import java.util.*;
import java.io.*;

class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int count = 0;

        for (int i=0; i<N; i++) {
            String S = br.readLine();
            int[] lastLoc = new int[26];
            boolean isGroup = true;

            Arrays.fill(lastLoc, -1);

            for (int j=0; j<S.length(); j++) {
                if (lastLoc[S.charAt(j) - 'a'] != -1 && lastLoc[S.charAt(j) - 'a'] != j - 1) {
                    isGroup = false;
                    break;
                }

                lastLoc[S.charAt(j) - 'a'] = j;
            }

            if (isGroup) { count++; }
        }

        System.out.println(count);
    }
}