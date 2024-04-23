/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ASUS
 */
 public class LimasSegiEmpat {
     double luasAlas;
     double luasSelubungLimas;
     double tinggi;

    // Constructor tanpa parameter
    public LimasSegiEmpat() {
        this.luasAlas = 0;
        this.luasSelubungLimas = 0;
        this.tinggi = 0;
    }

  
    public LimasSegiEmpat(double luasAlasBaru, double luasSelubungLimasBaru, double tinggiBaru) {
        this.luasAlas = luasAlasBaru;
        this.luasSelubungLimas = luasSelubungLimasBaru;
        this.tinggi = tinggiBaru;
    }

    // Get untuk luas alas
    public double getLuasAlas() {
        return luasAlas;
    }

    // Get luas selubung limas
    public double getLuasSelubungLimas() {
        return luasSelubungLimas;
    }

    // Get tinggi
    public double getTinggi() {
        return tinggi;
    }

    // luas limas segiempat
    public double Luas() {
        return luasAlas + luasSelubungLimas;  
    }

    //volume limas segiempat
    public double Volume() {
        return (1.0/3) * luasAlas * tinggi;
    }

    // Set luas alas
    public void setLuasAlas(double luasAlasBaru) {
        this.luasAlas = luasAlasBaru;
    }

    // Set luas selubung limas
    public void setLuasSelubungLimas(double luasSelubungLimasBaru) {
        this.luasSelubungLimas = luasSelubungLimasBaru;
    }

    // Set tinggi
    public void setTinggi(double tinggiBaru) {
        this.tinggi = tinggiBaru;
    }
}