import java.util.Scanner;

public class soal1no2 {
    public static void main(String[] args) {
        Scanner s = new Scanner (System.in);
         System.out.println("Masukkan angka: ");
        double angka = s.nextDouble();
 
        if (angka %2 == 0) {
         System.out.println(angka + " adalah angka genap.");
     } else {
         System.out.println(angka + " adalah angka ganjil.");   
        }

        s.close();
}

}
