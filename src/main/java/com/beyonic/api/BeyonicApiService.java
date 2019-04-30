package com.beyonic.api;

import com.beyonic.models.response.*;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Path;

/**
 * Created by jerryshikanga on  2019-04-30
 */
public interface BeyonicApiService {
    @GET("accounts")
    Call<CommonBeyonicListResponse<Account>> getAccounts();

    @GET("accounts/{id}/")
    Call<Account> getAccount(@Path("id") int id);

    @GET("transactions")
    Call<CommonBeyonicListResponse<Transaction>> getTransactions();

    @GET("transactions/{id}/")
    Call<Transaction> getTransaction(@Path("id") int id);

    @GET("contacts")
    Call<CommonBeyonicListResponse<Contact>> getContacts();

    @GET("contacts/{id}")
    Call<Contact> getContact(@Path("id") int id);

    @POST("contacts")
    Call<Contact> createContact(@Body com.beyonic.models.request.Contact contact);

    @GET("events")
    Call<CommonBeyonicListResponse<Event>> getEvents();

    @GET("events/{id}")
    Call<Event> getEvent(@Path("id") int id);

    @GET("collectionrequests")
    Call<CommonBeyonicListResponse<CollectionRequest>> getCollectionRequests();

    @GET("collectionrequests/{id}")
    Call<CollectionRequest> getCollectionRequest(@Path("id")int id);

    @POST("collectionrequests")
    Call<CollectionRequest> createCollectionRequest(@Body com.beyonic.models.request.CollectionRequest request);

    @GET("collections")
    Call<CommonBeyonicListResponse<Collection>> getCollections();

    @GET("collections/{id}")
    Call<Collection> getCollection(@Path("id") int id);

    @GET("payments")
    Call<CommonBeyonicListResponse<Payment>> getPayments();

    @GET("payments/{id}")
    Call<Payment> getPayment(@Path("id") int id);

    @POST("payments")
    Call<Payment> createPayment(@Body com.beyonic.models.request.Payment payment);
}
