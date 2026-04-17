import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int C = Integer.parseInt(br.readLine());

        for (int i=0; i<C; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int N = Integer.parseInt(st.nextToken());

            double avg = 0;
            double[] arr = new double[N];
            for (int j=0; j<N; j++) {
                arr[j] = Double.parseDouble(st.nextToken());
                avg += arr[j];
            }
            avg /= N;

            double avg_over = 0;
            for (int k=0; k<N; k++) {
                if (arr[k] > avg) {
                    avg_over++;
                }
            }
            avg_over = avg_over / N * 100;
            System.out.printf("%.3f%%\n", avg_over);
        }
    }
}