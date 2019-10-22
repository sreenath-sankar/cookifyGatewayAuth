package com.stackroute.userprofileservice.service;

import com.stackroute.userprofileservice.model.Recipe;
import com.stackroute.userprofileservice.model.User;

import java.util.List;

public interface UserService {
    public User saveuser(User user);

    /*public User getUserDataByUsername(String username);
    public List<Recipe> getPublishedRecipe(String username);
    public List<Recipe> getTriedRecipe(String username);
    public List<Recipe> getLikedRecipe(String username);
    public String getDeliveryStatus(String username,int deliveryid);*/
}
