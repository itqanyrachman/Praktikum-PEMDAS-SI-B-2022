package tutorial;

public class Pertemuan13{
    public static void main(String[] args) {

        // tampilkanNama();
        // tampilkanNama("jamal");
        // // sovi
        // // syahda
        // tampilkanNama("genji", "b");

        // // ican, zakaria = 3
        // int angka = getAngka3();
        // System.out.println(angka);
        // System.out.println(getAngka3());

        // // bintang = 2
        // int jumlah = tambahkan2angka(2, 5);
        // System.out.println(jumlah);

        // bintang, sovi, nadia = ga keluar
        // rizki 3.14
        // ican 314
        double luas = hitungLuasLingkaran(10, 3.14);
        System.out.println(luas);
        
        int[] array1 = new int [] {2,4,5};
        int[] array2 = new int [] {2,5,7,8,9,3,4};
        int[] array3 = new int [] {2,5};

        System.out.println(hitungJumlah(array1));
        System.out.println(hitungJumlah(array2));
        System.out.println(hitungJumlah(array3));

        int hasil1 = 0;
        for(int i =0; i<array1.length; i++){
            hasil1 = hasil1 + array1[i];
        }
        System.out.println(hasil1);

        int hasil2 = 0;
        for(int i =0; i<array2.length; i++){
            hasil2 = hasil2 + array2[i];
        }
        System.out.println(hasil2);

        int hasil3 = 0;
        for(int i =0; i<array3.length; i++){
            hasil3 = hasil3 + array3[i];
        }
        System.out.println(hasil3);

    }

    static void tampilkanNama(){
        System.out.println("halo nama saya tommy kelas pemdas si-c");
    }

    static void tampilkanNama(String nama){
        System.out.println("halo nama saya " + nama + " kelas pemdas si-c");
    }

    static void tampilkanNama(String nama, String kelas){
        
    }

    static int getAngka3(){ 
        return 3;
    }

    static int tambahkan2angka(int a, int b){
        int hasil = b/a;
        return hasil;
    }
    
    static double hitungLuasLingkaran(int jari2, double phi){
        double luas = jari2*jari2*phi;
        return phi;
    }

    static int hitungJumlah(int[] array){
        int hasil = 0;
        for(int i =0; i<array.length; i++){
            hasil = hasil + array[i];
        }
        return hasil;
    }
}