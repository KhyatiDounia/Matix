package com.example.douniakaliproject;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.amazonaws.amplify.generated.graphql.CreateProprietesMecaniquesMutation;
import com.amazonaws.amplify.generated.graphql.ListProprietesMecaniquessQuery;
import com.amazonaws.mobile.config.AWSConfiguration;
import com.amazonaws.mobileconnectors.appsync.AWSAppSyncClient;
import com.amazonaws.mobileconnectors.appsync.fetcher.AppSyncResponseFetchers;
import com.apollographql.apollo.GraphQLCall;
import com.apollographql.apollo.api.Response;
import com.apollographql.apollo.exception.ApolloException;

import javax.annotation.Nonnull;

import type.CreateProprietesMecaniquesInput;

public class MainActivity extends AppCompatActivity {
    private AWSAppSyncClient mAWSAppSyncClient;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mAWSAppSyncClient = AWSAppSyncClient.builder()
                .context(getApplicationContext())
                .awsConfiguration(new AWSConfiguration(getApplicationContext()))
                .build();

        Button saveButton = (Button)findViewById(R.id.save_button);
        final EditText editText1 = (EditText)findViewById(R.id.text_1);
        final EditText editText2 = (EditText)findViewById(R.id.text_2);
        final EditText editText3 = (EditText)findViewById(R.id.text_3);
        final TextView result = (TextView) findViewById(R.id.result_id);

        saveButton.setOnClickListener(
            new View.OnClickListener() {
                public void onClick(View view) {
                    String name = editText1.getText().toString();
                    Float moduleYoung = Float.valueOf(editText2.getText().toString());
                    Float moduleCisaillement = Float.valueOf(editText3.getText().toString());

                    mutation(name, moduleYoung, moduleCisaillement);

                    result.setText("Created");
                }
            }
        );
    }

    public void mutation(String name, Float moduleYoung, Float moduleCisaillement)
    {
        CreateProprietesMecaniquesInput createProprietesMecaniquesInput = CreateProprietesMecaniquesInput.builder()
                .name(name)
                .moduleYoung(moduleYoung)
                .moduleCisaillement(moduleCisaillement)
                .build();

        mAWSAppSyncClient.mutate(CreateProprietesMecaniquesMutation.builder().input(createProprietesMecaniquesInput).build())
                .enqueue(mutationCallback);
    }

    private GraphQLCall.Callback<CreateProprietesMecaniquesMutation.Data> mutationCallback = new GraphQLCall.Callback<CreateProprietesMecaniquesMutation.Data>() {
        @Override
        public void onResponse(@Nonnull Response<CreateProprietesMecaniquesMutation.Data> response) {
            Log.i("Results", "Added Propriete Mecanique");
        }

        @Override
        public void onFailure(@Nonnull ApolloException e) {
            Log.e("Error", e.toString());
        }
    };

    public void query(){
        mAWSAppSyncClient.query(ListProprietesMecaniquessQuery.builder().build())
                .responseFetcher(AppSyncResponseFetchers.CACHE_AND_NETWORK)
                .enqueue(proprieteMecaniquesCallback);
    }

    private GraphQLCall.Callback<ListProprietesMecaniquessQuery.Data> proprieteMecaniquesCallback = new GraphQLCall.Callback<ListProprietesMecaniquessQuery.Data>() {
        @Override
        public void onResponse(@Nonnull Response<ListProprietesMecaniquessQuery.Data> response) {
            assert response.data() != null;
            Log.i("Results", response.data().listProprietesMecaniquess().items().toString());
        }

        @Override
        public void onFailure(@Nonnull ApolloException e) {
            Log.e("ERROR", e.toString());
        }
    };
}
