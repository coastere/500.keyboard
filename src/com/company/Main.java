package com.company;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
	// write your code here
        String []words={"Hello", "Alaska", "Dad", "Peace"};
        List<String> r = new ArrayList<>();
        String r1 = "qwertyuiop";
        String r2 = "asdfghjkl";
        String r3 = "zxcvbnm";
        for (String word:words             ) {
            boolean valid=true;
            String lword=word.toLowerCase();
            char[] ss = lword.toCharArray();
            if (r1.indexOf(ss[0])>-1) {
                for (char s: ss      ) {
                    if (r1.indexOf(s) == -1) {
                        valid = false;
                        break;
                    }
                }

            } else if (r2.indexOf(ss[0]) > -1) {
                for (char s: ss      ) {
                    if (r2.indexOf(s) == -1) {
                        valid = false;
                        break;
                    }
                }
            } else {
                for (char s: ss      ) {
                    if (r3.indexOf(s) == -1) {
                        valid = false;
                        break;
                    }
                }
            }
            if (valid) {
                r.add(word);
            }
        }
        String[] rr = new String[r.size()];
        for (int i = 0; i <r.size() ; i++) {
            rr[i] = r.get(i);
        }

        for (String s: rr ) {
            System.out.println(s);
        }



    }
}
