
package milantis;

import java.util.Random;
import javax.swing.ImageIcon;

public class Level1 extends javax.swing.JFrame {

    Random rn = new Random();
    boolean Win = false;
    String imageName="Images/";
    String[] image_name = {"", "1.png", "2.png", "3.png", "4.png", "5.png", "6.png", "7.png", "8.png", ""};
     int count1=0, count2=6, count3=5, count4=8, count5=7, count6=2, count7=3, count8=4, count9=1, Score=0;
    //int count1=1, count2=2, count3=3, count4=4, count5=5, count6=6, count7=7, count8=0, count9=8, Score=0, wins=0;
    public Level1() {
        initComponents();
        //    setDefault();
        pic_1.setIcon(showImage(image_name[count1]));
        pic_2.setIcon(showImage(image_name[count2]));
        pic_3.setIcon(showImage(image_name[count3]));
        pic_4.setIcon(showImage(image_name[count4]));
        pic_5.setIcon(showImage(image_name[count5]));
        pic_6.setIcon(showImage(image_name[count6]));
        pic_7.setIcon(showImage(image_name[count7]));
        pic_8.setIcon(showImage(image_name[count8]));
        pic_9.setIcon(showImage(image_name[count9]));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        score = new javax.swing.JLabel();
        win = new javax.swing.JLabel();
        Background_image = new javax.swing.JLabel();
        pic_3 = new javax.swing.JLabel();
        pic_1 = new javax.swing.JLabel();
        pic_2 = new javax.swing.JLabel();
        pic_4 = new javax.swing.JLabel();
        pic_5 = new javax.swing.JLabel();
        pic_6 = new javax.swing.JLabel();
        pic_7 = new javax.swing.JLabel();
        pic_8 = new javax.swing.JLabel();
        pic_9 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(477, 550));
        setResizable(false);

