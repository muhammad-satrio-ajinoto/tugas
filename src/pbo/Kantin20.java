/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo;

import javax.swing.JOptionPane;

/**
 *
 * @author tio
 */
public class Kantin20 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         String str, str1;

        int choice, z,  a = 3;
        int t, s, tab = 100000;

        

        try {
            do {
                   {
                    do {
                        str = JOptionPane.showInputDialog(null, "[1] MENU \n[2]KELUAR \n\n Masukkan Pilihan Menu:", "Pilih Transaksi", 3);

                        choice = Integer.parseInt(str);

                        switch (choice) {
                            case 1:
                                 JOptionPane.showInputDialog(null, "[1] PECEL 10 K\n[2] BAKSO 2 K (1) \n[3] MI GORENG 5 K \n\n Masukkan Pilihan Menu:", "Pilih Transaksi", 3);
                                    switch (choice) {
                                        
                                    case 1:
                                ambil(tab, t = 10000);

                                tab = getsaldo();

                                z = JOptionPane.showConfirmDialog(null, "Melanjutkan transaksi lain?", "KANTIN", JOptionPane.YES_NO_OPTION, 1); //konfirmasi transaksi lain

                                if (z == 0) {
                                    break;
                                 } else {

                                }
                                System.exit(0);
                                
                                    case 2:   
                                ambil(tab, t = 2000);

                                tab = getsaldo();

                                z = JOptionPane.showConfirmDialog(null, "Melanjutkan transaksi lain?", "KANTIN", JOptionPane.YES_NO_OPTION, 2); //konfirmasi transaksi lain

                                if (z == 0) {
                                    break;
                                } else {

                                }
                                System.exit(0);
                                
                                    case 3:
                                ambil(tab, t = 5000);

                                tab = getsaldo();

                                z = JOptionPane.showConfirmDialog(null, "Melanjutkan transaksi lain?", "KANTIN", JOptionPane.YES_NO_OPTION, 3); //konfirmasi transaksi lain

                                if (z == 0) {
                                    break;
                                } else {

                                }
                                System.exit(0);
                                }
                                  
                                
                            case 2:
                                z = JOptionPane.showConfirmDialog(null,
                                        "Anda ingin keluar ? ", "Keluar", JOptionPane.YES_NO_OPTION, 0);
                                if (z == 0) {
                                    JOptionPane.showMessageDialog(null, "Terimakasih telah bertransaksi menggunakan ATM BRI, ambil kartu ATM Anda LALU BUANG");
                                    {
                                        System.exit(0);

                                    }

                                } else {
                                    break;
                                }

                            default:
                                JOptionPane.showMessageDialog(null, "Pilihan menu tidak tersedia\nSilahkan ulangi lagi", "ERROR", 0);
                        }
                    } while (1 == 1);
                

                  
                   
                }
            } while (1 == 1);

        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Kesalahan !\nPastikan kode yang anda masukkan berformat benar!\nPROGRAM KELUAR! \nTerimakasih", "ERROR", 0);

        }
    }
    private static int saldo;


    public static void ambil(int tab, int t) {
        if (t % 100 != 0) {
            JOptionPane.showMessageDialog(null, "Mesin ATM BRI tidak menerima uang koin \nSilahkan ulangi lagi", "Transaksi GAGAL", 0);
        } else {
            if (t > tab) {
                JOptionPane.showMessageDialog(null, "saldo anda tidak mencukupi \nSilahkan lakukan penyetoran", "Transaksi GAGAL", 0);
            } else {
                saldo = tab - t;
                JOptionPane.showMessageDialog(null, "Saldo anda saat ini sebesar : " + saldo);
                
            }
        }
    }
    

    public static int getsaldo() {
        return saldo;
    }
    
}
