package com.academy.muharremkulak.runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/java/com/academy/muharremkulak/features",
        glue = {"com/academy/muharremkulak/step_defs", "com/academy/muharremkulak/hooks"},
        dryRun = false
)
public class Runner {
}
