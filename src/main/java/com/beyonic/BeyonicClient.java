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
    private static final String BASE_URL = "https://app.beyonic.com/api/";
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

    public static void main(String [] args){
        BeyonicClient client = new BeyonicClient("testkey");

        //The client allows flexibility to make bioth synchronous and asynchronous calls

        //Asynchronous calls are as below
        client.getClient().getTransactions().enqueue(new Callback<CommonBeyonicListResponse<Transaction>>() {
            @Override
            public void onResponse(Call<CommonBeyonicListResponse<Transaction>> call, Response<CommonBeyonicListResponse<Transaction>> response) {
                //Pass response here
                Transaction firstTransaction = response.body().getResults().get(0);
                firstTransaction.getAmount();
            }

            @Override
            public void onFailure(Call<CommonBeyonicListResponse<Transaction>> call, Throwable t) {
                // handle error here
            }
        });

        //This is a sample synchronous call
        try {
            Response<CommonBeyonicListResponse<Transaction>> response = client.getClient().getTransactions().execute();
            Transaction firstTransaction = response.body().getResults().get(0);
            firstTransaction.getDescription();
        }
        catch (IOException e){
            //handle error
        }

        //Client methods methods

        //Collection Request
        client.getClient().getCollection(1234); // where 1234 is the collection id
        client.getClient().getCollections(); // returns all collections
        CollectionRequest collectionRequest = new CollectionRequest();
        collectionRequest.setAmount(1200F);
        collectionRequest.setCurrency("KES");
        collectionRequest.setPhonenumber("+254739936708");
        client.getClient().createCollectionRequest(collectionRequest);

        //Collection
        client.getClient().getCollections();
        client.getClient().getCollection(1234); //where 1234 is the collection id

        //Payment
        client.getClient().getPayment(1234); //where 1234 is the payment id
        client.getClient().getPayments();
        Payment payment = new Payment();
        payment.setAccount(123);
        ArrayList<PaymentReceipientData> receipientDataArrayList = new ArrayList<>();
        receipientDataArrayList.add(new PaymentReceipientData("+254739936701", "First", "Payee", "Description One", 45));
        receipientDataArrayList.add(new PaymentReceipientData("+254739936702", "Second", "Payee", "Description Two", 75));
        receipientDataArrayList.add(new PaymentReceipientData("+254739936703", "Third", "Payee", "Description", 85));
        receipientDataArrayList.add(new PaymentReceipientData("+254739936704", "Fourth", "Payee", "Description", 15));
        payment.setReceipientData(receipientDataArrayList);
        payment.setPayment_type("airtime");
        client.getClient().createPayment(payment);

        //Accounts
        client.getClient().getAccount(1234);
        client.getClient().getAccounts();

        //Transactions
        client.getClient().getTransactions();
        client.getClient().getTransactions();

        //Contacts
        client.getClient().getContacts();
        client.getClient().getContact(1234);
        Contact contact = new Contact();
        contact.setFirst_name("First");
        contact.setLast_name("last");
        contact.setPhone_number("+254739936701");
        contact.setEmail("user@domian.com");
        client.getClient().createContact(contact);

        //Events
        client.getClient().getEvent(1234);
        client.getClient().getEvents();
    }
}
