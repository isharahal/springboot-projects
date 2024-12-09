package com.example.useronboarding.controller;

import com.example.useronboarding.process.UserOnboardingProcess;
import com.example.useronboarding.model.Context;
import com.example.useronboarding.request.UserOnboardingRequest;
import com.example.useronboarding.step.AccountExistenceVerificationStep;
import com.example.useronboarding.step.CredentialVerificationStep;
import com.example.useronboarding.step.MobileOnboardingStep;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/onboarding")
public class OnboardingController {

    private final MobileOnboardingStep mobileOnboardingStep;

    private final CredentialVerificationStep credentialVerificationStep;

    private final AccountExistenceVerificationStep accountExistenceVerificationStep;

    public OnboardingController(MobileOnboardingStep mobileOnboardingStep, CredentialVerificationStep credentialVerificationStep, AccountExistenceVerificationStep accountExistenceVerificationStep) {
        this.mobileOnboardingStep = mobileOnboardingStep;
        this.credentialVerificationStep = credentialVerificationStep;
        this.accountExistenceVerificationStep = accountExistenceVerificationStep;
    }

    @PostMapping("/start")
    public String startOnboarding(@RequestBody UserOnboardingRequest request) {
//        Context context = new Context();
//        context.put("mobileNumber", request.getMobileNumber());
//        context.put("email", request.getEmail());
//        context.put("accountId", request.getAccountId());
//        context.put("credentialType", request.getCredentialType());
//        context.put("credentialValue", request.getCredentialValue());

//        mobileOnboardingStep.execute(context);
//        credentialVerificationStep.execute(context);
//        accountExistenceVerificationStep.execute(context);

//        return "Onboarding process completed for account: " + request.getAccountId();
        return "";
    }
}
