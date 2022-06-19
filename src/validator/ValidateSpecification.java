package validator;

public class ValidateSpecification implements Validate{

    protected Validate validator;

    public ValidateSpecification(Validate validator){
        this.validator = validator;
    }


    @Override
    public String validate() {
        return validator.validate();
    }
}
