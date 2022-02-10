package ru.hw1;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Directory {
    private Map<String, Set<String>> phoneBook = new HashMap<>();

    public void add(String name, String phone) {
        Set<String> book = phoneBook.getOrDefault(name, new HashSet<>());
        book.add(phone);
        phoneBook.put(name,book);
    }

    public Set<String> get(String name) {
        return  phoneBook.get(name);
    }
}
