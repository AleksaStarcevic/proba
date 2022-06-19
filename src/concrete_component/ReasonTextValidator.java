package concrete_component;

import validator.Validate;

public class ReasonTextValidator implements Validate {


    private String text;

    public ReasonTextValidator(String text) {
        this.text = text;
    }

    @Override
    public String validate() {
        return text;
    }
}
