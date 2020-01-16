package com.minhaz.thirdparty;

import org.apache.http.*;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.protocol.HttpContext;

import java.io.IOException;

public class InterceptorsExample {

    public static void main(String args[]) throws Exception {

        //Creating an HttpRequestInterceptor
        HttpRequestInterceptor requestInterceptor = new HttpRequestInterceptor() {
            @Override
            public void process(HttpRequest request, HttpContext context) throws
                    HttpException, IOException {
                //Printing remaining list of headers
                Header[] headers = request.getAllHeaders();
                for (int i = 0; i < headers.length; i++) {
                    System.out.println(headers[i].getName());
                }
            }
        };

        //Creating a CloseableHttpClient object
        CloseableHttpClient httpclient =
                HttpClients.custom().addInterceptorFirst(requestInterceptor).build();

        //Creating a request object
        HttpGet httpget1 = new HttpGet("https://mdacne-staging.herokuapp.com/api/v2/users/448368/shipments?auth_token=c64aVDiimXtVizk59yGn");

        //Setting the header to it

        //Executing the request
        HttpResponse httpresponse = httpclient.execute(httpget1);

        //Printing the status line
        System.out.println(httpresponse.getStatusLine());
    }
}