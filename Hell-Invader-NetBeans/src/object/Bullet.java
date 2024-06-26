package object;

import main.GamePanel;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.IOException;

public class Bullet extends GameObject {

    GamePanel gp;
    BufferedImage image;

    public Bullet(int x, int y, GamePanel gp) {
        super(x, y, gp.TILE_SIZE/4, gp.TILE_SIZE/4, 0, 50);
        this.gp = gp;

        getImage();
    }

    public void getImage() {

        try {

            image = ImageIO.read(getClass().getResourceAsStream("/res/sprite/player_bullet_sprite.png"));

        } catch(IOException e) {
            e.printStackTrace();
        }

    }

    public void update() {

        y -= vy;
    }

    public void draw(Graphics g) {
        
        // bullet
        g.drawImage(image, x - gp.TILE_SIZE/3, y - gp.TILE_SIZE/4, gp.TILE_SIZE, gp.TILE_SIZE, null);
        
        // draw hitbox
        //g.setColor(Color.yellow);
        //g.drawRect(x, y, width, height);
    }
}