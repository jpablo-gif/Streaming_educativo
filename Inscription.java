import java.time.LocalDate;

public class Inscription{
    private User user;
    private Course course;
    private LocalDate date;
    private InscriptionStatus status;

    public Inscription(User user, Course course){
        this.user = user;
        this.course = course;
        this.date = LocalDate.now();
        this.status = InscriptionStatus.Active;
    }

    public double calculateProgress(){
        long total =course.getLessons().size();
        long completed_lessons = course.getLessons()
                .stream()
                .filter(Lesson::isCompleted)
                .count();

        if(total == 0) return 0;
        return (completed_lessons*100.0)/ total;
    }
    public void finishing(){
        this.status = InscriptionStatus.Finished;
    }
    public InscriptionStatus getStatus(){
        return status;
    }
    public Course getCourse(){
        return course;
    }
}
