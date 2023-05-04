package com.example.a8.UI;

import android.app.Application;
import android.util.Log;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.LiveData;

import com.example.a8.data.ClientDB.Client;
import com.example.a8.data.ClientDB.ClientRepository;

import java.util.List;

public class ClientVM extends AndroidViewModel {
    private final LiveData<List<Client>> mAllClient;
    private final ClientRepository mRepository;

    public ClientVM(Application application) {
        super(application);
        Log.d("ClientVM", "Constructor");
        mRepository = new ClientRepository(application);
        mAllClient = mRepository.getAllApartment();
    }

    public LiveData<List<Client>> getAllClient() {
        return mAllClient;
    }

    public void insert(Client client) {
        mRepository.insert(client);
    }
}