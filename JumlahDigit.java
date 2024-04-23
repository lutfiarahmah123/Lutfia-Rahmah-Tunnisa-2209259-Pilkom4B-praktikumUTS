/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package jumlahdigit;

/**
 *
 * @author ASUS
 */
import java.util.Scanner;

public class JumlahDigit {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Masukkan bilangan bulat: ");
        long nomer = scanner.nextLong();
        
        System.out.print("Masukkan digit yang akan dihapus: ");
        int hapusdigit = scanner.nextInt();

        //  menghitung jumlah digit sebelum penghapusan digit
        int sumsebelumhapus = sumDigit(nomer);

        //  digit
        long hasil = extrakDanHapus(nomer, hapusdigit);

        // menghitung jumlah digit setelah penghapusan digit
        int sumSudahHapus = sumDigit(hasil);

       
        System.out.println("Jumlah digit sebelum penghapusan digit " + hapusdigit + ": " + sumsebelumhapus);
        System.out.println("Hasil setelah menghapus digit " + hapusdigit + ": " + hasil);
        System.out.println("Jumlah semua digit setelah penghapusan digit " + hapusdigit + ": " + sumSudahHapus);

        scanner.close();
    }

    //  menghitung jumlah digit dalam bilangan bulat
    public static int sumDigit(long n) {
        int sum = 0;

        //  loop untuk mengekstrak dan menghitung jumlah digit
        while (n != 0) {
            long digit = n % 10;
            sum += digit;
            n /= 10;
        }

        return sum;
    }

    // menghapus digit tertentu dari bilangan bulat
    public static long extrakDanHapus(long nomer, int hapusdigit) {
        // Menghapus digit tertentu
        long remainingNumber = 0;
        long multiplier = 1;

        while (nomer != 0) {
            long digit = nomer % 10;
            if (digit != hapusdigit) {
                remainingNumber = digit * multiplier + remainingNumber;
                multiplier *= 10;
            }
            nomer /= 10;
        }

        return remainingNumber;
    }
}
