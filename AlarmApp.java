import java.util.Timer;
import java.util.TimerTask;
import java.time.LocalTime;

public class AlarmApp {
    public static void main(String[] args) {
        // Set the alarm time (Change as needed)
        int alarmHour = 6;
        int alarmMinute = 30;

        System.out.println("Alarm set for " + alarmHour + ":" + alarmMinute);

        Timer timer = new Timer();
        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                LocalTime now = LocalTime.now();
                if (now.getHour() == alarmHour && now.getMinute() == alarmMinute) {
                    System.out.println("🔔 Alarm ringing! Opening music...");
                    openMusic();
                    timer.cancel(); // Stop the timer after alarm rings
                }
            }
        }, 0, 60000); // Check every minute
    }

    public static void openMusic() {
    System.out.println("🔔 Alarm ringing! (Music would play here in a real app)");
} catch (Exception e) {
            e.pri
