public class Pellet {

    // ATTRIBUTES ===========================================
    // ------------------------------------------------------

    // THE PELLET CLASS CONTAINS TWO PRIVATE INTEGER
    // ATTRIBUTES, posX AND posY, WHICH REPRESENT THE
    // X AND Y COORDINATES OF A PELLET.
    private int posX;
    private int posY;

    // THE PELLET CLASS ALSO CONTAINS TWO PRIVATE
    // INTEGER ATTRIBUTES, hSpeed AND vSpeed, WHICH
    // REPRESENT HOW FAST A PELLET IS MOVING ALONG
    // A SPECIFIC AXIS.
    private int hSpeed;
    private int vSpeed;


    // CONSTRUCTORS =========================================
    // ------------------------------------------------------

    // THE DEFAULT CONSTRUCTOR PLACES A PELLET AT (0, 0)
    // AND SETS ITS SPEED TO (0, 1).
    public Pellet () {
        posX = 0;
        posY = 0;
        hSpeed = 0;
        vSpeed = 1;
    }

    // A CUSTOM CONSTRUCTOR PLACES A PELLET AT A LOCATION
    // SPECIFIED BY PARAMETERS, WITH A SPEED SPECIFIED BY
    // PARAMETERS AS WELL!
    public Pellet (int posX, int posY, int hSpeed, int vSpeed) {
        this.posX = posX;
        this.posY = posY;
        this.hSpeed = hSpeed;
        this.vSpeed = vSpeed;
    };


    // CLASS METHODS ========================================
    // ------------------------------------------------------

    // THE UPDATE METHOD MOVES THE PELLET ACCORDING TO ITS
    // VERTICAL AND HORIZONTAL SPEEDS.  IT ALSO CONSTRAINS
    // THE PELLET INSIDE SPECIFIC BOUNDARIES.
    public void Update() {

        // ADD HORIZONTAL SPEED TO THE PELLET'S X POSITION
        posX += hSpeed;

        // ADD VERTICAL SPEED TO THE PELLET'S Y POSITION
        posY += vSpeed;

        // IF THE PELLET'S X POSITION IS LESS THAN ZERO,
        // SET ITS POSITION TO 1 AND MULTIPLY HORIZONTAL
        // SPEED BY -1.
        if (posX < 0) {
            posX = 1;
            hSpeed *= -1;
        }

        // IF THE PELLET'S X POSITION IS GREATER THAN 9,
        // SET ITS POSITION TO 8 AND MULTIPLY HORIZONTAL
        // SPEED BY -1.
        if (posX > 9) {
            posX = 8;
            hSpeed *= -1;
        }

        // IF THE PELLET'S Y POSITION IS LESS THAN ZERO,
        // SET ITS POSITION TO 1 AND MULTIPLY VERTICAL
        // SPEED BY -1.
        if (posY < 0) {
            posY = 1;
            vSpeed *= -1;
        }

        // IF THE PELLET'S Y POSITION IS GREATER THAN 9,
        // SET ITS POSITION TO 8 AND MULTIPLY VERTICAL
        // SPEED BY -1.
        if (posY > 9) {
            posY = 8;
            vSpeed *= -1;
        }

    }


    // ACCESSORS / MUTATORS =================================
    // ------------------------------------------------------

    // THE PELLET CLASS CONTAINS AN ACCESSOR FOR posX.
    public int get_posX () {
        return posX;
    }

    // THE PELLET CLASS CONTAINS AN ACCESSOR FOR posY.
    public int get_posY () {
        return posY;
    }

}