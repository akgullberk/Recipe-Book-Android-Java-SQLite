package com.example.recipebook;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

import com.example.recipebook.databinding.ActivityRecipeBinding;

public class RecipeActivity extends AppCompatActivity {

    private ActivityRecipeBinding binding;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding=ActivityRecipeBinding.inflate(getLayoutInflater());
        View view = binding.getRoot();
        setContentView(view);

    }

    public void save(View view){

    }

    public void selectImage(View view){

    }
}