package tutorial;
import java.util.Scanner;

public class Pertemuan7dan9{
    public static void main(String[] args) {
        Scanner io = new Scanner(System.in);

        // // While Loop
        // // Akan terus mengulang selama kondisi bernilai true
        // // int i = 0;
        // // boolean lanjut = true;
        // // 
        // while (true) {
        //     System.out.print("Masukkan angka : ");
        //     int g = io.nextInt();
        //     if (g == 0) {
        //         break;
        //     }
        // }

        System.out.println("---------------------------------------------------------------------------");

        // Do-While Loop
        // Sama seperti while loop namun akan menjalankan perulangan minimal sekali
        // walaupun kondisi bernilai false.
        // nadia : a = 9
        // rizki : a = 8 
        // int a = 8;
        // do {
        //     System.out.println("a = " + a);
        //     a++;
        // } while (a < 7);

        // rizki : 8,9,10
        // safira : 8,9
        // int b = 7;
        // do {
        //     b++;
        //     System.out.println("b = " + b);
        // } while (b < 10);

        // System.out.println("---------------------------------------------------------------------------");

        // For Loop
        // Gunakan apabila kita sudah tahu berapa kali perulangan atau iterasi
        // int b = 5;
        // rizki
        //String ab = "SUEB";
        // for(int i = 0; i<ab.length(); i++){
        //     // 0 < 4; i++
        //     System.out.println(ab.charAt(i));
        // }
        // rizki : SU
        // E
        // Sovi : SU
        // E
        // Bintang : SU
        // UEB
        // for (int j = 0, y = 2; y < ab.length(); j += 2, y++) {
        //     System.out.println(ab.substring(j, y));
        //     // println substring(0,2)
        //     // println substring(2,3)
        // }

        // System.out.println("---------------------------------------------------------------------------");

        // // Break and Continue
        // for (int g = 0; g < 10; g++) {
        //     if (g == 8) {
        //         break;
        //     } else if (g % 2 == 0) {
        //         System.out.println("Perulangan ke-" + g);
        //     } else {
        //         continue;
        //     }
        // }

        // System.out.println("---------------------------------------------------------------------------");

        // Nested Loop
        // 
        for (int t = 0; t < 5; t++) {
            for (int j = 0; j < 5; j++) {
                System.out.print("* ");
                if (t == j) {
                    break;
                }
            }
            System.out.print("\n");
        }

        io.close();
    }
}
