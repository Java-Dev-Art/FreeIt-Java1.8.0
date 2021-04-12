package HomeWork6.ClassesHomeWork6;

public class StudentRecordBook {
    private String studentName;
    private int id;
    private String faculty;
    public Exam exam;
    public Offset offset;

    public StudentRecordBook(String studentName, int id, String faculty) {
        this.studentName = studentName;
        this.id = id;
        this.faculty = faculty;
    }

    public String getStudentName() {
        return studentName;
    }

    public int getId() {
        return id;
    }

    public String getFaculty() {
        return faculty;
    }

    public Exam getExam() {
        return exam;
    }

    public class Exam{
        private String professor;
        private String subject;
        private String session;
        private int rank;

        public void setProfessor(String professor) {
            this.professor = professor;
        }

        public void setSubject(String subject) {
            this.subject = subject;
        }

        public void setSession(String session) {
            this.session = session;
        }

        public String getProfessor() {
            return professor;
        }

        public String getSubject() {
            return subject;
        }

        public String getSession() {
            return session;
        }

        public int getRank() {
            return rank;
        }

        public void setRank(int rank) {
            this.rank = rank;
        }
        public String infoExam(){
            return "Имя преподователя :" + getProfessor() + "\nНазвание предмета :" + getSubject() +
                    "\nСессия :" + getSession() + "\nИмя студента :" + getStudentName() + "\nОценка :" + getRank();
        }
    }
    public class Offset{
        private String professor;
        private String subject;
        private String session;
        private boolean rank;

        public void setProfessor(String professor) {
            this.professor = professor;
        }

        public void setSubject(String subject) {
            this.subject = subject;
        }

        public void setSession(String session) {
            this.session = session;
        }

        public void setRank(boolean rank) {
            this.rank = rank;
        }

        public String getProfessor() {
            return professor;
        }

        public String getSubject() {
            return subject;
        }

        public String getSession() {
            return session;
        }

        public boolean isRank() {
            return rank;
        }
        public String infoOffset(){
            return "Имя преподователя :" + getProfessor() + "\nНазвание предмета :" + getSubject() +
                    "\nСессия :" + getSession() + "\nИмя студента :" + getStudentName() + "\nЗачет :" + isRank();
        }
    }
    public final void infoSession(){
        exam = new Exam();
        offset = new Offset();
        System.out.println(exam.infoExam());
        System.out.println(offset.infoOffset());
    }

    public static void main(String[] args) {
        StudentRecordBook studentRecordBook = new StudentRecordBook("Alfred Einstein",5555458,"MAt");
        StudentRecordBook.Exam exam = studentRecordBook.new Exam();
        exam.setProfessor("MAriarti");
        exam.setSession("Winter");
        exam.setSubject("Criminal");
        exam.setRank(7);

        exam.infoExam();
        studentRecordBook.infoSession();
    }
}
