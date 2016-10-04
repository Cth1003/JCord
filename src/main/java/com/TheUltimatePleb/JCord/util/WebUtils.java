package com.TheUltimatePleb.JCord.util;

import com.mashape.unirest.http.HttpResponse;
import com.mashape.unirest.http.JsonNode;
import com.mashape.unirest.http.Unirest;
import com.mashape.unirest.http.exceptions.UnirestException;
import com.mashape.unirest.request.GetRequest;
import org.apache.commons.io.IOUtils;
import org.json.JSONObject;

import java.io.IOException;
import java.nio.charset.Charset;

public class WebUtils {

    static WebUtils wb;

    public JSONObject getPostResponse(String url, JSONObject body) {
        try {
            HttpResponse<JsonNode> re = Unirest.post("https://discordapp.com/api/" + url).body(body).asJson();
            JSONObject obj = re.getBody().getObject();
            return obj;
        } catch (UnirestException e) {
            e.printStackTrace();
            return null;
        }
    }

    public JSONObject getGetResponse(String url) {
        try {
            GetRequest get = Unirest.get("https://discordapp.com/api/" + url);
            JSONObject obj = new JSONObject();
            IOUtils.toString(get.getBody().getEntity().getContent(), Charset.forName("UTF-8"));
            return obj;
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }

}
