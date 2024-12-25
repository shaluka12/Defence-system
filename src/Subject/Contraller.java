/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Subject;


import defence.system.Observer;
import defence.system.Tank;
import java.util.ArrayList;
/**
 *
 * @author Saluka
 */

public class Contraller{

    static void addobsever(Tank tank) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    private boolean area;  
    private  String Msg;
    private  int Strength;
    int[] ar;
    
    
    private final ArrayList<Observer>Observerlist = new ArrayList<>();
    
    
    public  void addObserver (Observer ob){
        Observerlist.add(ob);
        
    }
     public void setArea(boolean area) {
        if (this.area != area) {
            this.area = area;
            notifyComponent();
        }
   }
      public void setMsg(String Msg){
           if(this.Msg != Msg){              
              this.Msg = Msg;
              notifyComponent();
         }

     }   
      
      public void Strenght(int Strength){
           if(this.Strength != Strength){              
              this.Strength = Strength;
              notifyComponent();
         }
     }  

    private void notifyComponent() {
       for(Observer ob  :  Observerlist){
           ob.areaMsg(area);
           ob.sendMsg(Msg);
           ob.Strenght(Strength);
       }
       
    
   }
    public int[] passHelicopterDetails(){
        ar = Observerlist.get(2).passDetails();
        return ar;
    }
    public int[] passTankDetails(){
        ar = Observerlist.get(0).passDetails();
        return ar;
    }
    public int[] passSubmarinDetails(){
        ar = Observerlist.get(1).passDetails();
        return ar;
    }
 
    
   }
     

   
    /**
     *
     * @return
     */
     
    
       
    

