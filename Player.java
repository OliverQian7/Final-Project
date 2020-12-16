package finalproject;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class Player {
    private int x,y,hp, mp, attack, magic, defence;
    private final static int MAX_HP = 50;
    
    public Player (int x, int y) {
        this.x = x;
        this.y = y;
        this.hp = (int) (Math.random()*10)+40;
        this.mp = (int) (Math.random()*5)+15;
        this.attack = (int) (Math.random()*5)+1;
        this.magic = (int) (Math.random()*5)+1;
        this.defence = (int) (Math.random()*5) +1;
    }
    
    public void draw(Graphics g) {
        g.setColor(Color.ORANGE);
        g.fillRect(x, y, 150, 150);
         g.setFont(new Font ("Times Roman", Font.PLAIN, 20));
        g.setColor(Color.black);
        g.drawString("YOU", x + 55, y+30);
        g.drawString("HP: "+this.hp, x+50, y+50);
        g.drawString("MP: "+this.mp, x+50, y+70);
        g.drawString("Attack:"+attack, x+45, y+90);
        g.drawString("Defence:"+defence, x+45, y+110);
        g.drawString("Magic:"+magic, x + 45, y +130);
    }
    public void attack1(Enemy e) {
        e.setHp(e.getHp() - (int)(5*(1+attack/10)*(1-e.getDefence()/10)));
    }
    public void attack2(Enemy e) {
        if (mp>=5) {
            e.setHp(e.getHp() - (int)(10*(1+attack/10)*(1-e.getDefence()/10)));
            mp -= 5;
        }   
    }
    public void magicAttack(Enemy e) {
        if (mp>=7) {
            e.setHp(e.getHp() - (int)(10*(1.5+magic/10)));
            mp -= 7;
        }
    }
    public void heal() {
        if (mp>=10) {
            hp = hp + (int)(15*(1+magic/10)); 
            mp -=10;
        }
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
