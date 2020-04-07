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
        final EditText editText4 = (EditText)findViewById(R.id.text_4);
        final EditText editText5 = (EditText)findViewById(R.id.text_5);
        final EditText editText6 = (EditText)findViewById(R.id.text_6);
        final EditText editText7 = (EditText)findViewById(R.id.text_7);
        final EditText editText8 = (EditText)findViewById(R.id.text_8);
        final EditText editText9 = (EditText)findViewById(R.id.text_9);
        final EditText editText10 = (EditText)findViewById(R.id.text_10);
        final EditText editText11 = (EditText)findViewById(R.id.text_11);
        final TextView result = (TextView) findViewById(R.id.result_id);

        saveButton.setOnClickListener(
            new View.OnClickListener() {
                public void onClick(View view) {
                    String name = editText1.getText().toString();
                    Float moduleCisaillementMinimal= Float.valueOf(editText2.getText().toString());
                    Float moduleCisaillementMaximal = Float.valueOf(editText3.getText().toString());
                    Float moduleYoungMinimal = Float.valueOf(editText4.getText().toString());
                    Float moduleYoungMaximal = Float.valueOf(editText5.getText().toString());
                    Float moduleCompressibiliteMinimal = Float.valueOf(editText6.getText().toString());
                    Float moduleCompressibiliteMaximal = Float.valueOf(editText7.getText().toString());
                    Float coefficientPoissonMinimal = Float.valueOf(editText8.getText().toString());
                    Float coefficientPoissonMaximal = Float.valueOf(editText9.getText().toString());
                    Float limiteElastiqueMinimal= Float.valueOf(editText10.getText().toString());
                    Float limiteElastiqueMaximal= Float.valueOf(editText11.getText().toString());

                    mutation(name, moduleCisaillementMinimal, moduleCisaillementMaximal, moduleYoungMinimal, moduleYoungMaximal, moduleCompressibiliteMinimal, moduleCompressibiliteMaximal, coefficientPoissonMinimal,  coefficientPoissonMaximal, limiteElastiqueMinimal,  limiteElastiqueMaximal );

                    result.setText("Created");
                }
            }
        );
    }

    public void mutation(String name, Float moduleCisaillementMinimal , Float moduleCisaillementMaximal, Float moduleYoungMinimal, Float moduleYoungMaximal , Float moduleCompressibiliteMinimal, Float moduleCompressibiliteMaximal, Float coefficientPoissonMinimal, Float coefficientPoissonMaximal, Float  limiteElastiqueMinimal, Float limiteElastiqueMaximal )
    {
        CreateProprietesMecaniquesInput createProprietesMecaniquesInput = CreateProprietesMecaniquesInput.builder()
                .name(name)
                .moduleCisaillementMinimal(moduleCisaillementMinimal)
                .moduleCisaillementMaximal(moduleCisaillementMaximal)
                .moduleYoungMinimal(moduleYoungMinimal)
                .moduleYoungMaximal(moduleYoungMaximal)
                .moduleCompressibiliteMinimal(moduleCompressibiliteMinimal)
                .moduleCompressibiliteMaximal(moduleCompressibiliteMaximal)
                .coefficientPoissonMinimal(coefficientPoissonMinimal)
                .coefficientPoissonMaximal(coefficientPoissonMaximal)
                .limiteElastiqueMinimal(limiteElastiqueMinimal)
                .limiteElastiqueMaximal(limiteElastiqueMaximal)
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
