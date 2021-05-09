import java.util.*;
import java.time.*;
import java.text.*;

public class Esercizio12U extends TimerTask {
    
    private Timer timer;
    
    public Esercizio12U () {
        timer = new Timer();
    }

    @Override
    public void run() {
        DateFormat timeFormatter = DateFormat.getTimeInstance(DateFormat.DEFAULT, Locale.getDefault());
        System.out.println("Sveglia! Sono le "+ LocalTime.now());
        timer.cancel();
    }

    public static void main(String args[]) throws Exception {
        int seconds = Integer.parseInt(args[0])*1000;
        Esercizio12U timerTask = new Esercizio12U();
        timerTask.timer.schedule(timerTask, seconds);
    }
}