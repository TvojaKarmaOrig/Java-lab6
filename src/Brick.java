import java.awt.*;
import java.awt.geom.Rectangle2D;

public class Brick {

    public static int HEIGHT = 75;
    public static int WIDTH = 150;
    private int durability = 5;
    private int x;
    private int y;

    public Brick(Field field, int startDurability) {
        durability = startDurability;
        x = (int) (Math.random() * field.getWidth() / WIDTH - 1) * WIDTH;
        y = (int) (Math.random() * field.getHeight() / HEIGHT - 1) * HEIGHT;
    }

    public void punch(){
        durability--;
    }

    public int getDurability() {
        return durability;
    }

    public int getPosX() {
        return x;
    }

    public int getPosY() {
        return y;
    }

    public void paint(Graphics2D canvas) {
        canvas.setColor(Color.ORANGE);
        Rectangle2D.Double rect = new Rectangle2D.Double(x, y, WIDTH, HEIGHT);
        canvas.fill(rect);
        canvas.setColor(Color.BLACK);
        canvas.draw(rect);
        canvas.drawString(Integer.toString(durability), x + 20, y + 15);
    }

}
