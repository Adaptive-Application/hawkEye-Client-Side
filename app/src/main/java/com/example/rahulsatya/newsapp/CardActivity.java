package com.example.rahulsatya.newsapp;

/**
 * Created by rahulsatya on 12/03/18.
 */

public class CardActivity {
    private String userId;
    private String name;
    public CardActivity(String userId, String name)
    {
        this.userId = userId;
        this.name = name;
    }

    public String getUserId()
    {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getName() {

        return name;
    }
    public void setName(String name )
    {
        this.name = name;
    }
}
