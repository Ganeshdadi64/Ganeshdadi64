package com.scaler.userservice;

import java.util.HashMap;
import java.util.TreeMap;

public class Practice {
    public static void main(String[] args) {
        String str="aadsewrinjdfsbahfkaufhealdjfnj";

       // HashMap<Character,Integer> freq=new HashMap<Character, Integer>();
        TreeMap<Character,Integer> freq=new TreeMap<>();
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            if(freq.containsKey(ch)){
                int val=freq.get(ch);
                freq.put(ch,val+1);
            }
            else {
                freq.put(ch,1);
            }
        }
//        for(int j=0; j<freq.size();j++){
//            char ch1
//        }

    }
}
