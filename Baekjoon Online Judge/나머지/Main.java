import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        HashSet<Integer> hs = new HashSet<>();

        for (int i=0; i<10; i++) {
            int num = Integer.parseInt(br.readLine()) % 42;
            hs.add(num);
        }
        System.out.println(hs.size());
    }
}