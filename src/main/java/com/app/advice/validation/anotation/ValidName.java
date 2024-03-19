package com.app.advice.validation.anotation;

import com.app.advice.validation.validator.ValidNameValidator;
import jakarta.validation.Constraint;
import jakarta.validation.Payload;

import java.lang.annotation.*;

@Documented
@Constraint(validatedBy = ValidNameValidator.class)
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.FIELD, ElementType.METHOD})
public @interface ValidName {

    String message() default "{custom.validacion.message}";
    Class<?>[] groups() default {};
    Class<? extends Payload>[] payload() default {};
}
