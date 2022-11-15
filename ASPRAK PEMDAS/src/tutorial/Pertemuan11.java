package tutorial;

import java.util.Scanner;
import java.util.Arrays;
// davito
// farchan
// ican
// rizki
// sovi
public class Pertemuan11{
    public static void main(String[] args) {
        Scanner io = new Scanner(System.in);

        // Array 2 Dimensi
        int[][] array2DSatu = new int[2][4];
        // [baris][kolom]
        // Isi array 2Dimensi
        for (int i = 0; i < array2DSatu.length; i++) {
            for (int j = 0; j < array2DSatu[1].length; j++) {
                System.out.printf("Masukkan value untuk array2DSatu index [%d][%d]: ", i, j);
                array2DSatu[i][j] = io.nextInt();
            }
        }

        // Tampilkan isi array 2Dimensi
        System.out.println("Array2DSatu: ");
        for (int i = 0; i < array2DSatu.length; i++) {
            for (int j = 0; j < array2DSatu[i].length; j++) {
                System.out.print(array2DSatu[i][j] + " ");
            }
            System.out.print("\n");
        }

        int[] arraySatu = { 1, 2, 3 };
        int[] arrayDua = new int[3];
        for (int i = 0; i < arrayDua.length; i++) {
            arrayDua[i] = arraySatu[(arraySatu.length - 1) - i];
        }
        arrayDua[0] = 10;
        System.out.println(Arrays.toString(arrayDua));
        System.out.println(Arrays.toString(arraySatu));
        Arrays.sort(arrayDua);
        System.out.println(Arrays.toString(arrayDua));

        byte[][] array2DDua = {{4,5,7}, {6,8}, {1}, {3,6,8}};
        // sama dengan byte [4][3]
        // farrel
        // barik
        for(byte[] inner : array2DDua){
            for(byte data : inner){
                System.out.print(data + " ");
            }
            System.out.println();
        }

        System.out.println("Array2DDua: ");
        for (int i = 0; i < array2DDua.length; i++) {
            for (int j = 0; j < array2DDua[i].length; j++) {
                System.out.print(array2DDua[i][j] + " ");
            }
            System.out.println();
        }

        // Mengecek panjang di baris ke 1
        // System.out.println(array2DDua[1].length);
        
        // Contoh Implementasi array 2D di KRS/KHS
        // [semester][mata_kuliah]

        io.close();
    }
}