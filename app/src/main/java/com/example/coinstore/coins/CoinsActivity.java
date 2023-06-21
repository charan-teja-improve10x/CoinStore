package com.example.coinstore.coins;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;

import android.os.Bundle;
import android.widget.Toast;

import com.example.coinstore.databinding.ActivityCoinsBinding;
import com.example.coinstore.model.Coin;
import com.example.coinstore.network.CoinApi;
import com.example.coinstore.network.CoinApiService;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class CoinsActivity extends AppCompatActivity {

    private CoinsAdapter coinsAdapter;
    private List<Coin> coins = new ArrayList<>();
    private ActivityCoinsBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityCoinsBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        setupAdapter();
        setupCoinsRv();
        fetchCoins();
    }

    private void setupAdapter() {
        coinsAdapter = new CoinsAdapter();
        coinsAdapter.setCoins(coins);
        coinsAdapter.setActive(true);
    }

    private void setupCoinsRv() {
        binding.coinsRv.setAdapter(coinsAdapter);
        binding.coinsRv.setLayoutManager(new LinearLayoutManager(this));
    }

    private void fetchCoins() {
        CoinApiService coinApiService = new CoinApi().createCoinApiService();
        Call<List<Coin>> call = coinApiService.fetchCoins();
        call.enqueue(new Callback<List<Coin>>() {
            @Override
            public void onResponse(Call<List<Coin>> call, Response<List<Coin>> response) {
                Toast.makeText(CoinsActivity.this, "Success", Toast.LENGTH_SHORT).show();
                coinsAdapter.setCoins(response.body());
            }

            @Override
            public void onFailure(Call<List<Coin>> call, Throwable t) {
                Toast.makeText(CoinsActivity.this, "Failed", Toast.LENGTH_SHORT).show();
            }
        });
    }
}