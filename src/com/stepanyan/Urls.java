package com.stepanyan;

import java.io.*;
import java.util.*;

public class Urls {

    public static void main(String[] args) {

        List<String> list = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader("//home//user//Документы//urls.txt"))) {
            String s;
            while ((s = br.readLine()) != null) {
                list.add(s);
            }
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }

        List<String> formList = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            formList.add(i, formatLine(list.get(i)));
        }

        Map<String, Integer> map = new HashMap<>();
        for (String domain : formList) {
            if (map.containsKey(domain)) {
                int count = map.get(domain);
                count++;
                map.put(domain, count);
            } else {
                map.put(domain, 1);
            }
        }

        List<Map.Entry<String, Integer>> entries = new ArrayList<>(map.entrySet());
        Collections.sort(entries, new Comparator<Map.Entry<String, Integer>>() {
            @Override
            public int compare(Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2) {
                return Integer.compare(o2.getValue(), o1.getValue());
            }
        });

        System.out.println(entries.subList(0, 10));

    }

    private static String formatLine(String s) {
        String[] str = s.split("\\/");
        if (str[0].equalsIgnoreCase("http//")
                || str[0].equals("http://")
                || str[0].equals("https//")
                || str[0].equals("https://")) {
            return str[1];
        }
        return str[0];
    }

}