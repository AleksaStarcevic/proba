package validator;

import domain.Appointment;

import java.util.ArrayList;
import java.util.List;

public class ValidatorEndTime implements Validator<Appointment>{
    private String endTimeError;
    private String endTimeErrorExplained;


    @Override
    public List<String> brokenRules(Appointment entity) {
        List<String> errors = new ArrayList<>();


        if(entity == null){
            endTimeError="Please enter valid end time";
            endTimeErrorExplained="End time must be digit";
            errors.add(endTimeError);
            errors.add(endTimeErrorExplained);
            return errors;
        }

        if(entity.getEndTime().isEmpty()){
            endTimeError="Please enter valid end time";
            endTimeErrorExplained="End time cant be empty";
            errors.add(endTimeError);
            errors.add(endTimeErrorExplained);
            return errors;
        }

        if(entity.getEndTime().length() >=3) {
            endTimeError = "Please enter valid end time";
            endTimeErrorExplained = "End time filed mush have 2 or les digits";
            errors.add(endTimeError);
            errors.add(endTimeErrorExplained);
            return errors;
        }

        return errors;

    }
}
