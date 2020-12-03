
package finalproject;

public class Player {
    private int hp, mp, attack, magic, defence;
    private final static int MAX_HP = 50;
    
    public Player () {
        this.hp = (int) (Math.random()*10)+40;
        this.mp = (int) (Math.random()*5)+25;
        this.attack = (int) (Math.random()*5)+1;
        this.magic = (int) (Math.random()*5)+1;
        this.defence = (int) (Math.random()*5) +1;
    }
}
