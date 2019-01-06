package net.lebedko.validation.validator;

import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

@Component("simpleValidator")
public class SimpleDataValidator implements Validator {
    @Override
    public boolean supports(Class<?> clazz) {
        return SimpleData.class.equals(clazz);
    }

    @Override
    public void validate(Object target, Errors errors) {
        SimpleData simpleData = (SimpleData) target;

        if (simpleData.getNumber() != 7) {
            errors.rejectValue("number", "wrongnumber", "Number is not 7");
        }
    }
}
