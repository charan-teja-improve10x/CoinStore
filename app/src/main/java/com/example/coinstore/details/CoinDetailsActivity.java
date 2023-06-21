package com.example.coinstore.details;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;

import android.os.Bundle;

import com.example.coinstore.databinding.ActivityCoinDetailsBinding;
import com.example.coinstore.model.Tag;
import com.example.coinstore.model.Team;

import java.util.List;

public class CoinDetailsActivity extends AppCompatActivity {

    private ActivityCoinDetailsBinding binding;
    private TeamsAdapter teamsAdapter;
    private TagsAdapter tagsAdapter;
    private List<Team> teams;
    private List<Tag> tags;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityCoinDetailsBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        setupAdapter();
        setupRecyclerView();
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
}