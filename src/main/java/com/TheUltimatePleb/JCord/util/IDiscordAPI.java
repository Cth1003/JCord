package com.TheUltimatePleb.JCord.util;

import com.TheUltimatePleb.JCord.util.WebUtils;

public class IDiscordAPI implements com.TheUltimatePleb.JCord.DiscordAPI {

   @Override
    public void loginWithToken(String token, boolean isBot) {
    JSONObject login = postWithHeader("auth/login", "token", token);
	 if (!login == null){ 
        throw "Token is nothing.";
    } else {
		//Connected.
		}
    }
    }


    @Override
    public void loginAsUser(String email, String password) {

    }
}
