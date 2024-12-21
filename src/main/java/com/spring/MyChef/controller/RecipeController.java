//package com.spring.MyChef.controller;
//
//import com.spring.MyChef.model.Recipe;
//import com.spring.MyChef.service.RecipeService;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.*;
//
//import java.util.List;
//
//@RestController
//@RequestMapping("/api/recipes")
//public class RecipeController {
//
//    @Autowired
//    private RecipeService recipeService;
//
//    // Get all recipes
//    @GetMapping
//    public List<Recipe> getAllRecipes() {
//        return recipeService.getAllRecipes();
//    }
//
//    // Get a recipe by ID
//    @GetMapping("/{id}")
//    public Recipe getRecipeById(@PathVariable String id) {
//        return recipeService.getAllRecipes().stream()
//                .filter(recipe -> recipe.getId().equals(id))
//                .findFirst()
//                .orElse(null); // Return null if not found
//    }
//
//    // Search recipes by ingredient
//    @GetMapping("/search/ingredient")
//    public List<Recipe> searchRecipesByIngredient(@RequestParam String ingredient) {
//        return recipeService.searchRecipesByIngredient(ingredient);
//    }
//
//    // Search recipes by cuisine
//    @GetMapping("/search/cuisine")
//    public List<Recipe> searchRecipesByCuisine(@RequestParam String cuisine) {
//        return recipeService.searchRecipesByCuisine(cuisine);
//    }
//
//    // Filter recipes by tag
//    @GetMapping("/filter/tag")
//    public List<Recipe> filterRecipesByTag(@RequestParam String tag) {
//        return recipeService.filterRecipesByTag(tag);
//    }
//
//    // Add a new recipe
//    @PostMapping
//    public Recipe addRecipe(@RequestBody Recipe recipe) {
//        return recipeService.saveRecipe(recipe);
//    }
//
//    // Update an existing recipe
//    @PutMapping("/{id}")
//    public Recipe updateRecipe(@PathVariable String id, @RequestBody Recipe recipe) {
//        return recipeService.updateRecipe(id, recipe);
//    }
//
//    // Delete a recipe
//    @DeleteMapping("/{id}")
//    public void deleteRecipe(@PathVariable String id) {
//        recipeService.deleteRecipe(id);
//    }
//}
