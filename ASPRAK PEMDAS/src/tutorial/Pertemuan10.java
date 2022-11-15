package tutorial;

import java.util.Scanner;
import java.util.Arrays;

public class Pertemuan10 {
    public static void main(String[] args) {
        Scanner io = new Scanner(System.in);

        // Deklarasi dan Instansiasi Array
        int[] arrayA = new int[3];
        String arrayB[];
        arrayB = new String[2];

        // Isi Array
        arrayA[0] = 5;
        arrayA[2] = 2;
        arrayA[1] = arrayA[0] - arrayA[2];

        // Tampilkan isi Array
        System.out.print("ArrayA: ");
        for (int i = 0; i < arrayA.length; i++) {
            System.out.print(arrayA[i] + " ");  
        }

        System.out.println("\n---------------------------------------------------------------------------");

        // Isi array secara eksplisit
        double[] arrayC = new double[] { 2.5, 3.4, 8.9 };
        System.out.println(Arrays.toString(arrayC));
        
        int[] arrayD = { 1, 2, 3, 4, 5 };
        System.out.print("ArrayD: ");
        for (int i = 0; i < arrayD.length; i++) {
            System.out.print(arrayD[i] + " ");
        }

        System.out.println("\n---------------------------------------------------------------------------");

        // Mennampilkan seluruh isi array dengan function .toString()
        System.out.println("ArrayC: " + Arrays.toString(arrayC));

        System.out.println("---------------------------------------------------------------------------");

        // Isi array pakai for loop
        for (int i = 0; i < arrayB.length; i++) {
            System.out.print("Masukkan value untuk arrayB index ke-" + (i) + ": ");
            arrayB[i] = io.next();
        }

        // Tampilkan isi array pakai for each
        System.out.print("ArrayD: ");
        for (int d : arrayD) {
            System.out.print(d + " ");
        }

        System.out.println("\n---------------------------------------------------------------------------");

        // Reference array
        arrayD = arrayA;
        System.out.print("ArrayD sebelum diubah: ");
        for (int i : arrayD) {
            System.out.print(i + " ");
        }

        System.out.println("\n---------------------------------------------------------------------------");

        arrayD[2] = 4;
        arrayA[0] = 10;
        System.out.print("Isi Array D setelah diubah: ");
        for (int i : arrayD) {
            System.out.print(i + " ");
        }

        System.out.println("\n---------------------------------------------------------------------------");

        System.out.print("Isi Array A setelah diubah: ");
        for (int i : arrayA) {
            System.out.print(i + " ");
        }

        io.close();

    }
}
