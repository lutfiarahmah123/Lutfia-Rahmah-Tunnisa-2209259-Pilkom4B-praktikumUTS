/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ASUS
 */
public class Main {
    public static void main(String[] args) {
        // objek limas segiempat 1
        LimasSegiEmpat limas1 = new LimasSegiEmpat(1.0, 1.0, 1.0);
        // hasil perhitungan untuk limas 1
        System.out.println("Limas segi empat dengan luas alas : " + limas1.getLuasAlas() +
                           ", luas selubung limas : " + limas1.getLuasSelubungLimas() +
                           " dan tinggi : " + limas1.getTinggi() +
                           ". Luasnya : " + limas1.Luas() +
                           ", sedangkan volumenya : " + String.format("%.2f", limas1.Volume()));

        //  objek limas segiempat 2
        LimasSegiEmpat limas2 = new LimasSegiEmpat(30, 40, 50);
        //  hasil perhitungan untuk limas 2
        System.out.println("Limas segi empat dengan luas alas : " + limas2.getLuasAlas() +
                           ", luas selubung limas : " + limas2.getLuasSelubungLimas() +
                           " dan tinggi : " + limas2.getTinggi() +
                           ". Luasnya : " + limas2.Luas() +
                           ", sedangkan volumenya : " + String.format("%.2f", limas2.Volume()));

        //  objek limas segiempat 3
        LimasSegiEmpat limas3 = new LimasSegiEmpat(25, 35, 45);
        //  hasil perhitungan untuk limas 3
        System.out.println("Limas segi empat dengan luas alas : " + limas3.getLuasAlas() +
                           ", luas selubung limas : " + limas3.getLuasSelubungLimas() +
                           " dan tinggi : " + limas3.getTinggi() +
                           ". Luasnya : " + limas3.Luas() +
                           ", sedangkan volumenya : " + String.format("%,.2f", limas3.Volume()));
    }
}
