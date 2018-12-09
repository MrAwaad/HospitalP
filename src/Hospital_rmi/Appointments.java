/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Hospital_rmi;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.Date;



/**
 *
 * @author Ahmed Gamal
 */
public class Appointments extends UnicastRemoteObject implements AppointmentsInterface {
    int appointment_ID;
    Date Date;
    int Time;
    
    public Appointments(int app_id,Date date,int time)throws RemoteException
    {
        appointment_ID=app_id;
        Date=date;
        Time=time;
    }
    
    
    public void AddAppointment()throws RemoteException
    {
    
    }
    public void RemoveAppointment()throws RemoteException
    {
        
    }

    public int getAppointment_ID() {
        return appointment_ID;
    }

    public void setAppointment_ID(int appointment_ID) {
        this.appointment_ID = appointment_ID;
    }

    public Date getDate() {
        return Date;
    }

    public void setDate(Date Date) {
        this.Date = Date;
    }

    public int getTime() {
        return Time;
    }

    public void setTime(int Time) {
        this.Time = Time;
    }
    

}
