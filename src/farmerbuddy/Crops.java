/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package farmerbuddy;

import java.awt.Color;

/**
 *
 * @author VIRAJ
 */
public class Crops extends javax.swing.JFrame {

    /**
     * Creates new form Crops
     */
    public Crops() {
        initComponents();
        displayWheatFirst();
    }
    
    public void displayWheatFirst(){
        txt_rice1.setVisible(false);
        txt_jowar.setVisible(false);
        txt_jowar1.setVisible(false);
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
        wheat = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        rice = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jowar = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        mung = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        txt_jowar = new javax.swing.JLabel();
        txt_rice1 = new javax.swing.JLabel();
        txt_jowar1 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(1264, 714));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(51, 102, 0));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        wheat.setBackground(new java.awt.Color(0, 153, 0));
        wheat.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.white, java.awt.Color.white, null, null));
        wheat.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                wheatMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                wheatMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                wheatMouseExited(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("MS Reference Sans Serif", 1, 14)); // NOI18N
        jLabel2.setText("Wheat");
        wheat.add(jLabel2);

        jPanel1.add(wheat, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 40, 190, 30));

        rice.setBackground(new java.awt.Color(51, 153, 0));
        rice.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.white, java.awt.Color.white, null, null));
        rice.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                riceMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                riceMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                riceMouseExited(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("MS Reference Sans Serif", 1, 14)); // NOI18N
        jLabel3.setText("Rice");
        rice.add(jLabel3);

        jPanel1.add(rice, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 70, 190, 30));

        jowar.setBackground(new java.awt.Color(51, 153, 0));
        jowar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.white, java.awt.Color.white, null, null));
        jowar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jowarMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jowarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jowarMouseExited(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("MS Reference Sans Serif", 1, 14)); // NOI18N
        jLabel4.setText("Jowar");
        jowar.add(jLabel4);

        jPanel1.add(jowar, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 100, 190, 30));

        mung.setBackground(new java.awt.Color(51, 153, 0));
        mung.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.white, java.awt.Color.white, null, null));
        mung.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                mungMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                mungMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                mungMouseExited(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("MS Reference Sans Serif", 1, 14)); // NOI18N
        jLabel5.setText("Mung");
        mung.add(jLabel5);

        jPanel1.add(mung, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 130, 190, 30));

        jButton1.setBackground(new java.awt.Color(51, 153, 0));
        jButton1.setFont(new java.awt.Font("MS Reference Sans Serif", 1, 18)); // NOI18N
        jButton1.setText("Back");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 630, 140, 30));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 30, 290, 810));

        jPanel4.setBackground(new java.awt.Color(0, 153, 0));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txt_jowar.setFont(new java.awt.Font("MS Reference Sans Serif", 0, 14)); // NOI18N
        txt_jowar.setText("<html><h1>Planting Your Wheat</h1> <b>1) Choosing a Suitable Location</b><br> bPick an area with full sun. </b>Wheat does best with a lot of sunlight, so try to pick an area that doesn't get much or any shade during the day. \nWatch your garden off and on throughout the day to find the best area for full sun. If you don't have a full-sun location, just pick the sunniest spot you can.<br>\n  <b>2) Carve out a large area of your garden for growing wheat. </b>Wheat has a relatively low yield in relation to the space it takes up in your garden. You need about 90 square yards (75 m2) to produce about 50 \npounds (23 kg) of wheat, the amount of wheat an average person consumes in a year. Put in other terms, you need an area that's at least 16.5 feet (5.0 m) by 16.5 feet (5.0 m) to produce enough wheat for 1 person for a year.\n However, you could always plant less than that and just replace some of the wheat you buy each year. Keep in mind that in colder areas, you'll likely have a lower yield, as little as 60 pounds (27 kg) per 1,100 square feet (100 m2).\nYou shouldn't expect high yields with your first crop. Growing wheat, like growing any vegetable, involves a learning curve.<br>\n<b>3) Test the soil pH level.</b>Purchase a pH testing kit from a local gardening store or online. Follow the instructions on the back of your kit to determine the pH level of your soil. You can also send samples to \na lab to test your soil, either from your local agriculture extension office at a university or from another soil-testing lab.Wheat doesn't like low pH levels, so if yours are below 7, amend the soil.\n Add about 2.5 pounds (1.1 kg) of limestone per 100 square feet (9.3 m2) of soil for each half a level you need to increase the pH.<br>\n<b>4) Turn the soil to get it ready for wheat.</b> Turning or digging the soil helps loosen it up, improving airflow and helping the plant grow. The simplest method to turn the soil is to take a spadeful from the ground, and flip it over in the same spot. Go across the whole bed this way. Only dig 2 to 3 inches (5.1 to 7.6 cm) down into the soil.You can also dig trenches, and flip the soil from one trench into the previous trench. If your plot is large, you can use a rototiller to turn your soil more easily.<br>\n <b>5) Till the soil with a fine rake.</b>Wheat does best in soil without large clumps. Go over your garden patch with a fine rake or tiller to break up any clumps and ready the soil for planting. Walk over the soil to help even it out, and then till it once more.<br>\n<h1>Planting Wheat</h1><b>1)Choose winter wheat up to growing zone 3.</b> You plant winter wheat in the fall, so it is a relatively sturdy plant. However, it won't survive very cold growing areas, such as any growing area at zone 3 or above.\nSome winter wheat varieties will survive down to −10 °F (−23 °C). Plant winter wheat seeds about 6 weeks before the first expected frost. While winter wheat does well in cooler climates, you do need to sow it when it's a bit warmer. Doing so will help the wheat germinate more readily.<br>\n<b>2)Try spring wheat if you live in a hardiness zone 3 or colder.</b>Because winter wheat won't survive where it's very cold, opt for spring wheat in those areas. In the United States, only the very northern states in the Midwest and East Coast fall into zone 3, such as most of Montana, Wisconsin, North Dakota, and Minnesota and parts of Michigan, New York, Vermont, and Maine, so those are the areas you should plant spring wheat instead. Plant spring wheat after the last frost in your area. Check weather sites for when the first and last frosts typically happen in your area.<br>\n<b>3)Toss the seeds on the ground with your hand.</b> You don't need to plant the seeds in evenly spaced holes with wheat. Instead, just scatter the seeds with your hand across the area you've prepared. Aim for about 1 seed per 1 square inch (6.5 cm2). You won't be able to get this exactly precise, and that's fine. If you're not confident you can spread the seed uniformly, try a broadcast seed spreader, which you can find in the lawn section at your local home improvement or gardening store. Adjust the hole size at the bottom for wheat, and then roll it over the garden area. It will disburse the seed evenly for you.<br>\n<b>Rake the ground lightly to cover up the seeds.</b>If you don't cover the seeds with a little soil, birds will eat them. Just run a fine rake over the area to move the soil on top of the seeds.<br>\n<b>Water the ground to start the germination process. </b>Use a hose with a gentle head to spray the ground with water until the area is fairly well saturated. The water will help the seeds begin the growth process.<br>\n<h1>Maintaining Your Wheat</h1> <b>1)Repel slugs and snails when the plants are young.</b> These bugs can ruin your crop when it's just coming up. Use slug repellents or spread diatomaceous earth on top of the soil to keep the slugs at bay.\nDiatomaceous earth is harmless to humans and animals. It basically drys out any crawling insect, keeping them away from your plants. You can find it online or in organic garden stores.<br>\n<b>2)Water the plants 1-2 times a week in very dry weather.</b> Typically, you won't need to water wheat, as it is fairly hardy. If you've gone more than a week without rain, give the wheat a good soaking.Fortunately, because you plant wheat so close together, you don't need to worry about weeds, as they have no room to grow.<br>\n<b>3)Apply a fungicide if you see drooping leaves and rusty patches.</b> If you see these signs, you may have a fungus such as rust or blotch. Apply a fungicide to help prevent the spread of the disease. Typically, you'll only apply these once when you see the disease popup, and spraying is a common method of application. However, it varies based on what kind of fungicide you choose, so always read the directions. Pick a fungicide meant to treat wheat, which may be listed under \"cereal\" or \"grain.\" Typically, the active ingredients you'll need will be one of the following: propiconazole, azoxystrobin, trifloxystrobin, Pyraclostrobin, or Tebuconazole.<br>\n<h1>Harvesting the Stalks</h1><b>1)Watch for the maturation of the grain.</b> Once your wheat develops stalk heads, check the growth of the grains. When the head starts turning all brown or mostly brown, you're near the end of the maturity cycle. The head of the stalk will also start to bend over when it's ready to be harvested.<br>\n<b>2)Cut stalks when the grains reach the \"hard dough\" stage. </b>Grain goes through 4 stages. It has a soft, milky stage (like corn on the cob), a soft dough stage, a hard dough stage, and a flint stage. In the hard dough stage, you should be able to dent the grain with a fingernail, but it shouldn't squish. Typically, the grains will reach this stage about 30 days after the heads flower.<br>\n<b>3)Harvest the stalks with a scythe or pruning shears. </b>If you don't have a lot of wheat, simply cut off about 10 inches (25 cm) of stalk near the grain head. If you have a scythe or other large harvesting knife, grasp the stalks in the middle, then cut them at the bottom of the plant near the soil.<br>\n<b>4)Let the grain cure in bundles.</b>Make piles of the stalks as you cut them. When you have a large pile that you can still wrap your arms around, tie up the stalks in a large bundle with string or even just a green stalk of wheat. Lean the bundles against each other to help them stand up, and let them sit in the sun for 3 or 4 days, until the grain hardens to the flint stage. Some rain won't hurt the grain. If you have a downpour or rain over a couple of days, cover the wheat with a tarp. You can harvest the grain in the flint stage instead of letting it dry after you cut the stalks. However, you'll get a better-tasting and better-grinding wheat if you let it dry to the flint stage after you cut it.\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
        jPanel4.add(txt_jowar, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 990, -1));

        txt_rice1.setFont(new java.awt.Font("MS Reference Sans Serif", 0, 14)); // NOI18N
        txt_rice1.setText("<html><h1>Planting Your Rice</h1><b>1)There are six basic types of rice you can choose for your farming</b><br> <b>Long-grain:</b>This type of rice produces grains that are light and fluffy. It tends to be a bit drier than other varieties.<br> <b>Medium-grain:</b> This type is moist, tender, slightly sticky, and a little creamy when cooked. It has the same texture as long-grain. <br>     <b>Short-grain:</b> When cooked, short-grain rice becomes soft and sticky. It's also a little more sweet – this is the rice to use with sushi.<br>      <b>Sweet: </b>This rice is sometimes called sticky rice, and is gooey when cooked. It’s often used for frozen products. <br>    <b>Aromatic: </b>This type of rice has more flavor and fragrance than other varieties. This category includes Basmati, Jasmine, Red, and Black japonica.<br>      <b>Arborio: </b>This type becomes creamy with a chewy center after cooking. It’s used primarily for risotto and other Italian dishes.</ul> <br> <b>2)Choose your planting location</b><br>Make sure the soil in the area you're planting consists of slightly acidic clay for the best results. You may also plant your rice seeds in plastic  buckets with the same type of soil. Wherever you plant, make sure you have a reliable water source and a way to drain that water when you need to harvest.     Pick a location that receives full sunlight, as rice grows best with bright light and warm temperatures of at least 70° Fahrenheit (approximately 21° Celsius). Consider the season – your area needs to allow for 3 to 6 months of plant and flower growth. Rice needs a long, warm growing season, so a climate like the southern United States is best.  If you don't have long periods of warmth, it may be best growing your rice inside.</ul> <br> <b>3)Gather at least 1 to 2 ounces (28.5 to 56.5 g) of rice seeds to sow.</b>  Soak the seeds in water to prep them for planting. Allow them to soak for at least 12 hours but not longer than 36 hours. Remove the seeds from the water afterward.     While your seeds are soaking, plan out where and how you want to plant them. Most prefer to plant the seeds in rows to make it easier to water and weed. Consider building trenches and blocking the ends  so the water stays contained and dammed (berms can be used as well). That being said, the area doesn't need to stay flooded per se, it just needs to stay wet.<br>  <b>4)Plant the rice seeds throughout the soil, during the fall or spring season. </b>Get rid of the weeds, till the beds, and level the soil. If you are using buckets, fill them with at least 6 inches (15 cm) of moist soil. Then add the rice seeds.     Keep in mind that the area needs to be flooded with water. It's much easier to flood a few smaller spaces than one larger one. If you're planting outside, using several seed beds will be easier to manage and maintain.     If you plant in the fall, be sure to de-weed come spring. The rice seeds need all the nutrients and space they can get.<br> <h2>Caring for Your Seedlings</h2>  <b>1)Fill the buckets or the garden space with at least 2 inches (5.1 cm) of water.</b>  However, this is just an old school recommendation. Plenty of people say that keeping the soil consistently moist is plenty – it doesn't necessarily need to be flooded. This stage is up to you – just make sure it's wet.     Add compost or mulch to the soil, slightly covering the rice grains. This will automatically tamp the seeds down into the soil. Organic compost holds moisture, so this is a good plan – especially in drier climes.<br> <b>2)Observe the water levels of the planting area, keeping the soil constantly wet.</b>  If you'd like, maintain 2 inches (5.1 cm) of water for the rice to grow. At least make sure the soil is consistently wet, if not flooded. Expect to see shoots from the grains grow after about 1 week.     If your plants are in buckets, you may want to consider moving them at night (when it gets cooler) to a warmer spot. Rice thrive in warmth, and if the temperature dips, you'll likely see stunted growth.     To emphasize that flooding policies differentiate from person to person, commercial rice-producing agencies sometimes flood up to eight inches. You may wish to up the water as your plants climb to the 7 inch mark.  What you practice is up to you.<br> <b>3)Thin, or space out, the rice seeds to prevent crowding.</b>For best results, thin out the seedlings no more than 4 inches (10.2 cm) apart in rows that range between 9 to 12 inches (22.9 to 30.5 cm) apart. Allow the seeds to grow up to 7 inches (17.8 cm) tall, which takes on average of about one month. Some people choose to start their plants off in a nursery bed since movement is always a part of the process anyway. If you follow this practice, transplant them when they reach 5-7 inches in height.  They should be planted about a foot apart into a muddy bed.<br>  <b>4)Wait for the rice grains to mature.</b>  This will take approximately 3 or 4 months; during this time, they can reach up to 17 inches tall. Let the water dry out or drain any excess water before removing the rice for harvesting. Over the course of the next two weeks, they'll turn green to gold – that's when you know they're ready.     If you're farming your rice, you may wish to drain the soil when the plants are about 15 inches (37.5 cm) tall, flood, and then drain again. After that, continue as above, allowing the rice to dry and turn golden. </html>");
        jPanel4.add(txt_rice1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 1110, 780));

        txt_jowar1.setFont(new java.awt.Font("MS Reference Sans Serif", 0, 14)); // NOI18N
        txt_jowar1.setText("<html><h1>Planting Your Jowar</h1> <b>1. Climate/site selection:</b><br> Basically, jowar or sorghum is a tropical crop. Sorghum thrives well at temperatures between 25°C and 32°C but below 16°C is not good for the crop. Jowar crop requires rainfall of about 40 cm annually.  Jowar is an extreme drought-tolerant crop and recommended for dry regions. Too many moist and prolonged dry conditions are not suitable for sorghum cultivation.<br> <b>2. Soil preparation</b><br> Sorghum crop adapts the wide range of soils but grows well in sandy loam soils having good drainage. Soil pH range of 6 to 7.5 is ideal for its cultivation and better growth.  The main field should be plowed and leveled to a fine tilth for weeds-free sowing.<br> <b>3. Land preparation:</b><br> One should avoid rocky field and 1­-2 ploughing followed by 2 crosswise harrowings are required to prepare a good seedbed.<br> <b>4. Seed rate and sowing method</b><br> A seed rate of 35­-40 kg per hectare is well enough, and sowing should be carried out by drilling @ row­to­row distance of 25 cm. Seed broadcasting should be avoided. The seed should not be sowed more than 2–3 cm in depth.<br> <b>5. Fertilizer Application:</b><br> For 1 Hectare of land; FYM (Farm Yard Manure) – 10­-15 tone. At the time of sowing, basal application of;     N – 60 Kg.      P2O5 – 40 kg.      K2O – 40 kg. Apply 35 kg N/ha top dressing 1 month after sowing. 60-­65 kg N/ha should be applied in low rainfall and rainfed areas at sowing time. In Sulphur deficient soils, 45­-60 kg S/ha should be added.<br> <b>6. Irrigation:</b><br> If the crop is sown in monsoon time (July), it may require l to 3 irrigations depending upon rains. For summer crops, 6 to 7 irrigations may be carried out due to high temperature. Rabi season crops need about 4 to 5 irrigations.  Critical stages of irrigation are­ (For Rabi season)     30­-45 days (seedling elongation stage).     60­-65 days (reproductive or heading stages).     70-­75 days (panicle emergence).     90­-95 days (grain development stage). However, suppose only one irrigation is available. In that case, this should be applied just before booting (40-­50 days) from flowering at 10 days interval or Dithane M 45 – 0.2 % + Bavistin 0.2 % twice at 10 days  interval after commencement of flowering.<br> <b>7. Weed control </B><br> To control the weeds in the Sorghum crop, weeder cum mulcher should give 1 hoeing @ 3 weeks crop stage. Should use pre­emergence application of atrazine @ 0.50 kg/ha in 650 litres of water to control the weeds effectively.<br> <b>8. Diseases and Insects </b><br> Sorghum crops are prone to many insects and diseases. Insects/pests in sorghum are stem borer, shootfly, & sorghum midge.     Use spray of carbofuran/malathion @ 125 ml/ha, to control sorghum midge     Use a spray of endosulfan @ 0.075. Diseases in Sorghum are Sooty stripe, anthracnose and zonate leaf spot.     Spray carbendazim @ 5 grams /litre water to control anthracnose disease in early stages.     Summer sown crop is very prone to shoot fly. Therefore, this carbofuran 3G @ 3 to 4 kg/ha should be applied to control shoot fly at sowing time.     The crop should be sown during the July season to control or avoid stem borers.     Using a spray of endosulfan @ 0.05%, 2 to 3 times at 10 to 14 days interval is also effective.<br> <b>9. Harvesting (how long does sorghum take to grow?)</b><br>  The crop will be ready in single cut varieties for harvesting @ 65 to 75 days after sowing (50%, flowering stage).  In multi-cut varieties, the first cut should be done @ 45­-50 days, and subsequent cuts should be carried at 1-month intervals.<br> <b>10.Yield</b><br>     Good farm management practices and a good variety of Sorghum/ Jowar can yield up to 1000 kg/ha.</html> ");
        jPanel4.add(txt_jowar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 990, -1));

        getContentPane().add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 30, 1130, 810));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/farmerbuddy/iamges/crophm.jpg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1620, 960));

        setSize(new java.awt.Dimension(1535, 903));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void wheatMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_wheatMouseEntered
         Color cl=new Color(0,204,0);
        wheat.setBackground(cl);
    }//GEN-LAST:event_wheatMouseEntered

    private void wheatMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_wheatMouseExited
        Color cl=new Color(51,153,0);
        wheat.setBackground(cl);
    }//GEN-LAST:event_wheatMouseExited

    private void riceMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_riceMouseEntered
         Color cl=new Color(0,204,0);
        rice.setBackground(cl);
    }//GEN-LAST:event_riceMouseEntered

    private void riceMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_riceMouseExited
        Color cl=new Color(51,153,0);
        rice.setBackground(cl);
    }//GEN-LAST:event_riceMouseExited

    private void jowarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jowarMouseClicked
        txt_rice1.setVisible(false);
        txt_jowar.setVisible(true);
        txt_jowar1.setVisible(false);
        
    }//GEN-LAST:event_jowarMouseClicked

    private void jowarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jowarMouseEntered
        Color cl=new Color(0,204,0);
        jowar.setBackground(cl);
    }//GEN-LAST:event_jowarMouseEntered

    private void jowarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jowarMouseExited
        Color cl=new Color(51,153,0);
        jowar.setBackground(cl);
    }//GEN-LAST:event_jowarMouseExited

    private void mungMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mungMouseEntered
        Color cl=new Color(0,204,0);
        mung.setBackground(cl);
    }//GEN-LAST:event_mungMouseEntered

    private void mungMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mungMouseExited
         Color cl=new Color(51,153,0);
        mung.setBackground(cl);
    }//GEN-LAST:event_mungMouseExited

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        Home Home=new Home();
        Home.show();
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void riceMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_riceMouseClicked
        txt_rice1.setVisible(true);
        txt_jowar.setVisible(false);
        txt_jowar1.setVisible(false);
    }//GEN-LAST:event_riceMouseClicked

    private void wheatMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_wheatMouseClicked
        txt_jowar.setVisible(false);
        txt_rice1.setVisible(false);
        txt_jowar1.setVisible(true);
    }//GEN-LAST:event_wheatMouseClicked

    private void mungMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mungMouseClicked
        txt_jowar.setVisible(false);
        txt_rice1.setVisible(false);
        txt_jowar1.setVisible(false);
    }//GEN-LAST:event_mungMouseClicked

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
            java.util.logging.Logger.getLogger(Crops.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Crops.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Crops.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Crops.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Crops().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jowar;
    private javax.swing.JPanel mung;
    private javax.swing.JPanel rice;
    private javax.swing.JLabel txt_jowar;
    private javax.swing.JLabel txt_jowar1;
    private javax.swing.JLabel txt_rice1;
    private javax.swing.JPanel wheat;
    // End of variables declaration//GEN-END:variables
}
