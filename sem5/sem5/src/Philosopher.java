import java.util.Random;

public class Philosopher {
    private final String name;
    private final Random random = new Random();

    Philosopher(String name) {
        this.name = name;
    }

    /**
     * Метод размышления философа
     */
    public void think() {
        System.out.println(name + " размышляет");
        try {
            Thread.sleep(random.nextInt(2000 - 1000) + 1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    /**
     * Метод приема пищи философа
     */
    public void eat() {
        System.out.println(name + " обедает");
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }


}
