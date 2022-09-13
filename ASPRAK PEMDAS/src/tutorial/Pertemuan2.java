package tutorial;

import java.util.Scanner;

public class Pertemuan2{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String nama;
        int age = 20;
        age = 31;
        System.out.println(age);

        System.out.println("masukkan nama : ");
        nama = input.nextLine();

        System.out.println("masukkan age : ");
        age = input.nextInt();
        System.out.println("nama saya " + nama + ", age " + age+" tahun");

        // bahasa java pake case sensitive, jadi antara huruf kapital dan huruf kecil beda
        // int a = 10;
        // int A = 100; 
        // String namaOrang = "sueb";
        // String NamaOrang = "siti";

        // int b = 6; integer digunakan untuk menyimpan nilai bulat
        // double b = 5.6; double untuk menyimpan nilai bilangan desimal
        // char huruf = 'a'; char untuk menyimpan nilai karakter
        // boolean g = true; boolean digunakan untuk menyimpan nilai kebenaran
        // float c = 6.4f; float digunakan untuk menyimpan kumpulan nilai char
        // byte x = 1; byte untuk menyimpan nilai bilangan bulat
        // long l = 1254667898; long untuk menyimpan nilai bilangan bulat
        // short s = 78; short untuk menyimpan nilai bilangan bulat
        // Urutan kecil ke besar
        // bilangan bulat = byte -> short -> int -> long
        // bilangan desimal = float -> double

        // Comment untuk menyimpan sebuah catatan
        /*String angka = "6";
        String nama = "steve jamal";
        */
        
        // input.close buat nutup scanner
        input.close();

        // System.out.println(angka+a);
    }
}