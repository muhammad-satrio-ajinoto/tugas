/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BUS3;

/**
 *
 * @author tio
 */
public class UjiBus3 
{
    public static void main(String[] abc){
        BUS3 Bus = new BUS3(5);
Bus.getpenumpang(17);
Bus.getpenumpang(24);
Bus.cetakpenumpang();
//penambahan penumpang
Bus.addpenumpang(1);
Bus.cetakpenumpang();
//penambahan penumpang
Bus.addpenumpang(2);
Bus.cetakpenumpang();
//penambahan penumpang
Bus.addpenumpang(2);
Bus.cetakpenumpang();
//penambahan penumpang
Bus.addpenumpang(2);
Bus.cetakpenumpang();      
}

    private UjiBus3(int i) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void cetakpenumpang() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void addpenumpang(int i) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void getpenumpang(int i) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
