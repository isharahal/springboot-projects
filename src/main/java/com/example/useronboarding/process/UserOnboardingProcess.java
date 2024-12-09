package com.example.useronboarding.process;

import com.example.useronboarding.model.Context;
import com.example.useronboarding.step.ProcessStep;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class UserOnboardingProcess {
    private final List<ProcessStep> steps;

    public UserOnboardingProcess(List<ProcessStep> steps) {
        this.steps = steps;
    }

    public void execute(Context context) {
        System.out.println("Starting onboarding process...");
        for (ProcessStep step : steps) {
            System.out.println("Executing step: " + step.getName());
            step.execute(context);
        }
        System.out.println("Onboarding process completed.");
    }
}
