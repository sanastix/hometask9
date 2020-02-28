package com.stepanyan;

public interface MyMap {

    interface Entry {
        String getKey();
        String getValue();
        String setValue(String value);
    }

    String put(String key, String value);

    String get(String key);

    boolean contains(String key);

    void clear();

    int size();

    String remove(String key);

    boolean isEmpty();

}
