package com.example.useronboarding.step;

import com.example.useronboarding.model.Context;
import org.springframework.stereotype.Component;

@Component
public class CredentialVerificationStep implements ProcessStep {
    @Override
    public void execute(Context context) {
        String credentialType = (String) context.get("credentialType");
        String credentialValue = (String) context.get("credentialValue");

        if ("Aadhaar".equals(credentialType)) {
            System.out.println("Verifying Aadhaar: " + credentialValue);
        } else if ("PAN".equals(credentialType)) {
            System.out.println("Verifying PAN: " + credentialValue);
        } else {
            System.out.println("Unknown credential type");
        }
    }

    @Override
    public String getName() {
        return "CredentialVerification";
    }
}
