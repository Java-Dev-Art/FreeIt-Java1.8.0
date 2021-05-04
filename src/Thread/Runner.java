package Thread;

import java.util.LinkedList;

public class Runner {
    public static void main(String[] args) {
        LinkedList<AudioChanel> list = new LinkedList<AudioChanel>(){
            {
                this.add(new AudioChanel(771));
                this.add(new AudioChanel(883));
                this.add(new AudioChanel(550));
                this.add(new AudioChanel(337));
                this.add(new AudioChanel(442));
//                this.add(new AudioChanel(116));
//                this.add(new AudioChanel(117));
//                this.add(new AudioChanel(118));
//                this.add(new AudioChanel(119));
//                this.add(new AudioChanel(120));
            }
        };
        ChannelPoolS313<AudioChanel>pool = new ChannelPoolS313<>(list);
        for (int i = 0; i < 20; i++){
            new Client(pool).start();
        }
    }
}
