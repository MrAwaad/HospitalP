/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Hospital_rmi;

import java.util.ArrayList;

/**
 *
 * @author Ahmed Gamal
 */
public class Pharmacy {
    private int PharID;
    private String Location;
    private int phone_No;
    private ArrayList<Medicine> medicine;

    public Pharmacy(int PharID, String Location, int phone_No, ArrayList<Medicine> medicine) {
        this.PharID = PharID;
        this.Location = Location;
        this.phone_No = phone_No;
        this.medicine = medicine;
    }

    public int getPharID() {
        return PharID;
    }

    public void setPharID(int PharID) {
        this.PharID = PharID;
    }

    public String getLocation() {
        return Location;
    }

    public void setLocation(String Location) {
        this.Location = Location;
    }

    public int getPhone_No() {
        return phone_No;
    }

    public void setPhone_No(int phone_No) {
        this.phone_No = phone_No;
    }

    public ArrayList<Medicine> getMedicine() {
        return medicine;
    }

    public void setMedicine(ArrayList<Medicine> medicine) {
        this.medicine = medicine;
    }
    
    
    
public void AddMedicine(Medicine m)
{
    medicine.add(m);
}
 public void RemoveMedicine(Medicine m)
 {
    medicine.remove(m);
 }
 
 public void EditMedicine()
 {
 
 
 } 
 
    
}
