package org.chaitanya.collect;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class Mapping {

    public static void main(String[] args) {

        Map<String,String> lang=new HashMap<>();
        lang.put("java","a computer programming langulage like python and c sharp");
        lang.put("javascript","a scriptinglanaguage mainly used in creation of classes");
        lang.put("Alhol","algorithmic language");
        lang.put("HtmlCss","content and styling a web page");
        lang.put("Lisp","some kind of styling content used in web app developerment");


        if(lang.containsKey("java")){
            System.out.println("java is already a key ...available");
        }else{
            System.out.println("java key is not available");
        }

        System.out.println("----------------------");
        System.out.println(lang.get("java"));


        for (String key:lang.keySet()){
            System.out.println(key+" : "+ lang.get(key));
        }

        System.out.println("-----------------------------");

        lang.remove("Lisp");

        lang.replace("javascript","its an scripting lan with ang and react frameworls and libraries");


        for (String key:lang.keySet()){
            System.out.println(key+" : "+ lang.get(key));
        }



    }

}
