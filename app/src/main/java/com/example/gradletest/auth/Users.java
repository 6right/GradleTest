package com.example.gradletest.auth;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

public class Users {
    private String UID;

    public Users() {
        // При создании объекта Users, создается объект Users с UID
        FirebaseUser user = FirebaseAuth.getInstance().getCurrentUser();
        setUID(user.getUid());

    }

    public Users(String UID) {
        this.UID = UID;

    }

    public String getUID() {
        return UID;
    }

    public void setUID(String UID) {
        this.UID = UID;
    }
}
