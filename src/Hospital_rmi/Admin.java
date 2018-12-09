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
public class Admin extends Staff{
    
    public Admin(int id, String un, String pass, String email, int ph) {
        super(id, un, pass, email, ph);
    }
    
     public int getId()
    {
        return ID;
    }

    public void setId(int id)
    {
        this.ID = id;
    }

    public void setUsername(String username)
    {
        this.Username = username;
    }
    
    
    public String getUsername()
    {
        return Username;
    }

    public void setPassword(String Password)
    {
        this.Password = Password;
    }

      public String getPassword()
    {
        return Password;
    }
    
    public void setEmail(String Email)
    {
        this.Email = Email;
    }

    public String getEmail()
    {
        return Email;
    }

    
      public void setPhone(int Phone) 
    {
        this.Phone = Phone;
    }
 
    public int getPhone()
    {
        return Phone;
    }
    
    
    
}
