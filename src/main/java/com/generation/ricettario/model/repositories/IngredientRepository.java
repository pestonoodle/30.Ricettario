package com.generation.ricettario.model.repositories;

import com.generation.ricettario.model.entities.Ingredient;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IngredientRepository extends JpaRepository<Ingredient, Integer>
{
}
