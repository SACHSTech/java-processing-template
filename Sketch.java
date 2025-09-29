import processing.core.PApplet;

/**
 * Starter for graphics assignments.
 * Edit your code in the setup() and draw() functions below.
 */
public class Sketch extends PApplet {

  /**
   * Called once when program is run. Put your size() method here.
   */  
    public void settings() {
        size(600, 600);
    }

  /** 
   * Called once when program is run. Add initial setup
   * values here, e.g., background, stroke, fill etc.
   */
    public void setup() {
        background(210, 255, 173);
    }

  /**
   * Called repeatedly. Anything drawn to the screen should go here.
   */
    public void draw() {
        // === SAMPLE CODE, REPLACE THIS STUFF ===
        stroke(237, 47, 228);
        line(150, 25, 270, 350);
    }
}
