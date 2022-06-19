package concrete_component;

import validator.Validate;

public class AppointmentTypeValidator implements Validate {

    private int type;

    public AppointmentTypeValidator(int type) {
        this.type = type;
    }

    @Override
    public String validate() {
        return String.valueOf(type);
    }
}
