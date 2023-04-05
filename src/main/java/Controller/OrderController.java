/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import Database.DBConnection;
import Models.Orders;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author A V I A N
 */
public class OrderController {
    
    public boolean customerOrder(Orders order){
        
        Connection connection = DBConnection.getConnection();
        
        try{
         
            Statement stam = connection.createStatement();
            int rows = stam.executeUpdate((" INSERT INTO `order`(`id`,"
              + " `name`, `email`, `address`, `number`, `price`) VALUES ('"+order.getId()+"','"
            +order.getName()+"','"+order.getEmail()+"','"+order.getAddress()+"','"+order.getNumber()+"','"+order.getPrice()+"')"));
            
           return rows>0;
            
        }catch(Exception ex){
            System.out.println("ERROR"+" "+ex);
        }
         
        return false;
    }
    
    public boolean orderUpdate(Orders order) {
        
         Connection connection = DBConnection.getConnection(); 
         try {   
            Statement statement = connection.createStatement();
            int rows = statement.executeUpdate("UPDATE `order` SET  `name` = '"
                    + order.getName() +  "', `email` = '" + order.getEmail() +"', `address` = '" + order.getAddress() + "', `number` = '" + order.getNumber() + "', `price` = '" + order.getPrice() + "' WHERE (`id` = '"  + order.getId() + "')");
            
            return rows > 0;
            
        } catch (Exception ex){
            System.out.println("ERROR"+" "+ex);
        }  
        return false;
     }
    
    public boolean deleteOrder(String id){
    Connection connection = DBConnection.getConnection(); 
     
        try{
          Statement stmt=connection.createStatement();
           
          int rows=stmt.executeUpdate(" DELETE FROM `order` WHERE "
           + "(`id`='"+id+"');");
      		
	    return rows>0;
	
        }catch(SQLException ex){
            System.out.println(ex.getMessage());
        }
        return false;
    }
}
