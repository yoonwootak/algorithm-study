import java.util.*;
import java.io.*;

class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        for (int i=0; i<n; i++) {
            String S = br.readLine();
            int score = 0;
            int sum = 0;

            for (int j=0; j<S.length(); j++) {
                char c = S.charAt(j);

                if (c == 'O') {
                    score += ++sum;
                }
                else {
                    sum = 0;
                }
            }
            System.out.println(score);
        }
    }
}