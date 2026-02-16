import java.util.ArrayList;
import java.util.List;

public class Course{
    private String title;
    private String description;
    private String category;
    private CourseLevel level;
    private List<Lesson> lessons;

    public Course(String title, String description, String category, CourseLevel level){
        this.title = title;
        this.description=description;
        this.category=category;
        this.level=level;
        this.lessons = new ArrayList<>();
    }
    public void addLesson(Lesson lesson){
        lessons.add(lesson);
    }
    public List<Lesson> getLessons(){
        return lessons;
    }
    public String getTitle(){
        return title;
    }
}
