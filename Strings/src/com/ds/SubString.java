package com.ds;

public class SubString {

    public static void main(String[] args){
        System.out.println("");

        String s1 = "for";
        String s2 = "geeksforgeeks";
        int res = isSubString(s1, s2);

        if(res == -1)
            System.out.println("Not a sub String");
        else
            System.out.println("Sub String Present at Index : "+res);
    }

    private static int isSubString(String s1, String s2) {

        int len1=s1.length();
        int len2=s2.length();

        for(int i=0;i<len2-len1;i++){
            int j=0;

            for(j=0;j<len1;j++)
                if(s1.charAt(j) != s2.charAt(i+j))
                    break;
             if(j==len1)
                 return j;
        }

        return -1;
    }
}
