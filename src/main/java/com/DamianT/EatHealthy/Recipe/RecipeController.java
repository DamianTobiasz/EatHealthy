package com.DamianT.EatHealthy.Recipe;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping(path = "/api/recipe")
public class RecipeController {
    private RecipeService recipeService;

    @Autowired
    public RecipeController(RecipeService recipeService) {
        this.recipeService = recipeService;
    }

    @GetMapping("/all")
    public Iterable<Recipe> getAll(){
        return recipeService.getAll();
    }

    @GetMapping
    public Optional<Recipe> getById(@RequestParam Long id){
        return this.recipeService.findById(id);
    }

    @PostMapping
    public Recipe addRecipe(@RequestBody Recipe recipe){
        return this.recipeService.save(recipe);
    }

    @PutMapping
    public Recipe putRecipe(@RequestBody Recipe recipe){
        return this.recipeService.save(recipe);
    }

    @DeleteMapping
    public void delete(@RequestParam Long id){
        this.recipeService.deleteById(id);
    }
}
