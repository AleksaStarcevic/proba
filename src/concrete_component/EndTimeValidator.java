package concrete_component;

import validator.Validate;

public class EndTimeValidator implements Validate {
    private String endTime;

    public EndTimeValidator(String endTime) {
        this.endTime = endTime;
    }

    @Override
    public String validate() {
        return endTime;
    }
}
