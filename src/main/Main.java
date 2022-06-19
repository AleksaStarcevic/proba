package main;

import domain.Appointment;
import validator.Validator;
import validator.ValidatorEndTime;
import validator.ValidatorName;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Main {

  private static HashMap<Validator,List<String>> errors= new HashMap<>();



    public static void main(String[] args) {


//        if(validate()){
//            //createAppointment
//        }

        System.out.println(validate());
        for (Validator i : errors.keySet()) {
            System.out.println("key: " + i.getClass() + " value: " + errors.get(i));
        }

    }


    public static boolean validate(){
        List<Validator> validators = new ArrayList<>();
        validators.add(new ValidatorName());
        validators.add(new ValidatorEndTime());

        Appointment appointment = new Appointment();
        appointment.setEndTime("1111");
        appointment.setNameText("");

        for (Validator v : validators) {
            if(!v.brokenRules(appointment).isEmpty()) {
                errors.put(v,v.brokenRules(appointment));
            }
        }
        return errors.isEmpty();
    }













}
