/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author Hanso
 */
public class Frmradiobutton extends javax.swing.JFrame {

    /**
     * Creates new form Frmradiobutton
     */
    public Frmradiobutton() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        grupo = new javax.swing.ButtonGroup();
        lblprojeto = new javax.swing.JLabel();
        lblresposta = new javax.swing.JLabel();
        txtResposta = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jbj = new javax.swing.JRadioButton();
        jbjs = new javax.swing.JRadioButton();
        jbphp = new javax.swing.JRadioButton();
        btnescolher = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblprojeto.setFont(new java.awt.Font("Monospaced", 1, 24)); // NOI18N
        lblprojeto.setText("Exemplo RadioButton");

        lblresposta.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        lblresposta.setText("Resposta:");

        txtResposta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtRespostaActionPerformed(evt);
            }
        });

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Linguagens de Programação"));

        grupo.add(jbj);
        jbj.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jbj.setText("Java");

        grupo.add(jbjs);
        jbjs.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jbjs.setText("JavaScript");

        grupo.add(jbphp);
        jbphp.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jbphp.setText("PHP");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jbj)
                .addGap(122, 122, 122)
                .addComponent(jbjs)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 84, Short.MAX_VALUE)
                .addComponent(jbphp)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbjs)
                    .addComponent(jbj)
                    .addComponent(jbphp))
                .addContainerGap(28, Short.MAX_VALUE))
        );

        btnescolher.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnescolher.setText("Escolher");
        btnescolher.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnescolherActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(167, 167, 167)
                        .addComponent(lblprojeto))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addComponent(lblresposta)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtResposta, javax.swing.GroupLayout.PREFERRED_SIZE, 287, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(96, 96, 96))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(237, 237, 237)
                        .addComponent(btnescolher)))
                .addContainerGap(44, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(lblprojeto)
                .addGap(48, 48, 48)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblresposta)
                    .addComponent(txtResposta, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnescolher)
                .addContainerGap(7, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtRespostaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtRespostaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtRespostaActionPerformed

    private void btnescolherActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnescolherActionPerformed
        // botão escolher
        if(jbj.isSelected()== true){
            //A opção escolhida foi o java
            txtResposta.setText("Java");
        }else if(jbjs.isSelected() == true){
            txtResposta.setText("JavaScript");
    }//GEN-LAST:event_btnescolherActionPerformed

        else if(jbphp.isSelected() == true){
       txtResposta.setText("PHP");
        }
          }   
    /**  }   
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
            java.util.logging.Logger.getLogger(Frmradiobutton.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Frmradiobutton.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Frmradiobutton.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Frmradiobutton.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Frmradiobutton().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnescolher;
    private javax.swing.ButtonGroup grupo;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JRadioButton jbj;
    private javax.swing.JRadioButton jbjs;
    private javax.swing.JRadioButton jbphp;
    private javax.swing.JLabel lblprojeto;
    private javax.swing.JLabel lblresposta;
    private javax.swing.JTextField txtResposta;
    // End of variables declaration//GEN-END:variables
}
