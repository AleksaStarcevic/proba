package validator;

public class MinLengthValidation extends ValidateSpecification {

    int min;

    public MinLengthValidation(int min,Validate validator) {
        super(validator);
        this.min = min;
    }




    @Override
    public String validate() {
       if(validator.validate().length() <min){
           return "Name length must be greater than 2";
       }
        return "";
    }

}
