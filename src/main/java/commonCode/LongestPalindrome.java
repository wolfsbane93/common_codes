package commonCode;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class LongestPalindrome {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String l="";
        String strs= scan.nextLine();
        for (int i = 0; i < strs.length(); i++) {
            for (int j = strs.length();j>=i; j--) {
                if(isPal(strs.substring(i,j)) && strs.substring(i,j).length()>l.length())
                    l=strs.substring(i,j);
            }

        }

        System.out.println(l);
    }

    private static boolean isPal(String comb) {
        int f = 0;
        int r = comb.length()-1;
        while (r>f){
            if(comb.charAt(f)!=comb.charAt(r))
                return false;
            f++;
            r--;
        }
        return true;
    }
}
