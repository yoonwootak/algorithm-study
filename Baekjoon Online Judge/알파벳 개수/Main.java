import java.io.*;

class Main {
    public static void main(String args[]) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String S = br.readLine();

        int[] list = new int[26];
        for (int i=0; i<S.length(); i++) {
            list[S.charAt(i) - 'a']++;
        }

        for (int i : list) {
            System.out.print(i + " ");
        }
    }
}