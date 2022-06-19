package concrete_decorator;

import validator.Validate;
import validator.ValidateSpecification;

public class EmptyValidator extends ValidateSpecification {


    public EmptyValidator(Validate validator) {
        super(validator);
    }

    @Override
    public String validate() {
        if(validator.validate().isEmpty()){
            return "Field is empty";
        }
        return "";
    }
}
