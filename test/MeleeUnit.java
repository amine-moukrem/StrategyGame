
public class MeleeUnit {
    public int damage, health, range;
    public float speed;
    public boolean inRange;
    
    public MeleeUnit() {
        damage = 50; // Numbers not final
        health = 100;
        speed = 1;
    }
    
    
    /**
     * Sets value of melee damage.
     * @param damage 
     */
    public void setDamage(int damage) {
        this.damage = damage;
    }
    
    /**
     * Sets value of melee health.
     * @param health 
     */
    public void setHealth(int health) {
        this.health = health;
    }
    
    /**
     * Gets integer value of melee damage.
     * @return melee damage
     */
    public int getDamage() {
        return this.damage;
    }
    
    /**
     * Gets integer value of melee health.
     * @return melee health
     */
    public int getHealth() {
        return this.health;
    }
    
    /**
     * Upgrades damage and health when melee units are upgraded
     */
    public void upgradeMelee() {
        // TODO: Button that uses upgradeMelee()
        setDamage(damage*2); // Nums not final
        setHealth(health*2); 
    }
    
    /* TO DO
    public boolean inRange() {
        
    } */
}
