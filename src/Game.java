
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.*;
import java.util.stream.Collectors;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.border.LineBorder;

public class Game extends javax.swing.JFrame {
    
    public Game() {
        this.playerArmy = new Army(); // Player Army instance
        this.enemyArmy = new Army(); // Enemy Army instance
        this.player = new Player(); // Player class instance
        this.enemy = new Enemy(); // Enemy class instance
        this.level = new GameLevel(); // GameLevel class instance

        mainbackground = new ImageIcon(getClass().getResource("images/mainbackgroundpic.jpg"));
        icon = new ImageIcon(getClass().getResource("images/GameMap1.gif")); // Sets first map icon
        meleeIconPlayer = new ImageIcon(getClass().getResource("images/infantry.png"));
        meleeIconEnemy = new ImageIcon(getClass().getResource("images/infantryenemy.png"));
        rangedIconPlayer = new ImageIcon(getClass().getResource("images/rangedicon.png"));
        rangedIconEnemy = new ImageIcon(getClass().getResource("images/rangediconenemy.png"));
        cavalryIconPlayer = new ImageIcon(getClass().getResource("images/cavalry.png"));
        cavalryIconEnemy = new ImageIcon(getClass().getResource("images/cavalryenemy.png"));
        buttons = new JButton[SIZE][SIZE];
        stringPlayerUnits = new String[SIZE][SIZE];
        stringEnemyUnits = new String[SIZE][SIZE];
        canUnitsMove = new boolean[SIZE][SIZE];
        currentEnemyPosx = new int[SIZE];
        currentEnemyPosz = new int[SIZE];
        nextEnemyPosx = new int[SIZE];
        nextEnemyPosz = new int[SIZE];
        inputUnitsManual = true;
        enemyTurnNum = 1;
        playerTurnNum = 1;
        trackEnemyUnits = 0;
        trackPlayerUnits = 0;
        
         for (int x = 0; x < SIZE; x++) {
            for (int z = 0; z < SIZE; z++) {
                canUnitsMove[x][z] = true;
            }
        }

        playerTurn = true;
        lastSelectedUnit = null;
        closestEnemyx = 0;
        closestEnemyz = 0;
        infcount = 0;
        battleNum = 0;
        initComponents();
        addButtons();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        gameTabbedPane = new javax.swing.JTabbedPane();
        mainMenuPanel = new javax.swing.JPanel();
        mainPageTitle = new javax.swing.JLabel();
        startButton = new javax.swing.JButton();
        helpButton = new javax.swing.JButton();
        exitButton = new javax.swing.JButton();
        signatureLabel = new javax.swing.JLabel();
        mainPageBackgroundImage = new javax.swing.JLabel();
        gameTabLayeredPane = new javax.swing.JLayeredPane();
        gamePanel = new javax.swing.JPanel();
        playerNameDisplay = new javax.swing.JLabel();
        playerGoldDisplay = new javax.swing.JLabel();
        playerLevelDisplay = new javax.swing.JLabel();
        playerExpDisplay = new javax.swing.JLabel();
        skillPointsDisplay = new javax.swing.JLabel();
        startCampaignButton = new javax.swing.JButton();
        purchaseUnitsButton = new javax.swing.JButton();
        playerNumMeleeUnits = new javax.swing.JLabel();
        playerNumRangedUnits = new javax.swing.JLabel();
        playerNumCavalryUnits = new javax.swing.JLabel();
        map1 = new javax.swing.JLabel();
        backgroundImageGamePanel = new javax.swing.JLabel();
        victoryScreen = new javax.swing.JPanel();
        backToCampaignButton = new javax.swing.JButton();
        survivingUnitsLabel = new javax.swing.JLabel();
        victoryScreenMainAnnounce = new javax.swing.JLabel();
        goldEarnedFromBattle = new javax.swing.JLabel();
        victoryScreenBackgroundImage = new javax.swing.JLabel();
        helpPanel = new javax.swing.JPanel();
        helpImage = new javax.swing.JLabel();
        helpPanelBackgroundImage = new javax.swing.JLabel();
        battlePreviewPanel = new javax.swing.JPanel();
        battleNameLabel = new javax.swing.JLabel();
        enemyNameLabel = new javax.swing.JLabel();
        enemyIcon = new javax.swing.JLabel();
        displayBattlePlayerName = new javax.swing.JLabel();
        playerIcon = new javax.swing.JLabel();
        battlePreviewInfantry = new javax.swing.JLabel();
        battlePreviewArchers = new javax.swing.JLabel();
        battlePreviewCavalry = new javax.swing.JLabel();
        enemyBattleScreenMelee = new javax.swing.JLabel();
        enemyBattleScreenRanged = new javax.swing.JLabel();
        enemyBattleScreenCavalry = new javax.swing.JLabel();
        enterBattleButton = new javax.swing.JButton();
        bScreenSeparate1 = new javax.swing.JSeparator();
        terrainLabel1 = new javax.swing.JLabel();
        mapPreview1 = new javax.swing.JLabel();
        battlePreview1 = new javax.swing.JLabel();
        previewPanelBackgroundImage = new javax.swing.JLabel();
        battlePanel = new javax.swing.JPanel();
        confirmUnitFormationManualButton = new javax.swing.JButton();
        resetManualPlacementButton = new javax.swing.JButton();
        unitsLeftToPlaceLabel = new javax.swing.JLabel();
        enemyBattleEventLabel = new javax.swing.JLabel();
        playerBattleEventLabel = new javax.swing.JLabel();
        endTurnButton = new javax.swing.JButton();
        enemyUnitInfo = new javax.swing.JLabel();
        playerUnitInfo = new javax.swing.JLabel();
        selectedUnitDetails = new javax.swing.JLabel();
        playerTurnNumberLabel = new javax.swing.JLabel();
        battleScreenLayeredPane = new javax.swing.JLayeredPane();
        battleGridPanel = new javax.swing.JPanel();
        battleBackgroundPanel = new javax.swing.JPanel();
        battleBackground = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(920, 467));
        setResizable(false);

        gameTabbedPane.setMaximumSize(new java.awt.Dimension(920, 467));
        gameTabbedPane.setMinimumSize(new java.awt.Dimension(920, 467));

