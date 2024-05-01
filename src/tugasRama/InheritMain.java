/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugasRama;
import java.util.Scanner;
/**
 *
 * @author Asus
 */
public class InheritMain {
    static class Person {
        protected String name;
        protected String address;
        
        public Person() {
            Scanner input = new Scanner(System.in);
            System.out.print("Masukkan Nama Mahasiswa: ");
            this.name = input.nextLine();
            System.out.print("Masukkan Alamat: ");
            this.address = input.nextLine();
        }
        
        public void identity() {
            System.out.println("Nama: " +name);
            System.out.println("Alamat: " +address);
        }
    }
    
    static class Student extends Person {
        String nim;
        
        public Student() {
            Scanner input = new Scanner(System.in);
            System.out.print("Masukkan NIM: ");
            this.nim = input.nextLine();
        }

        public String getNim() {
            return nim;
        }

        @Override
        public void identity() {
            super.identity();
            System.out.println("NIM: " + nim);
        }
        
        public void hitungPembayaran() {
            Scanner input = new Scanner(System.in);
            System.out.println("==========================");
            System.out.print("Masukkan biaya SPP: ");
            double spp = input.nextDouble();

            System.out.print("Masukkan biaya SKS: ");
            double sks = input.nextDouble();

            System.out.print("Masukkan biaya Modul: ");
            double modul = input.nextDouble();

            double total = spp + sks + modul;

            System.out.println("==========================");
            System.out.println("Total pembayaran: " + total);
        }
    }
    
    public static void main(String[] args) {
        Student mahasiswa = new Student();
        System.out.println("==========================");
        mahasiswa.identity();
        mahasiswa.hitungPembayaran();
    }
}
