import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Action {
    private final List<Philosopher> philosophers;

    public Action (Philosopher... philosopher) {
        philosophers = new ArrayList<>();
        Collections.addAll(philosophers, philosopher);
    }

    public void setThreads() {
        for (Philosopher philosopher : philosophers) {
            Runnable runnable = () -> {
                int count = 3;
                while (count != 0) {
                    philosopher.eat();
                    philosopher.think();
                    count--;
                }
            };
            Thread thread = new Thread(runnable);
            thread.start();
        }
    }
}
