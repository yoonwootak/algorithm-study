import java.util.*;
import java.io.*;

class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int prev = Integer.parseInt(st.nextToken());
        String flag = "";
        for (int i=0; i<7; i++) {
            int num = Integer.parseInt(st.nextToken());

            if (prev < num) {
                if (flag.equals("descending")) {
                    flag = "mixed";
                    break;
                }
                flag = "ascending";
            }
            else if (prev > num) {
                if (flag.equals("ascending")) {
                    flag = "mixed";
                    break;
                }
                flag = "descending";
            }
            prev = num;
        }

        System.out.println(flag);
    }
}