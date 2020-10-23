package kattis;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class AAAAA2_TerminatedInputBabelfish {

    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        Map<String, String> dict = new HashMap<String, String>();

        String line;
        while ((line = reader.readLine()).length() > 0) {
            String[] w = line.split(" ");
            dict.put(w[1], w[0]);
        }

        while ((line = reader.readLine()) != null) {
            if (dict.containsKey(line)) {
                System.out.println(dict.get(line));
            } else {
                System.out.println("eh");
            }
        }
    }
}
