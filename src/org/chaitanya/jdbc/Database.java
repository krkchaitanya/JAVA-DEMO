package org.chaitanya.jdbc;

import org.chaitanya.studentGetSet.studentTable;

import org.chaitanya.studentGetSet.*;
import java.sql.*;

public class Database {
        studentTable stu=new studentTable();
        studentInfoTable stuInfo=new studentInfoTable();
//search student by id.............
        public void searchStudent(int id){
        try{
//step1 load the driver class
            Class.forName("oracle.jdbc.driver.OracleDriver");

//step2 create  the connection object
            Connection con=DriverManager.getConnection(
                    "jdbc:oracle:thin:@localhost:1521:xe","system","password");

//step3 create the statement object
            Statement stmt=con.createStatement();

//step4 execute query
//            ResultSet rs=stmt.executeQuery(
//                    "SELECT * from student s inner join student_info si on s.student_id=si.fkid " +
//                            "where s.student_id="+id);

            ResultSet rs=stmt.executeQuery(
                    "SELECT * from student s where s.student_id="+id);

            while(rs.next()) {
                stu.setStudent_id(rs.getInt(1));
                stu.setStudent_name(rs.getString(2));
                stu.setStudent_age(rs.getInt(3));
                stu.setStudent_dob(rs.getString(4));

                System.out.println("student data................");
                System.out.println("ID :" + stu.getStudent_id());
                System.out.println("NAME :" + stu.getStudent_name());
                System.out.println("AGE :" + stu.getStudent_age());
                System.out.println("DOB :" + stu.getStudent_dob());
            }

//                System.out.println(rs.getInt(1)+"  "+rs.getString(2)+"  "+
//                        rs.getInt(3)+" "+rs.getString(4));

//step5 close the connection object
            con.close();

        }catch(Exception e){ System.out.println(e);}
        };


    public void searchStudent(String name){
        try{
//step1 load the driver class
            Class.forName("oracle.jdbc.driver.OracleDriver");

//step2 create  the connection object
            Connection con=DriverManager.getConnection(
                    "jdbc:oracle:thin:@localhost:1521:xe","system","password");

//step3 create the statement object
            Statement stmt=con.createStatement();


            ResultSet rs=stmt.executeQuery(
                    "SELECT * from student where student_name='"+name+"'");

            while(rs.next()) {
                stu.setStudent_id(rs.getInt(1));
                stu.setStudent_name(rs.getString(2));
                stu.setStudent_age(rs.getInt(3));
                stu.setStudent_dob(rs.getString(4));

                System.out.println("student data................");
                System.out.println("ID :" + stu.getStudent_id());
                System.out.println("NAME :" + stu.getStudent_name());
                System.out.println("AGE :" + stu.getStudent_age());
                System.out.println("DOB :" + stu.getStudent_dob());
            }

//                System.out.println(rs.getInt(1)+"  "+rs.getString(2)+"  "+
//                        rs.getInt(3)+" "+rs.getString(4));

//step5 close the connection object
            con.close();

        }catch(Exception e){ System.out.println(e);}
    }


}


