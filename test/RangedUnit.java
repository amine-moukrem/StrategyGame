
public class RangedUnit {
    public int damage, health;
    public float speed;
    public boolean inRange;
    
    public RangedUnit() {
        damage = 75; // Numbers not final
        health = 50;
        speed = 1;
    }
    
    /**
     * Sets value of ranged unit damage.
     * @param damage 
     */
    public void setDamage(int damage) {
        this.damage = damage;
    }
    
    /**
     * Sets value of ranged unit health.
     * @param health 
     */
    public void setHealth(int health) {
        this.health = health;
    }
    
    /**
     * Gets integer value of ranged unit damage.
     * @return ranged damage
     */
    public int getDamage() {
        return this.damage;
    }
    
    /**
     * Gets integer value of ranged unit health.
     * @return ranged unit health
     */
    public int getHealth() {
        return this.health;
    }
    
    /* TO DO
    public boolean inRange() {
        
    } */
}
