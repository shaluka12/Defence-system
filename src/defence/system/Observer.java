/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package defence.system;

/**
 *
 * @author Saluka
 */
public interface Observer {
    public void  areaMsg(boolean area);
    public void  sendMsg(String msg);
    public void  Strenght(int strength);
    public int[] passDetails();
    
}
