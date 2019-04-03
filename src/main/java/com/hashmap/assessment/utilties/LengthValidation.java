package com.hashmap.assessment.utilties;

public class LengthValidation {
    public static boolean isValidLength(String string,int limit)
    {
        if(string.length()>50){
           return true;
        }
        return false;
    }
}
