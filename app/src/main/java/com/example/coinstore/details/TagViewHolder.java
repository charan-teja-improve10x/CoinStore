package com.example.coinstore.details;

import android.view.View;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.coinstore.databinding.TagItemBinding;
import com.example.coinstore.model.Tag;

import java.util.List;

public class TagViewHolder extends RecyclerView.ViewHolder {

    TagItemBinding binding;
    public TagViewHolder(TagItemBinding binding) {
        super(binding.getRoot());
        this.binding = binding;
    }
}
