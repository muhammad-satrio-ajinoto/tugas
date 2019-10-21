/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author tio
 */
public class TestSiswa {
    public static void main(String[] args) {
         
        EncapSiswa siswa = new EncapSiswa();
        siswa.setName("Wakanda");
        siswa.setAddress("NGALAM");
        siswa.setAge(14);
        siswa.setUltah("SUHAT CITY");
        siswa.setHp("081359418005");
        
        System.out.println("Nama : " + siswa.getName());
        System.out.println("Age :" + siswa.getAge());
        System.out.println("Address : " + siswa.getAddress());
        System.out.println("ULTAH : " + siswa.getUltah());
        System.out.println("NO HP :" + siswa.getHp());
        
    }
    
}
