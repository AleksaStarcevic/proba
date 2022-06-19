package main;

import validator.*;

public class Main {






    public static void main(String[] args) {
        Validate v;
         v = new MinLengthValidation(3,new NameValidator("aaa"));
         System.out.println("Error:"+v.validate());

         v = new MaxLengthValidator(45,new NameValidator("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa"));
         System.out.println("Error:"+v.validate());
    }



}
