public class Canvas {

    int width;
    int height;
    int bpp;

    public Canvas() {
        width = 1280;
        height = 720;
        bpp = 24;
    }

    public Canvas (int newWidth, int newHeight, int newBPP) {
        width = newWidth;
        height = newHeight;
        bpp = newBPP;
    }

    public boolean equals(Canvas c) {
        return (c.width == width && c.height == height && c.bpp == bpp);
    }

}
