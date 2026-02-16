public class Main{
    public static void main(String[] args){

        Course javaCourse = new Course(
            "java basico",
            "introduccion a java", 
            "programacion",
            CourseLevel.BASIC
        );

        Lesson l1 = new Lesson("l1","variables",20);
        Lesson l2 = new Lesson("l2","condicionales",25);
        javaCourse.addLesson(l1);
        javaCourse.addLesson(l2);

        User user = new User ("juan pablo gomez","jpablo@unal.edu.co");

        user.register(javaCourse);

        l1.mark_as_completed();

        Inscription inscription =user.getInscriptions().get(0);
        System.out.println("progreso: " + inscription.calculateProgress() + "%");

        l2.mark_as_completed();
        inscription.finishing();

        System.out.println("Cursos finalizados: ");
        user.FinishedCourseList()
            .forEach(c -> System.out.println(c.getTitle()));


    }
}