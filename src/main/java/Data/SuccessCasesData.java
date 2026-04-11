package Data;

import Constants.Constants;
import Factory.UserFactory;
import Utils.Stubs;
import Utils.UsersAsJSON;

import java.util.List;
import java.util.Map;

public class SuccessCasesData {
    Constants constants = new Constants();
    Stubs stubs = new Stubs();
    UserFactory userFactory = new UserFactory();
    UsersAsJSON usersAsJSON = new UsersAsJSON();

    public String [] positiveStubs = {
            stubs.getStubWithoutParams(
                    constants.STATUS_CODE_200,
                    usersAsJSON.convertUsersToJSON(List.of(userFactory.john(), userFactory.anna()))
            ),
            stubs.getStubWithQueryParams(
                    constants.STATUS_CODE_200,
                    usersAsJSON.convertUsersToJSON(List.of(userFactory.anna())),
                    Map.of(constants.QUERY_AGE_PARAM_NAME, constants.QUERY_AGE_PARAM, constants.QUERY_GENDER_PARAM_NAME, constants.QUERY_GENDER_PARAM)
            ),
            stubs.getStubWithQueryParams(
                    constants.STATUS_CODE_200,
                    usersAsJSON.convertUsersToJSON(List.of(userFactory.anna())),
                    Map.of(constants.QUERY_NAME_PARAM_NAME, constants.SECOND_QUERY_NAME_PARAM, constants.QUERY_AGE_PARAM_NAME, constants.QUERY_AGE_PARAM, constants.QUERY_GENDER_PARAM_NAME, constants.QUERY_GENDER_PARAM)
            ),
            stubs.getStubWithQueryParams(
                    constants.STATUS_CODE_200,
                    usersAsJSON.convertUsersToJSON(List.of(userFactory.john())),
                    Map.of(constants.QUERY_AGE_PARAM_NAME, constants.SECOND_QUERY_AGE_PARAM)
            ),
            stubs.getStubWithQueryParams(
                    constants.STATUS_CODE_200,
                    usersAsJSON.convertUsersToJSON(List.of(userFactory.anna())),
                    Map.of(constants.QUERY_GENDER_PARAM_NAME, constants.QUERY_GENDER_PARAM)
            ),
            stubs.getStubWithQueryParams(
                    constants.STATUS_CODE_200,
                    usersAsJSON.convertUsersToJSON(List.of(userFactory.john())),
                    Map.of(constants.QUERY_NAME_PARAM_NAME, constants.QUERY_NAME_PARAM, constants.QUERY_AGE_PARAM_NAME, constants.SECOND_QUERY_AGE_PARAM)
            ),
            stubs.getStubWithQueryParams(
                    constants.STATUS_CODE_200,
                    usersAsJSON.convertUsersToJSON(List.of(userFactory.john())),
                    Map.of(constants.QUERY_NAME_PARAM_NAME, constants.QUERY_NAME_PARAM, constants.QUERY_GENDER_PARAM_NAME, constants.SECOND_QUERY_GENDER_PARAM)
            ),
            stubs.getStubWithQueryParams(
                    constants.STATUS_CODE_200,
                    usersAsJSON.convertUsersToJSON(List.of(userFactory.anna())),
                    Map.of(constants.QUERY_NAME_PARAM_NAME, constants.SECOND_QUERY_NAME_PARAM)
            )
    };
}
