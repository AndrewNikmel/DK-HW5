public class Main {
    public static void main(String[] args) {
        Philosopher philosopher1 = new Philosopher("Агриппий");
        Philosopher philosopher2 = new Philosopher("Аристотель");
        Philosopher philosopher3 = new Philosopher("Демокрит");
        Philosopher philosopher4 = new Philosopher("Диоген");
        Philosopher philosopher5 = new Philosopher("Эпикур");

        Action  philosophers = new Action(philosopher1, philosopher2, philosopher3,
                philosopher4, philosopher5);

        philosophers.setThreads();
    }
}