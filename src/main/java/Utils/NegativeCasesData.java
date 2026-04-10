package Utils;

public class NegativeCasesData {
    public static String userReturns200ButBackReturnsEmptyContainerStub = """
                {
                "request": {
                    "method": "GET",
                    "url": "/api/users"
                  },
                  "response": {
                    "status": 200,
                    "bodyFileName": "NegativeFiles/IfUsersReturn200ButBackReturnsEmptyContainerResponse.json"
                  }
                  }
        """;
}
