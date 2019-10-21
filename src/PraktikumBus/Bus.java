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
public class Bus {
 public double penumpang;
public double maxpenumpang;
int counter;
double penumpangBaru;
    
public Bus(int maxpenumpang){
this.maxpenumpang = maxpenumpang;
penumpang = 0;
}
//Method Mutator 
public void addpenumpang(int penumpang)
{
double temp;
temp = this.penumpang + penumpang;
if (temp > maxpenumpang)
{
System.out.println("penumpang melebihi kuota");
}
else
{
this.penumpang = temp;
counter++;
}
}
public void getpenumpang(int password)
{
if (password == 24)
{
System.out.println("Password Benar");
addpenumpang(55);
}
else
{
System.out.println("Password Salah");
}
}
public void cetakpenumpang()
{
System.out.println("Penumpang Bus Sekarang = " + penumpang);
System.out.println("Maksimum penumpang yang seharusnya adalah = " + maxpenumpang);
}
public double getAverge()
{
return penumpang/counter;
}
public int counter()
{
return counter;
}
    
}
