package com.DamianT.EatHealthy.Recipe;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;


@Service
public class RecipeService {

    private RecipeRepository repository;

    @Autowired
    public RecipeService(RecipeRepository repository){
        this.repository = repository;
    }

    public Optional<Recipe> findById(Long id) {
        return this.repository.findById(id);
    }

    public Recipe save(Recipe recipe){
        return repository.save(recipe);
    }


    public Iterable<Recipe> getAll() {
        return repository.findAll();
    }


    public void deleteById(Long id) {
        this.repository.deleteById(id);
    }
}
