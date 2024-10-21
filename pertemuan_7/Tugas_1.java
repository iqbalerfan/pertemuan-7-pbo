/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pertemuan_7;

/**
 *
 * @author iqbal
 */


import java.util.Scanner;

public class Tugas_1{
    public static void main(String[] args) {
        Scanner masukan = new Scanner(System.in);
        
        System.out.println("TOKO SERBA ADA");
        System.out.println("**************");
        int totalItem = 0;
        
        while (totalItem < 1 || totalItem > 5) {
            System.out.print("Masukkan Item Barang (1-5): ");
            totalItem = masukan.nextInt();

            if (totalItem > 5) {
                System.out.println("Jumlah barang melebihi batas.");
            } else if (totalItem < 1) {
                System.out.println("Jumlah barang harus minimal 1.");
            }
        }
        
        
        String[] kodeItem = new String[totalItem];
        String[] namaItem = new String[totalItem];
        int[] hargaItem = new int[totalItem];
        int[] kuantitasItem = new int[totalItem];
        int[] totalPerItem = new int[totalItem];
        
        int totalHarga = 0;

        
        for (int index = 0; index < totalItem; index++) {
            System.out.println("\nData ke " + (index + 1));
            System.out.print("Masukkan Kode: ");
            kodeItem[index] = masukan.next();

            System.out.print("Masukkan Jumlah Beli: ");
            kuantitasItem[index] = masukan.nextInt();

           
            switch (kodeItem[index]) {
                case "a001":
                    namaItem[index] = "Buku";
                    hargaItem[index] = 8000;
                    break;
                case "a002":
                    namaItem[index] = "Pensil";
                    hargaItem[index] = 2500;
                    break;
                case "a003":
                    namaItem[index] = "Pulpen";
                    hargaItem[index] = 3000;
                    break;
                case "a004":
                    namaItem[index] = "Penggaris";
                    hargaItem [index] = 5000;
                    break;
                case "a005":
                    namaItem[index] = "Penghapus";
                    hargaItem[index] = 2000;
                    break;
                default:
                    namaItem[index] = "Barang Tidak Dikenal";
                    hargaItem[index] = 0;
                    break;
            }
            
            
            totalPerItem[index] = hargaItem[index] * kuantitasItem[index];
            totalHarga += totalPerItem[index];
        }
        
        
        System.out.println("\n=============== TOKO SERBA ADA ===============");
        System.out.println("**********************************************");
        System.out.println("No   Kode Barang   Nama Barang   Harga   Jumlah Beli   Jumlah Bayar");
        System.out.println("--------------------------------------------------------------");

        for (int index = 0; index < totalItem; index++) {
            System.out.printf("%-4d %-13s %-13s %-10d %-13d %-10d\n", 
                              (index + 1), kodeItem[index], namaItem[index], hargaItem[index], kuantitasItem[index], totalPerItem[index]);
        }
        
        System.out.println("--------------------------------------------------------------");
        System.out.println("Total Bayar: " + totalHarga);
    }
}
