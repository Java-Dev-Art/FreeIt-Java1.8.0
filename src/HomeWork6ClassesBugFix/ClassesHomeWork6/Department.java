package HomeWork6ClassesBugFix.ClassesHomeWork6;

import java.util.*;

public class Department {
    private String nameDep;
    private int id;
    private MyDepartment depart;
    private ArrayList<MyDepartment> departments;

    public Department(String nameDep, int id) {
        this.nameDep = nameDep;
        this.id = id;
    }
    public static class MyDepartment{
        private String nameWorker;
        private String workerPosition;

        public String getNameWorker() {
            return nameWorker;
        }

        public void setNameWorker(String nameWorker) {
            this.nameWorker = nameWorker;
        }

        public String getWorkerPosition() {
            return workerPosition;
        }

        public void setWorkerPosition(String workerPosition) {
            this.workerPosition = workerPosition;
        }
        public String toStringDepart(){
            return "Имя :" + getNameWorker() + "\nДолжность :" + getWorkerPosition();
        }
    }
}
