package com.example.useronboarding.request;

import lombok.*;
import org.springframework.stereotype.Component;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Component
@Getter
public class UserOnboardingRequest {
    private String mobileNumber;
    private String email;
    private String accountId;
    private String credentialType;
    private String credentialValue;
}
