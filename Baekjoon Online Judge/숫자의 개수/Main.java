import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    public static void main(String[] args) throws IOException {
        // int[] 풀이 방법
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        int num = Integer.parseInt(br.readLine()) * Integer.parseInt(br.readLine()) * Integer.parseInt(br.readLine());
//        String s = Integer.toString(num);
//
//        int[] arr = new int[10];
//        for (int i=0; i<s.length(); i++) {
//            arr[s.charAt(i) - '0']++;
//        }
//
//        for (int i=0; i<arr.length; i++) {
//            System.out.println(arr[i]);
//        }

        // HashMap 풀이 방법
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine()) * Integer.parseInt(br.readLine()) * Integer.parseInt(br.readLine());
        String s = Integer.toString(num);

        HashMap<Integer, Integer> hm = new HashMap<>();
        for (int i=0; i<s.length(); i++) {
            hm.put(s.charAt(i) - '0', hm.getOrDefault(s.charAt(i) - '0', 0) + 1);
        }

        for (int i=0; i<10; i++) {
            if (hm.get(i) == null) {System.out.println("0");}
            else {System.out.println(hm.get(i));}
        }
    }
}