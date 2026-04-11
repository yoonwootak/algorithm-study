import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] arr = new int[N];

        arr[0] = Integer.parseInt(st.nextToken());
        int M = arr[0];
        for (int i=1; i<N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
            if (M < arr[i]) {M = arr[i];}
        }

        double avg = 0;
        for (int i : arr) {
            avg += (double)i / M * 100;
        }

        System.out.println(avg / N);
    }
}