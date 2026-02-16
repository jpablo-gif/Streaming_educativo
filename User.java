import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class User {
    private String name;
    private String email;
    private List<Inscription> inscriptions;

    public User(String name, String email){
        this.name = name;
        this.email= email;
        this.inscriptions = new ArrayList<>();
    }
    public void register (Course course){
        inscriptions.add(new Inscription(this, course));
    }

    public List<Course> CourseListInProgress(){
        return inscriptions.stream()
        .filter(i -> i.getStatus() == InscriptionStatus.Active)
        .map(Inscription::getCourse)
        .collect(Collectors.toList());
    }
    public List<Course> FinishedCourseList(){
        return inscriptions.stream()
        .filter(i-> i.getStatus()==InscriptionStatus.Finished)
        .map(Inscription::getCourse)
        .collect(Collectors.toList());
    }
    public List<Inscription> getInscriptions(){
        return inscriptions;
    }
    }
    

