package com.latihan;

import java.util.Scanner;

/*
 * @author
 * Nama              : M Ikhlas N R
 * Kelas             : IF-1
 * NIM               : 10119022
 * Deskripsi Program : Program Tunjangan Latihan 17
 *
 */
public class Tunjangan {
    public static void main(String[] args) {
        // Deklarasi Variabel
        double gajiPokok, tunjangan, totalGaji;
        String status;

        // membuat scanner baru
        Scanner keyboard = new Scanner(System.in);

        // Masukkan Data
        System.out.println("================Program Tunjangan================");

        System.out.print("Berapa gaji pokok anda perbulan?: Rp. ");
        gajiPokok = keyboard.nextDouble();

        System.out.print("Status Anda ? (Menikah/Belum)\t: ");
        status = keyboard.next();

        status = status.toLowerCase();
        tunjangan = (status.equals("menikah")) ? gajiPokok * 0.35 : 0;
        System.out.println(tunjangan);
        totalGaji = gajiPokok + tunjangan;

        //Keluaran Data
        System.out.println("======Hasil Perhitungan Gaji Anda======");
        System.out.println("Gaji Pokok\t\t: " + gajiPokok);
        System.out.println("Tunjangan\t\t: " + tunjangan);
        System.out.println("Total Gaji\t\t: " + totalGaji);
        System.out.println("(Developed by : M Ikhlas N R)");
    }
}
