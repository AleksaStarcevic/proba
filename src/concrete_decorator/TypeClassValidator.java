package concrete_decorator;

import validator.Validate;
import validator.ValidateSpecification;

public class TypeClassValidator extends ValidateSpecification {

    public TypeClassValidator(Validate validator) {
        super(validator);
    }

    @Override
    public String validate() {
        if(Integer.parseInt(validator.validate()) == -1){
            return "Appointment type is not selected";
        }
        return "";
    }
}