        mainMenuPanel.setPreferredSize(new java.awt.Dimension(77, 32));
        mainMenuPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        mainPageTitle.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        mainPageTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        mainPageTitle.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/gametitle.png"))); // NOI18N
        mainPageTitle.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        mainMenuPanel.add(mainPageTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 80, 920, -1));

        startButton.setText("Start Game");
        startButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                startButtonActionPerformed(evt);
            }
        });
        mainMenuPanel.add(startButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(208, 356, 124, 55));

        helpButton.setText("Help");
        helpButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                helpButtonActionPerformed(evt);
            }
        });
        mainMenuPanel.add(helpButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(402, 356, 125, 55));

        exitButton.setText("Exit");
        exitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitButtonActionPerformed(evt);
            }
        });
        mainMenuPanel.add(exitButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(594, 356, 128, 55));

        signatureLabel.setBackground(new java.awt.Color(255, 255, 255));
        signatureLabel.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        signatureLabel.setForeground(new java.awt.Color(0, 0, 0));
        signatureLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        signatureLabel.setText("Amine Moukrem - Fall 2017");
        mainMenuPanel.add(signatureLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 440, 200, 20));

        mainPageBackgroundImage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/mainbackgroundpic.jpg"))); // NOI18N
        mainPageBackgroundImage.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(51, 204, 255)));
        mainMenuPanel.add(mainPageBackgroundImage, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 920, 460));

        gameTabbedPane.addTab("Main Menu", mainMenuPanel);

        gamePanel.setPreferredSize(new java.awt.Dimension(77, 32));
        gamePanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        playerNameDisplay.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        playerNameDisplay.setForeground(new java.awt.Color(255, 255, 255));
        playerNameDisplay.setText("<html>Player Name: <br>" + player.getPlayerName() + "</html>");
        playerNameDisplay.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        gamePanel.add(playerNameDisplay, new org.netbeans.lib.awtextra.AbsoluteConstraints(4, 6, 233, 50));

        playerGoldDisplay.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        playerGoldDisplay.setForeground(new java.awt.Color(255, 255, 255));
        playerGoldDisplay.setText("Player Gold: " + (int)player.getPlayerGold());
        playerGoldDisplay.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        gamePanel.add(playerGoldDisplay, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 78, 171, 47));

        playerLevelDisplay.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        playerLevelDisplay.setForeground(new java.awt.Color(255, 255, 255));
        playerLevelDisplay.setText("Player Level: " + (int)player.getPlayerLevel());
        playerLevelDisplay.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        gamePanel.add(playerLevelDisplay, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 143, 171, 46));

        playerExpDisplay.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        playerExpDisplay.setForeground(new java.awt.Color(255, 255, 255));
        playerExpDisplay.setText("Player EXP: " + (int)player.getPlayerExp());
        playerExpDisplay.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        gamePanel.add(playerExpDisplay, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 207, 171, 48));

        skillPointsDisplay.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        skillPointsDisplay.setForeground(new java.awt.Color(255, 255, 255));
        skillPointsDisplay.setText("Skill Points: " + (int)player.getSkillPoints());
        skillPointsDisplay.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        gamePanel.add(skillPointsDisplay, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 280, 160, 48));

        startCampaignButton.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        startCampaignButton.setText("Start Campaign");
        startCampaignButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                startCampaignButtonActionPerformed(evt);
            }
        });
        gamePanel.add(startCampaignButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(697, 347, -1, 108));

        purchaseUnitsButton.setText("Purchase Units");
        purchaseUnitsButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                purchaseUnitsButtonActionPerformed(evt);
            }
        });
        gamePanel.add(purchaseUnitsButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(729, 269, 146, 60));

        playerNumMeleeUnits.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        playerNumMeleeUnits.setForeground(new java.awt.Color(255, 255, 255));
        playerNumMeleeUnits.setText("Infantry Squadrons: " + playerArmy.getNumMelee());
        playerNumMeleeUnits.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        gamePanel.add(playerNumMeleeUnits, new org.netbeans.lib.awtextra.AbsoluteConstraints(684, 23, 233, 47));

        playerNumRangedUnits.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        playerNumRangedUnits.setForeground(new java.awt.Color(255, 255, 255));
        playerNumRangedUnits.setText("Archer Squadrons: " + playerArmy.getNumRanged());
        playerNumRangedUnits.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        gamePanel.add(playerNumRangedUnits, new org.netbeans.lib.awtextra.AbsoluteConstraints(684, 88, 233, 48));

        playerNumCavalryUnits.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        playerNumCavalryUnits.setForeground(new java.awt.Color(255, 255, 255));
        playerNumCavalryUnits.setText("Cavalry Squadrons: " + playerArmy.getNumCavalry());
        playerNumCavalryUnits.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        gamePanel.add(playerNumCavalryUnits, new org.netbeans.lib.awtextra.AbsoluteConstraints(684, 154, 233, 48));

        map1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/GameMap1.gif")));
        map1.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(204, 255, 0)));
        gamePanel.add(map1, new org.netbeans.lib.awtextra.AbsoluteConstraints(243, 0, 435, 455));

        backgroundImageGamePanel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        backgroundImageGamePanel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/backgroundotherpanels.jpg.png"))); // NOI18N
        gamePanel.add(backgroundImageGamePanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 461));

        victoryScreen.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        backToCampaignButton.setText("Back to Campaign Screen");
        backToCampaignButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backToCampaignButtonActionPerformed(evt);
            }
        });
        victoryScreen.add(backToCampaignButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 370, 190, 70));

        survivingUnitsLabel.setBackground(new java.awt.Color(255, 255, 255));
        survivingUnitsLabel.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        survivingUnitsLabel.setForeground(new java.awt.Color(255, 255, 255));
        survivingUnitsLabel.setBorder(javax.swing.BorderFactory.createEtchedBorder(java.awt.Color.white, java.awt.Color.white));
        victoryScreen.add(survivingUnitsLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 220, 500, 50));

        victoryScreenMainAnnounce.setBackground(new java.awt.Color(255, 255, 255));
        victoryScreenMainAnnounce.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        victoryScreenMainAnnounce.setForeground(new java.awt.Color(255, 255, 255));
        victoryScreenMainAnnounce.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(204, 204, 255), null));
        victoryScreen.add(victoryScreenMainAnnounce, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 60, 500, 60));

        goldEarnedFromBattle.setBackground(new java.awt.Color(255, 255, 255));
        goldEarnedFromBattle.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        goldEarnedFromBattle.setForeground(new java.awt.Color(255, 255, 255));
        goldEarnedFromBattle.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(255, 255, 255), null));
        victoryScreen.add(goldEarnedFromBattle, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 150, 220, 50));

        victoryScreenBackgroundImage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/backgroundotherpanels.jpg.png"))); // NOI18N
        victoryScreen.add(victoryScreenBackgroundImage, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 920, 460));

        gameTabLayeredPane.setLayer(gamePanel, javax.swing.JLayeredPane.PALETTE_LAYER);
        gameTabLayeredPane.setLayer(victoryScreen, javax.swing.JLayeredPane.PALETTE_LAYER);

        javax.swing.GroupLayout gameTabLayeredPaneLayout = new javax.swing.GroupLayout(gameTabLayeredPane);
        gameTabLayeredPane.setLayout(gameTabLayeredPaneLayout);
        gameTabLayeredPaneLayout.setHorizontalGroup(
            gameTabLayeredPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 918, Short.MAX_VALUE)
            .addGroup(gameTabLayeredPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(gameTabLayeredPaneLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(gamePanel, javax.swing.GroupLayout.PREFERRED_SIZE, 918, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
            .addGroup(gameTabLayeredPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(gameTabLayeredPaneLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(victoryScreen, javax.swing.GroupLayout.PREFERRED_SIZE, 918, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        gameTabLayeredPaneLayout.setVerticalGroup(
            gameTabLayeredPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 461, Short.MAX_VALUE)
            .addGroup(gameTabLayeredPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(gameTabLayeredPaneLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(gamePanel, javax.swing.GroupLayout.PREFERRED_SIZE, 461, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
            .addGroup(gameTabLayeredPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(gameTabLayeredPaneLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(victoryScreen, javax.swing.GroupLayout.PREFERRED_SIZE, 461, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        gameTabbedPane.addTab("Game", gameTabLayeredPane);

        helpPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        helpImage.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        helpImage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/helpscreenimage.png"))); // NOI18N
        helpImage.setText("Help Panel");
        helpPanel.add(helpImage, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 920, 461));

        helpPanelBackgroundImage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/backgroundotherpanels.jpg.png"))); // NOI18N
        helpPanelBackgroundImage.setText("jLabel1");
        helpPanel.add(helpPanelBackgroundImage, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 926, 461));

        gameTabbedPane.addTab("Help", helpPanel);

        battlePreviewPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        battleNameLabel.setBackground(new java.awt.Color(255, 255, 255));
        battleNameLabel.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        battleNameLabel.setForeground(new java.awt.Color(255, 255, 255));
        battleNameLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        battleNameLabel.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        battlePreviewPanel.add(battleNameLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 10, 350, 40));

        enemyNameLabel.setBackground(new java.awt.Color(255, 255, 255));
        enemyNameLabel.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        enemyNameLabel.setForeground(new java.awt.Color(255, 255, 255));
        enemyNameLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        enemyNameLabel.setText(enemy.getEnemyName());
        enemyNameLabel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 0)));
        enemyNameLabel.setIconTextGap(1);
        battlePreviewPanel.add(enemyNameLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(549, 137, 304, 38));

        enemyIcon.setBackground(new java.awt.Color(255, 255, 255));
        enemyIcon.setForeground(new java.awt.Color(255, 255, 255));
        enemyIcon.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        enemyIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/AchaemenidEmpire.png"))); // NOI18N
        battlePreviewPanel.add(enemyIcon, new org.netbeans.lib.awtextra.AbsoluteConstraints(549, 6, 304, -1));

        displayBattlePlayerName.setBackground(new java.awt.Color(255, 255, 255));
        displayBattlePlayerName.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        displayBattlePlayerName.setForeground(new java.awt.Color(255, 255, 255));
        displayBattlePlayerName.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        displayBattlePlayerName.setText("");
        displayBattlePlayerName.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 0)));
        battlePreviewPanel.add(displayBattlePlayerName, new org.netbeans.lib.awtextra.AbsoluteConstraints(73, 137, 304, 38));

        playerIcon.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        playerIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Macedonia.png"))); // NOI18N
        battlePreviewPanel.add(playerIcon, new org.netbeans.lib.awtextra.AbsoluteConstraints(73, 6, 304, 125));

        battlePreviewInfantry.setBackground(new java.awt.Color(255, 255, 255));
        battlePreviewInfantry.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        battlePreviewInfantry.setForeground(new java.awt.Color(255, 255, 255));
        battlePreviewInfantry.setText("Total Infantry: " + playerArmy.getNumMelee()*playerArmy.meleeSquadMultiplier());
        battlePreviewPanel.add(battlePreviewInfantry, new org.netbeans.lib.awtextra.AbsoluteConstraints(73, 181, 254, 30));

        battlePreviewArchers.setBackground(new java.awt.Color(255, 255, 255));
        battlePreviewArchers.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        battlePreviewArchers.setForeground(new java.awt.Color(255, 255, 255));
        battlePreviewArchers.setText("Total Archers: " + playerArmy.getNumRanged()*playerArmy.rangedSquadMultiplier());
        battlePreviewPanel.add(battlePreviewArchers, new org.netbeans.lib.awtextra.AbsoluteConstraints(73, 217, 254, 30));

        battlePreviewCavalry.setBackground(new java.awt.Color(255, 255, 255));
        battlePreviewCavalry.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        battlePreviewCavalry.setForeground(new java.awt.Color(255, 255, 255));
        battlePreviewCavalry.setText("Total Cavalry: " + playerArmy.getNumCavalry()*playerArmy.cavalrySquadMultiplier());
        battlePreviewPanel.add(battlePreviewCavalry, new org.netbeans.lib.awtextra.AbsoluteConstraints(73, 253, 254, 30));

        enemyBattleScreenMelee.setBackground(new java.awt.Color(255, 255, 255));
        enemyBattleScreenMelee.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        enemyBattleScreenMelee.setForeground(new java.awt.Color(255, 255, 255));
        enemyBattleScreenMelee.setText("Total Infantry: " + enemyArmy.getNumMelee()*enemyArmy.meleeSquadMultiplier());
        battlePreviewPanel.add(enemyBattleScreenMelee, new org.netbeans.lib.awtextra.AbsoluteConstraints(549, 181, 304, 30));

        enemyBattleScreenRanged.setBackground(new java.awt.Color(255, 255, 255));
        enemyBattleScreenRanged.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        enemyBattleScreenRanged.setForeground(new java.awt.Color(255, 255, 255));
        enemyBattleScreenRanged.setText("Total Archers: " + enemyArmy.getNumRanged()*enemyArmy.rangedSquadMultiplier());
        battlePreviewPanel.add(enemyBattleScreenRanged, new org.netbeans.lib.awtextra.AbsoluteConstraints(549, 217, 304, 30));

        enemyBattleScreenCavalry.setBackground(new java.awt.Color(255, 255, 255));
        enemyBattleScreenCavalry.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        enemyBattleScreenCavalry.setForeground(new java.awt.Color(255, 255, 255));
        enemyBattleScreenCavalry.setText("Total Cavalry: " + enemyArmy.getNumCavalry()*enemyArmy.cavalrySquadMultiplier());
        battlePreviewPanel.add(enemyBattleScreenCavalry, new org.netbeans.lib.awtextra.AbsoluteConstraints(549, 253, 304, 30));

        enterBattleButton.setText("Enter Battle");
        enterBattleButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                enterBattleButtonActionPerformed(evt);
            }
        });
        battlePreviewPanel.add(enterBattleButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 70, 142, 48));
        battlePreviewPanel.add(bScreenSeparate1, new org.netbeans.lib.awtextra.AbsoluteConstraints(73, 295, 780, 4));

        terrainLabel1.setBackground(new java.awt.Color(255, 255, 255));
        terrainLabel1.setForeground(new java.awt.Color(255, 255, 255));
        terrainLabel1.setText("Terrain: " + level.getTerrain());
        battlePreviewPanel.add(terrainLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(701, 305, 152, -1));

        mapPreview1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/level1map.png"))); // NOI18N
        mapPreview1.setText("jLabel1");
        mapPreview1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        battlePreviewPanel.add(mapPreview1, new org.netbeans.lib.awtextra.AbsoluteConstraints(234, 299, 455, 156));

        battlePreview1.setBackground(new java.awt.Color(255, 255, 255));
        battlePreview1.setForeground(new java.awt.Color(255, 255, 255));
        battlePreview1.setText("Battle Preview: ");
        battlePreviewPanel.add(battlePreview1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 305, -1, -1));

        previewPanelBackgroundImage.setBackground(new java.awt.Color(255, 255, 255));
        previewPanelBackgroundImage.setForeground(new java.awt.Color(255, 255, 255));
        previewPanelBackgroundImage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/backgroundotherpanels.jpg.png"))); // NOI18N
        battlePreviewPanel.add(previewPanelBackgroundImage, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 920, 459));

        gameTabbedPane.addTab("Preview", battlePreviewPanel);
        gameTabbedPane.setEnabledAt(3, false);

        battlePanel.setOpaque(false);
        battlePanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        confirmUnitFormationManualButton.setText("Confirm");
        confirmUnitFormationManualButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                confirmUnitFormationManualButtonActionPerformed(evt);
            }
        });
        battlePanel.add(confirmUnitFormationManualButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 430, 80, 30));

        resetManualPlacementButton.setText("Reset");
        resetManualPlacementButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resetManualPlacementButtonActionPerformed(evt);
            }
        });
        battlePanel.add(resetManualPlacementButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 430, 70, 30));

        unitsLeftToPlaceLabel.setText("");
        unitsLeftToPlaceLabel.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Units still not placed", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 1, 12), new java.awt.Color(0, 0, 0))); // NOI18N
        battlePanel.add(unitsLeftToPlaceLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 410, 280, 50));
        battlePanel.add(enemyBattleEventLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 400, 210, 30));
        battlePanel.add(playerBattleEventLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 400, 210, 30));

        endTurnButton.setText("End Turn");
        endTurnButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                endTurnButtonActionPerformed(evt);
            }
        });
        battlePanel.add(endTurnButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 430, 80, 30));

        enemyUnitInfo.setFont(new java.awt.Font("Dialog", 1, 10)); // NOI18N
        enemyUnitInfo.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Enemy Squadrons", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 1, 12), new java.awt.Color(0, 0, 0))); // NOI18N
        battlePanel.add(enemyUnitInfo, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 410, 320, 50));

        playerUnitInfo.setFont(new java.awt.Font("Dialog", 1, 10)); // NOI18N
        playerUnitInfo.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Player Squadrons", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 1, 12), new java.awt.Color(0, 0, 0))); // NOI18N
        battlePanel.add(playerUnitInfo, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 410, 300, 50));

        selectedUnitDetails.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Unit Details", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 1, 12), new java.awt.Color(0, 0, 0))); // NOI18N
        battlePanel.add(selectedUnitDetails, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 410, 220, 50));

        playerTurnNumberLabel.setText("Turn #: " + playerTurnNum);
        battlePanel.add(playerTurnNumberLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 410, 80, 20));

        battleGridPanel.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 0));
        battleGridPanel.setOpaque(false);
        battleGridPanel.setLayout(new java.awt.GridLayout(20, 20, -1, -1));

        battleBackground.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/battle1background.png"))); // NOI18N

        javax.swing.GroupLayout battleBackgroundPanelLayout = new javax.swing.GroupLayout(battleBackgroundPanel);
        battleBackgroundPanel.setLayout(battleBackgroundPanelLayout);
        battleBackgroundPanelLayout.setHorizontalGroup(
            battleBackgroundPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, battleBackgroundPanelLayout.createSequentialGroup()
                .addComponent(battleBackground)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        battleBackgroundPanelLayout.setVerticalGroup(
            battleBackgroundPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(battleBackground, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        battleScreenLayeredPane.setLayer(battleGridPanel, javax.swing.JLayeredPane.PALETTE_LAYER);
        battleScreenLayeredPane.setLayer(battleBackgroundPanel, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout battleScreenLayeredPaneLayout = new javax.swing.GroupLayout(battleScreenLayeredPane);
        battleScreenLayeredPane.setLayout(battleScreenLayeredPaneLayout);
        battleScreenLayeredPaneLayout.setHorizontalGroup(
            battleScreenLayeredPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(battleScreenLayeredPaneLayout.createSequentialGroup()
                .addComponent(battleBackgroundPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 4, Short.MAX_VALUE))
            .addGroup(battleScreenLayeredPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(battleGridPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 924, Short.MAX_VALUE))
        );
        battleScreenLayeredPaneLayout.setVerticalGroup(
            battleScreenLayeredPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(battleScreenLayeredPaneLayout.createSequentialGroup()
                .addComponent(battleBackgroundPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 464, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(battleScreenLayeredPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(battleScreenLayeredPaneLayout.createSequentialGroup()
                    .addComponent(battleGridPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 413, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 51, Short.MAX_VALUE)))
        );

        battlePanel.add(battleScreenLayeredPane, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 460));

        gameTabbedPane.addTab("Battle", battlePanel);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(gameTabbedPane, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 920, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(gameTabbedPane, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        gameTabbedPane.setEnabledAt(1, false);
        gameTabbedPane.setEnabledAt(2, false);
        gameTabbedPane.setEnabledAt(4, false);

        pack();
    }// </editor-fold>//GEN-END:initComponents
   
    /**
     * Method to handle button helpButton press
     * @param evt 
     */
    private void helpButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_helpButtonActionPerformed
        gameTabbedPane.setSelectedIndex(2);
    }//GEN-LAST:event_helpButtonActionPerformed

    /**
     * Method to handle button startButton press
     * @param evt 
     */
    private void startButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_startButtonActionPerformed

        JFrame nameFrame = new JFrame("Enter your name");
        String playerN;
        playerN = JOptionPane.showInputDialog("What is your name?");
        
        JOptionPane.showMessageDialog(nameFrame, "Hello " + playerN + '.');

        if (playerN.length() < 1) {
            playerN = "Alexander";
        }
        player.setPlayerName(playerN);
        playerNameDisplay.setText("<html>Player Name: <br>" + player.getPlayerName() + " of Macedon</html>");
        gameTabbedPane.setSelectedIndex(1);
        gameTabbedPane.setEnabledAt(0, false);
        gameTabbedPane.setEnabledAt(1, true);
        gameTabbedPane.setEnabledAt(2, true);
    }//GEN-LAST:event_startButtonActionPerformed

    /**
     * Method to handle exit button press
     * @param evt 
     */
    private void exitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitButtonActionPerformed
        System.exit(0);
    }//GEN-LAST:event_exitButtonActionPerformed

    /**
     * Method to handle button purchaseUnitsButton press
     * @param evt 
     */
    private void purchaseUnitsButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_purchaseUnitsButtonActionPerformed
        Object[] options = { "Infantry (" + playerArmy.getMeleeCost() + ")", "Archers (" + playerArmy.getRangedCost() + ")", "Cavalry (" + playerArmy.getCavalryCost() + ")", "Exit" };
        int result = 0;
        while (result != 3) {
            if (player.getCanAfford()) {
                result = JOptionPane.showOptionDialog(null, "Purchase a unit: ", "Unit Shop", JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, null, options, options[0]);
                switch (result) {
                    case 0:
                        player.purchaseMelee();
                        playerArmy.addMeleeToObject();
                        refreshMeleeUnits();
                        break;
                        
                    case 1:
                        player.purchaseRanged();
                        playerArmy.addRangedToObject();
                        refreshRangedUnits();
                        break;
                        
                    case 2:
                        player.purchaseCavalry();
                        playerArmy.addCavalryToObject();
                        refreshCavalryUnits();
                        break;
                        
                    default:
                        break;
                }
                refreshGoldLabel();
            }
            else {
                result = JOptionPane.showOptionDialog(null, "You can't afford that! - Purchase a unit: ", "Unit Shop", JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, null, options, options[0]);
            }
        }
    }//GEN-LAST:event_purchaseUnitsButtonActionPerformed

    /**
     * Method to handle button startCampaignButton press
     * @param evt 
     */
    private void startCampaignButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_startCampaignButtonActionPerformed
       
        if (player.getNumMelee() > 0 || player.getNumRanged() > 0 || player.getNumCavalry() > 0) {
            int result = JOptionPane.showConfirmDialog(null, "Continue to campaign?", "Confirmation", JOptionPane.YES_NO_OPTION);
            if (result == JOptionPane.YES_OPTION) {
                gameTabbedPane.setSelectedIndex(3);
                gameTabbedPane.setEnabledAt(3, true);
                gameTabbedPane.setEnabledAt(1, false);
                displayBattlePlayerName.setText(player.getPlayerName());
                
                battleNameLabel.setText(level.getBattleName());
                
                enemy.changeEnemyArmy(level.getLevelNum());
                refreshEnemyMeleeUnits();
                refreshEnemyRangedUnits();
                refreshEnemyCavalryUnits();
            }
        }
        else {
            JOptionPane.showMessageDialog(null, "You can't battle without any units!", "Alert", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_startCampaignButtonActionPerformed

    private void placeUnitsAtStartOfBattle() {
        Object[] options = { "Preset 1", "Preset 2", "Manual", "Confirm" };
        int result = 0;
        while (result != 3 && result != 2) { 
            result = JOptionPane.showOptionDialog(null, "Choose a formation: ", "Army Formation Select",
                    JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, null, options, options[0]);
            switch (result) {
                case 0:
                    presetOneBattleOne();
                    
                    break;
                case 1:
                    presetTwoBattleOne();
                    break;
                    
                case 2:
                    clearGridButtons();
                    playerArmy.setMeleeCounter(player.getNumMelee());
                    playerArmy.setRangedCounter(player.getNumRanged());
                    playerArmy.setCavalryCounter(player.getNumCavalry());
                    manualUnitPlacement();
                    resetUnitsLeftToPlaceLabel();
                    
                    break;
                    
                default:
                    break;
            }
        }
    }
    /**
     * Method to handle enterBattleButton pressed
     * Changes current panel and sets previous one to false
     * @param evt 
     */
    private void enterBattleButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_enterBattleButtonActionPerformed
        // TODO add your handling code here:
        level.setBattleOneTileTerrain();
        result = playerArmy.getUnits().stream().filter(item -> item.getName().equals("Infantry")).collect(Collectors.toList());
        result = playerArmy.getUnits().stream().filter(item -> item.getName().equals("Archers")).collect(Collectors.toList());
        result =  playerArmy.getUnits().stream().filter(item -> item.getName().equals("Cavalry")).collect(Collectors.toList());
        gameTabbedPane.setEnabledAt(4, true);
        gameTabbedPane.setEnabledAt(3, false);
        gameTabbedPane.setSelectedIndex(4);
        
        playerTurnNumberLabel.setVisible(false);
        selectedUnitDetails.setVisible(false);
        
        playerArmy.setMeleeCounter(player.getNumMelee());
        playerArmy.setRangedCounter(player.getNumRanged());
        playerArmy.setCavalryCounter(player.getNumCavalry());
        
        /*
        switch(battleNum){ // Will be used if more battles are added
            case 1:
                
        }*/
        
        placeUnitsAtStartOfBattle();
    }//GEN-LAST:event_enterBattleButtonActionPerformed

    private void resetUnitsLeftToPlaceLabel() {
        unitsLeftToPlaceLabel.setText("Infantry: " + playerArmy.getMeleeCounter() 
                + " Archers " + playerArmy.getRangedCounter() 
                + " Cavalry: " + playerArmy.getCavalryCounter());
    }
    
    private void resetManualPlacementButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resetManualPlacementButtonActionPerformed
        for (int i = 18; i < 20; i++) {
            for (int j = 7; j < 13; j++) {
                buttons[i][j].setBorder(new LineBorder(Color.BLACK));
            }
        }
        clearGridButtons();
        playerArmy.setMeleeCounter(player.getNumMelee());
        playerArmy.setRangedCounter(player.getNumRanged());
        playerArmy.setCavalryCounter(player.getNumCavalry());
        resetUnitsLeftToPlaceLabel();
        placeUnitsAtStartOfBattle();
    }//GEN-LAST:event_resetManualPlacementButtonActionPerformed

    private void sortEnemyArmy() {
        for (int i = 0; i < enemyArmy.getUnits().size(); i++) {
            if (enemyArmy.getUnits().get(i).getName().equals("Infantry")) {
                 enemyArmy.getUnits().get(i).setCounter(trackEnemyUnits);
                 trackEnemyUnits++;
            }
        }
        for (int i = 0; i < enemyArmy.getUnits().size(); i++) {
            if (enemyArmy.getUnits().get(i).getName().equals("Archers")) {
                 enemyArmy.getUnits().get(i).setCounter(trackEnemyUnits);
                 trackEnemyUnits++;
            }
        }
        for (int i = 0; i < enemyArmy.getUnits().size(); i++) {
            if (enemyArmy.getUnits().get(i).getName().equals("Cavalry")) {
                 enemyArmy.getUnits().get(i).setCounter(trackEnemyUnits);
                 trackEnemyUnits++;
            }
        }
    }
    
    private void sortPlayerArmy() {
        for (int i = 0; i < playerArmy.getUnits().size(); i++) {
            if (playerArmy.getUnits().get(i).getName().equals("Infantry")) {
                 playerArmy.getUnits().get(i).setCounter(trackPlayerUnits);
                 trackPlayerUnits++;
            }
        }
        for (int i = 0; i < playerArmy.getUnits().size(); i++) {
            if (playerArmy.getUnits().get(i).getName().equals("Archers")) {
                 playerArmy.getUnits().get(i).setCounter(trackPlayerUnits);
                 trackPlayerUnits++;
            }
        }
        for (int i = 0; i < playerArmy.getUnits().size(); i++) {
            if (playerArmy.getUnits().get(i).getName().equals("Cavalry")) {
                 playerArmy.getUnits().get(i).setCounter(trackPlayerUnits);
                 trackPlayerUnits++;
            }
        }
    }
    
    private void confirmUnitFormationManualButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_confirmUnitFormationManualButtonActionPerformed
        enemyPresetBattleOne();
        sortEnemyArmy();
        sortPlayerArmy();
        for (int i = 0; i < playerArmy.getUnits().size(); i++) {
        }
        for (int i = 0; i < enemyArmy.getUnits().size(); i++) {
        }
        
        for (int i = 0; i < playerArmy.getUnits().size();i++) {
            playerUnitInfo.setText(playerUnitInfo.getText() + playerArmy.getUnits().get(i).getName() + " ");
        }
        
        for (int i = 0; i < enemyArmy.getUnits().size();i++) {
            enemyUnitInfo.setText(enemyUnitInfo.getText() + enemyArmy.getUnits().get(i).getName() + " ");
        }
        
        for (int x = 0; x < SIZE; x++) {
            for (int z = 0; z < SIZE; z++) {
                buttons[x][z].setBackground(null); // Removes background color
                buttons[x][z].setOpaque(false);
            }
        }
        
        if (playerArmy.getMeleeCounter() > 0 || playerArmy.getRangedCounter() > 0 || playerArmy.getCavalryCounter() > 0) {
            JOptionPane.showMessageDialog(null, "You haven't placed all of your units", "Alert", JOptionPane.ERROR_MESSAGE);
        }
        
        else {
            inputUnitsManual = false;
            
            
            
            for (int i = 0; i < 20; i++) {
                for (int j = 0; j < 20; j++) {
                    buttons[i][j].setBorder(new LineBorder(Color.BLACK));
                }
            }
            confirmUnitFormationManualButton.setVisible(false);
            resetManualPlacementButton.setVisible(false);
            unitsLeftToPlaceLabel.setVisible(false);
            playerTurnNumberLabel.setVisible(true);
            selectedUnitDetails.setVisible(true);
            battlePanel.revalidate();
            battlePanel.repaint();
        }
    }//GEN-LAST:event_confirmUnitFormationManualButtonActionPerformed

    private void endTurnButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_endTurnButtonActionPerformed
        playerUnitInfo.setText("");
        enemyUnitInfo.setText("");
        for (int i = 0; i < playerArmy.getUnits().size();i++) {
            
            playerUnitInfo.setText(playerUnitInfo.getText() + playerArmy.getUnits().get(i).getName() + " ");
        }
        
        for (int i = 0; i < enemyArmy.getUnits().size();i++) {
            
            enemyUnitInfo.setText(enemyUnitInfo.getText() + enemyArmy.getUnits().get(i).getName() + " ");
        }
        playerTurn = false;
        endTurnButton.setVisible(false);
        battlePanel.revalidate();
        battlePanel.repaint();
        enemyTurn();
    }//GEN-LAST:event_endTurnButtonActionPerformed

    private void backToCampaignButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backToCampaignButtonActionPerformed
        gameTabLayeredPane.setLayer(victoryScreen, 0);
        gameTabLayeredPane.setLayer(gamePanel, 1);
        refreshGoldLabel();
        playerGoldDisplay.setText("Player Gold: " + (int)player.getPlayerGold());
        playerNumMeleeUnits.setText("Infantry Squadrons: " + player.getNumMelee());
        playerNumRangedUnits.setText("Archer Squadrons: " + player.getNumRanged());
        playerNumCavalryUnits.setText("Cavalry Squadrons: " + player.getNumCavalry());
    }//GEN-LAST:event_backToCampaignButtonActionPerformed

    public void updateVictoryScreenLabels() {
        victoryScreenMainAnnounce.setText(" You've defeated the " + enemy.getEnemyName() + "!");
        goldEarnedFromBattle.setText(" Gold earned: " + level.getGoldGainedFromBattle());
        survivingUnitsLabel.setText(" Surviving Units: Infantry (" + player.getNumMelee() + ") Archers (" + player.getNumRanged() 
                + ") Cavalry (" + player.getNumCavalry() + ")");
        playerLevelDisplay.setText("Player Level: " + (int)player.getPlayerLevel());
        skillPointsDisplay.setText("Skill Points: " + (int)player.getSkillPoints());
    }
    
    private void playerTurn() {
        //battleDone();
        
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                canUnitsMove[i][j] = true; // Sets all units to be able to move
            }
        }
        
        playerTurn = true;
        playerTurnNum++;
        playerTurnNumberLabel.setText("Turn #: " + playerTurnNum);
        
        endTurnButton.setVisible(true);
        battlePanel.revalidate();
        battlePanel.repaint();
    }
    
    private void enemyAttack(int currentEnemyx, int currentEnemyz, int m) {
        closestEnemyz = 0;
        closestEnemyx = 0;
        int playerCount = 0;
        int enemyCount = 0;
        for (int i = 0; i < playerArmy.getUnits().size(); i++) {
            if (playerArmy.getUnits().get(i).getName() == stringPlayerUnits[closestEnemyx][closestEnemyz]) {
                playerCount = playerArmy.getUnits().get(i).getCounter();

            }
        }
        for (int i = 0; i < enemyArmy.getUnits().size(); i++) {
            if (enemyArmy.getUnits().get(i).getName() == stringEnemyUnits[currentEnemyx][currentEnemyz]) {
                enemyCount = enemyArmy.getUnits().get(i).getCounter();

            }
        }
        playerAttack(playerCount, enemyCount, currentEnemyPosx[m], currentEnemyPosz[m], lastGridi, lastGridj);
    }
    
    private void enemyTurn() {
        for (int m = 0; m < enemyArmy.getUnits().size(); m++) {
            nextEnemyPosx[m] = currentEnemyPosx[m];
            nextEnemyPosz[m] = currentEnemyPosz[m];
        }
        
        for (int i = 0; i < SIZE; i++){ // Sets previous positions to null
            buttons[currentEnemyPosx[i]][currentEnemyPosz[i]].setIcon(null);
            stringEnemyUnits[currentEnemyPosx[i]][currentEnemyPosz[i]] = null;
            //buttons[nextEnemyPosx[i]][nextEnemyPosz[i]].setIcon(null);
            //stringEnemyUnits[nextEnemyPosx[i]][nextEnemyPosz[i]] = null;
        }
        outerLoop:
        for (int i = SIZE-1; i > 0; i--) { // Finds where closest player unit is for enemy to approach
            for (int j = SIZE-1; j > 0; j--) {
                if (stringPlayerUnits[i][j] == "Infantry" || stringPlayerUnits[i][j] == "Archers" || stringPlayerUnits[i][j] == "Cavalry") {
                    closestEnemyx = i;
                    closestEnemyz = j;
                    break outerLoop;
                } 
            }
        }
        
        for (int m = 0; m < enemyArmy.getUnits().size(); m++) { // If closest player unit has a higher x than the enemy, increase enemy x
            if (currentEnemyPosx[m] < closestEnemyx) {
                if (closestEnemyx - nextEnemyPosx[m] == 1 || closestEnemyx - nextEnemyPosx[m] == -1) {
                    enemyAttack(currentEnemyPosx[m],currentEnemyPosz[m], m);
                }
                else if (buttons[nextEnemyPosx[m+1]][nextEnemyPosz[m]].getIcon() == null) {
                    if (level.getTileTerrain(nextEnemyPosx[m+1], nextEnemyPosz[m]) == "River" && !enemy.bridgeReady()) {
                        enemy.setBuildingBridge(true);
                        enemy.buildingABridge();
                        enemyBattleEventLabel.setText("ENEMY BUILDING BRIDGE! (" + enemy.getBridgeTimeLeft() + " turns)");
                        
                        if (enemy.bridgeReady()) {
                            enemy.setBuildingBridge(false);
                            enemyBattleEventLabel.setText("ENEMY BRIDGE COMPLETE!");
                            enemyBattleEventLabel.setText("");
                        }
                    }
                    else {
                        nextEnemyPosx[m]++;
                    }
                }
            }

            else if (currentEnemyPosx[m] > closestEnemyx) { // If closest player unit has a lower x than the enemy, decrease enemy x
                if (closestEnemyx - nextEnemyPosx[m] == 1 || closestEnemyx - nextEnemyPosx[m] == -1) {
                    enemyAttack(nextEnemyPosx[m],nextEnemyPosz[m], m);
                }
                /*else if (buttons[nextEnemyPosx[m]-1][nextEnemyPosz[m]].getIcon() == null) {
                    nextEnemyPosx[m]--; 
                }*/
            }
        }
        
        
        for (int i = 0; i < enemyArmy.getUnits().size(); i++) { // Goes through list to find if this unit it still alive
            if (containsName(enemyArmy.getUnits().get(i), "Infantry")) {
                if (buttons[nextEnemyPosx[0]][nextEnemyPosz[0]].getIcon() == null
                        && (level.getTileTerrain(nextEnemyPosx[0], nextEnemyPosz[0]) != "River" || enemy.bridgeReady())) { // If next position has no unit
                    stringEnemyUnits[nextEnemyPosx[0]][nextEnemyPosz[0]] = "Infantry"; // Move unit to next position
                    buttons[nextEnemyPosx[0]][nextEnemyPosz[0]].setIcon(meleeIconEnemy);
                    currentEnemyPosx[0] = nextEnemyPosx[0];
                    currentEnemyPosz[0] = nextEnemyPosz[0];
                    break;
                }
                else { // If next position has a unit
                    stringEnemyUnits[currentEnemyPosx[0]][currentEnemyPosz[0]] = "Infantry"; // Keep unit in its current place
                    buttons[currentEnemyPosx[0]][currentEnemyPosz[0]].setIcon(meleeIconEnemy);
                }
            }
        }

        for (int i = 0; i < enemyArmy.getUnits().size(); i++) {
            if (containsName(enemyArmy.getUnits().get(i), "Archers")) {
                if (buttons[nextEnemyPosx[1]][nextEnemyPosz[1]].getIcon() == null
                        && (level.getTileTerrain(nextEnemyPosx[1], nextEnemyPosz[1]) != "River" || enemy.bridgeReady())) {
                    stringEnemyUnits[nextEnemyPosx[1]][nextEnemyPosx[1]] = "Archers";
                    buttons[nextEnemyPosx[1]][nextEnemyPosz[1]].setIcon(rangedIconEnemy);
                    currentEnemyPosx[1] = nextEnemyPosx[1];
                    currentEnemyPosz[1] = nextEnemyPosz[1];
                    break;
                }
                else {
                    stringEnemyUnits[currentEnemyPosx[1]][currentEnemyPosx[1]] = "Archers";
                    buttons[currentEnemyPosx[1]][currentEnemyPosz[1]].setIcon(rangedIconEnemy);
                }
            }
        }
        for (int i = 0; i < enemyArmy.getUnits().size(); i++) {
            if (containsName(enemyArmy.getUnits().get(i), "Infantry")) {
                if (buttons[nextEnemyPosx[2]][nextEnemyPosz[2]].getIcon() == null
                        && (level.getTileTerrain(nextEnemyPosx[2], nextEnemyPosz[2]) != "River" || enemy.bridgeReady())) {
                    stringEnemyUnits[nextEnemyPosx[2]][nextEnemyPosz[2]] = "Infantry";
                    buttons[nextEnemyPosx[2]][nextEnemyPosz[2]].setIcon(meleeIconEnemy);
                    currentEnemyPosx[2] = nextEnemyPosx[2];
                    currentEnemyPosz[2] = nextEnemyPosz[2];
                    break;
                }
                else if (infcount > 1){
                    stringEnemyUnits[currentEnemyPosx[2]][currentEnemyPosz[2]] = "Infantry";
                    buttons[currentEnemyPosx[2]][currentEnemyPosz[2]].setIcon(meleeIconEnemy);
                }
            }
        }

        for (int i = 0; i < enemyArmy.getUnits().size(); i++) {
            if (containsName(enemyArmy.getUnits().get(i), "Cavalry")) {
                if (buttons[nextEnemyPosx[3]][nextEnemyPosz[3]].getIcon() == null
                        && (level.getTileTerrain(nextEnemyPosx[3], nextEnemyPosz[3]) != "River" || enemy.bridgeReady())) {
                    buttons[nextEnemyPosx[3]][nextEnemyPosz[3]].setIcon(cavalryIconEnemy);
                    stringEnemyUnits[nextEnemyPosx[3]][nextEnemyPosz[3]] = "Cavalry";
                    currentEnemyPosx[3] = nextEnemyPosx[3];
                    currentEnemyPosz[3] = nextEnemyPosz[3];
                    break;
                }
                else {
                    buttons[currentEnemyPosx[3]][currentEnemyPosz[3]].setIcon(cavalryIconEnemy);
                    stringEnemyUnits[currentEnemyPosx[3]][currentEnemyPosz[3]] = "Cavalry";
                    
                }
            }
        }
        
        enemyTurnNum++;  
        playerTurn();
    }
    
    /**
     * Refreshes JLabel that displays player gold
     */
    private void refreshGoldLabel() {
        playerGoldDisplay.setText("Player Gold: " + (int)player.getPlayerGold());
    }
    
    /**
     * Refreshes JLabel that displays # of player melee units
     */
    private void refreshMeleeUnits() {
        playerNumMeleeUnits.setText("Infantry Squadrons: " + player.getNumMelee());
        battlePreviewInfantry.setText("Total Infantry: " + player.getNumMelee()*playerArmy.meleeSquadMultiplier());
    }
    
    /**
     * Refreshes JLabel that displays # of player ranged units
     */
    private void refreshRangedUnits() {
        playerNumRangedUnits.setText("Archer Squadrons: " + player.getNumRanged());
        battlePreviewArchers.setText("Total Archers: " + player.getNumRanged()*playerArmy.rangedSquadMultiplier());
    }
    
    /**
     * Refreshes JLabel that displays # of player cavalry units
     */
    private void refreshCavalryUnits() {
        playerNumCavalryUnits.setText("Cavalry Squadrons: " + player.getNumCavalry());
        battlePreviewCavalry.setText("Total Cavalry: " + player.getNumCavalry()*playerArmy.cavalrySquadMultiplier());
    }
    
    /**
     * Refreshes JLabel that displays # of enemy melee units
     */
    private void refreshEnemyMeleeUnits() {
        enemyBattleScreenMelee.setText("Total Infantry: " + enemy.getNumMelee()*enemyArmy.meleeSquadMultiplier());
    }
    
    /**
     * Refreshes JLabel that displays # of enemy ranged units
     */
    private void refreshEnemyRangedUnits() {
        enemyBattleScreenRanged.setText("Total Archers: " + enemy.getNumRanged()*enemyArmy.rangedSquadMultiplier());
    }
    
    /**
     * Refreshes JLabel that displays # of enemy cavalry units
     */
    private void refreshEnemyCavalryUnits() {
        enemyBattleScreenCavalry.setText("Total Cavalry: " + enemy.getNumCavalry()*enemyArmy.cavalrySquadMultiplier());
    }
    
    /**
     * Sets positions of units when Preset 1 is selected
     */
    private void presetOneBattleOne() {
        clearGridButtons();
        
        playerArmy.setMeleeCounter(player.getNumMelee());
        playerArmy.setRangedCounter(player.getNumRanged());
        playerArmy.setCavalryCounter(player.getNumCavalry());
        
        while (playerArmy.getMeleeCounter() > 0) {
            buttons[19][9].setIcon(meleeIconPlayer);
            stringPlayerUnits[19][9] = "Infantry";
            playerArmy.decrementMeleeCounter();
            if (playerArmy.getMeleeCounter() <= 0) {
                break;
            }
            else {
                buttons[19][10].setIcon(meleeIconPlayer);
                stringPlayerUnits[19][10] = "Infantry";
                playerArmy.decrementMeleeCounter();
            }
            if (playerArmy.getMeleeCounter() <= 0) {
                break;
            }
            else {
                buttons[18][8].setIcon(meleeIconPlayer);
                stringPlayerUnits[18][8] = "Infantry";
                playerArmy.decrementMeleeCounter();
            }
            if (playerArmy.getMeleeCounter() <= 0) {
                break;
            }
            else {
                buttons[18][11].setIcon(meleeIconPlayer);
                stringPlayerUnits[18][11] = "Infantry";
                playerArmy.decrementMeleeCounter();
            }
        }
        
        while (playerArmy.getRangedCounter() > 0) {
            buttons[19][8].setIcon(rangedIconPlayer);
            stringPlayerUnits[19][8] = "Archers";
            playerArmy.decrementRangedCounter();
            if (playerArmy.getRangedCounter() <= 0) {
                break;
            }
            else {
                buttons[19][11].setIcon(rangedIconPlayer);
                stringPlayerUnits[19][11] = "Archers";
                playerArmy.decrementRangedCounter();
            }
            if (playerArmy.getRangedCounter() <= 0) {
                break;
            }
            else {
                buttons[18][8].setIcon(rangedIconPlayer);
                stringPlayerUnits[18][8] = "Archers";
                playerArmy.decrementRangedCounter();
            }
            if (playerArmy.getRangedCounter() <= 0) {
                break;
            }
            else {
                buttons[18][11].setIcon(rangedIconPlayer);
                stringPlayerUnits[18][11] = "Archers";
                playerArmy.decrementRangedCounter();
            }
        }
        
        while (playerArmy.getCavalryCounter() > 0) {
            buttons[19][7].setIcon(cavalryIconPlayer);
            stringPlayerUnits[19][7] = "Cavalry";
            playerArmy.decrementCavalryCounter();
            if (playerArmy.getCavalryCounter() <= 0) {
                break;
            }
            else {
                buttons[19][12].setIcon(cavalryIconPlayer);
                stringPlayerUnits[19][12] = "Cavalry";
                playerArmy.decrementCavalryCounter();
            }
            if (playerArmy.getCavalryCounter() <= 0) {
                break;
            }
            else {
                buttons[18][7].setIcon(cavalryIconPlayer);
                stringPlayerUnits[18][7] = "Cavalry";
                playerArmy.decrementCavalryCounter();
            }
            if (playerArmy.getCavalryCounter() <= 0) {
                break;
            }
            else {
                buttons[18][12].setIcon(cavalryIconPlayer);
                stringPlayerUnits[18][12] = "Cavalry";
                playerArmy.decrementCavalryCounter();
            }
        }
        unitActionListeners();
    }
    
    /**
     * Sets positions of units when Preset 2 is selected
     */
    private void presetTwoBattleOne() {
        clearGridButtons();
        
        playerArmy.setMeleeCounter(player.getNumMelee());
        playerArmy.setRangedCounter(player.getNumRanged());
        playerArmy.setCavalryCounter(player.getNumCavalry());
        
        int x, z;
        while (playerArmy.getMeleeCounter() > 0) {
            buttons[19][8].setIcon(meleeIconPlayer);
            stringPlayerUnits[19][8] = "Infantry";
            playerArmy.decrementMeleeCounter();
            if (playerArmy.getMeleeCounter() <= 0) {
                break;
            }
            else {
                buttons[19][10].setIcon(meleeIconPlayer);
                stringPlayerUnits[19][10] = "Infantry";
                playerArmy.decrementMeleeCounter();
            }
            if (playerArmy.getMeleeCounter() <= 0) {
                break;
            }
            else {
                
                buttons[18][9].setIcon(meleeIconPlayer);
                stringPlayerUnits[18][9] = "Infantry";
                playerArmy.decrementMeleeCounter();
            }
            if (playerArmy.getMeleeCounter() <= 0) {
                break;
            }
            else {
                buttons[18][10].setIcon(meleeIconPlayer);
                stringPlayerUnits[18][10] = "Infantry";
                playerArmy.decrementMeleeCounter();
            }
        }
        
        while (playerArmy.getRangedCounter() > 0) {
            buttons[19][9].setIcon(rangedIconPlayer);
            stringPlayerUnits[19][9] = "Archers";
            playerArmy.decrementRangedCounter();
            if (playerArmy.getRangedCounter() <= 0) {
                break;
            }
            else {
                buttons[18][11].setIcon(rangedIconPlayer);
                stringPlayerUnits[18][11] = "Archers";
                playerArmy.decrementRangedCounter();
            }
            if (playerArmy.getRangedCounter() <= 0) {
                break;
            }
            else {
                buttons[18][7].setIcon(rangedIconPlayer);
                stringPlayerUnits[18][7] = "Archers";
                playerArmy.decrementRangedCounter();
            }
            if (playerArmy.getRangedCounter() <= 0) {
                break;
            }
            else {
                buttons[18][12].setIcon(rangedIconPlayer);
                stringPlayerUnits[18][12] = "Archers";
                playerArmy.decrementRangedCounter();
            }
        }
        
        while (playerArmy.getCavalryCounter() > 0) {
            buttons[18][7].setIcon(cavalryIconPlayer);
            stringPlayerUnits[18][7] = "Cavalry";
            playerArmy.decrementCavalryCounter();
            if (playerArmy.getCavalryCounter() <= 0) {
                break;
            }
            else {
                buttons[19][12].setIcon(cavalryIconPlayer);
                stringPlayerUnits[19][12] = "Cavalry";
                playerArmy.decrementCavalryCounter();
            }
            if (playerArmy.getCavalryCounter() <= 0) {
                break;
            }
            else {
                buttons[18][7].setIcon(cavalryIconPlayer);
                stringPlayerUnits[18][7] = "Cavalry";
                playerArmy.decrementCavalryCounter();
            }
            if (playerArmy.getCavalryCounter() <= 0) {
                break;
            }
            else {
                buttons[18][12].setIcon(cavalryIconPlayer);
                stringPlayerUnits[18][12] = "Cavalry";
                playerArmy.decrementCavalryCounter();
            }
        }
        unitActionListeners();
    }
    
    /**
     * Sets positions of enemy units for battle one.
     */
    private void enemyPresetBattleOne() {
        enemyArmy.setNumMelee(2);
        enemyArmy.setNumRanged(1);
        enemyArmy.setNumCavalry(1);
        
        enemyArmy.setMeleeCounter(enemy.getNumMelee());
        enemyArmy.setRangedCounter(enemy.getNumRanged());
        enemyArmy.setCavalryCounter(enemy.getNumCavalry());
        
        buttons[0][8].setIcon(meleeIconEnemy);
        stringEnemyUnits[0][8] = "Infantry";
        enemyArmy.decrementMeleeCounter();
        
        currentEnemyPosx[0] = 0;
        currentEnemyPosz[0] = 8;
        
        
        buttons[0][9].setIcon(rangedIconEnemy);
        stringEnemyUnits[0][9] = "Archers";
        enemyArmy.decrementRangedCounter();
        
        currentEnemyPosx[1] = 0;
        currentEnemyPosz[1] = 9;
        
        buttons[0][10].setIcon(meleeIconEnemy);
        stringEnemyUnits[0][10] = "Infantry";
        enemyArmy.decrementMeleeCounter();
        
        currentEnemyPosx[2] = 0;
        currentEnemyPosz[2] = 10;
        
        buttons[0][11].setIcon(cavalryIconEnemy);
        stringEnemyUnits[0][11] = "Cavalry";
        enemyArmy.decrementCavalryCounter();
        
        currentEnemyPosx[3] = 0;
        currentEnemyPosz[3] = 11;
        
        enemyArmy.addMeleeToObject();
        enemyArmy.addMeleeToObject();
        enemyArmy.addRangedToObject();
        enemyArmy.addCavalryToObject();
        
        infcount = 2;
    }
    
    /**
     * Allows user to manually select start locations of available units
     */
    public void manualUnitPlacement() {
        if(inputUnitsManual) {
            for (int i = 18; i < 20; i++) {
                for (int j = 7; j < 13; j++) {
                    buttons[i][j].setBorder(new LineBorder(Color.BLUE));
                }
            }
            unitActionListeners();
        }
        else{
            
            for (int i = 18; i < 20; i++) {
                for (int j = 7; j < 13; j++) {
                    buttons[i][j].setBorder(new LineBorder(Color.BLACK));
                }
            }
        }
    }
    
    /**
     * Adds buttons to grid layout
     */
    public void addButtons() {
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                buttons[i][j] = new JButton(); // TO DO: Remove visible numbers from grid
                battleGridPanel.add(buttons[i][j]);
                buttons[i][j].setContentAreaFilled(false);
                buttons[i][j].setBorder(new LineBorder(Color.BLACK));
            }
        }
    }
    
    public boolean containsName(Units u, String name){
        return u.getName().equals(name);
    }
    
    public void battleDone() {
        boolean end = true;
        for (int i = 0; i < enemyArmy.getUnits().size(); i++) {
            if (enemyArmy.getUnits().get(i).getName() == "Infantry" || enemyArmy.getUnits().get(i).getName() == "Archers" 
                    || enemyArmy.getUnits().get(i).getName() == "Cavalry") {
                end = false;
                break;
            }
        }
        
        if (end) {
            level.setGameOver(true);
            JOptionPane.showMessageDialog(null, "You win!");
            gameTabbedPane.setSelectedIndex(1);
            gameTabbedPane.setEnabledAt(3, false);
            gameTabbedPane.setEnabledAt(4, false);
            gameTabbedPane.setEnabledAt(1, true);
            gameTabLayeredPane.setLayer(victoryScreen, 1);
            gameTabLayeredPane.setLayer(gamePanel, 0);
            
            player.setPlayerGold(player.getPlayerGold() + level.getGoldGainedFromBattle());
            
            updateVictoryScreenLabels();
            
            level.wonBattle();
            level.changeMap();
        }
        
        for (int i = 0; i < playerArmy.getUnits().size(); i++) {
            if (playerArmy.getUnits().get(i).getName() == "Infantry" || playerArmy.getUnits().get(i).getName() == "Archers" 
                    || playerArmy.getUnits().get(i).getName() == "Cavalry") {
                end = false;
                break;
            }
        }
        
        if (end) {
            level.setGameOver(true);
            //gameLevel.lostBattle();
            JOptionPane.showMessageDialog(null, "You Lose! - Game Over.");
            gameTabbedPane.setSelectedIndex(0);
            gameTabbedPane.setEnabledAt(3, false);
            gameTabbedPane.setEnabledAt(4, false);
            gameTabbedPane.setEnabledAt(0, true);
        }
    }
    
    public void playerAttack(int playerCount, int enemyCount, int m, int n, int lastGridi, int lastGridj) {
        boolean playerUnitDead = false;
        level.setGameOver(false);

        battleDone();
        
        if (!level.getGameOver()) {
            if (playerArmy.getUnits().get(playerCount).getName() == "Archers") { // Handled separately because archers attack from safely - they dont take return damage
                if (enemyArmy.getUnits().get(enemyCount).getHealth() <= playerArmy.getUnits().get(playerCount).getDamage()) { 

                    buttons[m][n].setIcon(null); // Remove enemy unit icon
                    stringEnemyUnits[m][n] = null; // Remove string value of enemy unit
                    enemyArmy.getUnits().get(enemyCount).decreaseHealth(
                    playerArmy.getUnits().get(playerCount).getDamage()); // Decrease Enemy unit health by value of player unit damage
                    enemyArmy.removeUnitFromObject(enemyCount);
                    
                    switch (enemyArmy.getUnits().get(enemyCount).getName()) {
                        case "Infantry":
                            enemyArmy.decrementMelee();
                            infcount -= 1;
                            break;
                        case "Archers":
                            enemyArmy.decrementRanged();
                            break;
                        case "Cavalry":
                            enemyArmy.decrementCavalry();
                            break;
                        default:
                            break;
                    }
                    
                    JOptionPane.showMessageDialog(null, "Enemy unit killed !", "Alert", JOptionPane.ERROR_MESSAGE);
                    level.increaseGoldGained(100);
                    player.addPlayerExp(25);
                    battleDone();
                }
                else if (enemyArmy.getUnits().get(enemyCount).getHealth() > playerArmy.getUnits().get(playerCount).getDamage()) {
                    enemyBattleEventLabel.setText(enemyArmy.getUnits().get(enemyCount).getName() + " took " + playerArmy.getUnits().get(playerCount).getDamage() + " points of damage.");
                    enemyArmy.getUnits().get(enemyCount).decreaseHealth(playerArmy.getUnits().get(playerCount).getDamage()); // Decrease Enemy unit health by value of player unit damage
                }
            }
            else {
                if (playerArmy.getUnits().get(playerCount).getName() == "Infantry" || playerArmy.getUnits().get(playerCount).getName() == "Cavalry") {
                    if (enemyArmy.getUnits().get(enemyCount).getHealth() <= playerArmy.getUnits().get(playerCount).getDamage()) {
                        enemyArmy.getUnits().get(enemyCount).setIsAlive(false);
                        if (!enemyArmy.getUnits().get(enemyCount).getIsAlive() && enemyArmy.getUnits().get(enemyCount).getName() != ""){

                            buttons[m][n].setIcon(null); // Remove enemy unit icon
                            stringEnemyUnits[m][n] = null; // Remove string value of enemy unit
                            enemyArmy.getUnits().get(enemyCount).decreaseHealth(playerArmy.getUnits().get(playerCount).getDamage()); // Decrease Enemy unit health by value of player unit damage
                            playerArmy.getUnits().get(playerCount).decreaseHealth(enemyArmy.getUnits().get(enemyCount).getDamage()); // Decrease Player unit health by value of enemy unit damage
                            enemyArmy.removeUnitFromObject(enemyCount);
                            enemyBattleEventLabel.setText(enemyArmy.getUnits().get(enemyCount).getName() + " took " + playerArmy.getUnits().get(playerCount).getDamage() + " points of damage.");
                            playerBattleEventLabel.setText(playerArmy.getUnits().get(playerCount).getName() + " took " + enemyArmy.getUnits().get(enemyCount).getDamage() + " points of damage.");
                            JOptionPane.showMessageDialog(null, "Enemy unit killed !", "Alert", JOptionPane.ERROR_MESSAGE);
                            
                            switch (enemyArmy.getUnits().get(enemyCount).getName()) {
                                case "Infantry":
                                    enemyArmy.decrementMelee();
                                    infcount = 1;
                                    break;
                                case "Archers":
                                    enemyArmy.decrementRanged();
                                    break;
                                case "Cavalry":
                                    enemyArmy.decrementCavalry();
                                    break;
                                default:
                                    break;
                            }
                            
                            level.increaseGoldGained(100);
                            player.addPlayerExp(25);
                            battleDone();
                        }
                    }
                }
                else if (enemyArmy.getUnits().get(enemyCount).getHealth() > playerArmy.getUnits().get(playerCount).getDamage()) {
                    enemyBattleEventLabel.setText(enemyArmy.getUnits().get(enemyCount).getName() + " took " + playerArmy.getUnits().get(playerCount).getDamage() + " points of damage.");
                    playerBattleEventLabel.setText(playerArmy.getUnits().get(playerCount).getName() + " took " + enemyArmy.getUnits().get(enemyCount).getDamage() + " points of damage.");
                    enemyArmy.getUnits().get(enemyCount).decreaseHealth(playerArmy.getUnits().get(playerCount).getDamage()); // Decrease Enemy unit health by value of player unit damage
                    playerArmy.getUnits().get(playerCount).decreaseHealth(enemyArmy.getUnits().get(enemyCount).getDamage()); // Decrease Player unit health by value of enemy unit damage
                }

                if (playerArmy.getUnits().get(playerCount).getHealth() <= enemyArmy.getUnits().get(enemyCount).getDamage()) {
                    playerArmy.getUnits().get(playerCount).setIsAlive(false);
                    if (!playerArmy.getUnits().get(playerCount).getIsAlive() && enemyArmy.getUnits().get(enemyCount).getName() != ""){
                         // Remove enemy unit from enemy army list
                        buttons[lastGridi][lastGridj].setIcon(null); // Remove enemy unit icon
                        stringPlayerUnits[lastGridi][lastGridj] = null; // Remove string value of enemy unit
                        enemyArmy.getUnits().get(enemyCount).decreaseHealth(playerArmy.getUnits().get(playerCount).getDamage()); // Decrease Enemy unit health by value of player unit damage
                        playerArmy.getUnits().get(playerCount).decreaseHealth(enemyArmy.getUnits().get(enemyCount).getDamage()); // Decrease Player unit health by value of enemy unit damage
                        playerArmy.removeUnitFromObject(playerCount);
                        enemyBattleEventLabel.setText(enemyArmy.getUnits().get(enemyCount).getName() + " took " + playerArmy.getUnits().get(playerCount).getDamage() + " points of damage.");
                        JOptionPane.showMessageDialog(null, "Player unit '" + playerArmy.getUnits().get(playerCount).getName() + 
                                "' killed by enemy '" + enemyArmy.getUnits().get(enemyCount).getName() + "'!", "Alert", JOptionPane.ERROR_MESSAGE);
                        switch (playerArmy.getUnits().get(playerCount).getName()) {
                            case "Infantry":
                                playerArmy.decrementMelee();
                                break;
                            case "Archers":
                                playerArmy.decrementRanged();
                                break;
                            case "Cavalry":
                                playerArmy.decrementCavalry();
                                break;
                            default:
                                break;
                        }
                        playerUnitDead = true;
                        battleDone();
                    }
                }
                else if (playerArmy.getUnits().get(playerCount).getHealth() > enemyArmy.getUnits().get(enemyCount).getDamage()) {
                    playerBattleEventLabel.setText(playerArmy.getUnits().get(playerCount).getName() + " took " + enemyArmy.getUnits().get(enemyCount).getDamage() + " points of damage.");
                    enemyArmy.getUnits().get(enemyCount).decreaseHealth(playerArmy.getUnits().get(playerCount).getDamage()); // Decrease Enemy unit health by value of player unit damage
                    playerArmy.getUnits().get(playerCount).decreaseHealth(enemyArmy.getUnits().get(enemyCount).getDamage()); // Decrease Player unit health by value of enemy unit damage
                }
                if (!playerUnitDead) {
                selectedUnitDetails.setText("Health: " + playerArmy.getUnits().get(playerCount).getHealth() 
                        + "\n Damage: " + playerArmy.getUnits().get(playerCount).getDamage()
                        + "\n Speed: " + playerArmy.getUnits().get(playerCount).getSpeed());
                }
            }
        }
    }

    /**
     * Adds action listeners to grid buttons
     * If user is manually inputting units, action event on certain buttons will allow user to input units
     * If user isn't manually inputting units, action event on all buttons will handle unit movement
     */
    public void unitActionListeners() {
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                buttons[i][j].addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent evt) {
                        if(inputUnitsManual) { // If user is still manually inputting units
                            for (int i = SIZE-2; i < SIZE; i++) { // Starts 2 grid spots from the bottom of the screen
                                for (int j = (SIZE/2)-3; j < (SIZE/2)+3; j++) { // Starts at the 6 middle spots at the bottom of the screen
                                    if (evt.getSource() == buttons[i][j]) {
                                        Object[] options = { "Infantry", "Archers", "Cavalry", "Cancel" };
                                        int result = 0;
                                        if (result != 3) {
                                            result = JOptionPane.showOptionDialog(null, "Select unit type: ", "Unit Placement",
                                                    JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, null, options, options[0]);
                                            switch (result) {
                                                case 0:
                                                    if (playerArmy.getMeleeCounter() > 0) { // If player still has melee units to place
                                                            if (stringPlayerUnits[i][j] != "Infantry" && stringPlayerUnits[i][j] != "Archers" &&
                                                                    stringPlayerUnits[i][j] != "Cavalry") { // If there is no player unit already in the given position
                                                            buttons[i][j].setIcon(meleeIconPlayer); // Set icon of new position to melee unit icon
                                                            stringPlayerUnits[i][j] = "Infantry"; // Change string value of position to Infantry
                                                            playerArmy.decrementMeleeCounter();
                                                            resetUnitsLeftToPlaceLabel(); 
                                                        }
                                                    }
                                                    else {
                                                        JOptionPane.showMessageDialog(null, "You have no melee units.", "Alert", JOptionPane.ERROR_MESSAGE);
                                                    }
                                                    break;

                                                case 1:
                                                    if (playerArmy.getRangedCounter() > 0) {
                                                        if (stringPlayerUnits[i][j] == null) {
                                                            buttons[i][j].setIcon(rangedIconPlayer);
                                                            stringPlayerUnits[i][j] = "Archers";
                                                            playerArmy.decrementRangedCounter();
                                                            resetUnitsLeftToPlaceLabel();
                                                        }
                                                    }
                                                    else {
                                                        JOptionPane.showMessageDialog(null, "You have no ranged units.", "Alert", JOptionPane.ERROR_MESSAGE);
                                                    }
                                                    break;

                                                case 2:
                                                    if (playerArmy.getCavalryCounter() > 0) {
                                                        if (stringPlayerUnits[i][j] == null) {
                                                            buttons[i][j].setIcon(cavalryIconPlayer);
                                                            stringPlayerUnits[i][j] = "Cavalry";
                                                            playerArmy.decrementCavalryCounter();
                                                            resetUnitsLeftToPlaceLabel();
                                                        }
                                                    }
                                                    else {
                                                        JOptionPane.showMessageDialog(null, "You have no cavalry units.", "Alert", JOptionPane.ERROR_MESSAGE);
                                                    }
                                                    break;

                                                default:
                                                    break;
                                                }
                                            }
                                        }
                                    }   
                                }
                            }
                        
                        else { // If user is not inputting units
                            for (int m = 0; m < SIZE; m++) {
                                for (int n = 0; n < SIZE; n++) {
                                    if (evt.getSource() == buttons[m][n]) {
                                        for (int i = 0; i < playerArmy.getUnits().size(); i++) {
                                            if (playerArmy.getUnits().get(i).getName() == stringPlayerUnits[m][n]) {
                                                selectedUnitDetails.setText("Health: " + playerArmy.getUnits().get(i).getHealth() 
                                                        + "\n Damage: " + playerArmy.getUnits().get(i).getDamage()
                                                        + "\n Speed: " + playerArmy.getUnits().get(i).getSpeed()
                                                );
                                                break;
                                            }
                                        }
                                        for (int i = 0; i < enemyArmy.getUnits().size(); i++) {
                                            if (enemyArmy.getUnits().get(i).getName() == stringEnemyUnits[m][n]) {
                                                selectedUnitDetails.setText("Health: " + enemyArmy.getUnits().get(i).getHealth() 
                                                        + "\n Damage: " + enemyArmy.getUnits().get(i).getDamage()
                                                        + "\n Speed: " + enemyArmy.getUnits().get(i).getSpeed()
                                                );
                                                break;
                                            }
                                        }
                                        if (canUnitsMove[m][n]) { // If Unit is ready to move
                                            if (lastSelectedUnit != null) {
                                                switch (lastSelectedUnit) { // Check what the last selected unit was
                                                    case "Infantry":
                                                        if (buttons[m][n].getBackground() == Color.BLUE && stringEnemyUnits[m][n] == null
                                                                && stringPlayerUnits[m][n] != stringPlayerUnits[lastGridi][lastGridj]) { 
                                                                // If position selected is blue (available for movement), and player unit position is different 
                                                                // from the last selected player unit position
                                                            buttons[m][n].setIcon(meleeIconPlayer);
                                                            buttons[lastGridi][lastGridj].setIcon(null);
                                                            stringPlayerUnits[lastGridi][lastGridj] = null;
                                                            stringPlayerUnits[m][n] = "Infantry";
                                                            canUnitsMove[m][n] = false;
                                                            canUnitsMove[lastGridi][lastGridj] = false;
                                                        } 

                                                        else if (buttons[m][n].getBackground() == Color.RED) {
                                                            int playerCount = 0;
                                                            int enemyCount = 0;
                                                            for (int i = 0; i < playerArmy.getUnits().size(); i++) {
                                                                if (playerArmy.getUnits().get(i).getName() == "Infantry") {
                                                                    playerCount = i;
                                                                }
                                                            }
                                                            for (int i = 0; i < enemyArmy.getUnits().size(); i++) {
                                                                if (enemyArmy.getUnits().get(i).getName() == stringEnemyUnits[m][n]) {
                                                                    enemyCount = i;

                                                                }
                                                            }
                                                            playerAttack(playerCount, enemyCount, m, n, lastGridi, lastGridj);
                                                            canUnitsMove[lastGridi][lastGridj] = false;
                                                        }
                                                        break;

                                                    case "Archers":
                                                        if (buttons[m][n].getBackground() == Color.BLUE && stringEnemyUnits[m][n] == null
                                                                && stringPlayerUnits[m][n] != stringPlayerUnits[lastGridi][lastGridj]) {
                                                            buttons[m][n].setIcon(rangedIconPlayer);
                                                            buttons[lastGridi][lastGridj].setIcon(null);
                                                            stringPlayerUnits[lastGridi][lastGridj] = null;
                                                            stringPlayerUnits[m][n] = "Archers";
                                                            canUnitsMove[m][n] = false;
                                                            canUnitsMove[lastGridi][lastGridj] = false;
                                                        } 

                                                        else if (buttons[m][n].getBackground() == Color.RED ) {
                                                            int playerCount = 0;
                                                            int enemyCount = 0;
                                                            for (int i = 0; i < playerArmy.getUnits().size(); i++) {
                                                                if (playerArmy.getUnits().get(i).getName() == "Archers") {
                                                                    playerCount = i;

                                                                }
                                                            }
                                                            for (int i = 0; i < enemyArmy.getUnits().size(); i++) {
                                                                if (enemyArmy.getUnits().get(i).getName() == stringEnemyUnits[m][n]) {
                                                                    enemyCount = i;                                                            
                                                                }
                                                            }
                                                            playerAttack(playerCount, enemyCount, m, n, lastGridi, lastGridj);
                                                            canUnitsMove[lastGridi][lastGridj] = false;
                                                        }
                                                        break;

                                                    case "Cavalry":
                                                        if (buttons[m][n].getBackground() == Color.BLUE && stringEnemyUnits[m][n] == null
                                                                && stringPlayerUnits[m][n] != stringPlayerUnits[lastGridi][lastGridj]) {
                                                            buttons[m][n].setIcon(cavalryIconPlayer);
                                                            buttons[lastGridi][lastGridj].setIcon(null);
                                                            stringPlayerUnits[lastGridi][lastGridj] = null;
                                                            stringPlayerUnits[m][n] = "Cavalry";
                                                            canUnitsMove[m][n] = false;
                                                            canUnitsMove[lastGridi][lastGridj] = false;
                                                        } 

                                                        else if (buttons[m][n].getBackground() == Color.RED) {
                                                            int playerCount = 0;
                                                            int enemyCount = 0;
                                                            int adjustx = 0;
                                                            int adjustz = 0;
                                                            for (int i = 0; i < playerArmy.getUnits().size(); i++) {
                                                                if (playerArmy.getUnits().get(i).getName() == "Cavalry") {
                                                                    playerCount = i;
                                                                }
                                                            }
                                                            for (int i = 0; i < enemyArmy.getUnits().size(); i++) {
                                                                if (enemyArmy.getUnits().get(i).getName() == stringEnemyUnits[m][n]) {
                                                                    enemyCount = i;

                                                                }
                                                            }
                                                            if (m - lastGridi < -1  || lastGridi - m > 1) {
                                                                adjustx = lastGridi - m - 1;
                                                            }
                                                            if (n - lastGridj < -1  || lastGridj - n > 1) {
                                                                adjustz = lastGridi - m - 1;
                                                            }
                                                            buttons[lastGridi][lastGridj].setIcon(null);
                                                            stringPlayerUnits[lastGridi][lastGridj] = null;
                                                            lastGridi -= adjustx;
                                                            lastGridj -= adjustz;
                                                            buttons[lastGridi][lastGridj].setIcon(cavalryIconPlayer);
                                                            stringPlayerUnits[lastGridi][lastGridj] = "Cavalry";
                                                            playerAttack(playerCount, enemyCount, m, n, lastGridi, lastGridj);
                                                            canUnitsMove[lastGridi][lastGridj] = false;
                                                        }
                                                        break;

                                                    default:
                                                        break;
                                                    }
                                                }
                                        }
                                        
                                        for (int x = 0; x < SIZE; x++) {
                                            for (int z = 0; z < SIZE; z++) {
                                                buttons[x][z].setBackground(null); // Removes background color
                                                buttons[x][z].setOpaque(false);
                                            }
                                        }
                                        
                                        if (null != stringPlayerUnits[m][n]) switch (stringPlayerUnits[m][n]) { // If a unit is clicked at start of turn
                                            case "Infantry":
                                                for (int k = m-1; k <= m+1; k++) {
                                                    for (int x = n-1; x<= n+1; x++) {
                                                        if (k < SIZE && x < SIZE && k > -1 && x > -1) {
                                                            if (stringPlayerUnits[k][x] == null && canUnitsMove[m][n] && stringEnemyUnits[k][x] == null) {
                                                                buttons[k][x].setBackground(Color.BLUE); // Adds background color that shows unit movement range
                                                                buttons[k][x].setOpaque(true);
                                                            }
                                                            if (stringPlayerUnits[k][x] == null && (buttons[k][x].getIcon() == meleeIconEnemy || 
                                                                    buttons[k][x].getIcon() == rangedIconEnemy || buttons[k][x].getIcon() == cavalryIconEnemy) && canUnitsMove[m][n]) {
                                                                buttons[k][x].setBackground(Color.RED); // Adds background color that shows enemy in range
                                                                buttons[k][x].setOpaque(true);
                                                            }
                                                            lastGridi = m;
                                                            lastGridj = n;
                                                        }
                                                    }
                                                }   
                                                lastSelectedUnit = "Infantry";
                                                break;
                                                
                                            case "Archers":
                                                for (int k = m-1; k <= m+1; k++) {
                                                    for (int x = n-1; x<= n+1; x++) {
                                                        if (k < SIZE && x < SIZE && k > -1 && x > -1) {
                                                            if (stringPlayerUnits[k][x] == null && canUnitsMove[m][n] && stringEnemyUnits[k][x] == null) {
                                                                buttons[k][x].setBackground(Color.BLUE);
                                                                buttons[k][x].setOpaque(true);
                                                            }
                                                            lastGridi = m;
                                                            lastGridj = n;
                                                        }
                                                    }
                                                } 
                                                for (int k = m-3; k <= m+3; k++) {
                                                    for (int x = n-3; x<= n+3; x++) {
                                                        if (k < SIZE && x < SIZE && k > -1 && x > -1) {
                                                            if (stringPlayerUnits[k][x] == null && (buttons[k][x].getIcon() == meleeIconEnemy || 
                                                                    buttons[k][x].getIcon() == rangedIconEnemy || buttons[k][x].getIcon() == cavalryIconEnemy) && canUnitsMove[m][n]) {
                                                                buttons[k][x].setBackground(Color.RED);
                                                                buttons[k][x].setOpaque(true);
                                                            }
                                                            //lastGridi = m;
                                                            //lastGridj = n;
                                                        }
                                                    }
                                                } 
                                                lastSelectedUnit = "Archers";
                                                break;
                                                
                                            case "Cavalry":
                                                for (int k = m-2; k <= m+2; k++) {
                                                    for (int x = n-2; x<= n+2; x++) {
                                                        if (k < SIZE && x < SIZE && k > -1 && x > -1) {
                                                            if (stringPlayerUnits[k][x] == null && canUnitsMove[m][n] && stringEnemyUnits[k][x] == null) {
                                                                buttons[k][x].setBackground(Color.BLUE);
                                                                buttons[k][x].setOpaque(true);
                                                            }
                                                            if (stringPlayerUnits[k][x] == null && (buttons[k][x].getIcon() == meleeIconEnemy || 
                                                                    buttons[k][x].getIcon() == rangedIconEnemy || buttons[k][x].getIcon() == cavalryIconEnemy) && canUnitsMove[m][n]) {
                                                                buttons[k][x].setBackground(Color.RED);
                                                                buttons[k][x].setOpaque(true);
                                                            }
                                                            lastGridi = m;
                                                            lastGridj = n;
                                                        }
                                                    }
                                                }
                                                lastSelectedUnit = "Cavalry";
                                                break;
                                                
                                            default:
                                                break;
                                        }
                                    }
                                }
                            }
                        }
                    }
                });
            }
        }
    }
    
    /**
     * Removes icons and resets battle grid
     */
    public void clearGridButtons() {
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                buttons[i][j].setIcon(null);
                
                // TO DO: Clear unit representation
            }
        }
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Game.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Game.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Game.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Game.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Game().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JSeparator bScreenSeparate1;
    private javax.swing.JButton backToCampaignButton;
    private javax.swing.JLabel backgroundImageGamePanel;
    private javax.swing.JLabel battleBackground;
    private javax.swing.JPanel battleBackgroundPanel;
    private javax.swing.JPanel battleGridPanel;
    private javax.swing.JLabel battleNameLabel;
    private javax.swing.JPanel battlePanel;
    private javax.swing.JLabel battlePreview1;
    private javax.swing.JLabel battlePreviewArchers;
    private javax.swing.JLabel battlePreviewCavalry;
    private javax.swing.JLabel battlePreviewInfantry;
    private javax.swing.JPanel battlePreviewPanel;
    private javax.swing.JLayeredPane battleScreenLayeredPane;
    private javax.swing.JButton confirmUnitFormationManualButton;
    private javax.swing.JLabel displayBattlePlayerName;
    private javax.swing.JButton endTurnButton;
    private javax.swing.JLabel enemyBattleEventLabel;
    private javax.swing.JLabel enemyBattleScreenCavalry;
    private javax.swing.JLabel enemyBattleScreenMelee;
    private javax.swing.JLabel enemyBattleScreenRanged;
    private javax.swing.JLabel enemyIcon;
    private javax.swing.JLabel enemyNameLabel;
    private javax.swing.JLabel enemyUnitInfo;
    private javax.swing.JButton enterBattleButton;
    private javax.swing.JButton exitButton;
    private javax.swing.JPanel gamePanel;
    private javax.swing.JLayeredPane gameTabLayeredPane;
    private javax.swing.JTabbedPane gameTabbedPane;
    private javax.swing.JLabel goldEarnedFromBattle;
    private javax.swing.JButton helpButton;
    private javax.swing.JLabel helpImage;
    private javax.swing.JPanel helpPanel;
    private javax.swing.JLabel helpPanelBackgroundImage;
    private javax.swing.JPanel mainMenuPanel;
    private javax.swing.JLabel mainPageBackgroundImage;
    private javax.swing.JLabel mainPageTitle;
    private javax.swing.JLabel map1;
    private javax.swing.JLabel mapPreview1;
    private javax.swing.JLabel playerBattleEventLabel;
    private javax.swing.JLabel playerExpDisplay;
    private javax.swing.JLabel playerGoldDisplay;
    private javax.swing.JLabel playerIcon;
    private javax.swing.JLabel playerLevelDisplay;
    private javax.swing.JLabel playerNameDisplay;
    private javax.swing.JLabel playerNumCavalryUnits;
    private javax.swing.JLabel playerNumMeleeUnits;
    private javax.swing.JLabel playerNumRangedUnits;
    private javax.swing.JLabel playerTurnNumberLabel;
    private javax.swing.JLabel playerUnitInfo;
    private javax.swing.JLabel previewPanelBackgroundImage;
    private javax.swing.JButton purchaseUnitsButton;
    private javax.swing.JButton resetManualPlacementButton;
    private javax.swing.JLabel selectedUnitDetails;
    private javax.swing.JLabel signatureLabel;
    private javax.swing.JLabel skillPointsDisplay;
    private javax.swing.JButton startButton;
    private javax.swing.JButton startCampaignButton;
    private javax.swing.JLabel survivingUnitsLabel;
    private javax.swing.JLabel terrainLabel1;
    private javax.swing.JLabel unitsLeftToPlaceLabel;
    private javax.swing.JPanel victoryScreen;
    private javax.swing.JLabel victoryScreenBackgroundImage;
    private javax.swing.JLabel victoryScreenMainAnnounce;
    // End of variables declaration//GEN-END:variables
    private JButton[][] buttons;
    private final int SIZE = 20;
    private ImageIcon meleeIconPlayer;
    private ImageIcon rangedIconPlayer;
    private ImageIcon cavalryIconPlayer;
    private ImageIcon meleeIconEnemy;
    private ImageIcon rangedIconEnemy;
    private ImageIcon cavalryIconEnemy;
    private ImageIcon mainbackground;
    private boolean inputUnitsManual;
    private ImageIcon icon;
    private Army playerArmy;
    private Army enemyArmy;
    private Player player;
    private Enemy enemy;
    private GameLevel level;
    private String[][] stringPlayerUnits, stringEnemyUnits;
    private String lastSelectedUnit;
    private boolean playerTurn;
    private int lastGridi, lastGridj;
    private boolean[][] canUnitsMove;
    private int enemyTurnNum;
    private int playerTurnNum;
    private int closestEnemyx, closestEnemyz;
    private int[] currentEnemyPosx, currentEnemyPosz;
    private int[] nextEnemyPosx, nextEnemyPosz;
    private int battleNum;
    List<Units> result;
    private int trackEnemyUnits, trackPlayerUnits;
    private int infcount;
}