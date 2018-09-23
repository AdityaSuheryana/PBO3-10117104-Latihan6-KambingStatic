/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo3.pkg10117104.latihan6.kambingstatic;

/**
 *
 * @author  
 * Nama      : Aditya Suheryana
 * Kelas     : IF-3 / PBO-3
 * Nim       : 10117104
 * Deskripsi : Program ini menampilkan Jumlah Hewan Ternak yang dimiliki
 */
public class KambingStatic {

public static final String NAMA_KAMBING = "MIDUN";

public static void main(String[] args){
    Mamalia.jumlahKambing = 485000;
    System.out.println(NAMA_KAMBING + " Memiliki Kambing Sebanyak " + Mamalia.jumlahKambing);
}
}
