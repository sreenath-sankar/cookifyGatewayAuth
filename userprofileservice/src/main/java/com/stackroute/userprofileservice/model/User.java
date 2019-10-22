package com.stackroute.userprofileservice.model;


import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Document
public class User {

    private String name;

    @Id
    private String userName;

    private String address;
    private String genderAge;
    private String city;
    private String email;
    private String userimagePath;
    private List<Recipe> recipePublished;
    private List<Recipe> recipeTried;
    private List<Recipe> recipeRated;
    private List<Recipe> recipeLiked;
    private List<Incredients> deliveryStatus;
    private String cookingStatus;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getGenderAge() {
        return genderAge;
    }

    public void setGenderAge(String genderAge) {
        this.genderAge = genderAge;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getUserimagePath() {
        return userimagePath;
    }

    public void setUserimagePath(String userimagePath) {
        this.userimagePath = userimagePath;
    }

    public List<Recipe> getRecipePublished() {
        return recipePublished;
    }

    public void setRecipePublished(List<Recipe> recipePublished) {
        this.recipePublished = recipePublished;
    }

    public List<Recipe> getRecipeTried() {
        return recipeTried;
    }

    public void setRecipeTried(List<Recipe> recipeTried) {
        this.recipeTried = recipeTried;
    }

    public List<Recipe> getRecipeRated() {
        return recipeRated;
    }

    public void setRecipeRated(List<Recipe> recipeRated) {
        this.recipeRated = recipeRated;
    }

    public List<Recipe> getRecipeLiked() {
        return recipeLiked;
    }

    public void setRecipeLiked(List<Recipe> recipeLiked) {
        this.recipeLiked = recipeLiked;
    }

    public List<Incredients> getDeliveryStatus() {
        return deliveryStatus;
    }

    public void setDeliveryStatus(List<Incredients> deliveryStatus) {
        this.deliveryStatus = deliveryStatus;
    }

    public String getCookingStatus() {
        return cookingStatus;
    }

    public void setCookingStatus(String cookingStatus) {
        this.cookingStatus = cookingStatus;
    }


}
