package farmerbuddy;


import java.awt.Color;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author VIRAJ
 */
public class Fruit extends javax.swing.JFrame {

    /**
     * Creates new form Fruit
     */
    public Fruit() {
        initComponents();
        displayFruitFirst();
    }
     public void displayFruitFirst(){
        txt_guava.setVisible(false);
        txt_pineaaple.setVisible(false);
        txt_fig.setVisible(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        Fig = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        pineapple = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        guava = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        banana = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        txt_guava = new javax.swing.JLabel();
        txt_fig = new javax.swing.JLabel();
        txt_pineaaple = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 102, 51));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Fig.setBackground(new java.awt.Color(255, 153, 51));
        Fig.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.white, java.awt.Color.white, null, null));
        Fig.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                FigMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                FigMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                FigMouseExited(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("MS Reference Sans Serif", 1, 14)); // NOI18N
        jLabel2.setText("Fig");
        Fig.add(jLabel2);

        jPanel1.add(Fig, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 40, 190, 30));

        pineapple.setBackground(new java.awt.Color(255, 153, 51));
        pineapple.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.white, java.awt.Color.white, null, null));
        pineapple.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pineappleMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                pineappleMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                pineappleMouseExited(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("MS Reference Sans Serif", 1, 14)); // NOI18N
        jLabel3.setText("Pineapple");
        pineapple.add(jLabel3);

        jPanel1.add(pineapple, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 70, 190, 30));

        guava.setBackground(new java.awt.Color(255, 153, 0));
        guava.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.white, java.awt.Color.white, null, null));
        guava.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                guavaMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                guavaMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                guavaMouseExited(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("MS Reference Sans Serif", 1, 14)); // NOI18N
        jLabel4.setText("guava");
        guava.add(jLabel4);

        jPanel1.add(guava, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 100, 190, 30));

        banana.setBackground(new java.awt.Color(255, 153, 0));
        banana.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.white, java.awt.Color.white, null, null));
        banana.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                bananaMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                bananaMouseExited(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("MS Reference Sans Serif", 1, 14)); // NOI18N
        jLabel5.setText("Banana");
        banana.add(jLabel5);

        jPanel1.add(banana, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 130, 190, 30));

        jButton1.setBackground(new java.awt.Color(255, 153, 0));
        jButton1.setFont(new java.awt.Font("MS Reference Sans Serif", 1, 18)); // NOI18N
        jButton1.setText("Back");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 630, 140, 30));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 20, 290, 790));

        jPanel4.setBackground(new java.awt.Color(255, 153, 51));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txt_guava.setFont(new java.awt.Font("MS Reference Sans Serif", 0, 14)); // NOI18N
        txt_guava.setText("<html><h1>Planting guava </h1><b>1)Flowering and fruiting in guava :</b><br>\nIn guava, flowering occurs on current season's growth, even though the crop is available around the year. For the purpose of commercial production, three distinct flowering seasons were identified in northern and southern parts of India.\n\nIn north India, flowering occurs twice in a year i.e. during February and June. The February or spring flowering is known as Ambe-bahar. Fruiting can be obtained from this crop during June to September (i.e during a rainy season). The second or monsoon flowering (flowering during June) is called as Mrig-bahar and its crop is available during November to March.\n\nIn southern and western parts of India, third flowering occurs in October (Hasta- bahar) and yields can be obtained from this crop during the spring season.<br>\n<b>2)Crop regulation in guava:</b><br>\nCrop regulation is practised in guava to encourage particular season crop in order to get quality fruit with high commercial value. For example, in northern India, winter crop is preferred over rainy season crop because fruits produced in the rainy season are inferior in quality and fetches lower market price compared to the other. Likewise, in the Deccan region, only two desirable crops in a year are preferred and the third one is escaped.\n\nThe key principle of crop regulation is to force a tree for its rest and to produce abundant blooms and fruits during particular seasons.\n\nCrop during the unwanted season is escaped by practising deblossoming; this can be achieved by induction of stress or using thinning and pruning techniques.<br>\na) Induction of water stress: induction of water stress by withholding irrigation after harvesting of winter crop in northern plains, results in the shedding of flowers and the trees goes to rest. June flowering is \nencouraged to get winter crop; for that, the basin of the tree is dug up, manured and irrigated in June. After about 20-25 days of fertigation, the tree put forth profuse flowering in July and fruiting is obtained in winter. \nWater stress can also be induced by practices like root exposure and root pruning.<br>\n b)Use of de-blossoming chemicals: some of the chemical compound or plant growth regulators have been very useful in thinning a crop in guava. Post-bloom application of NAA at 80- 100 ppm has been useful in reducing fruit set. \nThis treatment can reduce more than 80 % of rainy season crop and increase flowering of the following winter crop. NAD at 50 ppm and 2, 4-D at 30 ppm are also effective for de-blossoming of summer flowers<br>\n\n\n\n\n");
        jPanel4.add(txt_guava, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 990, -1));

        txt_fig.setFont(new java.awt.Font("MS Reference Sans Serif", 0, 14)); // NOI18N
        txt_fig.setText("<html><h1>Planting Fig </h1><b>1) Climate :</b><br>\nFig being a deciduous and sub tropical tree, prefers areas having arid or semiarid environment, high summer temperature, plenty of sunshine and moderate water. Although the plants can survive temperature as high 450C, the fruit quality deteriorates beyond 390C. Though the mature tree can withstand low temperature up to 40C, it makes good growth when the temperature is above 15 - 210C . The size, shape, colour of the skin and pulp quality are markedly affected by climate. But quality figs are produced in the region with dry climate especially at the time of fruit development and maturity. High humidity coupled with low temperature usually results in fruit splitting and low fruit quality.<br>\n<b>2) Soil :</b><br>\nFig is one of the most salt and drought tolerant crops. It can tolerate a fairly high level of sulphate or chloride salt. Medium to heavy, calcareous, well drained, deep (about 1 m ) soil having pH of 7-8 is ideally suitable cultivation of fig.\n<br>\n<b>3) Propagation :</b><br>\nRooting of hard wood cuttings is the common method of propoagtion in fig. Rooting was the best in cuttings from 3 year old wood with 30 - 40 cm length and 1.5 cm dia. Cuttings from the base of the shoot and lower part of crown have to be used as they root better. Cuttings are taken during January - February at the time of pruning in North India whereas, the cuttings are taken during rainy season in South India. Fig can also be propagated by air layering, shield or patch budding and side grafting. Focus glomeration rootstock offers resistance to root knot nematode.<br>\n<b>4) Planting :</b><br>\nFig is planted in square system of planting at a spacing of 5 x 5 m accommodating about 160 plants per acre.  Pits of 0.6 cu.m are dug for planting the cuttings.  Planting season varies from place to place viz., South India – August – September, Western India – June – July, North India – January – February.<br>\n<b>5) Irrigation :</b><br>Fig can sustain heat and drought. However, for commercial production timely irrigation is necessary. Flood irrigation at an interval of 10-12 days during summer is ideal. However, if drip irrigation is adopted 15-20 litres of water/day/plant needs to be provided.\n\nFrequent irrigation leading to excess soil moisture will cause splitting of fruits. It should be borne in mind that during fruit ripening, the plants should not be given any irrigation because it will result in insipid fruits viz., fruits with bland taste\n<br>\n<b>6) Training and Pruning :</b><br>To keep the trees more productive and to facilitate inter cultivation operations, the fig trees are trained to a desired height and shape. The fig tree bears tow crops in a year, the first crop on the wood of previous season and the second crop on new wood of current season. Pruning is necessary to induce growth of flower bearing wood. The time and amount of pruning are adjusted according to the growth habit and bearing capacity of the tree. Notchin stimulates production of laterals on vigorous upright b ranches.\n\nFig trees are trained initially to a single stem and allowed to grow to a height of about 1m and then it is topped. Light pruning is practiced in Poona Fig after the monsoon is over i.e. in October.\n<br>\n<b>7) Plant Protection :</b><br>The major pests of fig are stem borers, leaf defoliators and fig flies. The fig fly can be controlled by Demecron (0.05% spray). The stem borer is controlled with the application of Phorate granules with Petrol or Kerosene. Important disease of fig is rust which is caused by Cerotelium fici. It can be controlled by dusting with sulphur or spraying with Blitox or Dithane M-45 and Dithane Z-78.<br>\n<b>8) Harvesting and Yield :</b><br>Though fig starts bearing fruits from the second year, commercial harvesting is done from the third year. The yield increases with increase in canopy size of the tree and stabilizes during eighth year. The economic life of the plant is about 35 years. The harvesting season starts in February - March and is over by May - June. The fruits are harvested in 2-3 day intervals manually. The fruits should be picked when they are soft and wilt at the neck. If the fruits are picked before proper maturity, milky latex exudes.\nFresh figs are highly perishable. Slightly immature fruits are to be harvested for transporting to distant markets. Ripe fruits are picked either form the tree by twisting the neck at the stem end or by cutting it or gathered after they drop. Yield ranges from 180 to 360 fruits per tree.\nFully ripe fresh figs can be kept only for about a week at 0 o C with a 90 per cent relative humidity. \n<br>\n\n");
        jPanel4.add(txt_fig, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, -30, 1070, 830));

        txt_pineaaple.setFont(new java.awt.Font("MS Reference Sans Serif", 0, 14)); // NOI18N
        txt_pineaaple.setText("<html><h1>Planting Pineapple </h1><b>1) Season :</b><br>\nThe planting season is May-June. Planting should be avoided during the periods of heavy rains.<br>\n<b>2) Preparation of the land :</b><br>\nPrepare the land for planting by ploughing or digging followed by levelling. Depending on the nature of land, prepare trenches of convenient length and about 90 cm width and 15-30 cm depth. The trenches are to be aligned at a distance of 165 cm from centre to centre.<br>\n<b>3) Selection and treatment of suckers :</b><br>\nSelect healthy suckers of uniform size weighing 500-1000 g. Keep suckers in open space under shade in a single layer for about 7 days for drying. Strip off a few lower old dried leaves. Allow the suckers to dry and cure for another \n7 days. Dip the cured suckers in 1 percent Bordeaux mixture at the time of planting.<br>\n<b>4) Planting : </b><br>Rake the soil and plant the suckers in double rows at spacing of 70 cm between rows and 30 cm between plants. Limit the depth of planting to 7.5 to 10 cm. Adopt triangular method of planting in each trench \nso that the plants in two adjacent rows are not opposite to each other (plant population 40400 / ha).<br>\n<b>5) Manuring : </b>\n    Apply compost / cattle manure at 25 t per ha as basal dressing.<br>\n    Apply fertilizers at the following dosage:\n    Dose N:P2O5:K2O : Per plant per year (g) 8:4:8 ; Per hectare per year (kg) : 320:160:320<br>\n    Apply full dose of P2O5 at the time of planting. Nitrogen and K2O may be applied in four splits, during May-June (at planting), August-September, November and May-June (2nd year)<br>\n    Note: In places where rains are scanty during November, N and K2O may be applied in three equal splits - two doses in 1st year (May-June and August-September) and the third in May-June of the second year. After application \nof fertilizers, cover with soil by scraping the sides of trenches.<br>\n<b>6) Irrigation :</b>During summer months, pineapple should be irrigated wherever possible at 0.6 IW/ CPE ratio (50 mm depth of water). It requires five or six irrigations during dry months at an interval of 22 days. \nMulching the crop with dry leaves at 6 t per ha will help to conserve moisture.</b>\n<b>7) Weed Control : </b> For effective and economic weed control, use weedicides. Pre-emergent spray with diuron 3 kg or bromacil 2.5 kg in 600 litres of water per hectare completely controls all types of weeds in pineapple plantation. If there is subsequent growth of weeds, herbicide application may be repeated at half the above dose. Spraying should be done when there is adequate moisture in the soil. Avoid periods of heavy rainfall for spraying.<br>\n<b> 8) Induction of flowering :</b><br>For inducement of uniform flowering, apply 25 ppm ethephon (2-chloro ethyl phosphonic acid) in aqueous solution containing 2 per cent urea and 0.04 per cent calcium carbonate as follows:\n\nThe mixture (50 ml/plant) is to be applied pouring into the heart of 16-17 month old plants (39-42 leaf stage) during dry weather. For treating 1000 plants, 50 litres of the solution would be required. (The ingredients for preparing 50 litres of the aqueous solution are ethephon 1.25 ml, urea 1 kg and calcium carbonate 20 g, made up to 50 litres with water. The dosage has to be fixed depending on the availability of commercial formulation and the active ingredient contents) . Flowering will commence from 40th day after application and complete by 70th day.<br>\n<b>9) Plant protection :</b>No serious pests or diseases are noticed in the crop except for light incidence of leaf spot disease and mealy bugs. For control of leaf spot, spray any one of the following fungicides when symptoms of the disease\n are noticed:<br>\n    Bordeaux mixture 1 per cent, 225 litre/ha<br>\n    Zineb 1 kg in 225 litre water/ha<br>\n    Mancozeb 1 kg in 225 litre water/ha<br>\nFor control of mealy bugs, apply quinalphos at 0.05 per cent. Destroy grasses and other monocot weeds, which serve as alternate hosts for the pest.<br></html>\n\n\n\n");
        jPanel4.add(txt_pineaaple, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 1070, -1));

        getContentPane().add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 20, 1080, 790));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/farmerbuddy/iamges/Fruit.jpg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1570, 860));

        setSize(new java.awt.Dimension(1535, 903));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void FigMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_FigMouseEntered
        Color cl=new Color(255,51,51);
        Fig.setBackground(cl);
    }//GEN-LAST:event_FigMouseEntered

    private void FigMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_FigMouseExited
        Color cl=new Color(255,153,51);
        Fig.setBackground(cl);
    }//GEN-LAST:event_FigMouseExited

    private void pineappleMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pineappleMouseEntered
        Color cl=new Color(255,51,51);
        pineapple.setBackground(cl);
    }//GEN-LAST:event_pineappleMouseEntered

    private void pineappleMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pineappleMouseExited
        Color cl=new Color(255,153,51);
        pineapple.setBackground(cl);
    }//GEN-LAST:event_pineappleMouseExited

    private void guavaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_guavaMouseClicked
        txt_guava.setVisible(true);
        txt_pineaaple.setVisible(false);
        txt_fig.setVisible(false);
    }//GEN-LAST:event_guavaMouseClicked

    private void guavaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_guavaMouseEntered
        Color cl=new Color(255,51,51);
        guava.setBackground(cl);
    }//GEN-LAST:event_guavaMouseEntered

    private void guavaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_guavaMouseExited
        Color cl=new Color(255,153,51);
        guava.setBackground(cl);
    }//GEN-LAST:event_guavaMouseExited

    private void bananaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bananaMouseEntered
        Color cl=new Color(255,51,51);
        banana.setBackground(cl);
    }//GEN-LAST:event_bananaMouseEntered

    private void bananaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bananaMouseExited
        Color cl=new Color(255,153,51);
        banana.setBackground(cl);
    }//GEN-LAST:event_bananaMouseExited

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        Home Home=new Home();
        Home.show();
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void FigMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_FigMouseClicked
        // TODO add your handling code here:
        txt_guava.setVisible(false);
        txt_pineaaple.setVisible(false);
        txt_fig.setVisible(true);
    }//GEN-LAST:event_FigMouseClicked

    private void pineappleMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pineappleMouseClicked
        // TODO add your handling code here:
        txt_guava.setVisible(false);
        txt_pineaaple.setVisible(true);
        txt_fig.setVisible(false);
    }//GEN-LAST:event_pineappleMouseClicked

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
            java.util.logging.Logger.getLogger(Fruit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Fruit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Fruit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Fruit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Fruit().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Fig;
    private javax.swing.JPanel banana;
    private javax.swing.JPanel guava;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel pineapple;
    private javax.swing.JLabel txt_fig;
    private javax.swing.JLabel txt_guava;
    private javax.swing.JLabel txt_pineaaple;
    // End of variables declaration//GEN-END:variables
}