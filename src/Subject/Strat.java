/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Subject;

import Main.MainContraller;
import defence.system.Helicopter;
import defence.system.Submarin;
import defence.system.Tank;

/*
 *
 * @author Saluka
 */
public class Strat {
      public static void main(String[] args) {
         Contraller contraller = new Contraller();
         MainContraller mainContraller = new  MainContraller(contraller);
         contraller.addObserver(new Tank(mainContraller));
         contraller.addObserver(new Submarin(mainContraller));
         contraller.addObserver(new Helicopter(mainContraller));
    }
         
 }

