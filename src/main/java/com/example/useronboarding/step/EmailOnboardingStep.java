package com.example.useronboarding.step;

import com.example.useronboarding.model.Context;
import org.springframework.stereotype.Component;

@Component
public class EmailOnboardingStep implements ProcessStep {

    @Override
    public void execute(Context context) {
        String email = (String) context.get("email");
        System.out.println("Onboarding user with email: " + email);
    }

    @Override
    public String getName() {
        return "EmailOnboardingStep";
    }
}
