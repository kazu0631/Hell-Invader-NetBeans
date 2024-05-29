package object;

import main.GamePanel;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.util.ArrayList;

public class Enemy extends GameObject {

    GamePanel gp;
    BufferedImage image;
    public ArrayList<EnemyBullet> enemyBullets = new ArrayList<>();

    public int hp;
    
    int cooldown, threshhold;

    int timer = 0;

    public Enemy(int x, GamePanel gp) {
        super(x, -gp.TILE_SIZE*2, gp.TILE_SIZE*2, gp.TILE_SIZE*2, 0, 2);
        this.gp = gp;

        hp = 5;

        threshhold = 100;
        cooldown = threshhold;

        getImage();
    }

    public void getImage() {

        try {

            image = ImageIO.read(getClass().getResourceAsStream("/res/sprite/enemy_sprite.png"));

        } catch(IOException e) {
            e.printStackTrace();
        }
    }

    public void update() {

        y += vy;
        
        // update bullets
        for(int i = 0; i < enemyBullets.size(); i++) {
            enemyBullets.get(i).update();

            if(enemyBullets.get(i).y > gp.SCREEN_HEIGHT) {
                enemyBullets.remove(enemyBullets.get(i));
            }
        }
        
        // control fire rate
        cooldown++;
        if(cooldown >= threshhold) {
            gp.playSE(6);
            enemyBullets.add(new EnemyBullet(x + width/2 - (gp.TILE_SIZE/4)/2, y + height/2 - (gp.TILE_SIZE/4)/2, 1, 5, gp));
            enemyBullets.add(new EnemyBullet(x + width/2 - (gp.TILE_SIZE/4)/2, y + height/2 - (gp.TILE_SIZE/4)/2, -1, 5, gp));
            cooldown = 0;
        }
    }

    public void draw(Graphics g) {
        
        // draw enemy bullets
        for(int i = 0; i < enemyBullets.size(); i++) {
            enemyBullets.get(i).draw(g);
        }
        
        // draw enemy
        g.drawImage(image, x, y, width, height, null);
    }
}