package org.example;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;

public class HttpStatusChecker {

    public String getStatusImage(int code) throws IOException {
        String uri = "https://http.cat/" + code + ".jpg";
        String request = "GET" + uri + "HTTP/1.1 \nHost: https://http.cat";
        URL url = new URL(uri);
        HttpURLConnection connection = (HttpURLConnection) url.openConnection();

        try {
            connection.setRequestMethod("GET");
            int responseCode = connection.getResponseCode();
            if (responseCode == 404) {
                throw new RuntimeException("Image not found for status code: " + code);
            }
            return uri;
        } finally {
            connection.disconnect();
        }
    }
}
