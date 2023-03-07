/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import Database.DBConnection;
import Models.Admin;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 *
 * @author ama
 */
public class AdminController {
    
    public Admin Login(String id,String password){
        
        final Connection connection=DBConnection.getConnection();
        String sql_query="SELECT*FROM admin WHERE id=? and password=?";
        Admin admin=null;
        
        
        try{
            PreparedStatement stmt = connection.prepareStatement(sql_query);
            stmt.setString(1, id);
            stmt.setString(2, password);
            
            ResultSet rs=stmt.executeQuery();
            
            while(rs.next()) {
				
				
		admin = new Admin();
		admin.setAdmin_id(id);
		admin.setPassword(password);
		admin.setIsValide(true);
				
		}
            
        }catch(Exception ex){
            System.out.println("ERROR"+ex);
        }
        return admin;
    }
}
