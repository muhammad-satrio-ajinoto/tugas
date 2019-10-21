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
public class bus {
    public static void main(String[] args) {
        
    //membuat objek busBesar dari class BUS2
    BUS2 busBesar = new BUS2(40);
    busBesar.cetak();
    
    //penambahan penumpang
    busBesar.addPenumpang(15);//menambahkan 15 penumpang
    busBesar.cetak();
    
     //penambahan penumpang
    busBesar.addPenumpang(5);//menambahkan 55 penumpang
    busBesar.cetak();
    
    //penambahan penumpang
    busBesar.addPenumpang(26);//menambahkan 26 penumpang
    busBesar.cetak();
    
    
    
        
    }
    
}
