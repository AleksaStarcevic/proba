package concrete_component;

import validator.Validate;

public class AttendeesValidator implements Validate {

    private String attendees;

    public AttendeesValidator(String attendees) {
        this.attendees = attendees;
    }

    @Override
    public String validate() {
        return attendees;
    }
}
