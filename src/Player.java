
public class Player {
    public String playerName;
    public double playerGold;
    public int playerExp;
    public int playerLevel;
    public int skillPoints;
    public boolean canAfford;
    Army playerArmy;
    
    public Player() {
        playerArmy = new Army(); // new player army
        this.playerName = ""; // Initialize player name
        this.playerGold = 650; // Initialize player gold to starting value (650)
        this.playerLevel = 1; // Initialize player level to 1
        this.playerExp = 0; // Initialize player experience points to 0
        this.canAfford = true; // Initialize bool for canAfford a unit to true
    }
    
    /** 
     * Changes player name string
     * @param playerName 
     */
    public void setPlayerName(String playerName) {
        this.playerName = playerName;
    }
    
    /**
     * Returns String getPlayerName
     * @return player name string
     */
    public String getPlayerName() {
        return this.playerName;
    }
    
    /**
     * Enemy classes will add gold depending on which unit type Player killed.
     * @param playerGold 
     */
    public void setPlayerGold(double playerGold) {
        this.playerGold = playerGold;
    }
    
    /**
     * Sets player level that changes when playerExp = 100
     * @param playerLevel 
     */
    public void setPlayerLevel(int playerLevel) {
        this.playerLevel = playerLevel;
    }
    
    /**
     * Setter for playerExp
     * @param playerExp 
     */
    public void setPlayerExp(int playerExp) {
        this.playerExp = playerExp;
    }
    
    /**
     * Adds exp points to current exp points
     * @param playerExp 
     */
    public void addPlayerExp(int playerExp) {
        this.playerExp += playerExp;
        levelUp();
    }
    
    /**
     * Setter for boolean canAfford
     * @param canAfford 
     */
    public void setCanAfford(boolean canAfford) {
        this.canAfford = canAfford;
    }
    
    /**
     * Gets player gold value
     * @return playerGold
     */
    public double getPlayerGold() {
        return this.playerGold;
    }
    
    /**
     * Gets player level value
     * @return playerLevel
     */
    public double getPlayerLevel() {
        return this.playerLevel;
    }
    
    /**
     * Gets player experience points value
     * @return playerExp
     */
    public double getPlayerExp() {
        return this.playerExp;
    }
    
    /**
     * Gets boolean canAfford
     * @return true or false if player can afford a unit
     */
    public boolean getCanAfford() {
        return this.canAfford;
    }
    
    /**
     * Gets integer value of playerArmy.getNumMelee()
     * @return value of player army's number of melee units
     */
    public int getNumMelee() {
        return playerArmy.getNumMelee();
    }
    
    /**
     * Gets integer value of playerArmy.getNumRanged()
     * @return value of player army's number of ranged units
     */
    public int getNumRanged() {
        return playerArmy.getNumRanged();
    }
    
    /**
     * Gets integer value of playerArmy.getNumCavalry()
     * @return value of player army's number of cavalry units
     */
    public int getNumCavalry() {
        return playerArmy.getNumCavalry();
    }
    
    public int getMeleeCounter() {
        return playerArmy.getMeleeCounter();
    }
    
    public int getRangedCounter() {
        return playerArmy.getRangedCounter();
    }
    
    public int getCavalryCounter() {
        return playerArmy.getCavalryCounter();
    }
    
    public int getSkillPoints() {
        return this.skillPoints;
    }
    
    /**
     * Increments player level if player experience points have reached 100,
     * Increments skill points and resets player experience points to zero
     */
    public void levelUp() {
        // If player is at 100 experience points, they level up.
        if (playerExp == 100 ) {
            playerLevel++;
            // Gives a skill point.
            skillPoints++;
            // Reset player exp.
            playerExp = 0;
        }
    }

    /**
     * If player gold is more than melee unit cost, adds a melee unit
     * and decreases player gold by cost of melee unit
     * If player gold is less than unit cost, setCanAfford set to false
     */
    public void purchaseMelee() {
        if (getPlayerGold() >= playerArmy.getMeleeCost()) {
            playerArmy.addMelee();
            setPlayerGold(getPlayerGold()-playerArmy.getMeleeCost());
        }
        else {
            setCanAfford(false);
        }
    }
    
    /**
     * If player gold is more than ranged unit cost, adds a ranged unit
     * and decreases player gold by cost of ranged unit
     * If player gold is less than unit cost, setCanAfford set to false
     */
    public void purchaseRanged() {
        if (getPlayerGold() >= playerArmy.getRangedCost()) {
            playerArmy.addRanged();
            setPlayerGold(getPlayerGold()-playerArmy.getRangedCost());
        }
        else {
            setCanAfford(false);
        }
    }
    
    /**
     * If player gold is more than cavalry unit cost, adds a cavalry unit
     * and decreases player gold by cost of cavalry unit
     * If player gold is less than unit cost, setCanAfford set to false
     */
    public void purchaseCavalry() {
        if (getPlayerGold() >= playerArmy.getCavalryCost()) {
            playerArmy.addCavalry();
            setPlayerGold(getPlayerGold()-playerArmy.getCavalryCost());
        }
        else {
            setCanAfford(false);
        }
    }
}
