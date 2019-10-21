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
public class Bus {
      
    
    public int penumpang;
    public int maxPenumpang;
    
    public void cetak(){
        System.out.println("Total Penumpang Sekarang :" + penumpang);
        System.out.println("MAX Penumpang Sekarang :" + maxPenumpang);
        if(maxPenumpang < 15){
            System.out.println("Mohon keluar");
        
        }else if(maxPenumpang  > 14){
            System.out.println("Sepi ges");
            
                
    }
    
        
    }
    
}
    
