public class GradeBook {
    private String courseName;

    public GradeBook(String courseName) {
        this.courseName = courseName;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public static void displayMessage(){
        System.out.println(" Welcome to GradeBook!");
        GradeBook ojb1= new GradeBook("Lap trinh huong doi tuong");
        System.out.println(" Chao mung den voi khoa hoc"+ ojb1.getCourseName());
    }
    public static void main(String[]args){
        displayMessage();
    }
}
