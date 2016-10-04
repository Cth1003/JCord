package com.TheUltimatePleb.JCord;

import com.TheUltimatePleb.JCord.util.WebUtils;

public interface DiscordAPI {

    void loginWithToken(String token, boolean isBot);

    void loginAsUser(String email, String password);

}
