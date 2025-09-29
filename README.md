# ICS3U Java Processing Template

Welcome! This repository is your starter kit for Java assignments in
ICS3U.\
There are two kinds of programs you'll be writing in this course:

1.  **Console Programs** (text input and output)\
2.  **Graphics Programs** (using Processing to draw shapes, lines,
    colours, etc.)

------------------------------------------------------------------------

## 1. Console Programs

-   Open **`ConsoleApp.java`**.\
-   Edit the code inside the `run()` method. That's where all your work
    goes.

Example:

``` java
@Override
public void run() {
    println("Hello!");
    String name = readLine("What is your name? ");
    println("Hi " + name + "!");
}
```

-   Run **ConsoleApp** from the Run menu or the "Run Console App"
    option.\
-   Your program will print messages in the Terminal at the bottom of VS
    Code.

You do **not** need to edit `ConsoleProgram.java` --- that's just the
helper code that makes `readLine`, `readInt`, etc. work.

------------------------------------------------------------------------

## 2. Graphics Programs

-   Open **`Sketch.java`**.\
-   Edit the code inside the `setup()` and `draw()` methods. That's
    where your drawing code goes.

Example:

``` java
public void setup() {
    background(200, 200, 255);
}

public void draw() {
    ellipse(300, 300, 100, 100);
}
```

### Output options

-   In **Codespaces** (online), you can't see a live graphics window.
    Instead, running **Sketch** will save a picture called
    **`image.png`** in the repo. Open the file to see your work.\
-   On your **own computer** (if you install Java + Processing locally),
    you can run **Main.java** to see a live window.

------------------------------------------------------------------------

## Which file do I edit?

-   **Text/console assignment →** edit `ConsoleApp.java` (inside
    `run()`).\
-   **Graphics/drawing assignment →** edit `Sketch.java` (inside
    `setup()` and `draw()`).

Do **not** edit `Main.java` or `ConsoleProgram.java` --- those files are
just the "behind the scenes" setup.

------------------------------------------------------------------------

## Tips

-   Keep your code inside the marked sections of `ConsoleApp.java` and
    `Sketch.java` so you don't accidentally break the setup.\
-   Save often, and commit your work to GitHub.\
-   If you don't see your picture in Codespaces, refresh the file
    explorer --- `image.png` should be saved in the repo root.
