package homework.medicalCenter.storage;

import homework.medicalCenter.model.User;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

public class UserStorage implements Serializable {

    private final Map<String, User> userMap = new HashMap<>();

    public void addUser(User user) {

        boolean userFound = false;
        String userEmail = user.getEmail();

        if (userMap.containsKey(userEmail)) {
            System.out.println("User with '" + userEmail + " 'already found!");
            userFound = true;
        }

        if (!userFound) {
            userMap.put(userEmail, user);
            System.out.println("User registered successfully!");
        }
    }

    public User login(String login, String password) {

        boolean userFound = false;

        for (Map.Entry<String, User> stringUserEntry : userMap.entrySet()) {
            if (stringUserEntry.getKey().equals(login) && stringUserEntry.getValue().getPassword().equals(password)) {
                System.out.println("You're logged in successfully!");
                userFound = true;
                return stringUserEntry.getValue();
            }
        }
        if (!userFound){
            System.out.println("Incorrect login or password!");
            return null;
        }
        return null;
    }
}

