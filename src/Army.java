
import java.util.List;
import java.util.ArrayList;


public class Army{
    public int numMelee, numRanged, numCavalry
            ,numMeleeCounter, numRangedCounter, numCavalryCounter
            ,meleeCost, rangedCost, cavalryCost
            ,meleeMultiply, rangedMultiply, cavalryMultiply;
    public int countUnit;
    protected List<Units> units;
    
    public Army() {
        units = new ArrayList<Units>();
        countUnit = 0;
        
        numMelee = 0; // Number of melee squadrons
        numRanged = 0; // Number of ranged squadrons
        numCavalry = 0; // Number of cavalry squadrons
        
        numMeleeCounter = 0;
        numRangedCounter = 0;
        numCavalryCounter = 0;
        
        meleeCost = 100; // Cost of melee units
        rangedCost = 100; // Cost of ranged units
        cavalryCost = 150; // Cost of cavalry units
        
        meleeMultiply = 250; // Number of melee units in a melee squadron
        rangedMultiply = 100; // Number of ranged units in a ranged squadron
        cavalryMultiply = 150; // Number of cavalry units in an cavalry squadron
    }
    
    
    public List<Units> getUnits() {
        return this.units;
    }
    
    public int getCountUnit() {
        return this.countUnit;
    }
    
    /**
     * Sets number of a melee squadron.
     * @param numMelee    
    */
    public void setNumMelee(int numMelee) {
        this.numMelee = numMelee;
    }
    /**
     * Sets number of a ranged squadron.
     * @param numRanged 
     */
    public void setNumRanged(int numRanged) {
        this.numRanged = numRanged;
    }
    
    /**
     * Sets number of a cavalry squadron.
     * @param numCavalry 
     */
    public void setNumCavalry(int numCavalry) {
        this.numCavalry = numCavalry;
    }
    
    /**
     * Sets cost of a melee squadron.
     * @param meleeCost 
     */
    public void setMeleeCost(int meleeCost) {
        this.meleeCost = meleeCost;
    }
    
    /**
     * Sets cost of a ranged squadron.
     * @param rangedCost 
     */
    public void setRangedCost(int rangedCost) {
        this.rangedCost = rangedCost;
    }
    
    /**
     * Sets cost of a cavalry squadron.
     * @param cavalryCost 
     */
    public void setCavalryCost(int cavalryCost) {
        this.cavalryCost = cavalryCost;
    }
    
    /**
     * Returns cost of a melee squadron.
     * @return meleeCost
     */
    public int getMeleeCost() {
        return this.meleeCost;
    }
    
    /**
     * Returns cost of a ranged squadron.
     * @return rangedCost
     */
    public int getRangedCost() {
        return this.rangedCost;
    }
    
    /**
     * Returns cost of a cavalry squadron.
     * @return cavalryCost
     */
    public int getCavalryCost() {
        return this.cavalryCost;
    }
    
    /**
     * Returns number of melee squadrons.
     * @return numMelee
     */
    public int getNumMelee() {
        if (numMelee < 0) {
            numMelee = 0;
        }
        return this.numMelee;
    }
    
    /**
     * Returns number of ranged squadrons.
     * @return numRanged
     */
    public int getNumRanged() {
        if (numRanged < 0) {
            numRanged = 0;
        }
        return this.numRanged;
    }
    
    /**
     * Returns number of cavalry squadrons.
     * @return numCavalry
     */
    public int getNumCavalry() {
        if (numRanged < 0) {
            numRanged = 0;
        }
        return this.numCavalry;
    }
    
    public void setMeleeCounter(int numMeleeCounter) {
        this.numMeleeCounter = numMeleeCounter;
    }
    
    public void setRangedCounter(int numRangedCounter) {
        this.numRangedCounter = numRangedCounter;
    }
    
    public void setCavalryCounter(int numCavalryCounter) {
        this.numCavalryCounter = numCavalryCounter;
    }
    
    public int getMeleeCounter() {
        return this.numMeleeCounter;
    }
    
    public int getRangedCounter() {
        return this.numRangedCounter;
    }
    
    public int getCavalryCounter() {
        return this.numCavalryCounter;
    }
    
    public void decrementMeleeCounter() {
        numMeleeCounter--;
    }
    
    public void decrementRangedCounter() {
        numRangedCounter--;
    }
    
