package validator;

public class MaxLengthValidator extends ValidateSpecification{

    int max;

    public MaxLengthValidator(int max,Validate validator) {
        super(validator);
        this.max = max;
    }

    @Override
    public String validate() {
        if(validator.validate().length() >=max){
            return "Name field length must be less then 45";
        }

        return "";
    }
}
