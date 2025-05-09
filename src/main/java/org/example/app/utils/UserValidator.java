package org.example.app.utils;

import java.util.HashMap;
import java.util.Map;

public class UserValidator {

    public Map<String, String> validateUserData(Map<String, String> data) {

        Map<String, String> errors = new HashMap<>();

        if (data.containsKey("id") & AppValidator.isIdValid(data.get("id")))
            errors.put("id", Constants.WRONG_ID_MSG);

        if (data.containsKey("first_name")) {
            if (data.get("first_name") != null & data.get("first_name").isEmpty())
                errors.put("first name", Constants.INPUT_REQ_MSG);
        }

        if (data.containsKey("last_name")) {
            if (data.get("last_name") != null & data.get("last_name").isEmpty())
                errors.put("last name", Constants.INPUT_REQ_MSG);
        }

        if (data.containsKey("address") & AppValidator.isAddressValid(data.get("address")))
            errors.put("address", Constants.WRONG_ADDRESS_MSG);


        return errors;
    }
}
