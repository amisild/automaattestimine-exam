package com.amisild;

import org.junit.jupiter.api.Test;

import java.io.DataOutputStream;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;

public class ColorUtil<parameters> {
    Ring ring = new Ring();

    public ColorUtil() throws IOException {
    }

    public void getHexColor(String hexColor){

    }

    URL url = new URL("https://www.colourlovers.com/api");
    HttpURLConnection con = (HttpURLConnection) url.openConnection();
    con.setRequestMethod("GET");

    Map<String, String> parameters = new HashMap<>();
    parameters.put("param1", "val");

    con.setDoOutput(true);
    DataOutputStream out = new DataOutputStream(con.getOutputStream());
    out.writeBytes(ParameterStringBuilder.getParamsString(parameters));
    out.flush();
    out.close();

}