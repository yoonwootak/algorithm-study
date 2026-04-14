import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());

        for (int i=0; i<num; i++) {
            String s = br.readLine();
            int temp = 0;
            int score = 0;

            for (int j=0; j<s.length(); j++) {
                if (s.charAt(j) == 'X') {
                    temp = 0;
                }
                else {
                    temp++;
                    score += temp;
                }
            }

            System.out.println(score);
        }
    }
}