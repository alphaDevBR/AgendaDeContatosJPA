package in.alphadev.view;

import in.alphadev.models.Usuarios;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import javax.swing.JOptionPane;

/**
 *
 * @author fernando
 */
public class TelaLogin extends javax.swing.JDialog {

  String nomeUsuario = "não identificado";
  String nivelUsuario = "não identificado";
  String temaUsuario = "";

  public String getNomeUsuario() {
    return nomeUsuario;
  }

  public void setNomeUsuario(String nomeUsuario) {
    this.nomeUsuario = nomeUsuario;
  }

  public String getNivelUsuario() {
    return nivelUsuario;
  }

  public void setNivelUsuario(String nivelUsuario) {
    this.nivelUsuario = nivelUsuario;
  }

  public String getTemaUsuario() {
    return temaUsuario;
  }

  public void setTemaUsuario(String temaUsuario) {
    this.temaUsuario = temaUsuario;
  }

  public TelaLogin(java.awt.Frame parent, boolean modal) {
    super(parent, modal);
    initComponents();
  }

  @SuppressWarnings("unchecked")
  // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
  private void initComponents() {

    jLabel1 = new javax.swing.JLabel();
    jLabel2 = new javax.swing.JLabel();
    jLabel3 = new javax.swing.JLabel();
    txtUsuario = new javax.swing.JTextField();
    txtSenha = new javax.swing.JPasswordField();
    btnLogar = new javax.swing.JButton();
    btnSair = new javax.swing.JButton();

    setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);

    jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/in/alphadev/imagens/0054.png"))); // NOI18N

    jLabel2.setText("Nome do Usuário:");

    jLabel3.setText("Senha:");

    btnLogar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/in/alphadev/imagens/1778.png"))); // NOI18N
    btnLogar.setText("Logar");
    btnLogar.setMaximumSize(new java.awt.Dimension(100, 29));
    btnLogar.setMinimumSize(new java.awt.Dimension(100, 29));
    btnLogar.setPreferredSize(new java.awt.Dimension(100, 29));
    btnLogar.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        btnLogarActionPerformed(evt);
      }
    });

    btnSair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/in/alphadev/imagens/1766.png"))); // NOI18N
    btnSair.setText("Sair");
    btnSair.setMaximumSize(new java.awt.Dimension(100, 29));
    btnSair.setMinimumSize(new java.awt.Dimension(100, 29));
    btnSair.setPreferredSize(new java.awt.Dimension(100, 29));
    btnSair.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        btnSairActionPerformed(evt);
      }
    });

    javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
    getContentPane().setLayout(layout);
    layout.setHorizontalGroup(
      layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(layout.createSequentialGroup()
        .addContainerGap()
        .addComponent(jLabel1)
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
          .addGroup(layout.createSequentialGroup()
            .addGap(18, 18, 18)
            .addComponent(jLabel2))
          .addGroup(layout.createSequentialGroup()
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
              .addComponent(jLabel3)
              .addComponent(txtUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE)
              .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                .addGroup(layout.createSequentialGroup()
                  .addComponent(btnSair, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                  .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                  .addComponent(btnLogar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addComponent(txtSenha, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE)))))
        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
    );
    layout.setVerticalGroup(
      layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(layout.createSequentialGroup()
        .addContainerGap()
        .addComponent(jLabel2)
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
          .addComponent(jLabel1)
          .addGroup(layout.createSequentialGroup()
            .addComponent(txtUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addComponent(jLabel3)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addComponent(txtSenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
          .addComponent(btnSair, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
          .addComponent(btnLogar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
    );

    setSize(new java.awt.Dimension(332, 171));
    setLocationRelativeTo(null);
  }// </editor-fold>//GEN-END:initComponents

    private void btnSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSairActionPerformed
      dispose();
    }//GEN-LAST:event_btnSairActionPerformed

    private void btnLogarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogarActionPerformed

      EntityManagerFactory factory = Persistence.createEntityManagerFactory( "AgendaDeContatosJPAPU" );
      EntityManager manager = factory.createEntityManager();

      Query query = manager.createNamedQuery( "Usuarios.findByUsuarioESenha" );
      query.setParameter("usuario", txtUsuario.getText());
      query.setParameter("senha", txtSenha.getText());

      List<Usuarios> usuario = query.getResultList();

      if (!usuario.isEmpty()) {

        setNomeUsuario(usuario.get(0).getUsuario());
        setNivelUsuario(usuario.get(0).getNivel());
        setTemaUsuario(usuario.get(0).getTema());

        manager.close();

        this.setVisible(false);
        
      } else {
        
        JOptionPane.showMessageDialog(null, "Usuário e/ou senha incorretos.",
                "Atenção", JOptionPane.ERROR_MESSAGE);

      }
    }//GEN-LAST:event_btnLogarActionPerformed

  public static void main(String args[]) {
    /* Create and display the dialog */
    java.awt.EventQueue.invokeLater(new Runnable() {
      public void run() {
        TelaLogin dialog = new TelaLogin(new javax.swing.JFrame(), true);
        dialog.addWindowListener(new java.awt.event.WindowAdapter() {
          @Override
          public void windowClosing(java.awt.event.WindowEvent e) {
            System.exit(0);
          }
        });
        dialog.setVisible(true);
      }
    });
  }

  // Variables declaration - do not modify//GEN-BEGIN:variables
  private javax.swing.JButton btnLogar;
  private javax.swing.JButton btnSair;
  private javax.swing.JLabel jLabel1;
  private javax.swing.JLabel jLabel2;
  private javax.swing.JLabel jLabel3;
  private javax.swing.JPasswordField txtSenha;
  private javax.swing.JTextField txtUsuario;
  // End of variables declaration//GEN-END:variables
}
