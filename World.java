package finalproject;

import java.awt.Color;
import java.awt.Graphics;

public class World {
    private final int LENGTH = 1400;
    private final int WIDTH = 850;
    private Player player;
    private Enemy enemy;
    
    public void draw(Graphics g) {
        this.player = new Player (200,550);
        this.enemy = new Enemy(1150,100);
        player.draw(g);
        enemy.draw(g);
    }
    
}
