package com.generation.ricettario.controller;

import com.generation.ricettario.model.entities.Ingredient;
import com.generation.ricettario.model.entities.Recipe;
import com.generation.ricettario.model.repositories.IngredientRepository;
import com.generation.ricettario.model.repositories.RecipeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ControllerHelperImp implements ControllerHelper
{
	@Autowired
	private IngredientRepository iRepo;
	@Autowired
	private RecipeRepository rRepo;


	@Override
	public List<Recipe> findAllMerch()
	{
		return rRepo.findAll();
	}

	@Override
	public List<Recipe> findByIngredient(String ingredient)
	{
		List<Recipe> recipes = rRepo.findAll();
		List<Recipe> withIngredients = new ArrayList<>();

		for(Recipe r : recipes){
			for(Ingredient i : r.getIngredients()){
				if(i.getName().equals(ingredient)){
					withIngredients.add(r);
				}
			}

		}
		return withIngredients;
	}

	@Override
	public List<Recipe> findByAuthor(String author)
	{
		List<Recipe> recipes = rRepo.findAll();
		List<Recipe> withAuthors = new ArrayList<>();

		for(Recipe r : recipes){
				if(r.getAuthor().equals(author)){
					withAuthors.add(r);
				}
			}
		return withAuthors;
	}

	@Override
	public List<Recipe> findByType(String type)
	{
		List<Recipe> recipes = rRepo.findAll();
		List<Recipe> withType = new ArrayList<>();

		for(Recipe r : recipes){
			if(r.getType().equals(type)){
				withType.add(r);
			}
		}
		return withType;
	}


}
