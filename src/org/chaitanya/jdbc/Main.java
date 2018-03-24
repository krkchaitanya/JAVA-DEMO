package org.chaitanya.jdbc;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Database db=new Database();
        Scanner scanner=new Scanner(System.in);
        System.out.println("Select options ...11..12..13..14.....");
        int findVal=scanner.nextInt();
        db.searchStudent(findVal);
    }
}
