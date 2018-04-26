package org.chaitanya.polymorph;

public class Main {
    public static void main(String[] args) {


        MazeRunner mazeRunner = new MazeRunner();
        System.out.println(mazeRunner.plot());
        System.out.println((int) (Math.random() * 5));

        for (int i=0;i<5;i++){
            int randomNum=(int)(Math.random()*4);
            Movie movie=movieHandler(randomNum);
            System.out.println(movie.plot());
        }

    }
        public static Movie movieHandler(int randomNum){

        switch(randomNum){
            case 1:
                return new Jaws();

            case 2:
                return new StarWars();

            case 3:
                return new IndependenceDay();

            case 4:
                return new Forgettable();

                default:
                return null;
        }

    }
}
