package com.TheUltimatePleb.JCord;

public interface DiscordAPI {

    void loginWithToken(String token, boolean isBot);

    void loginAsUser(String email, String password);



}
