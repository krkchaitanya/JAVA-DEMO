package org.chaitanya.setset;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Main {


    private static Map<String,HeavenlyBody> solarSystem=new HashMap<>();
    private static Set<HeavenlyBody>  planets=new HashSet<>();

    public static void main(String[] args) {

        HeavenlyBody temp=new HeavenlyBody("Mercury",88);
        solarSystem.put(temp.getName(),temp);
        planets.add(temp);

        temp=new HeavenlyBody("Venus",225);
        solarSystem.put(temp.getName(),temp);
        planets.add(temp);

        temp=new HeavenlyBody("Earth",365);
        solarSystem.put(temp.getName(),temp);
        planets.add(temp);


        temp=new HeavenlyBody("Jupiter",4332);
        solarSystem.put(temp.getName(),temp);
        planets.add(temp);

        HeavenlyBody tempMoon=new HeavenlyBody("IO",.35);
        solarSystem.put(tempMoon.getName(),tempMoon);
        temp.addMoon(tempMoon);

         tempMoon=new HeavenlyBody("Europa",7.1);
        solarSystem.put(tempMoon.getName(),tempMoon);
        temp.addMoon(tempMoon);

         tempMoon=new HeavenlyBody("Ganymeda",16.7);
        solarSystem.put(tempMoon.getName(),tempMoon);
        temp.addMoon(tempMoon);

         tempMoon=new HeavenlyBody("Callisto",23);
        solarSystem.put(tempMoon.getName(),tempMoon);
        temp.addMoon(tempMoon);


         tempMoon=new HeavenlyBody("Nptune",165);
        solarSystem.put(tempMoon.getName(),tempMoon);
        temp.addMoon(tempMoon);

        temp=new HeavenlyBody("Satrun",165);
        solarSystem.put(temp.getName(), temp);
        planets.add(temp);

        temp=new HeavenlyBody("Pluto",248);
        solarSystem.put(temp.getName(), temp);
        planets.add(temp);


        System.out.println("planets--");
        for (HeavenlyBody planet:planets){
            System.out.println("\t"+planet.getName());
        }

        HeavenlyBody body=solarSystem.get("jupiter");
        System.out.println("Moons of "+body.getName());

        for(HeavenlyBody jupiterMoon:body.getSatellites()){
            System.out.println("\t"+jupiterMoon.getSatellites());
        }



    }
}
