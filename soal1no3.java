import java.util.Scanner;

public class soal1no3 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        for (int i = 50; i >= 2; i--) {
            if (i % 3 == 0) {
                System.out.println(i + ". saya angkatan 33");
            } else if (i % 2 == 0) {
                System.out.println(i + ". saya anak moklet");
            }else  {
                System.out.println( i + ".  saya anak wikusama");
            }

            s.close();
        }
            System.out.println("1. saya senang");
       
       
        } 
        
    
    }

