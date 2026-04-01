import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    public static void main(String[] args) throws Exception {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        StringTokenizer st = new StringTokenizer(br.readLine());
//        String A = st.nextToken();
//        String B = st.nextToken();
//        StringBuilder sb = new StringBuilder();
//
//        for(int i=2; i>=0; i--) {
//            if(A.charAt(i) - '0' > B.charAt(i) - '0') {
//                sb.append(A.charAt(2)).append(A.charAt(1)).append(A.charAt(0));
//                break;
//            }
//            else if(A.charAt(i) - '0' < B.charAt(i) - '0') {
//                sb.append(B.charAt(2)).append(B.charAt(1)).append(B.charAt(0));
//                break;
//            }
//        }
//        System.out.println(sb);

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        String A = new StringBuilder(st.nextToken()).reverse().toString();
        String B = new StringBuilder(st.nextToken()).reverse().toString();

        System.out.println(Math.max(Integer.parseInt(A), Integer.parseInt(B)));
    }
}