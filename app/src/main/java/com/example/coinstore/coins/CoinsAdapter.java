package com.example.coinstore.coins;

import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.coinstore.databinding.CoinItemBinding;
import com.example.coinstore.model.Coin;

import java.util.List;

public class CoinsAdapter extends RecyclerView.Adapter<CoinViewHolder> {

    private List<Coin> coins;

    private Boolean isActive = false;

    public void setCoins(List<Coin> coins) {
        this.coins = coins;
        notifyDataSetChanged();
    }
    @NonNull
    @Override
    public CoinViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        CoinItemBinding binding = CoinItemBinding.inflate(inflater, parent, false);
        CoinViewHolder viewHolder = new CoinViewHolder(binding);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull CoinViewHolder holder, int position) {
        Coin coin = coins.get(position);
        holder.binding.setCoin(coin);
        holder.binding.setIsActive(true);
    }

    @Override
    public int getItemCount() {
        return coins.size();
    }
}
