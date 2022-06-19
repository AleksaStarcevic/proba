package main;

import concrete_component.AppointmentTypeValidator;
import concrete_component.NameValidator;
import concrete_component.StartTimeValidator;
import concrete_decorator.*;
import validator.*;


public class Main {






    public static void main(String[] args) {
           Validate v;
         v = new MinLengthValidation(3,new NameValidator("aaa"));
         System.out.println("Error:"+v.validate());

         v = new MaxLengthValidator(45,new NameValidator("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa"));
         System.out.println("Error:"+v.validate());

        v = new NullValidator(new NameValidator(null));
        System.out.println("Error:"+v.validate());


        v = new WorkTimeValidator(new StartTimeValidator("2"));
        System.out.println("Error:"+v.validate());

        v = new TypeClassValidator(new AppointmentTypeValidator(-1));
        System.out.println("Error:"+v.validate());


    }



}
