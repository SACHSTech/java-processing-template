import processing.core.PApplet;

/**
 * Starter for graphics assignments.
 * Edit the setup() and draw() functions.
 *
 * Default: Saves one frame to image.png (File Mode).
 */
public class Sketch extends PApplet {

    // Change flag for output to screen instead of file
    private static boolean screenMode = false;
  
    // Called once when program is run. Put your canvas size() here.
    public void settings() {
        size(600, 600);
    }

    // Called once when run. Add initial setup values here, e.g., background()
    public void setup() {
        background(210, 255, 173);
    }

    // Called repeatedly when run. Draw your stuff here
    public void draw() {
        // === BEGIN CODE HERE, REPLACE THIS STUFF ===
        stroke(237, 47, 228);
        line(150, 25, 270, 350);
        
        // === END CODE HERE, DO NOT EDIT BELOW THIS ===
        if (!screenMode) {
            save("image.png");
            exit();
        }
    }

    /**
     * Launches the sketch.
     * Default: File Mode (saves image.png).
     * Use --screen to run in Screen Mode.
     */
    public static void main(String[] args) {
        if (args.length > 0 && args[0].equals("--screen")) {
            screenMode = true;
        }
        PApplet.runSketch(new String[]{"Sketch"}, new Sketch());
    }
}
