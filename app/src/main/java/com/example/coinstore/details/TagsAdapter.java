package com.example.coinstore.details;

import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.coinstore.databinding.TagItemBinding;
import com.example.coinstore.model.Tag;

import java.util.List;

public class TagsAdapter extends RecyclerView.Adapter<TagViewHolder> {

    private List<Tag> tags;

    public TagsAdapter(List<Tag> tags) {
        this.tags = tags;
    }

    @NonNull
    @Override
    public TagViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        TagItemBinding binding = TagItemBinding.inflate(inflater, parent, false);
        TagViewHolder viewHolder = new TagViewHolder(binding);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull TagViewHolder holder, int position) {
        Tag tag = tags.get(position);
        holder.binding.setTag(tag);
    }

    @Override
    public int getItemCount() {
        return tags.size();
    }
}
