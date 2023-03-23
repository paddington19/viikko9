package com.example.v9oikea;

import android.util.Log;

import java.util.ArrayList;

public class UserStorage {

    private ArrayList<User> users = new ArrayList<User>();

    private static UserStorage userStorage = null;

    private UserStorage() {

    }

    public static UserStorage getInstance() {
        if(userStorage == null) {
            userStorage = new UserStorage();
        }
        return userStorage;
    }


    public void addUser(User user) {
        users.add(user);
    }

    public void printUsers() {
        for (User user : users) {
            Log.d("User Information", user.toString());
        }
    }

    public ArrayList<User> getUsers() {
        return users;
    }

}
