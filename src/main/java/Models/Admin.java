/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Models;

/**
 *
 * @author ama
 */
public class Admin {
    private String Admin_id;
    private String password;
    private boolean isValide;

    public Admin(String Admin_id, String password, boolean isValide) {
        this.Admin_id = Admin_id;
        this.password = password;
        this.isValide = isValide;
    }

    public Admin() {
    }

    
    
    public String getAdmin_id() {
        return Admin_id;
    }

    public void setAdmin_id(String Admin_id) {
        this.Admin_id = Admin_id;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public boolean isIsValide() {
        return isValide;
    }

    public void setIsValide(boolean isValide) {
        this.isValide = isValide;
    }
    
    
}
