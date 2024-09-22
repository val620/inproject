package com.example.demo99.utils;

public class StringUtils {

    public static String removeOrReplaceString(String input,boolean replace){
        var newText=handleString(input,replace);
        while (!input.equals(newText)){
            input=newText;
            newText=handleString(input,replace);
        }
        return newText;
    }

    private static String handleString(String input,boolean replace){
        var charArray = input.toCharArray();
        if(null==charArray || 3>charArray.length) {
            System.out.println("input:"+input+"，output:"+input);
            return input;
        }
        var strBuilder=new StringBuilder();
        for(var i=0;i< charArray.length;i++){
            var c=charArray[i];
            if(i>=charArray.length-2){
                strBuilder.append(c);
                continue;
            }
            if(c==charArray[i+1] && c==charArray[i+2]){
                i=i+2;
                if(c!='a' && replace){
                    var ascNum=(int)c-1;
                    var newChar=  (char)ascNum;
                    strBuilder.append(newChar);
                }
            } else {
                strBuilder.append(c);
            }
        }
        var output=strBuilder.toString();
        System.out.println("input:"+input+"，output:"+output);
        return output;
    }
}
