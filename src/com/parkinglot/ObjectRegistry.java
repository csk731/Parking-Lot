package com.parkinglot;

import java.util.HashMap;
import java.util.Map;

public class ObjectRegistry {
    private Map<String,Object> map=new HashMap<>();

    public Object get(String string){
        return map.get(string);
    }
    public void register(String string, Object object){
        map.put(string,object);
    }

}
