import java.util.*;
import java.io.*;

class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        for (int j=0; j<N; j++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int[] arr = new int[26];
            String A = st.nextToken();
            String B = st.nextToken();
            String message = "Possible";

            for (int i=0; i<A.length(); i++) {
                arr[A.charAt(i) - 'a']++;
            }

            for (int i=0; i<B.length(); i++) {
                arr[B.charAt(i) - 'a']--;
            }

            for (int i : arr) {
                if (i != 0) {
                    message = "Impossible";
                    break;
                }
            }

            System.out.println(message);
        }
    }
}