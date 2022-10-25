import business.CategoryManager;
import business.CourseManager;
import business.InstructorManager;
import core.logging.DatabaseLogger;
import core.logging.FileLogger;
import core.logging.Logger;
import core.logging.MailLogger;
import dataAccess.JdbcCategoryDao;
import dataAccess.JdbcCourseDao;
import dataAccess.JdbcInstructorDao;
import entities.Category;
import entities.Course;
import entities.Instructor;

public class Main {
    public static void main(String[] args) throws Exception {

        Logger[] loggers = {new MailLogger(),new FileLogger(), new DatabaseLogger()};

        Course course1 = new Course(1,"Java","backend programing",10);
        CourseManager courseManager = new CourseManager(new JdbcCourseDao(),loggers);
        courseManager.add(course1);


        Category category1 = new Category(4, "Cloud");
        CategoryManager categoryManager = new CategoryManager(new JdbcCategoryDao(), loggers);
        categoryManager.add(category1);

        Instructor instructor1 = new Instructor(1 ,"Engin","Demiroğ");
        InstructorManager instructorManager = new InstructorManager(new JdbcInstructorDao(), loggers);
        instructorManager.add(instructor1);



    }
}