package com.lhr.cucumber;

public class AbstractSteps {
    private final CucumberTestContext CONTEXT = CucumberTestContext.CONTEXT;

    protected CucumberTestContext testContext() {
        return CONTEXT;
    }
}
