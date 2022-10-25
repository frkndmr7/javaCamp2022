package business;

import core.logging.Logger;
import dataAccess.CourseDao;
import dataAccess.JdbcCourseDao;
import entities.Course;


public class CourseManager {

    private CourseDao courseDao;
    private Logger[] loggers;

    public CourseManager(CourseDao courseDao,Logger[] loggers) {
        this.courseDao = courseDao;
        this.loggers = loggers;
    }

    public void add(Course course) throws Exception{

        Course[] courses = {new Course(1,"Java","backend programing",10),new Course(2,"Javascript","frontend programing",20)};
        for (Course co : courses){
            if (course.getName() == co.getName()){
                throw new Exception("Kurs ismi tekrar edilemez");
            } else if (course.getPrice()<0) {
                throw new Exception("Bir kursun fiyatı 0 dan küçük olamaz.");
                
            }
        }

        courseDao.add(course);

        for (Logger logger : loggers){
            logger.log(course.getDescription());
        }
    }
}