        jPanel2.setBackground(new java.awt.Color(153, 255, 153));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        score.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        score.setForeground(new java.awt.Color(0, 255, 204));
        score.setText(" ");
        jPanel2.add(score, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 470, 160, 50));

        win.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        win.setForeground(new java.awt.Color(255, 255, 102));
        win.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        win.setText("  ");
        jPanel2.add(win, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 280, 450, 100));

        Background_image.setText(" ");
        jPanel2.add(Background_image, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -6, 480, 490));

        pic_3.setText(" ");
        pic_3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        pic_3.setPreferredSize(new java.awt.Dimension(160, 160));
        pic_3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pic_3MouseClicked(evt);
            }
        });
        jPanel2.add(pic_3, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 0, -1, 160));

        pic_1.setText(" ");
        pic_1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        pic_1.setPreferredSize(new java.awt.Dimension(160, 160));
        pic_1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pic_1MouseClicked(evt);
            }
        });
        jPanel2.add(pic_1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 160));

        pic_2.setIcon(new javax.swing.ImageIcon("C:\\Users\\AL KAZI AKASH\\Desktop\\Milantis Game\\Images\\2.png")); // NOI18N
        pic_2.setText(" ");
        pic_2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        pic_2.setPreferredSize(new java.awt.Dimension(160, 160));
        pic_2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pic_2MouseClicked(evt);
            }
        });
        jPanel2.add(pic_2, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 0, -1, -1));

        pic_4.setIcon(new javax.swing.ImageIcon("C:\\Users\\AL KAZI AKASH\\Desktop\\Milantis Game\\Images\\4.png")); // NOI18N
        pic_4.setText(" ");
        pic_4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        pic_4.setPreferredSize(new java.awt.Dimension(160, 160));
        pic_4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pic_4MouseClicked(evt);
            }
        });
        jPanel2.add(pic_4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 160, -1, 160));

        pic_5.setText(" ");
        pic_5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        pic_5.setPreferredSize(new java.awt.Dimension(160, 160));
        pic_5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pic_5MouseClicked(evt);
            }
        });
        jPanel2.add(pic_5, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 160, -1, -1));

        pic_6.setIcon(new javax.swing.ImageIcon("C:\\Users\\AL KAZI AKASH\\Desktop\\Milantis Game\\Images\\66.png")); // NOI18N
        pic_6.setText(" ");
        pic_6.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        pic_6.setPreferredSize(new java.awt.Dimension(160, 160));
        pic_6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pic_6MouseClicked(evt);
            }
        });
        jPanel2.add(pic_6, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 160, -1, -1));

        pic_7.setText(" ");
        pic_7.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        pic_7.setPreferredSize(new java.awt.Dimension(160, 160));
        pic_7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pic_7MouseClicked(evt);
            }
        });
        jPanel2.add(pic_7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 320, -1, -1));

        pic_8.setIcon(new javax.swing.ImageIcon("C:\\Users\\AL KAZI AKASH\\Desktop\\Milantis Game\\Images\\8.png")); // NOI18N
        pic_8.setText(" ");
        pic_8.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        pic_8.setPreferredSize(new java.awt.Dimension(160, 160));
        pic_8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pic_8MouseClicked(evt);
            }
        });
        jPanel2.add(pic_8, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 320, -1, 160));

        pic_9.setText(" ");
        pic_9.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        pic_9.setPreferredSize(new java.awt.Dimension(160, 160));
        pic_9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pic_9MouseClicked(evt);
            }
        });
        jPanel2.add(pic_9, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 320, -1, -1));

        jButton1.setText("Preview");
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButton1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButton1MouseExited(evt);
            }
        });
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 483, 110, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 477, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 550, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void pic_1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pic_1MouseClicked
        if(!Win) {
            score.setText("Score: " + ++Score);
            if(count1 != 0) {
                if(count2 == 0) {
                    count2 = count1;
                    count1=0;
                    pic_1.setIcon(showImage(image_name[count1]));
                    pic_2.setIcon(showImage(image_name[count2]));
                    win();
                } else if(count4 == 0) {
                    count4 = count1;
                    count1=0;
                    pic_1.setIcon(showImage(image_name[count1]));
                    pic_4.setIcon(showImage(image_name[count4]));
                    win();
                } else getToolkit().beep();
            } 
        }
    }//GEN-LAST:event_pic_1MouseClicked

    private void pic_3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pic_3MouseClicked
        if(!Win) {
            score.setText("Score: " + ++Score);
            if(count3 != 0) {
                if (count2 == 0) {
                    count2 = count3;
                    count3 = 0;
                    pic_2.setIcon(showImage(image_name[count2]));
                    pic_3.setIcon(showImage(image_name[count3]));
                    win();
                } else if (count6 == 0) {
                    count6 = count3;
                    count3 = 0;
                    pic_3.setIcon(showImage(image_name[count3]));
                    pic_6.setIcon(showImage(image_name[count6]));
                    win();
                } else getToolkit().beep();
            } 
        }
    }//GEN-LAST:event_pic_3MouseClicked

    private void pic_2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pic_2MouseClicked
        if(!Win) {
            score.setText("Score: " + ++Score);
            if (count2 != 0) {
                if (count1 == 0) {
                    count1 = count2;
                    count2 = 0;
                    pic_2.setIcon(showImage(image_name[count2]));
                    pic_1.setIcon(showImage(image_name[count1]));
                    win();
                } else if (count3 == 0) {
                    count3 = count2;
                    count2 = 0;
                    pic_2.setIcon(showImage(image_name[count2]));
                    pic_3.setIcon(showImage(image_name[count3]));
                    win();
                } else if (count5 == 0) {
                    count5 = count2;
                    count2 = 0;
                    pic_2.setIcon(showImage(image_name[count2]));
                    pic_5.setIcon(showImage(image_name[count5]));
                    win();
                } else getToolkit().beep();
            } 
        }
    }//GEN-LAST:event_pic_2MouseClicked

    private void pic_4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pic_4MouseClicked
        if(!Win) {
            score.setText("Score: " + ++Score);
            if(count4 != 0) {
                if (count1 == 0) {
                    count1 = count4;
                    count4 = 0;
                    pic_4.setIcon(showImage(image_name[count4]));
                    pic_1.setIcon(showImage(image_name[count1]));
                    win();
                } else if (count7 == 0) {
                    count7 = count4;
                    count4 = 0;
                    pic_4.setIcon(showImage(image_name[count4]));
                    pic_7.setIcon(showImage(image_name[count7]));
                    win();
                } else if (count5 == 0) {
                    count5 = count4;
                    count4 = 0;
                    pic_4.setIcon(showImage(image_name[count4]));
                    pic_5.setIcon(showImage(image_name[count5]));
                    win();
                } else getToolkit().beep();
            } 
        }
    }//GEN-LAST:event_pic_4MouseClicked

    private void pic_5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pic_5MouseClicked
        if(!Win) {
            score.setText("Score: " + ++Score);
            if(count5 != 0) {
                if (count2 == 0) {
                    count2 = count5;
                    count5 = 0;
                    pic_5.setIcon(showImage(image_name[count5]));
                    pic_2.setIcon(showImage(image_name[count2]));
                    win();
                } else if (count4 == 0) {
                    count4 = count5;
                    count5 = 0;
                    pic_5.setIcon(showImage(image_name[count5]));
                    pic_4.setIcon(showImage(image_name[count4]));
                    win();
                } else if (count6 == 0) {
                    count6 = count5;
                    count5 = 0;
                    pic_5.setIcon(showImage(image_name[count5]));
                    pic_6.setIcon(showImage(image_name[count6]));
                    win();
                }  else if (count8 == 0) {
                    count8 = count5;
                    count5 = 0;
                    pic_5.setIcon(showImage(image_name[count5]));
                    pic_8.setIcon(showImage(image_name[count8]));
                    win();
                } else getToolkit().beep();
            } 
        }
    }//GEN-LAST:event_pic_5MouseClicked

    private void pic_6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pic_6MouseClicked
        if(!Win) {
            score.setText("Score: " + ++Score);
            if(count6 != 0) {
                if (count5 == 0) {
                    count5 = count6;
                    count6 = 0;
                    pic_5.setIcon(showImage(image_name[count5]));
                    pic_6.setIcon(showImage(image_name[count6]));
                    win();
                } else if (count3 == 0) {
                    count3 = count6;
                    count6 = 0;
                    pic_3.setIcon(showImage(image_name[count3]));
                    pic_6.setIcon(showImage(image_name[count6]));
                    win();
                } else if (count9 == 0) {
                    count9 = count6;
                    count6 = 0;
                    pic_9.setIcon(showImage(image_name[count9]));
                    pic_6.setIcon(showImage(image_name[count6]));
                    win();
                } else getToolkit().beep();
            }
        }
    }//GEN-LAST:event_pic_6MouseClicked

    private void pic_7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pic_7MouseClicked
        if(!Win) {
            score.setText("Score: " + ++Score);
            if(count7 != 0) {
                if (count4 == 0) {
                    count4 = count7;
                    count7 = 0;
                    pic_7.setIcon(showImage(image_name[count7]));
                    pic_4.setIcon(showImage(image_name[count4]));
                    win();
                } else if (count8 == 0) {
                    count8 = count7;
                    count7 = 0;
                    pic_7.setIcon(showImage(image_name[count7]));
                    pic_8.setIcon(showImage(image_name[count8]));
                    win();
                } else getToolkit().beep();
            } 
        }
    }//GEN-LAST:event_pic_7MouseClicked

    private void pic_8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pic_8MouseClicked
       if(!Win) {
            score.setText("Score: " + ++Score);
            if(count8 != 0) {
                if (count7 == 0) {
                    count7 = count8;
                    count8 = 0;
                    pic_8.setIcon(showImage(image_name[count8]));
                    pic_7.setIcon(showImage(image_name[count7]));
                    win();
                } else if (count9 == 0) {
                    count9 = count8;
                    count8 = 0;
                    pic_8.setIcon(showImage(image_name[count8]));
                    pic_9.setIcon(showImage(image_name[count9]));
                    win();
                } else if (count5 == 0) {
                    count5 = count8;
                    count8 = 0;
                    pic_8.setIcon(showImage(image_name[count8]));
                    pic_5.setIcon(showImage(image_name[count5]));
                    win();
                } else getToolkit().beep();
            } 
       }
    }//GEN-LAST:event_pic_8MouseClicked

    private void pic_9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pic_9MouseClicked
        if(!Win) {
            score.setText("Score: " + ++Score);
            if(count9 != 0) {
                if (count8 == 0) {
                    count8 = count9;
                    count9 = 0;
                    pic_8.setIcon(showImage(image_name[count8]));
                    pic_9.setIcon(showImage(image_name[count9]));
                    win();
                } else if (count6 == 0) {
                    count6 = count9;
                    count9 = 0;
                    pic_6.setIcon(showImage(image_name[count6]));
                    pic_9.setIcon(showImage(image_name[count9]));
                    win();
                } else getToolkit().beep();
            } 
        }
    }//GEN-LAST:event_pic_9MouseClicked

    private void jButton1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseEntered
        if(!Win)
         Background_image.setIcon(showImage("AKASH-NAHIDA.png"));
    }//GEN-LAST:event_jButton1MouseEntered

    private void jButton1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseExited
       if(!Win)
        Background_image.setIcon(showImage(""));
    }//GEN-LAST:event_jButton1MouseExited

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(Level1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Level1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Level1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Level1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Level1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Background_image;
    private javax.swing.JButton jButton1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel pic_1;
    private javax.swing.JLabel pic_2;
    private javax.swing.JLabel pic_3;
    private javax.swing.JLabel pic_4;
    private javax.swing.JLabel pic_5;
    private javax.swing.JLabel pic_6;
    private javax.swing.JLabel pic_7;
    private javax.swing.JLabel pic_8;
    private javax.swing.JLabel pic_9;
    private javax.swing.JLabel score;
    private javax.swing.JLabel win;
    // End of variables declaration//GEN-END:variables

    // Image show
    public ImageIcon showImage(String image) {
        image = imageName+image;
        ImageIcon iconLogo = new ImageIcon(image);
        return iconLogo;
    }
    
    public void win() {
        if(count1 == 1 && count2 == 2 && count3 == 3 && count4 == 4 && count5 == 5 && count6 == 6 && count7 == 7 && count8 == 8 && count9 == 0){
            Win = true;
            pic_1.setIcon(showImage(""));
            pic_2.setIcon(showImage(""));
            pic_3.setIcon(showImage(""));
            pic_4.setIcon(showImage(""));
            pic_5.setIcon(showImage(""));
            pic_6.setIcon(showImage(""));
            pic_7.setIcon(showImage(""));
            pic_8.setIcon(showImage(""));
            pic_9.setIcon(showImage(""));
            Background_image.setIcon(showImage("AKASH-NAHIDA.png"));
            win.setText("You are win!!");
        }
    }
}
