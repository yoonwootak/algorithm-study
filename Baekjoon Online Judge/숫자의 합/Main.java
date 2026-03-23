import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int sum = 0;

        st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine());
        String num = st.nextToken();

        for(int i=0; i<n; i++) {
            sum = sum + num.charAt(i) - '0';
        }

        StringBuilder sb = new StringBuilder();
        sb.append(sum);
        System.out.println(sb);
    }
}