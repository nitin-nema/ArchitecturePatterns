// LoginStepDefinitions.java
public class LoginStepDefinitions {

    private boolean isAuthenticated;

    @Given("a user with username {string} and password {string}")
    public void a_user_with_credentials(String username, String password) {
        isAuthenticated = authenticate(username, password);
    }

    @When("the user tries to log in")
    public void the_user_tries_to_log_in() {
        // authentication is handled in @Given step
    }

    @Then("the login should be successful")
    public void the_login_should_be_successful() {
        assertTrue(isAuthenticated);
    }

    @Then("the login should fail")
    public void the_login_should_fail() {
        assertFalse(isAuthenticated);
    }

    private boolean authenticate(String username, String password) {
        return "admin".equals(username) && "admin123".equals(password);
    }
}
