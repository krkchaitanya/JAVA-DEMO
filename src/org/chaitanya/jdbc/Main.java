package org.chaitanya.jdbc;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Database db=new Database();
        Scanner scanner=new Scanner(System.in);
        System.out.println("Select options ...11..12..13..14.....");
        System.out.println("Enter student_id");
        int findVal=scanner.nextInt();
        db.searchStudent(findVal);
        System.out.println("==============================");
        System.out.println("select options...sandeep...venkat...shrawan....chaitanya..........");
        System.out.println("enter student_name");
        String person=scanner.nextLine();
        db.searchStudent(person);

    }
}
