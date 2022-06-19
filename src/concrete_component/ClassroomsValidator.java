package concrete_component;

import validator.Validate;

import java.util.List;

public class ClassroomsValidator implements Validate {
   private List<Object> classrooms;

    public ClassroomsValidator(List<Object> classrooms) {
        this.classrooms = classrooms;
    }

    @Override
    public String validate() {
        return String.valueOf(classrooms.size());
    }
}
