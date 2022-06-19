package concrete_decorator;

import validator.Validate;
import validator.ValidateSpecification;

public class ClassroomValidator extends ValidateSpecification {


    public ClassroomValidator(Validate validator) {
        super(validator);

    }

    @Override
    public String validate() {
        if(Integer.parseInt(validator.validate()) == 0){
            return "Select one classroom";
        }

        return "";
    }
}
