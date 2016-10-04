package com.TheUltimatePleb.JCord;

import com.TheUltimatePleb.JCord.util.WebUtils;

public interface DiscordAPI {

    /**
     * Log into discord using the following token
     * @param token The token to login with
     * @param isBot whether the token represents a bot user
     */
    void loginWithToken(String token, boolean isBot);

    /**
     * Attempt to login to a user with the email and password.
     * @deprecated Please do not use this unless you really need to. Login using the token instead.
     * @param email discord user email
     * @param password discord user password
     */
    @Deprecated
    void loginAsUser(String email, String password);

}
