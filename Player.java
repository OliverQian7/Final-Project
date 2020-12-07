package finalproject;

import java.awt.Color;
import java.awt.Graphics;

public class Player {
    private int x,y,hp, mp, attack, magic, defence;
    private final static int MAX_HP = 50;
    
    public Player (int x, int y) {
        this.x = x;
        this.y = y;
        this.hp = (int) (Math.random()*10)+40;
        this.mp = (int) (Math.random()*5)+25;
        this.attack = (int) (Math.random()*5)+1;
        this.magic = (int) (Math.random()*5)+1;
        this.defence = (int) (Math.random()*5) +1;
    }
    
    public void draw(Graphics g) {
        g.setColor(Color.ORANGE);
        g.fillRect(x, y, 150, 150);
    }
    public void attack1(Enemy e) {
        e.setHp(e.getHp() - (int)(5*(1+attack/10)*(1-e.getDefence()/10)));
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
