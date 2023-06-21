package com.example.coinstore.details;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.coinstore.R;
import com.example.coinstore.databinding.FragmentTagsBinding;
import com.example.coinstore.databinding.TagItemBinding;
import com.example.coinstore.model.Tag;

import java.util.List;

public class TagsFragment extends Fragment {

    private TagsAdapter tagsAdapter;
    private List<Tag> tags;
    private FragmentTagsBinding binding;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FragmentTagsBinding.inflate(inflater, container, false);
        setupTagsAdapter();
        setupTagsRv();
        return binding.getRoot();
    }

    private void setupTagsAdapter() {
        tagsAdapter = new TagsAdapter(tags);
    }

    private void setupTagsRv() {
        binding.tagsRv.setLayoutManager(new GridLayoutManager(getContext(),3));
        binding.tagsRv.setAdapter(tagsAdapter);
    }
}