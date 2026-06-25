import java.io.*;
import java.util.*;

class Main {
    public static void main(String[] args) throws Exception {
        /*
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String N = br.readLine();

        int[] num = new int[10];
        Arrays.fill(num, 1);

        int setCount = 1;
        for (int i=0; i<N.length(); i++) {
            int n = N.charAt(i) - '0';
            if (num[n] != 0) {
                num[n]--;
            }
            else if (n == 6 && num[9] != 0) {
                num[9]--;
            }
            else if (n == 9 && num[6] != 0) {
                num[6]--;
            }
            else {
                for (int j=0; j<num.length; j++) {
                    num[j] += 1;
                }
                setCount++;
                num[n]--;
            }
        }

        System.out.println(setCount);
         */

        //기존 방식대로 풀어도 괜찮음
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String N = br.readLine();
        int[] num = new int[10];

        for (int i=0; i<N.length(); i++) {
            num[N.charAt(i) - '0']++;
        }

        num[6] = (num[6] + num[9] + 1) / 2;
        num[9] = 0;

        int answer = 0;
        for (int i=0; i<num.length; i++) {
            answer = Math.max(answer, num[i]);
        }

        System.out.println(answer);
    }
}