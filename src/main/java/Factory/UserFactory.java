package Factory;

import Models.ResponseModels.User;

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
}
