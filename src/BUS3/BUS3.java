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
public class BUS3 {
    

public int penumpang;
public int maxpenumpang;

public BUS3(int maxpenumpang)
{
this.maxpenumpang = maxpenumpang;
penumpang = 0;
}
//Method Mutator
public void addpenumpang(int penumpang)
{
int temp;
temp =  this.penumpang + penumpang;
if(temp>maxpenumpang){
System.out.println("penumpang melebihi kuota");
}
else
{
this.penumpang = temp;
}
}
public void getpenumpang(int password)
{
if (password == 23)
{
System.out.println("pass benar");
}
else
{
System.out.println("pass salah");
}
}
public void cetakpenumpang()
{
System.out.println("penumpang bus sekarang : " + penumpang);
System.out.println("maximum penumpang yang seharusnya adalah :" + maxpenumpang);
}
}