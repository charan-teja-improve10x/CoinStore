package com.example.coinstore.model.network;

import com.example.coinstore.Constants;
import com.example.coinstore.model.Coin;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface CoinApiService {

    @GET(Constants.COINS_END_POINT)
    Call<List<Coin>> fetchCoins();
}
