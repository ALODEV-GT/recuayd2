package gt.com.alodev.refactor.services;

import gt.com.alodev.refactor.models.User;

public class UserService {
    public String createUser(User user) {
        return "User created: " + user.name();
    }
}
