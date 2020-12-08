package finalproject;

import java.awt.Color;
import java.awt.Graphics;

public class World {
    private final int LENGTH = 1400;
    private final int WIDTH = 850;
    private Player player;
    private Enemy enemy;
    private int turn = 1;
    
    public World() {
        this.player = new Player (200,550);
        this.enemy = new Enemy(1150,100);
    }
    
    public void draw(Graphics g) {
        
        if (player.getHp() >0 && enemy.getHp()>0) {
            player.draw(g);
            enemy.draw(g);
            if (turn%2 == 0) {
                enemy.attack1(player);
                turn ++;
            }
            else if (turn%2 == 1) {
                
                player.attack1(enemy);
                turn ++;
            }
        }
        else if (player.getHp()<=0) {
            g.setColor(Color.red);
            g.fillRect(213,230,344,233);
        }
        else if (enemy.getHp()<=0) {
            g.setColor(Color.green);
            g.fillRect(123,123, 238, 283);
        }
    }
    
   // public void turns(){
//        for (int i = 0; i < 100; i++)
  //          if (player.getHp()>0 && enemy.getHp() > 0) {
      //          enemy.attack1(player);
        //        i++;
          //  }
            //else if (player.getHp()<= 0) {
              //  System.out.println("you lose!");
            //}
            //else if (enemy.getHp() <= 0) {
              //  System.out.println("you win!");
            //}
    //}
}
