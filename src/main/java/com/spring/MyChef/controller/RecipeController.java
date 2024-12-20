//package com.spring.MyChef.controller;
//import org.springframework.web.bind.annotation.GetMapping;
//
//import com.spring.MyChef.service.RecipeService;
//import com.spring.MyChef.model.Recipe;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Controller;
//import org.springframework.ui.Model;
//import org.springframework.web.bind.annotation.PathVariable;
//
//@Controller
//public class RecipeController {
//
//    @Autowired
//    private RecipeService recipeService;
//
//    // This endpoint will fetch a recipe based on its ID and return the recipe details page
//    @GetMapping("/recipe/{id}")
//    public String getRecipe(@PathVariable Long id, Model model) {
//        Recipe recipe = recipeService.getRecipeById(id);
//        model.addAttribute("recipe", recipe); // Add the recipe to the model to access in the view
//        return "receipe-post"; // Return the recipe post page
//    }
//}
