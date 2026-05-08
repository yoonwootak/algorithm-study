import java.util.*;
import java.io.*;

class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int C = Integer.parseInt(br.readLine());

        for (int i=0; i<C; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int N = Integer.parseInt(st.nextToken());

            int[] score = new int[N];
            double avg = 0;
            for (int j=0; j<N; j++) {
                score[j] = Integer.parseInt(st.nextToken());
                avg += score[j];
            }
            avg /= N;

            int over = 0;
            for (int j : score) {
                if (j > avg) { over++; }
            }
            System.out.printf("%.3f%%\n", (double)over / N * 100);
        }
    }
}