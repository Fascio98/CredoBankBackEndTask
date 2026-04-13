package Utils;

import Models.ResponseModels.User;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.core.JsonProcessingException;

import java.util.List;

public class UsersAsJSON {
    public String convertUsersToJSON(List<User> users) {
        try {
            ObjectMapper mapper = new ObjectMapper();
            return mapper.writeValueAsString(users);
        } catch (JsonProcessingException e) {
            throw new RuntimeException("Failed to convert users to JSON", e);
        }
    }
}
