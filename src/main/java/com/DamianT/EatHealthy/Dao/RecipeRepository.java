package com.DamianT.EatHealthy.Dao;


import com.DamianT.EatHealthy.Dao.Entity.Recipe;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RecipeRepository extends CrudRepository<Recipe, Long> {

}
