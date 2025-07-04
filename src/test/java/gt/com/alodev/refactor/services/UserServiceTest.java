package gt.com.alodev.refactor.services;

import gt.com.alodev.refactor.models.User;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class UserServiceTest {

    public UserService userService;

    @BeforeEach
    public void setUp(){
        this.userService = new UserService();
    }

    @Test
    public void shouldCreateUser() {
        var user = new User("Alex", "a@mail.com", "123", "x", "x", "90");
        var result = userService.createUser(user);
        var expected = "User created: " + user.name();

        Assertions.assertEquals(expected, result);
    }
}
