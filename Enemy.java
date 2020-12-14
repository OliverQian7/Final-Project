package finalproject;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;

public class Enemy {
    private int x,y, hp, mp, attack, magic, defence;
    private static int MAX_HP = 50;
    
    public Enemy (int x,int y) {
        this.x = x;
        this.y = y;
        this.hp = (int) (Math.random()*10)+39;
        this.mp = (int) (Math.random()*5)+22;
        this.attack = (int) (Math.random()*5)+1;
        this.magic = (int) (Math.random()*5)+1;
        this.defence = (int) (Math.random()*5) +1;
    }
    
    public void draw (Graphics g) {
        g.setColor(Color.CYAN);
        g.fillRect(x,y,150,150);
        g.setColor(Color.black);
         g.setFont(new Font ("Times Roman", Font.PLAIN, 20));
        g.drawString("HP: "+this.hp+"/50", x+50, y+50);
        g.drawString("MP: "+this.mp, x+50, y+70);
    }
    
    public void attack1 (Player p) {
       p.setHp(p.getHp() - (int)(5*(1+attack/10)*(1-p.getDefence()/10)));
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public int getHp() {
        return hp;
    }

    public int getMp() {
        return mp;
    }

    public int getAttack() {
        return attack;
    }

    public int getMagic() {
        return magic;
    }

    public int getDefence() {
        return defence;
    }

    public static int getMAX_HP() {
        return MAX_HP;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }
    
    
}
