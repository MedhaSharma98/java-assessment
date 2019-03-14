package com.hashmap.assessment.Utilties;

public class LengthValidation {
    public static boolean isValidLength(String string,int limit)
    {
        if(string.length()>50){
           return true;
        }
        return false;
    }
}
