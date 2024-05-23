package com.example.recipebook;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.recipebook.databinding.RecyclerRowBinding;

import java.util.ArrayList;

public class RecipeAdapter extends RecyclerView.Adapter<RecipeAdapter.RecipeHolder> {

    ArrayList<Recipe> recipeArrayList;

    public RecipeAdapter(ArrayList<Recipe> recipeArrayList){
        this.recipeArrayList=recipeArrayList;
    }


    @NonNull
    @Override
    public RecipeHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        RecyclerRowBinding recyclerRowBinding=RecyclerRowBinding.inflate(LayoutInflater.from(parent.getContext()),parent,false);
        return  new RecipeHolder(recyclerRowBinding);
    }

    @Override
    public void onBindViewHolder(@NonNull RecipeHolder holder, int position) {
        holder.binding.recyclerViewTextView.setText(recipeArrayList.get(position).name);

    }

    @Override
    public int getItemCount() {
        return recipeArrayList.size();
    }

    public class RecipeHolder extends RecyclerView.ViewHolder{
        private RecyclerRowBinding binding;

        public RecipeHolder(RecyclerRowBinding binding) {
            super(binding.getRoot());
            this.binding=binding;
        }
    }


}
