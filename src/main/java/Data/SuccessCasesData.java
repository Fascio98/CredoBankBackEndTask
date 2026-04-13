package Data;

import Constants.Constants;
import Factory.UserFactory;
import Utils.Stubs;
import Utils.UsersAsJSON;

import java.util.List;
import java.util.Map;

public class SuccessCasesData {
    Stubs stubs = new Stubs();
    UserFactory userFactory = new UserFactory();
    UsersAsJSON usersAsJSON = new UsersAsJSON();

    public String [] positiveStubs = {
            stubs.getStubWithoutParams(
                    Constants.STATUS_CODE_200,
                    usersAsJSON.convertUsersToJSON(List.of(userFactory.john(), userFactory.anna()))
            ),
            stubs.getStubWithQueryParams(
                    Constants.STATUS_CODE_200,
                    usersAsJSON.convertUsersToJSON(List.of(userFactory.anna())),
                    Map.of(Constants.QUERY_AGE_PARAM_NAME, Constants.QUERY_AGE_PARAM, Constants.QUERY_GENDER_PARAM_NAME, Constants.QUERY_GENDER_PARAM)
            ),
            stubs.getStubWithQueryParams(
                    Constants.STATUS_CODE_200,
                    usersAsJSON.convertUsersToJSON(List.of(userFactory.anna())),
                    Map.of(Constants.QUERY_NAME_PARAM_NAME, Constants.SECOND_QUERY_NAME_PARAM, Constants.QUERY_AGE_PARAM_NAME, Constants.QUERY_AGE_PARAM, Constants.QUERY_GENDER_PARAM_NAME, Constants.QUERY_GENDER_PARAM)
            ),
            stubs.getStubWithQueryParams(
                    Constants.STATUS_CODE_200,
                    usersAsJSON.convertUsersToJSON(List.of(userFactory.john())),
                    Map.of(Constants.QUERY_AGE_PARAM_NAME, Constants.SECOND_QUERY_AGE_PARAM)
            ),
            stubs.getStubWithQueryParams(
                    Constants.STATUS_CODE_200,
                    usersAsJSON.convertUsersToJSON(List.of(userFactory.anna())),
                    Map.of(Constants.QUERY_GENDER_PARAM_NAME, Constants.QUERY_GENDER_PARAM)
            ),
            stubs.getStubWithQueryParams(
                    Constants.STATUS_CODE_200,
                    usersAsJSON.convertUsersToJSON(List.of(userFactory.john())),
                    Map.of(Constants.QUERY_NAME_PARAM_NAME, Constants.QUERY_NAME_PARAM, Constants.QUERY_AGE_PARAM_NAME, Constants.SECOND_QUERY_AGE_PARAM)
            ),
            stubs.getStubWithQueryParams(
                    Constants.STATUS_CODE_200,
                    usersAsJSON.convertUsersToJSON(List.of(userFactory.john())),
                    Map.of(Constants.QUERY_NAME_PARAM_NAME, Constants.QUERY_NAME_PARAM, Constants.QUERY_GENDER_PARAM_NAME, Constants.SECOND_QUERY_GENDER_PARAM)
            ),
            stubs.getStubWithQueryParams(
                    Constants.STATUS_CODE_200,
                    usersAsJSON.convertUsersToJSON(List.of(userFactory.anna())),
                    Map.of(Constants.QUERY_NAME_PARAM_NAME, Constants.SECOND_QUERY_NAME_PARAM)
            )
    };
}
