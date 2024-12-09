package com.example.useronboarding;

import com.example.useronboarding.model.Context;
import com.example.useronboarding.process.UserOnboardingProcess;
import com.example.useronboarding.step.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

import java.util.Arrays;
import java.util.List;

@SpringBootApplication
@ComponentScan(value="com.example.useronboarding.*")
public class UseronboardingApplication implements CommandLineRunner {
	private final UserOnboardingProcess onboardingProcess;
	private final MobileOnboardingStep mobileOnboarding;
	private final EmailOnboardingStep emailOnboarding;
	private final CredentialVerificationStep credentialVerification;
	private final AccountExistenceVerificationStep accountExistenceVerification;

	public UseronboardingApplication(UserOnboardingProcess onboardingProcess, MobileOnboardingStep mobileOnboarding, EmailOnboardingStep emailOnboarding, CredentialVerificationStep credentialVerification, AccountExistenceVerificationStep accountExistenceVerification) {
		this.onboardingProcess = onboardingProcess;
		this.mobileOnboarding = mobileOnboarding;
		this.emailOnboarding = emailOnboarding;
		this.credentialVerification = credentialVerification;
		this.accountExistenceVerification = accountExistenceVerification;
	}

	public static void main(String[] args) {
		SpringApplication.run(UseronboardingApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Context context = new Context();
		context.put("mobileNumber", "1234567890");
		context.put("email", "user@example.com");
		context.put("accountId", "user123");
		context.put("credentialType", "Aadhaar");  // Type of credential (Aadhaar, PAN, etc.)
		context.put("credentialValue", "1234-5678-9101");

		List<ProcessStep> steps = Arrays.asList(mobileOnboarding, credentialVerification, accountExistenceVerification);

		UserOnboardingProcess process = new UserOnboardingProcess(steps);

		process.execute(context);
	}
}
