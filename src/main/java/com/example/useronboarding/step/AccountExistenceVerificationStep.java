package com.example.useronboarding.step;

import com.example.useronboarding.model.Context;
import org.springframework.stereotype.Component;

@Component
public class AccountExistenceVerificationStep implements ProcessStep {

    // Simulating a predefined list of existing accounts
    private static final String[] EXISTING_ACCOUNTS = {"user123", "user456", "user789"};

    @Override
    public void execute(Context context) {
        // Retrieve the accountId from the context
        String accountId = (String) context.get("accountId");

        // Check if the accountId exists in the predefined list of existing accounts
        boolean accountExists = checkAccountExistence(accountId);

        // Print the result
        if (accountExists) {
            System.out.println("Account exists for user: " + accountId);
        } else {
            System.out.println("Account does not exist for user: " + accountId);
        }
    }

    private boolean checkAccountExistence(String accountId) {
        // Simulate checking the account existence against a list of existing accounts
        for (String existingAccount : EXISTING_ACCOUNTS) {
            if (existingAccount.equals(accountId)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public String getName() {
        return "AccountExistenceVerificationStep";
    }
}