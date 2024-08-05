import java.lang.reflect.Method;

public class TrainingCenter {
    Course[] courses;

    public TrainingCenter(Course[] courses) {
        this.courses = courses;
    }

    public void getInfo() {
        for(Course course : courses) {
            if(course instanceof ProgrammingCourse) {
                ((ProgrammingCourse) course).provideOnlineAccess();
            }
            else if(course instanceof MathCourse) {
                ((MathCourse) course).arrangeClassroom();
            }
            course.conductClass();
            course.startCourse();
            System.out.println();
        }
    }

}
