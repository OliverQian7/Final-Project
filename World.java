package finalproject;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class World {
    private final int LENGTH = 1400;
    private final int WIDTH = 850;
    private Player player;
    private Enemy enemy;
    private int turn = 1;
    
    
    public World() {
        this.player = new Player (200,550);
        this.enemy = new Enemy(200,100);
    }
    
    public void draw(Graphics g){
        
        if (player.getHp() >0 && enemy.getHp()>0) {
            player.draw(g);
            enemy.draw(g);
            if (turn%2 == 1) {
                g.setColor(Color.blue);
                g.fillRect(1000, 100, 330, 100);
                g.setColor(new Color(200,200,200));
                g.setFont(new Font ("Times Roman", Font.PLAIN,20));
                g.drawString("Basic Attack \n Press W", 1050, 130);
                g.drawString("Attack Power: 5", 1075, 150);
                g.drawString("MP Cost: 0", 1100, 170);
            }
            if (turn%2==0){
                g.setColor(Color.magenta);
                g.fillRect(1000,100,330,600);
                g.setColor(Color.black);
                g.setFont(new Font ("Times Roman", Font.PLAIN,20));
                g.drawString("Press Any Key to Continue", 1050, 300);
            }
        }
        else if (player.getHp()<=0) {
            g.setColor(Color.red);
            g.fillRect(213,230,344,233);
            g.setColor(Color.black);
            g.setFont(new Font ("Times Roman", Font.PLAIN, 30));
            g.drawString("YOU LOSE!",313,280);
        }
        else if (enemy.getHp()<=0) {
            g.setColor(Color.green);
            g.fillRect(123,123, 238, 283);
            g.setColor(Color.black);
             g.setFont(new Font ("Times Roman", Font.PLAIN, 30));
            g.drawString("YOU WIN!", 178,173);
        }
    }
    
    public void handleTurns(KeyEvent e) {
        
              if (turn%2 == 0) {
                enemy.attack1(player);
                
            }
        
                else if (turn%2 == 1) {
                    if (e.getKeyCode()==87) {
                        player.attack1(enemy);
                    
                }
                
            }
              turn ++;
    }
    }
    

