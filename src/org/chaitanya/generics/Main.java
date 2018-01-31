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


        //----------melboune team and member------
        Team<FootballPlayer> melbourne=new Team<>("melbourne");
        FootballPlayer nidesh=new FootballPlayer("nidesh");

        melbourne.addPlayer(nidesh);




        hawthorn.matchResult(adelaideCrows,1,0);
        melbourne.matchResult(hawthorn,3,1);



        System.out.println("Rankings ");
        System.out.println(adelaideCrows.getName()+" :" +adelaideCrows.ranking());
        System.out.println(melbourne.getName()+" :" +melbourne.ranking());
        System.out.println(hawthorn.getName()+" "+ hawthorn.ranking());

        System.out.println(adelaideCrows.compareTo(melbourne));
        System.out.println(melbourne.compareTo(hawthorn));

    }

}
