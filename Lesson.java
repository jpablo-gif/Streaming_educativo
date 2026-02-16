public class Lesson{
    private String id;
    private String title;
    private int durationMin;
    private boolean completed;

    public Lesson (String id, String title, int durationMin){
        this.id=id;
        this.title=title;
        this.durationMin = durationMin;
        this.completed=false;
    }

    public void mark_as_completed(){
        this.completed=true;
    }
    public boolean isCompleted(){
        return completed;
    }
    public String getTitle(){
        return title;
    }
}