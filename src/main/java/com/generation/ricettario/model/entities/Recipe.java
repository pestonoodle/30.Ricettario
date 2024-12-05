package com.generation.ricettario.model.entities;

import jakarta.persistence.*;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.HashSet;
import java.util.Set;

@Entity
public class Recipe
{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String name;
	private String author;
	private String type;

	private int difficulty;
	private int time;
	private String imgRecipe;

	@ManyToMany
	@JoinTable(name = "recipe_ingredient",	joinColumns= @JoinColumn(name="recipe_id"), inverseJoinColumns= @JoinColumn(name="ingredients_id"))
	private Set<Ingredient> ingredients = new HashSet<>();

	public int getId()
	{
		return id;
	}

	public void setId(int id)
	{
		this.id = id;
	}

	public String getName()
	{
		return name;
	}

	public void setName(String name)
	{
		this.name = name;
	}

	public String getAuthor()
	{
		return author;
	}

	public void setAuthor(String author)
	{
		this.author = author;
	}

	public String getType()
	{
		return type;
	}

	public void setType(String type)
	{
		this.type = type;
	}

	public int getDifficulty()
	{
		return difficulty;
	}

	public void setDifficulty(int difficulty)
	{
		this.difficulty = difficulty;
	}

	public int getTime()
	{
		return time;
	}

	public void setTime(int time)
	{
		this.time = time;
	}

	public String getImgRecipe()
	{
		return imgRecipe;
	}

	public void setImgRecipe(String imgRecipe)
	{
		this.imgRecipe = imgRecipe;
	}

	public Set<Ingredient> getIngredients()
	{
		return ingredients;
	}

	public void setIngredients(Set<Ingredient> ingredients)
	{
		this.ingredients = ingredients;
	}
}
