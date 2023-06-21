package com.example.coinstore.details;

import android.view.View;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.coinstore.databinding.TeamItemBinding;

public class TeamViewHolder extends RecyclerView.ViewHolder {

    TeamItemBinding binding;
    public TeamViewHolder(TeamItemBinding binding) {
        super(binding.getRoot());
        this.binding = binding;
    }
}
