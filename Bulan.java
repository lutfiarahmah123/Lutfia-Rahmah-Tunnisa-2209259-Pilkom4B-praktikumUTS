/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bulan;

/**
 *
 * @author ASUS
 */
import java.util.Random;
public class Bulan {

    public static void main(String[] args) {
        
        String[] namaBulan = {"Januari", "Februari", "Maret", "April", "Mei", "Juni",
                              "Juli", "Agustus", "September", "Oktober", "November", "Desember"};

        // Membuat objek dari kelas Random
        Random random = new Random();

       
        int nomorBulan = random.nextInt(12) + 1;

        
        System.out.println("Nomor bulan: " + nomorBulan);
        System.out.println("Nama bulan: " + namaBulan[nomorBulan - 1]);
    }
}