package com.example.coinstore.details;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;

import android.os.Bundle;
import android.widget.Toast;

import com.example.coinstore.databinding.ActivityCoinDetailsBinding;
import com.example.coinstore.model.Coin;
import com.example.coinstore.model.Tag;
import com.example.coinstore.model.Team;
import com.example.coinstore.network.CoinApi;
import com.example.coinstore.network.CoinApiService;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class CoinDetailsActivity extends AppCompatActivity {

    private ActivityCoinDetailsBinding binding;
    private TeamsAdapter teamsAdapter;
    private TagsAdapter tagsAdapter;
    private String id ;
    private List<Team> teams = new ArrayList<>();
    private List<Tag> tags = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityCoinDetailsBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        reviveData();
        fetchCoinDetails(id);
        setupAdapter();
        setupRecyclerView();
    }

    private void reviveData() {
        if (getIntent().hasExtra("id")) {
           id =  getIntent().getStringExtra("id");
        }
    }
    private void setupAdapter() {
        tagsAdapter = new TagsAdapter(tags);
        teamsAdapter = new TeamsAdapter(teams);
    }

    private void setupRecyclerView() {
        binding.teamRv.setLayoutManager(new LinearLayoutManager(this));
        binding.tagsRv.setLayoutManager(new GridLayoutManager(this, 3));
        binding.teamRv.setAdapter(teamsAdapter);
        binding.tagsRv.setAdapter(tagsAdapter);
    }

    private void fetchCoinDetails(String id) {
        CoinApiService coinApiService = new CoinApi().createCoinApiService();
        Call<Coin> call = coinApiService.fetchCoinDetails(id);
        call.enqueue(new Callback<Coin>() {
            @Override
            public void onResponse(Call<Coin> call, Response<Coin> response) {
                Toast.makeText(CoinDetailsActivity.this, "Success", Toast.LENGTH_SHORT).show();
                teamsAdapter.setTeams(response.body().getTeams());
                tagsAdapter.setTags(response.body().getTags());
                binding.setCoin(response.body());
            }

            @Override
            public void onFailure(Call<Coin> call, Throwable t) {
                Toast.makeText(CoinDetailsActivity.this, "Failed", Toast.LENGTH_SHORT).show();
            }
        });
    }
}