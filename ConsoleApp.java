/**
 * Starter for console assignments.
 * Edit your code in the run() method beginning on L13 below.
 */
public class ConsoleApp extends ConsoleProgram {

    public static void main(String[] args) {
        new ConsoleApp().run();
    }

    @Override
    public void run() {
        // === EDIT YOUR CODE BELOW ===
        println("Hello, ICS3U!");
        String name = readLine("What is your name? ");
        println("Hi " + name + "!");
    }
}
