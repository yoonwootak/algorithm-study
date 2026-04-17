import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        s = s.toUpperCase();

        Map<Character, Integer> hm = new HashMap<>();
        for (int i=0; i<s.length(); i++) {
            hm.put(s.charAt(i), hm.getOrDefault(s.charAt(i), 0) + 1);
        }

        char max_key = ' ';
        int max_value = 0;
        boolean b = false;
        for (Map.Entry<Character, Integer> entry : hm.entrySet()) {
            char key = entry.getKey();
            int value = entry.getValue();

            if (max_value == value) {
                b = true;
            }

            if (max_value < value) {
                b = false;
                max_key = key;
                max_value = value;
            }
        }

        if (b) {
            System.out.println("?");
        }
        else {
            System.out.println(max_key);
        }
    }
}