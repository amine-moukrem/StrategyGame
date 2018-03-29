
public class CavalryUnit {
    public int damage, health;
    public float speed;
    public boolean inRange;
    
    public CavalryUnit() {
        damage = 50; // Numbers not final
        health = 50;
        speed = 2;
    }
    
    /**
     * Sets value of cavalry damage.
     * @param damage 
     */
    public void setDamage(int damage) {
        this.damage = damage;
    }
    
    /**
     * Sets value of cavalry health.
     * @param health 
     */
    public void setHealth(int health) {
        this.health = health;
    }
    
    /**
     * Gets integer value of cavalry damage.
     * @return cavalry damage
     */
    public int getDamage() {
        return this.damage;
    }
    
    /**
     * Gets integer value of cavalry health.
     * @return cavalry health
     */
    public int getHealth() {
        return this.health;
    }
    
    /**
     * Upgrades damage and health when cavalry is upgraded
     
    public void upgradeCavalry() {
        // TODO: Button that uses upgradeCavalry()
        setCavalryDamage(damage*2); // Nums not final
        setCavalryHealth(health*2);
    }*/
    
    /* TO DO
    public boolean inRange() {
        
    } */
}
