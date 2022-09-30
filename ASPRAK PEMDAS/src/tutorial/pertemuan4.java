package tutorial;

public class pertemuan4 {
    public static void main(String[] args) {
        // ===== PERCABANGAN =====
        /**
         * Percabangan digunakan apabila terdapat kode program yang ingin dijalankan
         * membutuhkan suatu kondisi tertentu yang harus terpenuhi. Terdapat 3 jenis
         * percabangan yang ada di Java yaitu ternary operator, if-else statement, dan
         * switch case.
         */

        // ===== IF - ELSE STATEMENT =====
        // int a = 8;
        // int b = 9;
        // if(a>b){
        //     System.out.println("A lebih besar dari B");
        // }else{
        //     System.out.println("A lebih kecil dari B");
        // }

        // ====== IF - ELSE IF - ELSE STATEMENT =======
        // int time = 13;
        // if(time < 12){
        //     System.out.println("Morning");
        // } else if(time < 16){
        //     System.out.println("Afternoon");
        // } else{
        //     System.out.println("Evening");
        // }

        // String namaBelakang = "Sambo";
        // String namaDepan = "Ferdy";

        // OPERATOR AND & OR
        // kalau mau pakai "OR", gunakan ||
        // kalau mau pakai "AND", gunakan &&

        // if(namaBelakang.equals("Samba") && namaDepan.equals("Ferdy")){
        //     System.out.println("Polisi yang hebat");
        // } else{
        //     System.out.println("Nama salah");
        // }

        // ===== TERNARY OPERATOR =====
        // int a = 8;
        // int b = 10;
        // String z = (a<b)?"Nol" : "Satu";
        // System.out.println(z);

        // String kotaLahir = "Surabaya";
        // String y = (kotaLahir.equalsIgnoreCase("SURABAYA")) ? "Benar" : "Salah";
        // System.out.println(y);

        // ====== NESTED IF ========
        // int umur = 20;
        // if(umur <17){
        //     System.out.println("kamu bocil");
        // } else {
        //     if(umur < 22){
        //         System.out.println("kamu lagi kuliah");
        //     } else {
        //         System.out.println("kamu lagi kerja");
        //     }
        // }

        // String penilaian = "UTP";
        // int nilai = 85;
        // if(penilaian.equalsIgnoreCase("UTS")){
        //     if (nilai>75){
        //         System.out.println("Kamu lulus UTS");
        //     } else {
        //         System.out.println("Kamu gagal UTS");
        //     }
        // } else if (penilaian.equalsIgnoreCase("UAS")){
        //     if (nilai>75){
        //         System.out.println("Kamu lulus UAS");
        //     } else {
        //         System.out.println("Kamu gagal UAS");
        //     }
        // } else {
        //     System.out.println("anjai");
        // }

        int x = 4;
        int y = 23;
        x = y;
        y = 22;
        
        if(x == y){
            System.out.println("IYA");
        } else{
            System.out.println("TIDAK");
        }
    }
}
