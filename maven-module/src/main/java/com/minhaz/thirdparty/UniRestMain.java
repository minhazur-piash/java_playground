package com.minhaz.thirdparty;

import kong.unirest.GetRequest;
import kong.unirest.Unirest;

import java.util.Arrays;

public class UniRestMain {
    public static void main(String[] args) {
        GetRequest getRequest = Unirest.get("https://mdacne-staging.herokuapp.com/api/v2/users/448368/shipments?auth_token=c64aVDiimXtVizk59yGn");
        getRequest.header(" User-Agent", "curl/7.64.1");
        getRequest.header(" Accept", "*/*");
        getRequest.getHeaders().all().forEach( (t) -> {
            System.out.println(t.getName());
        });

        System.out.println("status = " + getRequest.asString().getBody());
    }
}
