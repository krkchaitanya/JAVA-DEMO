package org.chaitanya.collect.map;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Main {

    public static void main(String[] args){
        Map<String,String> map=new HashMap<>();
        map.put("name","chaitanya");
        map.put("actor","john");
        map.put("address","austin");
        System.out.println("=============");
        System.out.println(map.get("name"));


        System.out.println("------------");

        Set<String> keys=map.keySet();
        for(String key:keys){
            System.out.println(map.get(key));
        }
    }

}
