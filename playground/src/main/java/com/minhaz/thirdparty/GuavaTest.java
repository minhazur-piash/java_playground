package com.minhaz.thirdparty;

import com.google.common.hash.Hashing;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.protocol.HttpProcessorBuilder;
import org.eclipse.jetty.client.HttpClient;
import org.eclipse.jetty.client.api.ContentResponse;
import org.eclipse.jetty.client.api.Request;
import org.eclipse.jetty.client.util.BytesContentProvider;
import org.eclipse.jetty.client.util.FormContentProvider;
import org.eclipse.jetty.client.util.StringContentProvider;
import org.eclipse.jetty.http.HttpHeader;
import org.eclipse.jetty.http.HttpMethod;
import org.eclipse.jetty.http.HttpVersion;
import org.eclipse.jetty.util.Fields;
import org.eclipse.jetty.util.ssl.SslContextFactory;
import org.json.JSONObject;

import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeoutException;


//-Dorg.eclipse.jetty.util.log.class=org.eclipse.jetty.util.log.StdErrLog  -Dorg.eclipse.jetty.LEVEL=DEBUG
public class GuavaTest {
    public static void main(String[] args) {


       /* String json = null;
        try {
            json = new ObjectMapper().writeValueAsString(map);
            System.out.println(json);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }*/

        try {
            // Instantiate and configure the SslContextFactory
            // Instantiate and configure the SslContextFactory

            CloseableHttpClient hc = HttpClients.custom()
                    .setHttpProcessor(HttpProcessorBuilder.create().build())
                    .build();


            SslContextFactory.Client sslContextFactory = new SslContextFactory.Client();
            HttpClient httpClient = new HttpClient(sslContextFactory);
            httpClient.setConnectTimeout(1000);
            httpClient.setFollowRedirects(false);
            httpClient.setStopTimeout(1000);
            httpClient.start();
            Fields fields = new Fields();

            Request method = httpClient.newRequest("https://mdacne-staging.herokuapp.com/api/v2/users/448368/shipments?auth_token=c64aVDiimXtVizk59yGn")
                    .method(HttpMethod.GET);
            method.header(HttpHeader.USER_AGENT, "test");
            System.out.println("method = " + method.getHeaders());
            ContentResponse send2 = method
                    .send();
//            System.out.println("send = " + send.getContentAsString());
            System.out.println("send2 = " + send2.getContentAsString());
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (TimeoutException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }


    }

    public static boolean isPalindrome(String word) {
        if (word == null) {
            return false;
        }

        word = word.toLowerCase();
        StringBuilder stringBuilder = new StringBuilder(word);
        String reversedString = stringBuilder.reverse().toString();
        return word.equals(reversedString);
    }
}
