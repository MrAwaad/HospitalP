/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Hospital_rmi;

import java.rmi.RemoteException;
import java.util.ArrayList;

/**
 *
 * @author Ahmed Gamal
 */
public class Patient extends Staff{
    int visa_no;
    String Name;
    ArrayList<Appointments> appoinment;
    public Patient(int id, String un,String Na, String pass, String email, int ph)
    {
        super(id, un, pass, email, ph);
        Name=Na;
    }
    
    public void setName(String name)
    {
        this.Name = name;
    }
    
    public String getName()
    {
        return Name;
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
    
    public int getVisa_no()
    {
        return visa_no;
    }

    public void setVisa_no(int visa_no)
    {
        this.visa_no = visa_no;
    }
    
    public void cancel(Appointments A)throws RemoteException
    {
        appoinment.remove(A);
    }
    public void MakeReservation(Appointments A)throws RemoteException
    {
        appoinment.add(A);
    }
    
}
