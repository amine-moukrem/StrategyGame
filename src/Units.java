
public class Units {
    public String name;
    public int damage, health, range;
    public int speed;
    public int countUnit;
    public boolean isAlive = true;
        
    public Units(int c, String n, int d, int h, int s) {
        countUnit = c;
        name = n;
        damage = d;
        health = h;
        speed = s;
    }
    
    public boolean getIsAlive() {
        return this.isAlive;
    }
    
    public void setIsAlive(boolean isAlive) {
        this.isAlive = isAlive;
    }
    
    public void decreaseHealth(int dmg) {
        health -= dmg;
        if (health <= 0) {
            health = 0;
            setIsAlive(false);
        }
        setHealth(health);
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public void setCounter(int countUnit) {
        this.countUnit = countUnit;
    }
    
    public int getCounter() {
        return this.countUnit;
    }
    
    public String getName() {
        return this.name;
    }
    
    /**
     * Sets value of unit damage.
     * @param damage 
     */
    public void setDamage(int damage) {
        this.damage = damage;
    }
    
    /**
     * Sets value of unit health.
     * @param health 
     */
    public void setHealth(int health) {
        this.health = health;
    }
    
    public void setSpeed(int speed) {
        this.speed = speed;
    }
    
    /**
     * Gets integer value of unit damage.
     * @return damage
     */
    public int getDamage() {
        return this.damage;
    }
    
    /**
     * Gets integer value of unit health.
     * @return health
     */
    public int getHealth() {
        return this.health;
    }
    
    public int getSpeed() {
        return this.speed;
    }
    
    /**
     * Upgrades damage and health when units are upgraded
     */
    public void upgradeUnit() {
        setDamage(damage*2); // Nums not final
        setHealth(health*2); 
    }
    
    
}
