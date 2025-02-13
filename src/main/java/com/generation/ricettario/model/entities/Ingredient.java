package com.generation.ricettario.model.entities;

import jakarta.persistence.*;

import java.util.HashSet;
import java.util.Set;

@Entity
public class Ingredient
{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String name;

	@ManyToMany(mappedBy = "ingredients")
	private Set<Recipe> recipes = new HashSet<>();

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

	public Set<Recipe> getRecipes()
	{
		return recipes;
	}

	public void setRecipes(Set<Recipe> recipes)
	{
		this.recipes = recipes;
	}
}
