package com.example.useronboarding.step;

import com.example.useronboarding.model.Context;

public interface ProcessStep {
    void execute(Context context);
    String getName();
}
