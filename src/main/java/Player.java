
import zero.GameApp;
import zero.ImageRegion;

public class Player {
    private double x;
    private double y;
    private final double size = 48;
    private final double speed = 180;
    private final ImageRegion image;
    

    public Player(double startX, double startY, ImageRegion image) {
        x = startX;
        y = startY;
        this.image = image;
    }

    public void update(int horizontal, int vertical, double seconds,
                       double canvasWidth, double canvasHeight) {
        x += horizontal * speed * seconds;
        y += vertical * speed * seconds;
        x = Math.max(0, Math.min(x, canvasWidth - size));
        y = Math.max(0, Math.min(y, canvasHeight - size));
    }
    public boolean touches(double otherX, double otherY, double otherSize) {
        return x + size >= otherX && x <= otherX + otherSize
                && y + size >= otherY && y <= otherY + otherSize;
    }
    public void draw(GameApp app) {
        app.image(image, x, y, size, size);
    }
}
