/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PraktikumBus;

/**
 *
 * @author tio
 */
public class UjiBus2 {
    public static void main(String[] args) {
        Bus bus = new Bus(100);
        bus.cetakpenumpang();
        
        //penambahan penumpang 
        System.out.println("\n");
        bus.getpenumpang(24);//password
        bus.cetakpenumpang();
        
        //penambahan penumpang
        System.out.println("\n");
         bus.getpenumpang(27);//password
        bus.cetakpenumpang();
        
        //penambhan penumpang 
        System.out.println("\n");
        bus.getpenumpang(24);//password
        bus.cetakpenumpang();
        
        //penambahan penumpang
        System.out.println("\n");
        bus.getpenumpang(10);//password
        bus.cetakpenumpang();
        
        //penambahab penumpang
        System.out.println("\n");
        bus.getpenumpang(87);//password
        bus.cetakpenumpang();
        
        System.out.println("Rata-rata penumpang : " + bus.getAverge() + "kg.");
        System.out.println("Jumlah penumpang sekarang : " + bus.counter());
    }
    
}
