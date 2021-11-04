package com.example.demo.util;


import org.slf4j.Logger;
import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;
import org.springframework.validation.beanvalidation.SpringValidatorAdapter;
import com.example.demo.logging.ManagementLoggerFactory;

import javax.validation.Validation;
import java.util.Collection;

@Component
public class CustomCollectionValidator implements Validator {

    private SpringValidatorAdapter validator;
    
    private final Logger logger = ManagementLoggerFactory.getLogger(CustomCollectionValidator.class);

    public CustomCollectionValidator() {
        this.validator = new SpringValidatorAdapter(
                Validation.buildDefaultValidatorFactory().getValidator()
        );
    }

    @Override
    public boolean supports(Class<?> clazz) {
        return Collection.class.isAssignableFrom(clazz);
    }

    @Override
    public void validate(Object target, Errors errors) {  	
        Collection collection = (Collection) target;
        for (Object object : collection) {
            validator.validate(object, errors);
        }
    }
}

