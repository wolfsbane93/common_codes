package commonCode;

public class LongestCommonPrefix {

    public static void main(String[] args){
        String[] strs = {"flower","flow","flight"};

        System.out.println(myLogic(strs));

    }
    public static StringBuilder myLogic (String[] strs){
        String smalestString="";
        StringBuilder combination= new StringBuilder();
        int c=0;
        int l=strs[0].length();
        for(String s:strs ){
            if(s.length()<l){
                smalestString=s;
            }
        }
        for(int i=0; i<smalestString.length(); i++) {
            for (String s:strs) {
                if (smalestString.charAt(i) != s.charAt(i)) {
                    c=1;
                    break;
                }
            }
            if(c==1)
                break;
            else
                combination.append(smalestString.charAt(i));
        }

        return combination;
    }
    public static String usingSubString (String[] strs){


        String prefix = strs[0];
        String[] sts = {"flower","flow","flight"};
        for(int i =1;i<strs.length;i++){
            while(strs[i].indexOf(prefix)!=0){
                prefix=prefix.substring(0,prefix.length()-1);
                if (prefix.isEmpty())
                    return "";
            }


        }


        return prefix;
    }


}

