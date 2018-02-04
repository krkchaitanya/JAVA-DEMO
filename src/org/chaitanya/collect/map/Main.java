package org.chaitanya.collect.map;

import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args){
        Map<String,String> map=new HashMap<>();
        map.put("name","chaitanya");
        map.put("actor","john");
        map.put("address","austin");

        System.out.println(map);
    }

}
