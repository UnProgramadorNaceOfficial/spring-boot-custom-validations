package com.app.advice.validation.anotation;

import com.app.advice.validation.validator.ValueRequiredValidator;
import jakarta.validation.Constraint;
import jakarta.validation.Payload;

import java.lang.annotation.*;

@Documented
@Constraint(validatedBy = ValueRequiredValidator.class)
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.FIELD, ElementType.METHOD})
public @interface ValueRequired {

    String message() default "{custom.validacion.message.last.name}";
    Class<?>[] groups() default {};
    Class<? extends Payload>[] payload() default {};
}
