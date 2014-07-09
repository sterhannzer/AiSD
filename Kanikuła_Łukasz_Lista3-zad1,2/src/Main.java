import java.util.*;
public class Main {
    public static void main(String[] args){
        Timer timer1 = new Timer();
        Urzad timer1_task = new Urzad(10, 3);
        timer1.schedule (timer1_task, 0, 3000);
    }
}
