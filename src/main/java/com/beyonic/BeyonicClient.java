package com.beyonic;

import com.beyonic.api.BeyonicApiService;
import com.beyonic.models.request.CollectionRequest;
import com.beyonic.models.request.Contact;
import com.beyonic.models.request.Payment;
import com.beyonic.models.request.PaymentReceipientData;
import com.beyonic.models.response.CommonBeyonicListResponse;
import com.beyonic.models.response.Transaction;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.sun.tools.sjavac.Log;
import okhttp3.Interceptor;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

import java.io.IOException;
import java.util.ArrayList;

/**
 * Created by jerryshikanga on  2019-04-27
 */
public class BeyonicClient {
    // TODO : Versions, Base endpoint, authentication, duplicate requests
    private static Retrofit retrofit;
    private static final String BASE_URL = "https://app.mfsafrica.com/api/";
    private String apiKey;

    public BeyonicClient(String apiKey) {
        this.apiKey = apiKey;
    }

    public String getApiKey() {
        return this.apiKey;
    }

    public void setApiKey(String apiKey) {
        this.apiKey = apiKey;
    }

    public BeyonicApiService getClient(){
        Gson gson = new GsonBuilder()
                .setLenient()
                .create();
        OkHttpClient okHttpClient = new OkHttpClient().newBuilder().addInterceptor(new Interceptor() {
            @Override
            public okhttp3.Response intercept(Chain chain) throws IOException {
                Request originalRequest = chain.request();
                Request.Builder builder = originalRequest.newBuilder().header("Authorization", "Token "+getApiKey());
                Request newRequest = builder.build();
                return chain.proceed(newRequest);
            }
        }).build();
        retrofit = new Retrofit.Builder()
                .baseUrl(BASE_URL)
                .client(okHttpClient)
                .addConverterFactory(GsonConverterFactory.create(gson))
                .build();
        return retrofit.create(BeyonicApiService.class);
    }
}
