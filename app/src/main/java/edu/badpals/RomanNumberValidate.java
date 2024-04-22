package edu.badpals;

import java.util.HashMap;
import java.util.Map;

public class RomanNumberValidate {

    private final Map<String,String> valores= new HashMap<String,String>();

    public void addValues(String key, String value){
        this.valores.putIfAbsent(key,value);
    }

    private void groups(){

    }

    private void createGroup(){

    }
}
