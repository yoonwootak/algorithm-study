import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    public static void main(String[] args) throws Exception {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        int N = Integer.parseInt(br.readLine());
//        int count = 0;
//
//        for (int i=0; i<N; i++) {
//            String S = br.readLine();
//            Map<Character, Integer> hm = new HashMap<>();
//            boolean isGroup = true;
//
//            for (int j=0; j<S.length(); j++) {
//                if (hm.getOrDefault(S.charAt(j), j) == j) {
//                    hm.put(S.charAt(j), j);
//                }
//                else if (hm.get(S.charAt(j)) == j - 1) {
//                    hm.put(S.charAt(j), j);
//                }
//                else {
//                    isGroup = false;
//                }
//            }
//
//            if (isGroup) {count++;}
//        }
//
//        System.out.println(count);

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int count = 0;

        for (int i=0; i<N; i++) {
            String S = br.readLine();
            boolean[] visited = new boolean[26];
            char prev = 0;
            boolean isGroup = true;

            for (int j=0; j<S.length(); j++) {
                char cur = S.charAt(j);

                if (cur != prev) {
                    if (visited[cur - 'a']) {
                        isGroup = false;
                        break;
                    }
                    visited[cur - 'a'] = true;
                }
                prev = cur;
            }

            if (isGroup) {count++;}
        }
        System.out.println(count);
    }
}