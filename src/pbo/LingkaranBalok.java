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
public class LingkaranBalok {
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        System.out.println("PILIH : \n [1]LUAS ALAS LINGKARAN \n [2]LUAS ALAS BALOK \n [3]LUAS ALAS KERUCUT");
        int pilih = input.nextInt();
        
        switch (pilih) {
            case 1:
                System.out.println("==LUAS ALAS LINGKARAN==");
                System.out.println("Masukkan jari jari");
                int r = input.nextInt();
                System.out.println(" Hasil : " + (4 * 22/7 * r * r));
                System.exit(0);
            case 2:
                System.out.println("==LUAS ALAS BALOK==");
                
                System.out.println("Masukkan panjang :");
                int p = input.nextInt();
                System.out.println("Masukkan lebar :");
                int l = input.nextInt();
                System.out.println("Masukkan tinggi :");
                int t = input.nextInt();
                System.out.println("Masukkan panjang :");
                System.out.println(" luas permukaan balok : " + ((2*p*l)+(2*p*t)+(2*l*t)));
                System.exit(0);
            case 3:
                System.out.println("==LUAS ALAS KERUCUT==");
                
                System.out.println("Masukkan alas :");
                int a = input.nextInt();
                System.out.println("Masukkan tinggi :");
                int g = input.nextInt();
                System.out.println(" Hasil :" + (1/2 * a * g));
                System.exit(0);
            default:
                break;
        }    
    }
}
