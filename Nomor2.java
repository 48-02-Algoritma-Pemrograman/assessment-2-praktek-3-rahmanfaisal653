import java.util.Scanner;
import java.util.ArrayList;

public class Nomor2 {
    public static int harga = 0;
    public static int harga2 = 0;
    public static ArrayList<Integer> menu = new ArrayList<>();

    public static int hampersPacking(int a, int b) {
        return a + b;
    }

    public static double total() {
        return hampersPacking(harga, harga2) * 0.1;
    }

    public static void main(String[] args) {
        /* Pekerjaan anda mulai dari sini */
        Scanner input = new Scanner(System.in);


        String pilihan;
        do {
            System.out.println("pilih menu hampers [1/2/3]");
            int hampers = input.nextInt();
            menu.add(hampers);
            
            System.out.println("pilih menu packing [1/2/3]");
            int packing = input.nextInt();
            menu.add(packing);
            
            
            switch (hampers) {
                case 1:
                    harga = 150000;
                    break;
                case 2:
                    harga = 175000;
                    break;
                case 3:
                    harga = 200000;
                    break;
    
                default:
                    break;
            }
    
            switch (packing) {
                case 1:
                    harga2 = 50000;
                    break;
                case 2:
                    harga2 = 75000;
                    break;
                case 3:
                    harga2 = 125000;
                    break;
    
                default:
                    break;
            }
            System.out.println("Input lagi? Y/T");
            pilihan = input.next().toUpperCase();

    
        } while (pilihan.equals("Y"));

        System.out.println(hampersPacking(harga, harga2));
        System.out.println(total());
        /* Pekerjaan anda berakhir sini */

        System.out.println(Nomor2.class.getDeclaredMethods().length);
        
}
}
