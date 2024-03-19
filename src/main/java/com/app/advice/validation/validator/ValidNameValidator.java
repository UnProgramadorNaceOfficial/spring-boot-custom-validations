package com.app.advice.validation.validator;

import com.app.advice.validation.anotation.ValidName;
import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;

public class ValidNameValidator implements ConstraintValidator<ValidName, String> {

    @Override
    public void initialize(ValidName constraintAnnotation) {
        ConstraintValidator.super.initialize(constraintAnnotation);
    }

    @Override
    public boolean isValid(String value, ConstraintValidatorContext constraintValidatorContext) {

        // Value cannot be Null
        if(value == null){
            return false;
        }

        // Value cannot be Empty
        if(value.isEmpty()){
            return false;
        }

        // Value cannot be greater than 15
        if(value.length() > 15){
            return false;
        }

        // Value cannot be less than 3
        if(value.length() < 3){
            return false;
        }

        // Value should have the first character in uppercase
        if (!Character.isUpperCase(value.charAt(0))) {
            return false;
        }

        return true;
    }
}
