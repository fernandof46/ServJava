////
////import java.awt.event.ActionEvent;
////
/////*página inicial, deve verificar se o usuário é cadastrado,
////caso não seja, solicite o cadastro ao usuário para acesso à página
////caso o usuário utilizar adimi..admin, informar que esta senha 
////é provisória e deve ser realizado cadastro para utilização do sistema*/
////public class menuInicial extends javax.swing.JFrame {
////
////    public menuInicial() {
////        initComponents();
////    }
////    private void initComponents(){
////        
////                
////            }
////
////            private boolean verificarCadastroCliente(String nome, String senha) {
////                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
////            }
////        });
////    }
////    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        BtnCadUser = new javax.swing.JButton();
        Foto = new javax.swing.JLabel();
        Titulo = new javax.swing.JLabel();
        BtnSai = new javax.swing.JButton();
        Foto1 = new javax.swing.JLabel();
        BtnCadClient = new javax.swing.JButton();
        BtnOrcamento = new javax.swing.JButton();
        BtnCadService1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));

        BtnCadUser.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        BtnCadUser.setIcon(new javax.swing.ImageIcon(getClass().getResource("/usuario.png"))); // NOI18N
        BtnCadUser.setText("Usuários");
        BtnCadUser.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        BtnCadUser.setMaximumSize(new java.awt.Dimension(70, 30));
        BtnCadUser.setMinimumSize(new java.awt.Dimension(70, 30));

        Foto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projetofinal/Serviços M (1).png"))); // NOI18N
        Foto.setText("jLabel1");

        Titulo.setFont(new java.awt.Font("Wide Latin", 3, 24)); // NOI18N
        Titulo.setText("Cadastro");

        BtnSai.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        BtnSai.setIcon(new javax.swing.ImageIcon(getClass().getResource("/saida.png"))); // NOI18N
        BtnSai.setText("Sair");
        BtnSai.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        BtnSai.setMaximumSize(new java.awt.Dimension(70, 30));
        BtnSai.setMinimumSize(new java.awt.Dimension(70, 30));
        BtnSai.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnSaiActionPerformed(evt);
            }
        });

        Foto1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Foto1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projetofinal/Serviços.png"))); // NOI18N
        Foto1.setText("jLabel1");
        Foto1.setIconTextGap(5);

        BtnCadClient.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        BtnCadClient.setIcon(new javax.swing.ImageIcon(getClass().getResource("/clientes.png"))); // NOI18N
        BtnCadClient.setText("Clientes");
        BtnCadClient.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        BtnCadClient.setMaximumSize(new java.awt.Dimension(70, 30));
        BtnCadClient.setMinimumSize(new java.awt.Dimension(70, 30));

        BtnOrcamento.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        BtnOrcamento.setIcon(new javax.swing.ImageIcon(getClass().getResource("/orcamento.png"))); // NOI18N
        BtnOrcamento.setText("Orçamentos");
        BtnOrcamento.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        BtnOrcamento.setMaximumSize(new java.awt.Dimension(70, 30));
        BtnOrcamento.setMinimumSize(new java.awt.Dimension(70, 30));

        BtnCadService1.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        BtnCadService1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/manutencao.png"))); // NOI18N
        BtnCadService1.setText("Serviços");
        BtnCadService1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        BtnCadService1.setMaximumSize(new java.awt.Dimension(70, 30));
        BtnCadService1.setMinimumSize(new java.awt.Dimension(70, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(130, 130, 130)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 113, Short.MAX_VALUE)
                                .addComponent(Titulo)
                                .addGap(66, 66, 66))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(BtnCadClient, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addComponent(Foto, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(38, 38, 38))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(BtnCadUser, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(BtnCadService1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(BtnOrcamento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(BtnSai, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(48, 48, 48))))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(24, 24, 24)
                    .addComponent(Foto1, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(523, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Foto, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(Titulo, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(BtnCadUser, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(BtnCadClient, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 11, Short.MAX_VALUE)
                .addComponent(BtnCadService1, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BtnOrcamento, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BtnSai, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(19, 19, 19))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(44, 44, 44)
                    .addComponent(Foto1, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(184, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BtnSaiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnSaiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BtnSaiActionPerformed

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
            java.util.logging.Logger.getLogger(PagInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PagInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PagInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PagInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PagInicial().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnCadClient;
    private javax.swing.JButton BtnCadService1;
    private javax.swing.JButton BtnCadUser;
    private javax.swing.JButton BtnOrcamento;
    private javax.swing.JButton BtnSai;
    private javax.swing.JLabel Foto;
    private javax.swing.JLabel Foto1;
    private javax.swing.JLabel Titulo;
    // End of variables declaration//GEN-END:variables
}
