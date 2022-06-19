package concrete_decorator;

import validator.Validate;
import validator.ValidateSpecification;

public class MaxLengthValidator extends ValidateSpecification {

    int max;

    public MaxLengthValidator(int max, Validate validator) {
        super(validator);
        this.max = max;
    }

    @Override
    public String validate() {
        if(validator.validate().length() >=max){
            return "Length must be less then 45";
        }

        return "";
    }
}
