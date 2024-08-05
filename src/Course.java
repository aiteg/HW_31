public abstract class Course {
    private String title;
    private int duration;
    private String instructor;

    public Course(String title, int duration, String instructor) {
        this.title = title;
        this.duration = duration;
        this.instructor = instructor;
    }

    public Course() {
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public String getInstructor() {
        return instructor;
    }

    public void setInstructor(String instructor) {
        this.instructor = instructor;
    }

    public abstract void conductClass();

    public void startCourse() {
        System.out.println("Курс " + title + " начинается");
    }

}
