import java.util.Scanner;;

public class soal2no2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("masukkan jari-jari tabung: ");
        double jarijari = s.nextDouble();

        System.out.print("masukkan tinggi tabung: ");
        double tinggi = s.nextDouble();

        double volume = 3.14*jarijari*jarijari*tinggi;

        System.out.println("volume tabung: " + volume);

        s.close();
    }

    
    
}

