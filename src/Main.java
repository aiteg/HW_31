public class Main {
    public static void main(String[] args) {
        Course[] myCourses = {new ProgrammingCourse("Java", 144, "Azat"),
                new DesignCourse("UI/UX", 30, "Argen"),
                new MathCourse("Geometry", 100, "Aitegin"),
                new LanguageCourse("English", 300, "Isken")};

        TrainingCenter trainingCenter = new TrainingCenter(myCourses);

        trainingCenter.getInfo();
    }
}