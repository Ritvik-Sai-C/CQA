package com.suny.model;

import java.util.HashMap;
import java.util.Map;

/**
 * Encapsulated Object Entity Class
 * Created by admin on 17-8-31.12:53 p.m.
 */
public class ViewObject {

    private Map<String, Object> objs = new HashMap<>();

    public void set(String key, Object value) {
        objs.put(key, value);
    }

    public Object get(String key) {
        return objs.get(key);
    }
}
