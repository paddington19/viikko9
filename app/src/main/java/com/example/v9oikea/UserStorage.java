package com.example.v9oikea;

import static android.provider.Telephony.Mms.Part.FILENAME;

import android.content.Context;
import android.util.Log;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class UserStorage {

    private ArrayList<User> users = new ArrayList<User>();

    private static UserStorage userStorage = null;

    private UserStorage() {

    }

    public static UserStorage getInstance() {
        if (userStorage == null) {
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
    } /// changed


    public void saveUsers(Context context) {
        try {
            ObjectOutputStream userWriter = new ObjectOutputStream(context.openFileOutput("users5555555555.data", Context.MODE_PRIVATE));
            userWriter.writeObject(users);
            userWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("Tallentaminen ei onnistunut");
        }
    }
    public void loadUsers(Context context) {
        try {
            ObjectInputStream userReader = new ObjectInputStream(context.openFileInput("users5555555555.data"));
            users = (ArrayList<User>) userReader.readObject();
            userReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("Ei löytynyt listaa, joten luodaampa uusi tyhjä lista.");
            users = new ArrayList<>();
        } catch (IOException e) {
            System.out.println("Rakettien lukeminen ei onnistunut");
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            System.out.println("Rakettien lukeminen ei onnistunut");
            e.printStackTrace();
        }
    }

}
