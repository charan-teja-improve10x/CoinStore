package com.example.coinstore.network;

import com.example.coinstore.Constants;
import com.example.coinstore.model.Coin;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

public interface CoinApiService {

    @GET(Constants.COINS_END_POINT)
    Call<List<Coin>> fetchCoins();
    @GET(Constants.COINS_END_POINT + "/{id}")
    Call<Coin> fetchCoinDetails(@Path("id") String id);
}
