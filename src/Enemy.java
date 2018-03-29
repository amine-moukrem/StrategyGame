
public class Enemy {
    public String enemyName;
    public float attkChance, fleeChance;
    Army enemyArmy;
    int bridgeTimeLeft;
    boolean buildingBridge;
    boolean bridgeReady;
    
    public Enemy() {
        enemyName = "First Persian Empire"; // First enemy name
        attkChance = 0; // Initialize chance of attacking
        fleeChance = 0; // Initialize chance of fleeing
        enemyArmy = new Army(); // New enemy army
        bridgeTimeLeft = 4;
        buildingBridge = false;
        bridgeReady = false;
    }
    
    public void buildingABridge() {
        if (buildingBridge) {
            bridgeTimeLeft -=1;
        }
        if (bridgeTimeLeft == 0) {
            setBridgeReady(true);
            bridgeReady = true;
            buildingBridge = false;
            setBuildingBridge(false);
        }
    }
    
    public void setBridgeTimeLeft(int bridgeTimeLeft) {
        this.bridgeTimeLeft = bridgeTimeLeft;
    }
    
    public int getBridgeTimeLeft() {
        return this.bridgeTimeLeft;
    }
    
    public boolean bridgeReady() {
        return this.bridgeReady;
    }
    
    public void setBridgeReady(boolean bridgeReady) {
        this.bridgeReady = bridgeReady;
    }
    
    public void setBuildingBridge(boolean buildingBridge) {
        this.buildingBridge = buildingBridge;
    }
    
    public boolean buildingBridgeBool() {
        return this.buildingBridge;
    }
    /**
     * Changes name of enemy
     * @param enemyName 
     */
    public void changeEnemyName(String enemyName) {
        this.enemyName = enemyName; 
    }
    
    /**
     * Returns getEnemyName string-
     * @return enemy name
     */
    public String getEnemyName() {
        return this.enemyName;
    }
    
    /**
     * Returns integer getNumMelee from Army class
     * @return number of melee squadrons
     */
    public int getNumMelee() {
        return enemyArmy.getNumMelee();
    }
    
    /**
     * Returns integer getNumRanged() from Army class
     * @return number of ranged squadrons
     */
    public int getNumRanged() {
        return enemyArmy.getNumRanged();
    }
    
    /**
     * Returns integer getNumCavalry from Army class
     * @return number of cavalry squadrons
     */
    public int getNumCavalry() {
        return enemyArmy.getNumCavalry();
    }
    
    /**
     * Changes enemy army sizes based on which enemy it is
     */
    public void changeEnemyArmy(int levelNum) {
        switch (levelNum) {
            case 1:
                enemyArmy.setNumMelee(2);
                enemyArmy.setNumRanged(1);
                enemyArmy.setNumCavalry(1);
                break;
            case 2:
                // Numbers not final
                enemyArmy.setNumMelee(3);
                enemyArmy.setNumRanged(2);
                enemyArmy.setNumCavalry(2);
                break;
            case 3:
                // Numbers not final
                enemyArmy.setNumMelee(5);
                enemyArmy.setNumRanged(4);
                enemyArmy.setNumCavalry(3);
                break;
            default:
                break;
        }
        // move to game class
    }
}