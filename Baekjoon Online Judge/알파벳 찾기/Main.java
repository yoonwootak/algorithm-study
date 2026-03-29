import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        String S = st.nextToken();
        StringBuilder sb = new StringBuilder();

        int[] arr = new int[26];

        for(int i=0; i<arr.length; i++) {
            arr[i] = -1;
        }

        for(int i=0; i<S.length(); i++) {
            if(arr[S.charAt(i) - 'a'] != -1) {
                continue;
            }
            arr[S.charAt(i) - 'a'] = i;
        }

        for(int i=0; i<arr.length; i++) {
            sb.append(arr[i]).append(' ');
        }

        System.out.println(sb);
    }
}