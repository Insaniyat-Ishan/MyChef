//package com.spring.MyChef.service;
//
//import com.spring.MyChef.model.Recipe;
//import com.spring.MyChef.repository.RecipeRepository;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//
//import java.util.List;
//
//@Service
//public class RecipeService {
//
//    @Autowired
//    private RecipeRepository recipeRepository;
//
//    // Get all recipes
//    public List<Recipe> getAllRecipes() {
//        return recipeRepository.findAll();
//    }
//
//    // Search recipes by ingredient
//    public List<Recipe> searchRecipesByIngredient(String ingredient) {
//        return recipeRepository.findByIngredientsContaining(ingredient);
//    }
//
//    // Search recipes by cuisine
//    public List<Recipe> searchRecipesByCuisine(String cuisine) {
//        return recipeRepository.findByCuisine(cuisine);
//    }
//
//    // Filter recipes by tag
//    public List<Recipe> filterRecipesByTag(String tag) {
//        return recipeRepository.findByTagsContaining(tag);
//    }
//
//    // Add a new recipe
//    public Recipe saveRecipe(Recipe recipe) {
//        return recipeRepository.save(recipe);
//    }
//
//    // Update a recipe
//    public Recipe updateRecipe(String id, Recipe recipe) {
//        recipe.setId(id);
//        return recipeRepository.save(recipe);
//    }
//
//    // Delete a recipe
//    public void deleteRecipe(String id) {
//        recipeRepository.deleteById(id);
//    }
//}
