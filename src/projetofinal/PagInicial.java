package projetofinal;


import java.awt.event.ActionEvent;

/*página inicial, deve verificar se o usuário é cadastrado,
caso não seja, solicite o cadastro ao usuário para acesso à página
caso o usuário utilizar adimi..admin, informar que esta senha 
é provisória e deve ser realizado cadastro para utilização do sistema*/
public class PagInicial extends javax.swing.JFrame {

    public PagInicial() {
        initComponents();
    }
    private void initComponents(){
        BtnEntra.addActionListener(new java.awt.event.ActionListener() {
            @Override
            public void actionPerformed(java.awt.event.ActionEvent evt) {
               String nome = Nome.getText();
               String senha = new String(Senha.getPassword());
               
            boolean usuarioCadastrado = verificarCadUsuario(nome, senha);
               
            if (usuarioCadastrado){
                abrirmenuInicial();
            }
            else{
                System.out.println("Usuário não cadastrado");
            }

                
            }

            private boolean verificarCadaUsuario(String nome, String senha) {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }
        });
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        BtnEntra = new javax.swing.JButton();
        BtnCadastra = new javax.swing.JButton();
        Foto = new javax.swing.JLabel();
        Titulo = new javax.swing.JLabel();
        Jnome = new javax.swing.JLabel();
        Nome = new javax.swing.JTextField();
        Jsenha = new javax.swing.JLabel();
        BtnSai = new javax.swing.JButton();
        Senha = new javax.swing.JPasswordField();
        Foto1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));

        BtnEntra.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        BtnEntra.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Entrar.png"))); // NOI18N
        BtnEntra.setText("Entrar");
        BtnEntra.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        BtnEntra.setMaximumSize(new java.awt.Dimension(70, 30));
        BtnEntra.setMinimumSize(new java.awt.Dimension(70, 30));
        BtnEntra.setName(""); // NOI18N

        BtnCadastra.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        BtnCadastra.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cadastro.png"))); // NOI18N
        BtnCadastra.setText("Cadastrar");
        BtnCadastra.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        BtnCadastra.setMaximumSize(new java.awt.Dimension(70, 30));
        BtnCadastra.setMinimumSize(new java.awt.Dimension(70, 30));

        Foto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projetofinal/Serviços M (1).png"))); // NOI18N
        Foto.setText("jLabel1");

        Titulo.setFont(new java.awt.Font("Wide Latin", 3, 24)); // NOI18N
        Titulo.setText("Meus Serviços");

        Jnome.setBackground(new java.awt.Color(255, 255, 255));
        Jnome.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        Jnome.setText("Nome");
        Jnome.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        Nome.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Nome.setName("PassNome"); // NOI18N

        Jsenha.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        Jsenha.setText("Senha");
        Jsenha.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

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

        Senha.setText("jPasswordField1");

        Foto1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Foto1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projetofinal/Serviços.png"))); // NOI18N
        Foto1.setText("jLabel1");
        Foto1.setIconTextGap(5);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(141, 141, 141)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(Jnome)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Nome, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(Jsenha)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Senha, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(Titulo, javax.swing.GroupLayout.PREFERRED_SIZE, 317, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(130, 130, 130)
                        .addComponent(BtnEntra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(22, 22, 22)
                        .addComponent(BtnCadastra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(BtnSai, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                .addComponent(Foto, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38))
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
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(Titulo, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Jnome)
                            .addComponent(Nome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(Foto, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 26, Short.MAX_VALUE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Jsenha)
                    .addComponent(Senha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(52, 52, 52)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BtnEntra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BtnCadastra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BtnSai, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(44, 44, 44)
                    .addComponent(Foto1, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(183, Short.MAX_VALUE)))
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
    private javax.swing.JButton BtnCadastra;
    private javax.swing.JButton BtnEntra;
    private javax.swing.JButton BtnSai;
    private javax.swing.JLabel Foto;
    private javax.swing.JLabel Foto1;
    private javax.swing.JLabel Jnome;
    private javax.swing.JLabel Jsenha;
    private javax.swing.JTextField Nome;
    private javax.swing.JPasswordField Senha;
    private javax.swing.JLabel Titulo;
    // End of variables declaration//GEN-END:variables
}
