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
public class Clinic {
    private int ID;
    private int Type;
    private String Location;
    private ArrayList<Doctor> doctors;

    public Clinic(int ID, int Type, String Location, ArrayList<Doctor> doctors) {
        this.ID = ID;
        this.Type = Type;
        this.Location = Location;
        this.doctors = doctors;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public void setType(int Type) {
        this.Type = Type;
    }

    public void setLocation(String Location) {
        this.Location = Location;
    }

    public void setDoctors(ArrayList<Doctor> doctors) {
        this.doctors = doctors;
    }

    public int getID() {
        return ID;
    }

    public int getType() {
        return Type;
    }

    public String getLocation() {
        return Location;
    }

    public ArrayList<Doctor> getDoctors() {
        return doctors;
    }
    
}
