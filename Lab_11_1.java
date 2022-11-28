package com.codes;
import java.sql.*;
public class Lab_11_1 {
    public static void main(String[] args) {
        try{
            Class.forName("com.mysql.jdbc.Driver");

            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc", "root", "rounak7100");

            String s = "create table employee3(emp_name varchar(2), emp_id int(2), emp_dept varchar(2))";

            Statement st = con.createStatement();
            st.executeUpdate(s);

            System.out.println("Table created");

            con.close();
        }

        catch(Exception e)
        {
            System.out.println(e);
        }
    }
}
