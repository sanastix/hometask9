package com.stepanyan;

import java.util.Comparator;

public class MyTreeMap implements MyMap {

    private static class Entry implements MyMap.Entry{

        String key;
        String value;
        Entry next;

        @Override
        public String getKey() {
            return key;
        }

        @Override
        public String getValue() {
            return value;
        }

        @Override
        public String setValue(String value) {
            String oldValue = this.value;
            this.value = value;
            return oldValue;
        }
    }

    private int size = 0;



    @Override
    public String put(String key, String value) {
        return null;
    }

    @Override
    public String get(String key) {
        return null;
    }

    @Override
    public boolean contains(String key) {
        return false;
    }

    @Override
    public void clear() {
        size = 0;

    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public String remove(String key) {
        return null;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }



}
