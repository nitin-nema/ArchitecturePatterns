// CalculatorStepDefinitions.java
public class CalculatorStepDefinitions {
    Calculator calculator;
    int result;

    @Given("a calculator")
    public void a_calculator() {
        calculator = new Calculator();
    }

    @When("I add {int} and {int}")
    public void i_add_and(Integer int1, Integer int2) {
        result = calculator.add(int1, int2);
    }

    @Then("the result should be {int}")
    public void the_result_should_be(Integer expected) {
        assertEquals(expected, result);
    }
}
