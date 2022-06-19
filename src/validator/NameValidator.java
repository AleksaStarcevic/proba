package validator;

public class NameValidator implements Validate{

    private String value;

    public NameValidator(String value) {
        this.value = value;
    }

    @Override
    public String validate() {
       return value;
    }

}
