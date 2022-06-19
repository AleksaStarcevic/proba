package concrete_component;

import validator.Validate;

public class StartTimeValidator implements Validate {

   private String startTime;

    public StartTimeValidator(String startTime) {
        this.startTime = startTime;
    }

    @Override
    public String validate() {
        return startTime;
    }
}
