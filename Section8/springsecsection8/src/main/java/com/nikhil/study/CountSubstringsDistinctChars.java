package com.nikhil.study;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class CountSubstringsDistinctChars {

    static int countSub(String str)
    {
        int n = (int)str.length();

        // Stores the count of
        // subStrings
        int ans = 0;

        // Stores the frequency
        // of characters
        int []cnt = new int[26];

        // Initialised both pointers
        // to beginning of the String
        int i = 0, j = 0;

        while (i < n)
        {

            // If all characters in
            // subString from index i
            // to j are distinct
            if (j < n &&
                    (cnt[str.charAt(j) - 'a'] == 0))
            {

                // Increment count of j-th
                // character
                cnt[str.charAt(j) - 'a']++;
              //  System.out.print(str.charAt(j) - 'a');
                // Add all subString ending
                // at j and starting at any
                // index between i and j
                // to the answer
                ans += (j - i + 1);

                // Increment 2nd pointer
                j++;
            }

            // If some characters are repeated
            // or j pointer has reached to end
            else
            {

                // Decrement count of j-th
                // character
                cnt[str.charAt(i) - 'a']--;
            //    System.out.print(str.charAt(i) - 'a');
                // Increment first pointer
                i++;
            }
        }

        // Return the final
        // count of subStrings
        return ans;
    }

    public static Set<String> findSubstrings(String s) {

        // to store all substrings
        Set<String> res = new HashSet<>();
        for (int i = 0; i < s.length(); i++) {
            for (int j = i; j < s.length(); j++) {

                // substr function takes starting index
                // and ending index + 1 as parameters
                res.add(s.substring(i, j + 1));
            }
        }
        return res;
    }


    public static void main(String[] args)
    {
        String str = "nikhil";
        int i=1;
        //System.out.print('f'-'a');
       // System.out.print((int)'f');
        System.out.print(countSub(str));

//        String s = "gffg";
//        Set<String> res = findSubstrings(s);
//        for (String i : res) {
//            System.out.print(i + " ");
//        }

        List<String> list = new ArrayList<>();
        for(String a : list)
            System.out.println(a);

    }
}
