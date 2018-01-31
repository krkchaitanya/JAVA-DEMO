package org.chaitanya.generics;


public class Main {

    public static void main(String[] args){

        FootballPlayer joe=new FootballPlayer("joe");
        BaseballPlayer pat=new BaseballPlayer("pat");
        SoccerPlayer backham=new SoccerPlayer("backhem");

        System.out.println("===================================");
        Team<FootballPlayer> adelaideCrows=new Team<>("adelaideCrows");
        adelaideCrows.addPlayer(joe);
//        adelaideCrows.addPlayer(pat);
//        adelaideCrows.addPlayer(backham);

//        System.out.println(adelaideCrows.numPlayers());


        Team<BaseballPlayer> baseballTeam=new Team<>("chicagoHubs");
        baseballTeam.addPlayer(pat);


        Team<SoccerPlayer> backhem=new Team<>("randomTeam");
        backhem.addPlayer(backham);

        Team<FootballPlayer> hawthorn=new Team<>("hawthorn");
        Team<FootballPlayer> fremantale=new Team<>("frementale");

        hawthorn.matchResult(adelaideCrows,1,0);

    }

}
