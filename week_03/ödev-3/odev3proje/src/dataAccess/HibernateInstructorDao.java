package dataAccess;

import entities.Instructor;

public class HibernateInstructorDao implements InstructorDao{
    public void add(Instructor instructor){
        System.out.println("Hibernate ile veritabanına eklendi" +
                instructor.getId()+ instructor.getName()+instructor.getLastName());
    }
}
