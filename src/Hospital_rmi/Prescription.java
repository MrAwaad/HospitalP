/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Hospital_rmi;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author Ahmed
 */
public class Prescription {
   private ArrayList<Medicine> medicines;
   private int id;
   private String MedicineName;
   private int Quantity;
   private Date date;

    public Prescription(ArrayList<Medicine> medicines, int id, String MedicineName, int Quantity, Date date) {
        this.medicines = medicines;
        this.id = id;
        this.MedicineName = MedicineName;
        this.Quantity = Quantity;
        this.date = date;
    }

    public ArrayList<Medicine> getMedicines() {
        return medicines;
    }

    public void setMedicines(ArrayList<Medicine> medicines) {
        this.medicines = medicines;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMedicineName() {
        return MedicineName;
    }

    public void setMedicineName(String MedicineName) {
        this.MedicineName = MedicineName;
    }

    public int getQuantity() {
        return Quantity;
    }

    public void setQuantity(int Quantity) {
        this.Quantity = Quantity;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
   
   
}
 
