package org.example.app.view;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class UserUpdateView {

    // Отримуємо вхідні дані
    public Map<String, String> getData() {
        System.out.println("\nUPDATE FORM");
        Map<String, String> map = new HashMap<>();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input id: ");
        map.put("id", scanner.nextLine().trim());
        System.out.print("Input first name: ");
        map.put("first_name", scanner.nextLine().trim());
        System.out.print("Input last name: ");
        map.put("last_name", scanner.nextLine().trim());
        System.out.print("Input address in format str. [street_name] ([number+(A-Z)] or [number]) ");
        System.out.println("For example: str. Popova5  or  str. Popova5A");
        map.put("address", scanner.nextLine().trim());
        return map;
    }

    // Виведення результату роботи програми
    public void getOutput(String output) {
        System.out.println(output);
    }
}
