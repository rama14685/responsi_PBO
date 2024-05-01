/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugasRama;

/**
 *
 * @author Asus
 */
public class Student extends Person {
    String nim;
    public double spp;
    public double sks;
    public double modul;

    public Student() {
        System.out.println("Inside Student:Constructor");
        super.name = "Anda";
    }

    public String getNim() {
        return nim;
    }

    @Override
    public void identity() {
        System.out.println("NIM: " + getNim());
        System.out.println("Nama: " + super.name);
        System.out.println("Alamat: " + super.address);
    }

    public void job() {
        System.out.println("Pekerjaan : Mahasiswa");
    }

    public String getName() {
        System.out.println("Student name: " + name);
        return name;
    }

    public void setSPP(double spp) {
        this.spp = spp;
    }

    public void setSKS(double sks) {
        this.sks = sks;
    }

    public void setModul(double modul) {
        this.modul = modul;
    }

    public double hitungPembayaran() {
        return 0;
    }
}
