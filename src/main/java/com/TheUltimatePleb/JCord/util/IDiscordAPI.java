package com.TheUltimatePleb.JCord.util;

public class IDiscordAPI implements com.TheUltimatePleb.JCord.DiscordAPI {

    WebUtils wb;

    @Override
    public void loginWithToken(String token, boolean isBot) {

    }

    @Override
    public void loginAsUser(String email, String password) {

    }

    @Override
    public WebUtils getWebUtils() {
        return wb == null ? wb = new WebUtils() : wb; //Remember this is called Ternary, hopefully I won't forget now
    }
}
