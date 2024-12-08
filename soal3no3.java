import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class soal3no3 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int[] arr = {1, 2, 2, 3, 5, 3, 4, 2, 3, 5};

        Map<Integer, Integer> frekuensi = new HashMap<>();

        for (int num : arr) {
            frekuensi.put(num, frekuensi.getOrDefault(num, 0) + 1);
        }

        for (Map.Entry<Integer, Integer> entry : frekuensi.entrySet()) {
            System.out.println(entry.getKey() + " muncul " + entry.getValue() + " kali");
        }
        s.close();
    } 
}

