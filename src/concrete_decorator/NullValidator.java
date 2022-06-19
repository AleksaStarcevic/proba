package concrete_decorator;

import validator.Validate;
import validator.ValidateSpecification;

public class NullValidator extends ValidateSpecification {


    public NullValidator(Validate validator) {
        super(validator);
    }

    @Override
    public String validate() {
        if(validator.validate() == null){
            return "Field is null";
        }
        return "";
    }
}
