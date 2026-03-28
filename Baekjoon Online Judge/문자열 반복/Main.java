import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();

        int T = Integer.parseInt(st.nextToken());

        for(int i=0; i<T; i++) {
            st = new StringTokenizer(br.readLine());
            int R = Integer.parseInt(st.nextToken());
            String S = st.nextToken();

            for(int j=0; j<S.length(); j++) {
                for(int k=0; k<R; k++) {
                    sb.append(S.charAt(j));
                }
            }
            sb.append('\n');
        }
        System.out.println(sb);
    }
}