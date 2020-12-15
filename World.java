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
                g.fillRect(1000, 250, 330, 100);
                g.fillRect(1000, 400, 330, 100);
                g.fillRect(1000, 550, 330, 100);
                g.setColor(new Color(200,200,200));
                g.setFont(new Font ("Times Roman", Font.PLAIN,20));
                g.drawString("Basic Attack \n Press W", 1050, 130);
                g.drawString("Attack Power: 5", 1075, 150);
                g.drawString("MP Cost: 0", 1100, 170);
                g.drawString("Powerful Attack \n Press D", 1050, 280);
                g.drawString("Attack Power: 10", 1075, 300);
                g.drawString("MP Cost: 5", 1100, 320);
                g.drawString("Magic Attack \n Press A", 1050, 430);
                g.drawString("Magic Power: 10", 1075, 450);
                g.drawString("MP Cost: 7", 1100, 470);
                g.drawString("Healing Technique \n Press S", 1050, 580);
                g.drawString("Healing Power: 10", 1075, 600);
                g.drawString("MP Cost: 10", 1100, 620);
                
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
               if (enemy.getMp()>10) {
                int h = (int) (Math.random() * 4);
                if (h==0){
                enemy.attack1(player);
                }
                else if (h==1) {
                    enemy.attack2(player);
                }
                else if (h==2) {
                    enemy.magicAttack(player);
                }
                else if (h==3) {
                    enemy.heal();
                }
               }
               if (enemy.getMp()<10&&enemy.getMp()>7) {
                   int g = (int) (Math.random() * 3);
                   if (g==0) {
                       enemy.attack1(player);
                   }
                   if (g==1) {
                       enemy.attack2(player);
                   }
                   if (g==2) {
                       enemy.magicAttack(player);
                   }
               }
               if (enemy.getMp()<7&&enemy.getMp()>5) {
                  int f = (int)(Math.random() * 2);
                  if (f==0) {
                      enemy.attack1(player);
                  }
                  if (f==1) {
                      enemy.attack2(player);
                  }
               }
               if (enemy.getMp()<5) {
                   enemy.attack1(player);
               }
            }
        
                else if (turn%2 == 1) {
                    if (e.getKeyCode()==87) {
                        player.attack1(enemy);
                    }
                    if (e.getKeyCode()==68) {
                        player.attack2(enemy);
                    }
                    if (e.getKeyCode()==65) {
                        player.magicAttack(enemy);
                    }
                    if(e.getKeyCode()==83) {
                        player.heal();
                    }
                
            }
              turn ++;
    }
    }
    

