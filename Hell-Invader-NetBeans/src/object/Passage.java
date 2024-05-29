package object;

import main.GamePanel;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.IOException;

public class Passage extends GameObject {

    GamePanel gp;
    BufferedImage image;

    public Passage(int x, int y, int height, int vy, GamePanel gp) {
        super(x, y, gp.TILE_SIZE*3, height, 0, vy);
        this.gp = gp;

        getImage();
    }
    
    public void getImage() {

        try {

            BufferedImage sprite = ImageIO.read(getClass().getResourceAsStream("/res/sprite/passage_sprite.png"));
            image = sprite.getSubimage(0, 0, 24, 8);

        } catch(IOException e) {
            e.printStackTrace();
        }
    }
    
    public void update() {

        y += vy;
    }

    public void draw(Graphics g) {
        
        // draw passage
        g.drawImage(image, x, y, width, height, null);
    }
}