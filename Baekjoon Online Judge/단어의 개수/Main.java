import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int count = 0;
        String s;

        while(st.hasMoreTokens()) {
            s = st.nextToken();
            count++;
        }

        System.out.println(count);
    }
}