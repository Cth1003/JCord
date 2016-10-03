package com.TheUltimatePleb.JCord.util;

import com.mashape.unirest.http.HttpResponse;
import com.mashape.unirest.http.JsonNode;
import com.mashape.unirest.http.Unirest;
import com.mashape.unirest.http.exceptions.UnirestException;
import com.mashape.unirest.request.HttpRequestWithBody;
import org.json.JSONObject;

public class WebUtils {

    public JSONObject getPostResponse(String url, JSONObject body) {
        try {
            HttpResponse<JsonNode> re = Unirest.post("https://discordapp.com/api/" + url).body(body).asJson();
            
        } catch (UnirestException e) {
            e.printStackTrace();
            return null;
        }
        return null;
    }

}
