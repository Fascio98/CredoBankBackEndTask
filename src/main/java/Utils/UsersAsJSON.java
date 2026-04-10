package Utils;

import Models.ResponseModels.User;
import tools.jackson.databind.ObjectMapper;

import java.util.List;

public class UsersAsJSON {
    public String convertUsersToJSON(List<User> users) {
        ObjectMapper mapper = new ObjectMapper();
        return mapper.writeValueAsString(users);
    }
}
