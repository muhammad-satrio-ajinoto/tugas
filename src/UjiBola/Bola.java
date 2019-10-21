/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UjiBola;

/**
 *
 * @author tio
 */
public class Bola {
    
    private double jarijari;
    public Bola(double jarijari){
        this.jarijari = jarijari;
    }
    public void setjarijari(double jarijari){
        this.jarijari = jarijari;
    }
    public void showDiameter(){
        System.out.println("Diameter Bola: " +2*jarijari);
    }
    public void showLuasPermukaan(){
        System.out.println("Volume Bola: " + (4*Math.PI*Math.pow(jarijari, 2)));
    }
    public void showVolume(){
        System.out.println("Luas Permukaan bola: " +(4/3*Math.PI*Math.pow(jarijari, 3)));
    }
    
}
