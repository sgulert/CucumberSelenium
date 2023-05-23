package stepdefinitions;

import io.cucumber.java.en.Given;

public class ParametrizedStepDef {
    @Given("Bu parametreli bir steptir ve degeri {string}")//cucumber expression
    public void buParametreliBirSteptirVeDegeri(String arg0) {
        System.out.println(arg0);
    }
}
