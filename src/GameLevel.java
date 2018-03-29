
public class GameLevel {
    Player player;
    String terrain;
    int levelNum;
    boolean playerTurn;
    boolean gameOver;
    String[][] tileTerrain;
    int goldGainedFromBattle;
    String battleName;
    
    public GameLevel() {
        this.player = new Player(); // New player
        terrain = "River Bank"; // Sets first terrain name
        levelNum = 1; // Sets level to 1
        playerTurn = true;
        tileTerrain = new String[20][20];
        goldGainedFromBattle = 0;
        battleName = "";
    }
    
    public void increaseGoldGained(int gold) {
        this.goldGainedFromBattle += gold;
    }
    
    public int getGoldGainedFromBattle() {
        return this.goldGainedFromBattle;
    }
    
    public void buildBridge(int i, int j) {
        tileTerrain[i][j] = "Bridge";
    }
    
    public String getTileTerrain(int i, int j) {
        return this.tileTerrain[i][j];
    }
    
    public void setBattleOneTileTerrain() {
        for (int i = 0; i < 20; i++) {
            for (int j = 0; j < 20; j++) {
                tileTerrain[i][j] = "Grassland";
            }
        }
        // Manually setting terrain values of each special tile
        tileTerrain[8][0] = "River Bank";
        tileTerrain[9][0] = "River";
        for (int j = 5; j < 11; j++) {
            tileTerrain[9][j] = "River Bank";
        }
        for (int j = 16; j < 20; j++) {
            tileTerrain[9][16] = "River Bank";
        }
        tileTerrain[10][0] = "River";
        tileTerrain[10][1] = "River Bank";
        tileTerrain[10][2] = "River Bank";
        tileTerrain[10][3] = "River Bank";
        tileTerrain[10][4] = "River Bank";
        for (int j = 5; j < 11; j++) {
            tileTerrain[10][j] = "River";
        }
        for (int j = 11; j < 16; j++) {
            tileTerrain[10][j] = "River Bank";
        }
        for (int j = 16; j < 20; j++) {
            tileTerrain[10][j] = "River";
        }
        tileTerrain[11][0] = "River Bank";
        
        for (int j = 1; j < 6; j++) {
            tileTerrain[11][j] = "River";
        }
        for (int j = 6; j < 10; j++) {
            tileTerrain[11][j] = "River Bank";
        }
        for (int j = 10; j < 20; j++) {
        tileTerrain[11][j] = "River";
        }
        tileTerrain[12][1] = "River";
        tileTerrain[12][2] = "River";
        tileTerrain[12][3] = "River";
        tileTerrain[12][4] = "River Bank";
        tileTerrain[12][5] = "River Bank";
        tileTerrain[12][10] = "River Bank";
        tileTerrain[12][11] = "River Bank";
        tileTerrain[12][12] = "River";
        tileTerrain[12][13] = "River";
        tileTerrain[12][14] = "River";
        for (int j = 15; j < 20; j++) {
            tileTerrain[12][j] = "River Bank";
        }
        tileTerrain[13][1] = "River Bank";
        tileTerrain[13][2] = "River Bank";
        tileTerrain[13][3] = "River Bank";
        tileTerrain[13][12] = "River Bank";
        tileTerrain[13][13] = "River Bank";
        tileTerrain[13][14] = "River Bank";
    }
    
    public void changeTileTerrain(int i, int j, String t) {
        this.tileTerrain[i][j] = t;
    }
    
    public boolean getGameOver() {
        return this.gameOver;
    }
    
    public void setGameOver(boolean gameOver) {
        this.gameOver = gameOver;
    }
    
    public boolean playerTurn() {
        return playerTurn;
    }
    
    public void setPlayerTurn(boolean playerTurn) {
        this.playerTurn = playerTurn;
    }
    
    public void setLevelNum(int levelNum) {
        this.levelNum = levelNum;
    }
    /**
     * Handles what happens when player wins battle
     * Increments level number when a battle is won
     */
    
    public void wonBattle() {
        levelNum++;
    }
    
    /**
     * Handles what happens when player loses battle
     */
    public void lostBattle() {
        // TODO
    }
    
    /**
     * Increments integer levelNum
     * @return level number
     */
    public int currentMap() {
        return levelNum;
    }
    
    /**
     * Gets levelNum integer
     * @return level number value
     */
    public int getLevelNum() {
        return this.levelNum;
    }
    
    /**
     * Gets terrain string
     * @return String value of terrain
     */
    public String getTerrain() {
        return this.terrain;
    }
    
    /**
     * Changes String terrain
     * @param terrain 
     */
    public void changeTerrain(String terrain) {
        this.terrain = terrain;
    }
    
    public String getBattleName() {
        switch(levelNum) {
            case 1: 
                changeBattleName("Battle of the Granicus");
                break;
            case 2: 
                changeBattleName("Battle of the Issus");
                break;
        }
        return this.battleName;
    }
    
    public void changeBattleName(String battleName) {
        this.battleName = battleName;
    }
    
    /**
     * Changes map based on level number
     * @param levelNum 
     */
    public void changeMap() {
        switch (levelNum) {
            case 1:
                changeTerrain("River Bank");
                changeBattleName("Battle of the Granicus");
                break;
            case 2:
                changeTerrain(""); // TODO: Input terrain
                changeBattleName("Battle of Issus");
                break;
            case 3:
                changeTerrain(""); // TODO: Input terrain
                break;
            default:
                break;
        }
    }
}
