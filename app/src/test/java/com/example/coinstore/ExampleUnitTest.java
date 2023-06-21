package com.example.coinstore;

import org.junit.Test;

import static org.junit.Assert.*;

import com.example.coinstore.model.Coin;
import com.example.coinstore.network.CoinApi;
import com.example.coinstore.network.CoinApiService;
import com.google.gson.Gson;

import java.io.IOException;
import java.util.List;

import retrofit2.Call;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class ExampleUnitTest {
    @Test
    public void addition_isCorrect() {
        assertEquals(4, 2 + 2);
    }

    @Test
    public void getCoins() throws IOException {
        CoinApiService coinApiService = new CoinApi().createCoinApiService();
        Call<List<Coin>> call = coinApiService.fetchCoins();
        List<Coin> coins = call.execute().body();
        assertNotNull(coins);
        assertFalse(coins.isEmpty());
        System.out.println(new Gson().toJson(coins));
    }

    @Test
    public void getCoinDetails() throws IOException {
        CoinApiService coinApiService = new CoinApi().createCoinApiService();
        Call<Coin> call = coinApiService.fetchCoinDetails("eth-ethereum");
        Coin coin = call.execute().body();
        assertNotNull(coin);
        System.out.println(new Gson().toJson(coin));
    }
}