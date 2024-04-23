/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bilangan.bulat;

import java.util.Scanner;
public class BilanganBulat {

  public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int nilai;
        int jumlahPositif = 0;
        int jumlahNegatif = 0;
        int total = 0;
        int jumlahBilangan = 0;

        System.out.println("Masukkan bilangan integer, program akan berhenti jika memasukkan nilai 0:");

        
        while ((nilai = scanner.nextInt()) != 0) {
            if (nilai > 0) {
                jumlahPositif++;
            } else if (nilai < 0) {
                jumlahNegatif++;
            }

            
            if (nilai != 0) {
                total += nilai;
                jumlahBilangan++;
            }
        }

        
         double rataRata = (double) total / jumlahBilangan;

        
        System.out.println("Jumlah bilangan positif adalah " + jumlahPositif);
        System.out.println("Jumlah bilangan negatif adalah " + jumlahNegatif);
        System.out.println("Nilai total adalah " + (double) total);
        System.out.println("Nilai rata-rata " + rataRata);
        
      
    }
}