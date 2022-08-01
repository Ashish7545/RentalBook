/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.RentalBook;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class signup extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        PrintWriter out = response.getWriter();
        // now conect the jdbc and take values from jsp and insert it into our dbms
        
//        String userID=(String)(request.getParameter("id"));
        String name=request.getParameter("fname");
        String email=request.getParameter("em");
        String id = request.getParameter("adh");
        String contact =request.getParameter("cont");
        String password=request.getParameter("pass");
        String cpswd=request.getParameter("cpass");
        
        // here we are taking user enter val from jsp and with the help of this servlet
        
        try{
            Connection con;
            Class.forName("oracle.jdbc.driver.OracleDriver");
            
            con = DriverManager.getConnection("jdbc:oracle:thin:@119.160.199.94:1521:mefgi", "mef191160107009","mef191160107009");
            System.out.println("connected");
         
        // now we connected with dbms
    
            String sql="insert into signup (name, email, id, contact, password, cpswd) values(?,?,?,?,?,?)";
            PreparedStatement ps = con.prepareStatement(sql);
            
            ps.setString(1, name);
            ps.setString(2, email);
            ps.setString(3, id);
            ps.setString(4, contact);
            ps.setString(5, password);
            ps.setString(6, cpswd);
            
            ps.executeUpdate();
            RequestDispatcher rd = request.getRequestDispatcher("RentalBookphp\\login.html");
            rd.forward(request, response);
            
        }
        catch(Exception e){
            System.out.println("ERROR :: "+e.getMessage());
        }
    }

}
