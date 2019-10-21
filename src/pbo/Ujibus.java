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
public class Ujibus {
    public static void main(String[] args){
    //membuat projek busMini dari kelas Bus
    Bus busMini = new Bus();
    //memasukkan nilai jumlah penumpang dan penumpang maximal ke
    //dalam objek busMini
    busMini.penumpang = 5;
    busMini.maxPenumpang = 15;
    //mengambil method cetak pada kelas Bus
    busMini.cetak();
    //menambah penumpang pada busMini
    busMini.penumpang = busMini .penumpang + 5;
    //memanggil method cetak pada kelas Bus
    busMini.cetak();
    //mengurangi jumlah penumpang pada busMini
    busMini.penumpang = busMini.penumpang - 3;
    busMini.cetak();
    //menambah penumpang pada busMini
    busMini.penumpang = busMini .penumpang + 8;
    busMini.cetak();
    
    

    } 
    
       
    
}
