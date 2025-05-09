package org.example.app.utils;

public class AppValidator {


    // Regex для id.
    // Регулярний вираз для позитивних цілих чисел без нулів, мінусів або ком на початку.
    // ^ вказує на початок рядка
    // [1-9] відповідає будь-якій цифрі від 1 до 9 і гарантує відсутність нулів на початку.
    // $ вказує на кінець рядка
    public final static String ID_RGX = "^[1-9]$";


    // Regex для email
   // public final static String ADDRESS_RGX = "^str\\. ([A-Za-z]+)(\\d+[A-Za-z]?)$";
    public final static String ADDRESS_RGX = "^str\\. ([A-Za-z]+) \\d([A-Za-z]?)$";

    // Валідація вхідного значення id
    public static boolean isIdValid(String id) {
        if (id != null)
            return id.isEmpty() || !id.matches(ID_RGX);
        return false;
    }

    // Валідація вхідного значення телефона
    public static boolean isAddressValid(String address) {
        if (address != null)
            return address.isEmpty() || !address.matches(ADDRESS_RGX);
        return false;
    }

}
