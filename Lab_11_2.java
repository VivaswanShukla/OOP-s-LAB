package com.codes;
import java.sql.*;
import java.util.*;
public class Lab_11_2 {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        int i = 0;
        while(i<2) {
            System.out.println("Enter the name: ");
            String emp_name = sc.nextLine();
            System.out.println("Enter the id: ");
            String s1 = sc.nextLine();
            int emp_id = Integer.parseInt(s1);
            System.out.println("Enter the department: ");
            String emp_dept = sc.nextLine();
            try {
                Class.forName("com.mysql.jdbc.Driver");

                Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc", "root", "rounak7100");

                String s = "insert into employee4(emp_name,emp_id,emp_dept) values(?,?,?)";

                PreparedStatement ps = con.prepareStatement(s);
                ps.setString(1, emp_name);
                ps.setInt(2, emp_id);
                ps.setString(3, emp_dept);
                ps.executeUpdate();
                con.close();
            } catch (Exception e) {
                System.out.println(e);
            }
            System.out.println("Would you like to continue y/n");
            String imp = sc.nextLine();
            if(imp.equals("n"))
            {
                break;
            }
        }
    }
}
