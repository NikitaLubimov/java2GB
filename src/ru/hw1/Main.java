package ru.hw1;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
        String[] arr = {"Nikita", "Alena", "Sasha", "Anton", "Roma", "Alena", "Nikita", "Roma", "Valentin", "Alla"};
        System.out.println(Arrays.toString(arr));

        Map<String, Integer> hmap = new HashMap<>();
        for (String x : arr) {
            hmap.put(x, hmap.getOrDefault(x, 0) + 1);
        }
        System.out.println(hmap);

        Directory directory = new Directory();
        directory.add("Nikita", "8-978-55-24-758");
        directory.add("Sasha", "8-978-22-65-243");
        directory.add("Roma", "8-978-13-78-547");
        directory.add("Alena", "8-978-87-32-675");
        directory.add("Anton", "8-978-76-34-723");

        System.out.println("Телефон: " + directory.get("Nikita"));
        System.out.println("Телефон: " + directory.get("Alena"));
        System.out.println("Телефон: " + directory.get("Anton"));
    }
}
