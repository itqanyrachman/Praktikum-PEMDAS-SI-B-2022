package tutorial;

public class Pertemuan5 {
    public static void main(String[] args) {
        // ===== SWITCH CASE =====
        // switch(kondisi){
        //     case 1 : 
        //      break;
        //     case 2 :
        //      break;
        //     default :
        // }
        String nama = "TONY AIMAR";
        int n = 5;
        switch(n){
            case 5 :
            System.out.println("ini angka 5");
        }
        System.out.println(nama.length());
        System.out.println(nama.substring(1,4));
        switch (nama.charAt(0)) {
            case 'A': 
                System.out.println("Namamu berawalan huruf vokal");
                break;
            default:
                System.out.println("Namamu tidak berawalan huruf vokal tapi keren");
        }
    }
}
