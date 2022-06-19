package validator;

import domain.Appointment;

import java.util.ArrayList;
import java.util.List;

public class ValidatorName implements Validator<Appointment>{

    private String nameTextError;
    private String nameTextErrorExplained;


    @Override
    public List<String> brokenRules(Appointment entity) {
        List<String> errors = new ArrayList<>();

         if(entity.getNameText() == null){
             nameTextError="Please enter valid end name";
             nameTextErrorExplained="Name cant be empty";
             errors.add(nameTextError);
             errors.add(nameTextErrorExplained);
             return errors;
         }


            if(entity.getNameText().isEmpty()) {
                nameTextError="Please enter valid name";
                nameTextErrorExplained="Name cant be empty";
                errors.add(nameTextError);
                errors.add(nameTextErrorExplained);
                return errors;
            }
            if(entity.getNameText().length() >=45){
                nameTextError="Please enter valid name";
                nameTextErrorExplained= "Name field length must be less then 45";
                errors.add(nameTextError);
                errors.add(nameTextErrorExplained);
                return errors;
            }
            return errors;

        }
    }

