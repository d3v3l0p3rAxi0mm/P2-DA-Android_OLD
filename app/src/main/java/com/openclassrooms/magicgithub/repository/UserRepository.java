package com.openclassrooms.magicgithub.repository;

import com.openclassrooms.magicgithub.api.ApiService;
import com.openclassrooms.magicgithub.model.User;

import java.util.List;

public class UserRepository {

    private final ApiService apiService; // TODO A utiliser

    public UserRepository(ApiService apiService) {
        this.apiService = apiService;
    }

    public List<User> getUsers() {
        // modified by Fabrice.Maurin
        return apiService.getUsers();
        // end of modification
    }

    public void generateRandomUser() {
        // modified by Fabrice.Maurin
        apiService.generateRandomUser();
        // end of modification
    }

    public void deleteUser(User user) {
        // modified by Fabrice.Maurin
        apiService.deleteUser(user);
        // end of modification
    }
}
