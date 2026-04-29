import java.io.*;

class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();

//        int time = 0;
//        for (int i=0; i<input.length(); i++) {
//            char c = input.charAt(i);
//            if (c == 'A' || c == 'B' || c == 'C') {time += 3;}
//            else if (c == 'D' || c == 'E' || c == 'F') {time += 4;}
//            else if (c == 'G' || c == 'H' || c == 'I') {time += 5;}
//            else if (c == 'J' || c == 'K' || c == 'L') {time += 6;}
//            else if (c == 'M' || c == 'N' || c == 'O') {time += 7;}
//            else if (c == 'P' || c == 'Q' || c == 'R' || c == 'S') {time += 8;}
//            else if (c == 'T' || c == 'U' || c == 'V') {time += 9;}
//            else if (c == 'W' || c == 'X' || c == 'Y' || c == 'Z') {time += 10;}
//        }
//
//        System.out.println(time);

        int[] time = {
                3, 3, 3,
                4, 4, 4,
                5, 5, 5,
                6, 6, 6,
                7, 7, 7,
                8, 8, 8, 8,
                9, 9, 9,
                10, 10, 10, 10
        };

        int answer = 0;
        for (int i=0; i<input.length(); i++) {
            answer += time[input.charAt(i) - 'A'];
        }

        System.out.println(answer);
    }
}