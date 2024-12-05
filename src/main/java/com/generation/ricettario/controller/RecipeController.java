package com.generation.ricettario.controller;

import com.generation.ricettario.model.entities.Recipe;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
@RequestMapping("/recipe")
public class RecipeController
{
	@Autowired
	private ControllerHelper helper;

	@GetMapping
	public String showAllRecipe(Model model)
	{
		List<Recipe> all = helper.findAllMerch();
		model.addAttribute("recipes", all);

		return "recipes";
	}

	@GetMapping("/ingredients")
	public String showSomeRecipeIngredients(Model model)
	{
		List<Recipe> all = helper.findAllMerch();
		model.addAttribute("recipes", all);

		return "recipeByIngredients";
	}

	@GetMapping("/authors")
	public String showSomeRecipeAuthor(Model model)
	{
		List<Recipe> all = helper.findAllMerch();
		model.addAttribute("recipes", all);

		return "recipeByAuthors";
	}

	@GetMapping("/types")
	public String showSomeRecipeType(Model model)
	{
		List<Recipe> all = helper.findAllMerch();
		model.addAttribute("recipes", all);

		return "recipeByType";
	}

	@PostMapping("/types")
	public String selectType(Model model, @RequestParam String type){
		List<Recipe> all = helper.findByType(type);
		model.addAttribute("recipes", all);
		return "recipeByType";
	}

	@PostMapping("/ingredients")
	public String selectIngredient(Model model, @RequestParam String ingredient){
		List<Recipe> all = helper.findByIngredient(ingredient);
		model.addAttribute("recipes", all);
		return "recipeByIngredients";
	}

	@PostMapping("/authors")
	public String selectAuthors(Model model, @RequestParam String authors){
		List<Recipe> all = helper.findByAuthor(authors);
		model.addAttribute("recipes", all);
		return "recipeByAuthors";
	}
}
