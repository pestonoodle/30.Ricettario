package com.generation.ricettario.controller;

import com.generation.ricettario.model.entities.Recipe;

import java.util.List;

public interface ControllerHelper
{
	List<Recipe> findAllMerch();

	List<Recipe> findByIngredient(String ingredient);

	List<Recipe> findByAuthor(String authors);

	List<Recipe> findByType(String type);
}