    public void decrementCavalryCounter() {
        numCavalryCounter--;
    }
    
    /**
     * Sets multiplier for how many melee units are in a squadron.
     * @return meleeMultiply
     */
    public int meleeSquadMultiplier() {
        return this.meleeMultiply;
    }
    
    /**
     * Sets multiplier for how many ranged units in a squadron.
     * @return rangedMultiply
     */
    public int rangedSquadMultiplier() {
        return this.rangedMultiply;
    }
    
    /**
     * Sets multiplier for how many cavalry units in a squadron.
     * @return cavalryMultiplier
     */
    public int cavalrySquadMultiplier() {
        return this.cavalryMultiply;
    }
    
    /**
     * Adds a single melee squadron to the number of squadrons already present.
     */
    public void addMelee() {
        numMelee++;
    }
    
    /**
     * Adds a single ranged squadron to the number of squadrons already present.
     */
    public void addRanged() {
        numRanged++;
    }
    
    /**
     * Adds a single cavalry squadron to the number of squadrons already present.
     */
    public void addCavalry() {
        numCavalry++;
    }
    
    /**
     * Removes a single melee squadron from the number of squadrons already present.
     */
    public void decrementMelee() {
        numMelee--;
    }
    
    /**
     * Removes a single ranged squadron from the number of squadrons already present.
     */
    public void decrementRanged() {
        numRanged--;
    }
    
    /**
     * Removes a single cavalry squadron from the number of squadrons already present.
     */
    public void decrementCavalry() {
        numCavalry--;
    }
    
    public void incrementCounter() {
        countUnit++;
    }
    /**
     * Adds a melee unit object to the array of units
     */
    public void addMeleeToObject() {
        units.add(new Units(countUnit, "Infantry", 50, 200, 1));
        incrementCounter();
    }
    
    /**
     * Adds a ranged unit object to the array of units
     */
    public void addRangedToObject() {
        units.add(new Units(countUnit, "Archers", 75, 150, 1));
        incrementCounter();
    }
    
    /**
     * Adds a cavalry unit object to the array of units
     */
    public void addCavalryToObject() {
        units.add(new Units(countUnit, "Cavalry", 50, 150, 2));
        incrementCounter();
    }
    
    public void removeUnitFromObject(int c) { 
       /*units.get(c).setName(""); // Prevents IndexOutOfBoundsException caused by adding/removing units from a list
       units.get(c).setDamage(0);
       units.get(c).setHealth(0);
       units.get(c).setSpeed(0);*/
       units.remove(c);
       units.add(new Units(c, "", 0, 0, 0));
    }
   
    /**
     * Upgrades damage and health when melee units are upgraded
     * @param c
     */
    public void upgradeUnit(int c) {
        getUnits().get(c).upgradeUnit();
    }
    
    public int getMeleeDamage(String s) {
        for (int i = 0; i < 10; i++) {
           if (units.get(i).getName() == "Infantry") {
               return units.get(i).getDamage();
            }
        }
       return 0;
    }
    
    public int getRangedDamage() {
        for (int i = 0; i < 10; i++) {
           if (units.get(i).getName() == "Archers") {
               return units.get(i).getDamage();
            }
        }
       return 0;
    }
    
    public int getCavalryDamage() {
        for (int i = 0; i < 10; i++) {
           if (units.get(i).getName() == "Cavalry") {
               return units.get(i).getDamage();
            }
        }
       return 0;
    }
    
    public int getMeleeHealth() {
        for (int i = 0; i < 10; i++) {
           if (units.get(i).getName() == "Infantry") {
               return units.get(i).getHealth();
            }
        }
       return 0;
    }
    
    public int getRangedHealth() {
        for (int i = 0; i < 10; i++) {
           if (units.get(i).getName() == "Archers") {
               return units.get(i).getHealth();
            }
        }
       return 0;
    }
    
    public int getCavalryHealth() {
        for (int i = 0; i < 10; i++) {
           if (units.get(i).getName() == "Cavalry") {
               return units.get(i).getHealth();
            }
        }
       return 0;
    }
    
    /**
     * Resets values of melee, ranged, and cavalry to zero.
     */
    public void resetArmy() {
        // TO DO : Reset button that uses this method.
        setNumMelee(0);
        setNumRanged(0);
        setNumCavalry(0);
    } 
}
