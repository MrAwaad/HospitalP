/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Hospital_rmi;

/**
 *
 * @author Ahmed Gamal
 */
public class Accounts{
    
    private int account_id;
    private String username;
    private int password;

    public Accounts(int account_id, String username, int password) {
        this.account_id = account_id;
        this.username = username;
        this.password = password;
    }

    public int getAccount_id() {
        return account_id;
    }

    public void setAccount_id(int account_id) {
        this.account_id = account_id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public int getPassword() {
        return password;
    }

    public void setPassword(int password) {
        this.password = password;
    }
    
    
    
    
    public void CreateAccount()
    {
        
    }
    public void DeleteAccount()
    {
        
    }
   public void Login()
   {
       
   }
   
    public void  Register()
    {
        
    }
}
