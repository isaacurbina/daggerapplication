package com.isaacurbna.daggerapplication.model;

import android.support.annotation.NonNull;

import java.util.Locale;

public class User {

    private String firstName;
    private String lastName;

    public User(@NonNull String firstName,
                @NonNull String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    @Override
    public String toString() {
        return String.format(Locale.US, "User [firstName=%s, lastName=%s]", firstName, lastName);
    }
}
