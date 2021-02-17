package com.DamianT.EatHealthy.Recipe;


import com.DamianT.EatHealthy.Recipe.Recipe;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RecipeRepository extends CrudRepository<Recipe, Long> {

}
