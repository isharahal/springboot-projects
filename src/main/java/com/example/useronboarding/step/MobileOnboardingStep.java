package com.example.useronboarding.step;

import com.example.useronboarding.model.Context;
import org.springframework.stereotype.Component;

@Component
public class MobileOnboardingStep implements ProcessStep {

    @Override
    public void execute(Context context) {
        String mobileNumber = (String) context.get("mobileNumber");
        System.out.println("Onboarding user with mobile: " + mobileNumber);
    }

    @Override
    public String getName() {
        return "MobileOnboardingStep";
    }
}
