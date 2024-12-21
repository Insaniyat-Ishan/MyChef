//package com.spring.MyChef.model;
//
//import org.springframework.data.annotation.Id;
//import org.springframework.data.mongodb.core.mapping.Document;
//
//import java.util.List;
//
//@Document(collection = "recipes")
//public class Recipe {
//
//    @Id
//    private String id;
//    private String title;
//    private String prepTime;
//    private String cookTime;
//    private String yields;
//    private List<String> ingredients;
//    private List<String> steps;
//    private String imageUrl;
//
//    private List<String> tags; // Add this field for tags
//
//    // Getters and setters for all fields
//    public String getId() {
//        return id;
//    }
//
//    public void setId(String id) {
//        this.id = id;
//    }
//
//    public String getTitle() {
//        return title;
//    }
//
//    public void setTitle(String title) {
//        this.title = title;
//    }
//
//    public String getPrepTime() {
//        return prepTime;
//    }
//
//    public void setPrepTime(String prepTime) {
//        this.prepTime = prepTime;
//    }
//
//    public String getCookTime() {
//        return cookTime;
//    }
//
//    public void setCookTime(String cookTime) {
//        this.cookTime = cookTime;
//    }
//
//    public String getYields() {
//        return yields;
//    }
//
//    public void setYields(String yields) {
//        this.yields = yields;
//    }
//
//    public List<String> getIngredients() {
//        return ingredients;
//    }
//
//    public void setIngredients(List<String> ingredients) {
//        this.ingredients = ingredients;
//    }
//
//    public List<String> getSteps() {
//        return steps;
//    }
//
//    public void setSteps(List<String> steps) {
//        this.steps = steps;
//    }
//
//    public String getImageUrl() {
//        return imageUrl;
//    }
//
//    public void setImageUrl(String imageUrl) {
//        this.imageUrl = imageUrl;
//    }
//
//    public List<String> getTags() {
//        return tags;
//    }
//
//    public void setTags(List<String> tags) {
//        this.tags = tags;
//    }
//}
