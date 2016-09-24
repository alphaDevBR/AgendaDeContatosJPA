/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package in.alphadev.view;

import in.alphadev.models.Contatos;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class TelaContatos extends javax.swing.JDialog {

  private int idRegistro;

  public int getIdRegistro() {
    return idRegistro;
  }

  private void preencheTabela() {
    EntityManagerFactory factory = Persistence.createEntityManagerFactory( "AgendaDeContatosJPAPU" );
    EntityManager manager = factory.createEntityManager();

    Query query = manager.createNamedQuery( "Contatos.findAll" );

    List<Contatos> contato = query.getResultList();

    DefaultTableModel dtm = new DefaultTableModel();

    tblContatos = new JTable( dtm );
//    tblContatos.addMouseListener( (MouseListener) this );
    
    dtm.addColumn( "Id" );
    dtm.addColumn( "Nome" );
    dtm.addColumn( "Fone Cel" );
    dtm.addColumn( "E-mail" );

    for ( Contatos regContatos : contato ) {
      dtm.addRow( new Object[]{regContatos.getId(), regContatos.getNome(),
        regContatos.getFoneCel(), regContatos.getEmail()} );
    }

    manager.close();
    factory.close();

  }

  public void setIdRegistro( int idRegistro ) {
    this.idRegistro = idRegistro;
  }

  public TelaContatos( java.awt.Frame parent, boolean modal ) {
    super( parent, modal );
    preencheTabela();
    initComponents();
  }

  @SuppressWarnings("unchecked")
  // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
  private void initComponents() {

    buttonGroup1 = new javax.swing.ButtonGroup();
    jPanel5 = new javax.swing.JPanel();
    jLabel1 = new javax.swing.JLabel();
    jLabel2 = new javax.swing.JLabel();
    jLabel3 = new javax.swing.JLabel();
    jLabel4 = new javax.swing.JLabel();
    jLabel5 = new javax.swing.JLabel();
    jLabel6 = new javax.swing.JLabel();
    jLabel7 = new javax.swing.JLabel();
    txtID = new javax.swing.JTextField();
    txtNome = new javax.swing.JTextField();
    opcMasculino = new javax.swing.JRadioButton();
    opcFeminino = new javax.swing.JRadioButton();
    txtFoneRes = new javax.swing.JFormattedTextField();
    txtFoneCel = new javax.swing.JFormattedTextField();
    txtEmail = new javax.swing.JTextField();
    txtDtNasc = new javax.swing.JFormattedTextField();
    jLabel8 = new javax.swing.JLabel();
    jPanel1 = new javax.swing.JPanel();
    btnNovo = new javax.swing.JButton();
    btnSalvar = new javax.swing.JButton();
    btnExcluir = new javax.swing.JButton();
    btnFechar = new javax.swing.JButton();
    txtSalario = new javax.swing.JTextField();
    jPanel2 = new javax.swing.JPanel();
    jScrollPane1 = new javax.swing.JScrollPane();
    tblContatos = new javax.swing.JTable();
    jLabel9 = new javax.swing.JLabel();
    jTextField4 = new javax.swing.JTextField();
    jComboBox1 = new javax.swing.JComboBox<>();
    jButton5 = new javax.swing.JButton();

    setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
    setTitle("Cadastro de Contatos");

    jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder("Dados do Contato"));

    jLabel1.setText("ID:");

    jLabel2.setText("Nome:");

    jLabel3.setText("Sexo:");

    jLabel4.setText("Fone Res.:");

    jLabel5.setText("Fone Cel.:");

    jLabel6.setText("E-mail:");

    jLabel7.setText("Dt. Nasc.:");

    txtID.setEnabled(false);

    buttonGroup1.add(opcMasculino);
    opcMasculino.setText("Masculino");

    buttonGroup1.add(opcFeminino);
    opcFeminino.setText("Feminino");

    jLabel8.setText("Salário:");

    jPanel1.setBackground(new java.awt.Color(204, 214, 144));

    btnNovo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/in/alphadev/imagens/0295.png"))); // NOI18N
    btnNovo.setToolTipText("Novo registro");
    btnNovo.setMaximumSize(new java.awt.Dimension(40, 40));
    btnNovo.setMinimumSize(new java.awt.Dimension(40, 40));
    btnNovo.setPreferredSize(new java.awt.Dimension(40, 40));
    btnNovo.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        btnNovoActionPerformed(evt);
      }
    });

    btnSalvar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/in/alphadev/imagens/1778.png"))); // NOI18N
    btnSalvar.setToolTipText("Grava os dados na tabela");
    btnSalvar.setMaximumSize(new java.awt.Dimension(40, 40));
    btnSalvar.setMinimumSize(new java.awt.Dimension(40, 40));
    btnSalvar.setPreferredSize(new java.awt.Dimension(40, 40));
    btnSalvar.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        btnSalvarActionPerformed(evt);
      }
    });

    btnExcluir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/in/alphadev/imagens/0293.png"))); // NOI18N
    btnExcluir.setToolTipText("Deleta o registro atual");
    btnExcluir.setMaximumSize(new java.awt.Dimension(40, 40));
    btnExcluir.setMinimumSize(new java.awt.Dimension(40, 40));
    btnExcluir.setPreferredSize(new java.awt.Dimension(40, 40));

    btnFechar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/in/alphadev/imagens/0237.png"))); // NOI18N
    btnFechar.setText("Fechar");
    btnFechar.setToolTipText("Fecha a janela");
    btnFechar.setMaximumSize(new java.awt.Dimension(72, 40));
    btnFechar.setMinimumSize(new java.awt.Dimension(72, 40));
    btnFechar.setPreferredSize(new java.awt.Dimension(72, 40));
    btnFechar.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        btnFecharActionPerformed(evt);
      }
    });

    javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
    jPanel1.setLayout(jPanel1Layout);
    jPanel1Layout.setHorizontalGroup(
      jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(jPanel1Layout.createSequentialGroup()
        .addContainerGap()
        .addComponent(btnNovo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
        .addComponent(btnSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
        .addComponent(btnExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        .addComponent(btnFechar, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addContainerGap())
    );
    jPanel1Layout.setVerticalGroup(
      jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(jPanel1Layout.createSequentialGroup()
        .addContainerGap()
        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
          .addComponent(btnFechar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
          .addComponent(btnExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
          .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
            .addComponent(btnNovo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(btnSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
    );

    javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
    jPanel5.setLayout(jPanel5Layout);
    jPanel5Layout.setHorizontalGroup(
      jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(jPanel5Layout.createSequentialGroup()
        .addContainerGap()
        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
          .addGroup(jPanel5Layout.createSequentialGroup()
            .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
              .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.TRAILING)
              .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING)
              .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING)
              .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING)
              .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING)
              .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING)
              .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING)
              .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
              .addGroup(jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                  .addComponent(txtID, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                  .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, 263, javax.swing.GroupLayout.PREFERRED_SIZE)
                  .addComponent(txtFoneRes)
                  .addComponent(txtFoneCel, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                  .addComponent(txtEmail)
                  .addComponent(txtDtNasc, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(9, 9, 9))
              .addGroup(jPanel5Layout.createSequentialGroup()
                .addComponent(txtSalario, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
          .addGroup(jPanel5Layout.createSequentialGroup()
            .addGap(72, 72, 72)
            .addComponent(opcMasculino)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addComponent(opcFeminino)
            .addContainerGap(93, Short.MAX_VALUE))
          .addGroup(jPanel5Layout.createSequentialGroup()
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addContainerGap())))
    );
    jPanel5Layout.setVerticalGroup(
      jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(jPanel5Layout.createSequentialGroup()
        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
          .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
          .addComponent(txtID))
        .addGap(3, 3, 3)
        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
          .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
          .addComponent(txtNome))
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
          .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
          .addComponent(opcMasculino, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
          .addComponent(opcFeminino, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
          .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
          .addComponent(txtFoneRes))
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
          .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
          .addComponent(txtFoneCel))
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
          .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
          .addComponent(txtEmail))
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
          .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
          .addComponent(txtDtNasc))
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
          .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
          .addComponent(txtSalario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        .addGap(24, 24, 24)
        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addContainerGap())
    );

    jPanel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));

    tblContatos.setAutoCreateRowSorter(true);
    tblContatos.setModel(new javax.swing.table.DefaultTableModel(
      new Object [][] {

      },
      new String [] {

      }
    ));
    tblContatos.setRowSelectionAllowed(false);
    tblContatos.setShowGrid(true);
    tblContatos.addMouseListener(new java.awt.event.MouseAdapter() {
      public void mouseClicked(java.awt.event.MouseEvent evt) {
        tblContatosMouseClicked(evt);
      }
    });
    jScrollPane1.setViewportView(tblContatos);

    jLabel9.setText("Pesquisa:");

    jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "ID", "Nome", "Fone Residencial", "Fone Ceular", "E-mail" }));

    jButton5.setText("...");

    javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
    jPanel2.setLayout(jPanel2Layout);
    jPanel2Layout.setHorizontalGroup(
      jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(jPanel2Layout.createSequentialGroup()
        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
          .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 538, javax.swing.GroupLayout.PREFERRED_SIZE)
          .addGroup(jPanel2Layout.createSequentialGroup()
            .addComponent(jLabel9)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, 249, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))))
    );
    jPanel2Layout.setVerticalGroup(
      jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(jPanel2Layout.createSequentialGroup()
        .addGap(12, 12, 12)
        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
          .addComponent(jLabel9)
          .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
          .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
          .addComponent(jButton5))
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
        .addContainerGap())
    );

    javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
    getContentPane().setLayout(layout);
    layout.setHorizontalGroup(
      layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(layout.createSequentialGroup()
        .addContainerGap()
        .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addContainerGap(21, Short.MAX_VALUE))
    );
    layout.setVerticalGroup(
      layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(layout.createSequentialGroup()
        .addContainerGap()
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
          .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
          .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        .addContainerGap(16, Short.MAX_VALUE))
    );

    setSize(new java.awt.Dimension(963, 394));
    setLocationRelativeTo(null);
  }// </editor-fold>//GEN-END:initComponents

  private void btnFecharActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFecharActionPerformed
    this.setVisible(false);
  }//GEN-LAST:event_btnFecharActionPerformed

  private void tblContatosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblContatosMouseClicked
    setIdRegistro(
        (Integer) tblContatos.getValueAt(
            tblContatos.getSelectedRow(), 0 ) );
    exibeContato();
  }//GEN-LAST:event_tblContatosMouseClicked

  private void btnNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNovoActionPerformed
    txtNome.setText("");
    opcMasculino.setSelected( true);
    txtDtNasc.setText( "");
    txtFoneRes.setText( "");
    txtFoneCel.setText( "");
    txtSalario.setText( "");
    txtEmail.setText( "");
    
    txtNome.requestFocus();
  }//GEN-LAST:event_btnNovoActionPerformed

  private void btnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarActionPerformed
    SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

    EntityManagerFactory factory = Persistence.createEntityManagerFactory( "AgendaDeContatosJPAPU" );
    EntityManager manager = factory.createEntityManager();

    Contatos contato = new Contatos();

    try {
  
      contato.setNome( txtNome.getText());
      contato.setDataNas( sdf.parse( txtDtNasc.getText() ) );
      contato.setEmail( txtEmail.getText());
      contato.setFoneCel( txtFoneCel.getText());
      contato.setFoneRes( txtFoneRes.getText());
      contato.setSalario( Float.parseFloat( txtSalario.getText() ) );
      if (opcMasculino.isSelected())
        contato.setSexo( "M" );
      else
        contato.setSexo( "F" );

      manager.getTransaction().begin();
      manager.persist( contato );
      manager.getTransaction().commit();

      manager.close();
      factory.close();

      jScrollPane1.repaint();

    } catch ( ParseException ex ) {

      Logger.getLogger( TelaContatos.class.getName() ).log( Level.SEVERE, null, ex );

    }
  }//GEN-LAST:event_btnSalvarActionPerformed

  private void exibeContato() {
    EntityManagerFactory factory = Persistence.createEntityManagerFactory( "AgendaDeContatosJPAPU" );
    EntityManager manager = factory.createEntityManager();

    Query query = manager.createNamedQuery( "Contatos.findById" );
    query.setParameter( "id", getIdRegistro() );

    List<Contatos> contato = query.getResultList();

    mostraDados( contato.get( 0 ) );
    manager.close();
  }

  private void mostraDados( Contatos contato ) {
    SimpleDateFormat dataNasc = new SimpleDateFormat("dd/MM/yyyy");

    txtID.setText( contato.getId().toString() );
    txtNome.setText( contato.getNome() );
    txtFoneRes.setText( contato.getFoneRes() );
    txtFoneCel.setText( contato.getFoneCel() );
    if ( contato.getSexo().equals( "M" ) ) {
      opcMasculino.setSelected( true );
    } else {
      opcFeminino.setSelected( true );
    }
    txtEmail.setText( contato.getEmail() );
    txtDtNasc.setText( dataNasc.format( contato.getDataNas() ) );
    txtSalario.setText( String.valueOf( contato.getSalario() ) );
  }

  /**
   * @param args the command line arguments
   */
  public static void main(String args[]) {
    /* Create and display the dialog */
    java.awt.EventQueue.invokeLater(new Runnable() {
      public void run() {
        TelaContatos dialog = new TelaContatos(new javax.swing.JFrame(), true);
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
  private javax.swing.JButton btnExcluir;
  private javax.swing.JButton btnFechar;
  private javax.swing.JButton btnNovo;
  private javax.swing.JButton btnSalvar;
  private javax.swing.ButtonGroup buttonGroup1;
  private javax.swing.JButton jButton5;
  private javax.swing.JComboBox<String> jComboBox1;
  private javax.swing.JLabel jLabel1;
  private javax.swing.JLabel jLabel2;
  private javax.swing.JLabel jLabel3;
  private javax.swing.JLabel jLabel4;
  private javax.swing.JLabel jLabel5;
  private javax.swing.JLabel jLabel6;
  private javax.swing.JLabel jLabel7;
  private javax.swing.JLabel jLabel8;
  private javax.swing.JLabel jLabel9;
  private javax.swing.JPanel jPanel1;
  private javax.swing.JPanel jPanel2;
  private javax.swing.JPanel jPanel5;
  private javax.swing.JScrollPane jScrollPane1;
  private javax.swing.JTextField jTextField4;
  private javax.swing.JRadioButton opcFeminino;
  private javax.swing.JRadioButton opcMasculino;
  private javax.swing.JTable tblContatos;
  private javax.swing.JFormattedTextField txtDtNasc;
  private javax.swing.JTextField txtEmail;
  private javax.swing.JFormattedTextField txtFoneCel;
  private javax.swing.JFormattedTextField txtFoneRes;
  private javax.swing.JTextField txtID;
  private javax.swing.JTextField txtNome;
  private javax.swing.JTextField txtSalario;
  // End of variables declaration//GEN-END:variables
}
