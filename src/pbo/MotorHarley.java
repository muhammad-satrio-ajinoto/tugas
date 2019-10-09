/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo;

/**
 *
 * @author tio
 */
public class MotorHarley {
    public static void main(String[]args){
        MotorHarley harley = new MotorHarley();
        harley.setMerk("");
        harley.setNama("");
    }
    private void setMerk(String merk){
        merk = "yamaha";
        System.out.println("Merk Sepeda Motor : " + merk);
        
    }
     private void setNama(String nama){
        nama = "aerox";
        System.out.println("Jenis Sepeda Motor : " + nama);
     }
}
