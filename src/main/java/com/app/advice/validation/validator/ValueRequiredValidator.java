package com.app.advice.validation.validator;

import com.app.advice.validation.anotation.ValueRequired;
import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;

public class ValueRequiredValidator implements ConstraintValidator<ValueRequired, String> {
    @Override
    public void initialize(ValueRequired constraintAnnotation) {
        ConstraintValidator.super.initialize(constraintAnnotation);
    }

    @Override
    public boolean isValid(String value, ConstraintValidatorContext constraintValidatorContext) {

        // Value cannot be Null nor Empty
        if (value == null || value.isEmpty()) {
            return false;
        }

        // Value should have a blank space
        if (!value.contains(" ")) {
            return false;
        }

        // Value should have two words
        String[] words = value.split(" ");
        if (words.length != 2) {
            return false;
        }

        // Check each last name
        for (String lasName : words) {
            if (lasName.isEmpty() || !Character.isUpperCase(lasName.charAt(0))) {
                return false;
            }
        }
        return true;
    }
}
