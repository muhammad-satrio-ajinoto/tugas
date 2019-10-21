/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bus_2;

/**
 *
 * @author tio
 */
public class BUS2 {
    
    
    private int penumpang;
    private int maxPenumpang;
    
    //konstruksi kelas Bis
    public BUS2(int maxPenumpang){
        this.maxPenumpang = maxPenumpang;
        penumpang = 0;
       
    }
    //nethod untuk menambahkan penumpang
    public void addPenumpang(int penumpang){
        int temp;
        temp = this.penumpang + penumpang;
        if(temp >= maxPenumpang){
            System.out.println("penumpang melebihi kuota paketan");
        }else{
            this.penumpang = temp;
        }
        
    }

public void cetak(){
System.out.println("Penumpang bis : " + penumpang);
System.out.println("Penumpang bis : " + maxPenumpang);
    
}

   
    }
