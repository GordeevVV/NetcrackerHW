package com.company;

public class IsPali implements Palindrome{
    @Override
    public boolean isPalindrome(int x) {
        if(x<0){
            x=-x;
        }
        String tmp=String.valueOf(x);
        int j=tmp.length()-1;
        for(int i=0;i<(tmp.length()/2);i++){
            if(tmp.toCharArray()[i]!=tmp.toCharArray()[j]){
                System.out.format("Mistake in %s symbol from start instead of that:\t",i+1);
                return false;
            }
            j--;
        }
        return true;
    }
}
