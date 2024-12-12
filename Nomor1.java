import java.util.Scanner;

public class Nomor1 {

    public static double luas (double alas, double tinggi){
        return 0.5*alas*tinggi;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int t = input.nextInt();
        /* Pekerjaan anda mulai dari sini */
        System.out.println(luas(a,t));
        /* Pekerjaan anda berakhir sini */

        System.out.println(Nomor1.class.getDeclaredMethods().length);
    }

}
