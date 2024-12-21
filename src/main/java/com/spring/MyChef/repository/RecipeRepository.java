//package com.spring.MyChef.repository;
//
//import com.spring.MyChef.model.Recipe;
//import org.springframework.data.mongodb.repository.MongoRepository;
//
//import java.util.List;
//
//public interface RecipeRepository extends MongoRepository<Recipe, String> {
//    List<Recipe> findByTagsContaining(String tag);
//}