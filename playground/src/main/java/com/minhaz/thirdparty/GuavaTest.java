package com.minhaz.thirdparty;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.common.hash.Hashing;

import java.nio.charset.StandardCharsets;
import java.util.HashMap;
import java.util.Map;

public class GuavaTest {
    public static void main(String[] args) {
        String sha256hex = Hashing.sha256()
                .hashString(System.currentTimeMillis() + "", StandardCharsets.UTF_8)
                .toString();
        System.out.println("sha256hex = " + sha256hex);

        boolean deleveled = isPalindrome(null);
        System.out.println("is palindrome = " + deleveled);

        Map<String,Object> map = new HashMap<>();
//You can convert any Object.
        map.put("key3","string1");
        map.put("key4","string2");

        String json = null;
        try {
            json = new ObjectMapper().writeValueAsString(map);
            System.out.println(json);
        } catch (JsonProcessingException e) {
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
