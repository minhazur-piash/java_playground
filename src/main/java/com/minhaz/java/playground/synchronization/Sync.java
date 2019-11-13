package com.minhaz.java.playground.synchronization;

import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public class Sync {
    public Map<String, Date> lastLogin = Collections.synchronizedMap(new HashMap<String, Date>());

    public Sync() {
        lastLogin.put("piash", new Date());
        lastLogin.get("piash");
    }

    public static void main(String[] args) {

    }
}
