/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo;

import java.util.Scanner;

/**
 *
 * @author tio
 */
public class EKSPO {
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        
       System.out.println("Masukkan angka : ");
       float angka = input.nextInt();
       
        System.out.println("Masukkan angka 2 : ");
       float angka2 = input.nextInt();
       
       System.out.println("Hasil : " + (angka + angka2));

}
}
