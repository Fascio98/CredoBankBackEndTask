package Factory;

import Models.ResponseModels.User;
import Models.ResponseModels.Users;

import java.util.List;

public class UserFactory {
    public User john() {
        return User.builder()
                .id(1)
                .name("John")
                .age(30)
                .gender("Male")
                .build();
    }

    public User anna() {
        return User.builder()
                .id(2)
                .name("Anna")
                .age(25)
                .gender("Female")
                .build();
    }

    public Users users() {
        return Users.builder()
                .users(List.of(john(), anna()))
                .build();
    }
}
