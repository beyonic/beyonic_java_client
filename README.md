# Beyonic Java Client Library
The official Java library for interacting with [Beyonic](http://beyonic.com) API.
Detailed description for interaction with the API can be found at [https://developer.mfsafrica.com/docs](https://developer.mfsafrica.com/docs).

The client has the following dependencies.

1. okhttp version 3.14.1
2. retrofit version 2.5.0
3. gson version 2.8.5
4. retrofit2 converter-gson version 2.5.0

These can be installed using gradle, maven or manually placing the files in your application folder.

To get up and running, instantiate the client suing your API Key from your beyonic account.
```java
import com.beyonic.BeyonicClient;
BeyonicClient client = new BeyonicClient("yourapikeyhere");
```
The client is flexible enough to allow you to make both synchronous and asynchronous requests.

Below is a sample asynchronous call:
```java
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
                Log.error(t.getMessage());
            }
        });
```

Below is a sample synchronous call:
```java
try {
            Response<CommonBeyonicListResponse<Transaction>> response = client.getClient().getTransactions().execute();
            Transaction firstTransaction = response.body().getResults().get(0);
            firstTransaction.getDescription();
        }
        catch (IOException e){
            //handle error
            Log.error(e.getMessage());
        }
```

The client library support s the following methods
```java
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
```

You are welcome to contribute by opening a pull request!
