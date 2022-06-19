package concrete_decorator;

import constants.Constants;
import validator.Validate;
import validator.ValidateSpecification;

public class WorkTimeValidator extends ValidateSpecification {

    public WorkTimeValidator(Validate validator) {
        super(validator);
    }

    @Override
    public String validate() {
        if(Integer.parseInt(validator.validate()) > Constants.MAX_WORK_TIME || Integer.parseInt(validator.validate())< Constants.MIN_WORK_TIME){
            return "Work time is not valid";
        }
        return "";
    }
}
