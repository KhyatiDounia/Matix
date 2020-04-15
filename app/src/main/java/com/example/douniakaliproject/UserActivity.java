package com.example.douniakaliproject;

import android.os.Bundle;
import android.util.Log;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

import com.amazonaws.amplify.generated.graphql.ListProprietesMecaniquessQuery;
import com.amazonaws.mobile.config.AWSConfiguration;
import com.amazonaws.mobileconnectors.appsync.AWSAppSyncClient;
import com.amazonaws.mobileconnectors.appsync.fetcher.AppSyncResponseFetchers;
import com.apollographql.apollo.GraphQLCall;
import com.apollographql.apollo.api.Response;
import com.apollographql.apollo.exception.ApolloException;

import javax.annotation.Nonnull;

public class UserActivity extends AppCompatActivity
{
    private AWSAppSyncClient mAWSAppSyncClient;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.user);

        mAWSAppSyncClient = AWSAppSyncClient.builder()
                .context(getApplicationContext())
                .awsConfiguration(new AWSConfiguration(getApplicationContext()))
                .build();

        final EditText editText1 = (EditText) findViewById(R.id.text_1);
        final EditText editText2 = (EditText) findViewById(R.id.text_2);
        final EditText editText3 = (EditText) findViewById(R.id.text_3);
        final EditText editText4 = (EditText) findViewById(R.id.text_4);
        final EditText editText5 = (EditText) findViewById(R.id.text_5);

        query();
    }

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
