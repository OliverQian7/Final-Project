package finalproject;

public class Enemy {
    private int hp, mp, attack, magic, defence;
    private static int MAX_HP;
    
    public Enemy () {
        this.hp = (int) (Math.random()*10)+35;
        this.mp = (int) (Math.random()*5)+22;
        this.attack = (int) (Math.random()*5)+1;
        this.magic = (int) (Math.random()*5)+1;
        this.defence = (int) (Math.random()*5) +1;
    }
}
