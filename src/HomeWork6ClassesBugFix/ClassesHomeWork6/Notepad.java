package HomeWork6ClassesBugFix.ClassesHomeWork6;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Notepad {

    public class Note{
        private String note;
        private String note2;
        private String date;

        public String getDate() {
            return date;
        }

        public void setDate(Date date){
            SimpleDateFormat format = new SimpleDateFormat("mm/DD/yyyy");
            this.date = format.format(date);
        }
        public void setN(String note, String note2){
            if (this.date != null){
                System.out.println("You can write");
                this.note = note;
                this.note2 = note2;
            }
        }
        public void get(){
            System.out.println(note + "\n" + note2);
            System.out.println(getDate());
        }
    }
}
