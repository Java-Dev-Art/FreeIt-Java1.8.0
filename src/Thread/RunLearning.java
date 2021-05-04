package Thread;

import java.util.ArrayList;

public class RunLearning {
    public static void main(String[] args) {
        final int TASK1 = 5;
        Student student = new Student(322335,TASK1);
        for (int i = 0; i < TASK1; i++){
            Task t = new Task("Task # " + i);
            student.addTask(t);
        }
        final int TASK2 = 4;
        Student student1 = new Student(4456321,TASK2);
        for (int i = 0; i < TASK2; i++){
            Task t = new Task("Task ##" + i);
            student1.addTask(t);
        }
        ArrayList<Student> st1 = new ArrayList<Student>();
        st1.add(student);
        st1.add(student1);
        Tutor tutor = new Tutor(st1);
        student.start();
        student1.start();
        try {
            Thread.sleep(500);
        }catch (InterruptedException e){
            e.printStackTrace();
        }
        tutor.start();
    }
}
