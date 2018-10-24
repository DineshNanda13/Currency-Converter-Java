
package cConvert;

public class cConverters extends javax.swing.JFrame {
    double Nigerian_Naira=302.96;
    double US_Dollar=1.53;
    double Kenyan_Shilling=156.21;
    double Brazilian_Real=5.86;
    double Canadian_Dollar=2.03;
    double Indian_Rupee=100.68;
    double Philippine_Peso=71.74;
    double Indonesian_Rupiah=20746.75;
    
    public cConverters() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jcmbCurrency = new javax.swing.JComboBox<>();
        jlblConvert = new javax.swing.JLabel();
        jtxtConvert = new javax.swing.JTextField();
        jbtnExit = new javax.swing.JButton();
        jbtnConvert = new javax.swing.JButton();
        jbtnReset = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 60)); // NOI18N
        jLabel1.setText("Currency Converter");
        jLabel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 4));

        jcmbCurrency.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jcmbCurrency.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Choose One...", "USA", "Nigeria", "Brazil", "Canada", "Kenyan", "Indonesia", "India", "Philippine" }));
        jcmbCurrency.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcmbCurrencyActionPerformed(evt);
            }
        });

        jlblConvert.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        jlblConvert.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlblConvert.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 4));

        jtxtConvert.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        jtxtConvert.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jtxtConvert.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 4));
        jtxtConvert.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxtConvertActionPerformed(evt);
            }
        });

        jbtnExit.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        jbtnExit.setText("Exit");
        jbtnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnExitActionPerformed(evt);
            }
        });

        jbtnConvert.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        jbtnConvert.setText("Convert");
        jbtnConvert.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnConvertActionPerformed(evt);
            }
        });

        jbtnReset.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        jbtnReset.setText("Reset");
        jbtnReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnResetActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel2.setText("£");
        jLabel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204), 2));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(171, 171, 171)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(72, 72, 72)
                        .addComponent(jbtnConvert)
                        .addGap(94, 94, 94)
                        .addComponent(jbtnReset)
                        .addGap(100, 100, 100)
                        .addComponent(jbtnExit))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(310, 310, 310)
                        .addComponent(jcmbCurrency, javax.swing.GroupLayout.PREFERRED_SIZE, 332, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(307, 307, 307)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jtxtConvert, javax.swing.GroupLayout.PREFERRED_SIZE, 289, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(294, 294, 294)
                        .addComponent(jlblConvert, javax.swing.GroupLayout.PREFERRED_SIZE, 384, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(292, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(65, 65, 65)
                .addComponent(jLabel1)
                .addGap(47, 47, 47)
                .addComponent(jcmbCurrency, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtxtConvert, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jlblConvert, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbtnExit)
                    .addComponent(jbtnReset)
                    .addComponent(jbtnConvert))
                .addContainerGap(36, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jtxtConvertActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxtConvertActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtxtConvertActionPerformed

    private void jbtnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnExitActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jbtnExitActionPerformed

    private void jbtnResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnResetActionPerformed
        jtxtConvert.setText(null);
        jlblConvert.setText(null);
        jcmbCurrency.setSelectedIndex(0);
    }//GEN-LAST:event_jbtnResetActionPerformed

    private void jbtnConvertActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnConvertActionPerformed
        double British_Pound=Double.parseDouble(jtxtConvert.getText());
        if(jcmbCurrency.getSelectedItem().equals("Nigeria")){
            String cConvert1=String.format("N %.2f",British_Pound*Nigerian_Naira);
            jlblConvert.setText(cConvert1);
        }
        if(jcmbCurrency.getSelectedItem().equals("USA")){
            String cConvert1=String.format("$ %.2f",British_Pound*US_Dollar);
            jlblConvert.setText(cConvert1);
        }
        if(jcmbCurrency.getSelectedItem().equals("Canada")){
            String cConvert1=String.format("C$ %.2f",British_Pound*Canadian_Dollar);
            jlblConvert.setText(cConvert1);
        }
        if(jcmbCurrency.getSelectedItem().equals("Indonesia")){
            String cConvert1=String.format("Idr %.2f",British_Pound*Indonesian_Rupiah);
            jlblConvert.setText(cConvert1);
        }
        if(jcmbCurrency.getSelectedItem().equals("Philippine")){
            String cConvert1=String.format("PhP %.2f",British_Pound*Philippine_Peso);
            jlblConvert.setText(cConvert1);
        }
        if(jcmbCurrency.getSelectedItem().equals("India")){
            String cConvert1=String.format("Inr %.2f",British_Pound*Indian_Rupee);
            jlblConvert.setText(cConvert1);
        }
        if(jcmbCurrency.getSelectedItem().equals("Brazil")){
            String cConvert1=String.format("Bra %.2f",British_Pound*Brazilian_Real);
            jlblConvert.setText(cConvert1);
        }
        if(jcmbCurrency.getSelectedItem().equals("Kenyan")){
            String cConvert1=String.format("KS %.2f",British_Pound*Kenyan_Shilling);
            jlblConvert.setText(cConvert1);
        }
    }//GEN-LAST:event_jbtnConvertActionPerformed

    private void jcmbCurrencyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcmbCurrencyActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jcmbCurrencyActionPerformed

    
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new cConverters().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JButton jbtnConvert;
    private javax.swing.JButton jbtnExit;
    private javax.swing.JButton jbtnReset;
    private javax.swing.JComboBox<String> jcmbCurrency;
    private javax.swing.JLabel jlblConvert;
    private javax.swing.JTextField jtxtConvert;
    // End of variables declaration//GEN-END:variables
}
