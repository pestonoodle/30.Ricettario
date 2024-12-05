package com.generation.ricettario.model.repositories;

import com.generation.ricettario.model.entities.Ingredient;
import com.generation.ricettario.model.entities.Recipe;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RecipeRepository  extends JpaRepository<Recipe, Integer>
{
}
