package com.example.useronboarding.model;

import java.util.HashMap;
import java.util.Map;

public class Context {
    private final Map<String, Object> data;

    public Context() {
        this.data = new HashMap<>();
    }

    public void put(String key, Object value) {
        data.put(key, value);
    }

    public Object get(String key) {
        return data.get(key);
    }

    public <T> T get(String key, Class<T> type) {
        Object value = data.get(key);
        if (type.isInstance(value)) {
            return type.cast(value);
        }
        return null;
    }

    public boolean containsKey(String key) {
        return data.containsKey(key);
    }

    public void remove(String key) {
        data.remove(key);
    }

    public void clear() {
        data.clear();
    }
}
