package com.minhaz.thirdparty;

import org.apache.http.HttpHeaders;
import org.apache.http.HttpRequest;
import org.apache.http.HttpResponse;
import org.apache.http.NameValuePair;
import org.apache.http.client.HttpClient;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpHead;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.message.BasicNameValuePair;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class apachehttp {
    public static void main(String[] args) throws IOException {
        BasicNameValuePair basicNameValuePair = new BasicNameValuePair("auth_token", "ZKQ7YTkzmsS4K2DbtX95");
        ArrayList<BasicNameValuePair> nameValuePairs = new ArrayList<>();
        nameValuePairs.add(basicNameValuePair);

        HttpGetWithEntity e = new HttpGetWithEntity("https://mdacne.com/api/v2/users/1010706/shipments");
        e.setHeader(HttpHeaders.CONTENT_TYPE, "application/x-www-form-urlencoded");
        e.setEntity(new UrlEncodedFormEntity(nameValuePairs));


        HttpClient client = new DefaultHttpClient();
        HttpResponse response = client.execute(e);



// Get the response
        BufferedReader rd = new BufferedReader(new InputStreamReader(response.getEntity().getContent()));

        String line = "";
        while ((line = rd.readLine()) != null) {
            System.out.println("line = " + line);
        }
    }
}
