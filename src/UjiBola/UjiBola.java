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
public class UjiBola {
    public static void main(String[] args) {
        double jarijari = 14;
        Bola Objekbola = new Bola(7);
        Objekbola.showDiameter();
        Objekbola.showLuasPermukaan();
        Objekbola.showVolume();
        System.out.println("\n");
        Objekbola.setjarijari(jarijari);
        Objekbola.showDiameter();
        Objekbola.showLuasPermukaan();
        Objekbola.showVolume();
    }
    
}
