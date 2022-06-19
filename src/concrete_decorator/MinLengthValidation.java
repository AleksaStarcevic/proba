package concrete_decorator;

import validator.Validate;
import validator.ValidateSpecification;

public class MinLengthValidation extends ValidateSpecification {

    int min;

    public MinLengthValidation(int min, Validate validator) {
        super(validator);
        this.min = min;
    }




    @Override
    public String validate() {
       if(validator.validate().length() <min){
           return "Length must be greater than 2";
       }
        return "";
    }

}
