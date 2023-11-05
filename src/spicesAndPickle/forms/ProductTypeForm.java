package spicesAndPickle.forms;



import spicesAndPickle.db.DBClass;
import spicesAndPickle.db.ImageUtiltiy;
import spicesAndPickle.db.Messages;
import java.awt.Color;
import java.awt.Container;
import javax.swing.BorderFactory;
import javax.swing.JOptionPane;
import javax.swing.JRootPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author star
 */
public class ProductTypeForm extends javax.swing.JFrame {
    DBClass db=new DBClass();
    String oldname;
    /**
     * Creates new form NewJFrame1
     */
    public ProductTypeForm() {
        initComponents();
        getContentPane().setBackground(Color.WHITE);
        JRootPane p1=getRootPane();
        p1.setBorder(BorderFactory.createEtchedBorder());
        ImageUtiltiy.resizeLabelImage(lbl2);
        db.fillTable(table1, "select * from ProductType");
        txtname.requestFocus();
        
        
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        txtname = new javax.swing.JTextField();
        btnsave = new javax.swing.JButton();
        btndelete = new javax.swing.JButton();
        btnclear = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        table1 = new javax.swing.JTable();
        btnedit = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        btnclose = new javax.swing.JButton();
        lbl2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("CRUD Operations on Stud Table");
        setBackground(new java.awt.Color(255, 255, 255));
        setUndecorated(true);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setText("Product Type");

        txtname.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        txtname.setForeground(new java.awt.Color(153, 0, 153));
        txtname.setToolTipText("Please enter roll no");

        btnsave.setBackground(new java.awt.Color(250, 72, 37));
        btnsave.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnsave.setForeground(new java.awt.Color(255, 255, 255));
        btnsave.setText("Save");
        btnsave.setToolTipText("Save or Update Student Record");
        btnsave.setContentAreaFilled(false);
        btnsave.setOpaque(true);
        btnsave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsaveActionPerformed(evt);
            }
        });

        btndelete.setBackground(new java.awt.Color(250, 72, 37));
        btndelete.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btndelete.setForeground(new java.awt.Color(255, 255, 255));
        btndelete.setText("Delete");
        btndelete.setContentAreaFilled(false);
        btndelete.setOpaque(true);
        btndelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btndeleteActionPerformed(evt);
            }
        });

        btnclear.setBackground(new java.awt.Color(250, 72, 37));
        btnclear.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnclear.setForeground(new java.awt.Color(255, 255, 255));
        btnclear.setText("Clear");
        btnclear.setToolTipText("Clear all fields");
        btnclear.setContentAreaFilled(false);
        btnclear.setOpaque(true);
        btnclear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnclearActionPerformed(evt);
            }
        });

        table1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        table1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null},
                {null},
                {null},
                {null}
            },
            new String [] {
                "Product Type"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(table1);

        btnedit.setBackground(new java.awt.Color(250, 72, 37));
        btnedit.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnedit.setForeground(new java.awt.Color(255, 255, 255));
        btnedit.setText("Edit");
        btnedit.setContentAreaFilled(false);
        btnedit.setOpaque(true);
        btnedit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btneditActionPerformed(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(250, 72, 37));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Product Type Entry");

        btnclose.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnclose.setText("X");
        btnclose.setContentAreaFilled(false);
        btnclose.setOpaque(true);
        btnclose.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncloseActionPerformed(evt);
            }
        });

        lbl2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/ptype.png"))); // NOI18N
        lbl2.setText("jLabel1");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbl2, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(45, 45, 45)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnclose)
                .addGap(24, 24, 24))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addComponent(jLabel3))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(btnclose))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lbl2, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 386, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnedit)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btndelete))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(22, 22, 22)
                                .addComponent(jLabel2)
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(btnsave)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(btnclear))
                                    .addComponent(txtname, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addContainerGap(55, Short.MAX_VALUE))
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnsave)
                    .addComponent(btnclear))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 259, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnedit)
                    .addComponent(btndelete))
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnsaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsaveActionPerformed
            String name=txtname.getText();
            if(name.equals("")){
                Messages.showError("ProductType Name cannot be left empty..", "Input Error");
                txtname.requestFocus();
                return;
            }
            String btntext=btnsave.getText(); //Save
            //if(btntext=="Save") //100==200 Compares references or address
            if(btntext.equals("Save")){
                db.execute("Insert into ProductType values(?)", name);
                Messages.showInfo("ProductType entry is saved..","Saved");
            }else{
                db.execute("Update ProductType set ProductTypeName=? where ProductTypeName=?", name,oldname);
                Messages.showInfo("ProductType entry is updated..","Updated");
            }
            db.fillTable(table1, "select * from ProductType");
            txtname.requestFocus();
        
    }//GEN-LAST:event_btnsaveActionPerformed

    private void btnclearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnclearActionPerformed
        // TODO add your handling code here:
        //Clear
        txtname.setText("");
        btnsave.setText("Save");
        txtname.requestFocus();
        
    }//GEN-LAST:event_btnclearActionPerformed

    private void btndeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btndeleteActionPerformed
        int i=table1.getSelectedRow();
        if(i!=-1){              
        int ans=Messages.showConfirm("Do you want to remove selected ProductType entry?","Confirm");
        if(ans==JOptionPane.YES_OPTION){            
        Object name=table1.getValueAt(i, 0);
        db.execute("delete from ProductType where ProductTypeName=?", name);
        db.fillTable(table1, "select * from ProductType");
        }
        }else{
            Messages.showWarning("Please select row to delete","Select");
        }
        
    }//GEN-LAST:event_btndeleteActionPerformed

    private void btneditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btneditActionPerformed
        // TODO add your handling code here:
        //Edit
        int i=table1.getSelectedRow();
        if(i!=-1){            
        Object name=table1.getValueAt(i, 0);
        oldname=name.toString();
        txtname.setText(name+"");                
        btnsave.setText("Update");        
        txtname.requestFocus();
        }else{
            Messages.showWarning("Please select row to edit","Select");
        }
        
    }//GEN-LAST:event_btneditActionPerformed

    private void btncloseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncloseActionPerformed
        // Close
        dispose(); //close current form
    }//GEN-LAST:event_btncloseActionPerformed

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
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ProductTypeForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ProductTypeForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ProductTypeForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ProductTypeForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ProductTypeForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnclear;
    private javax.swing.JButton btnclose;
    private javax.swing.JButton btndelete;
    private javax.swing.JButton btnedit;
    private javax.swing.JButton btnsave;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbl2;
    private javax.swing.JTable table1;
    private javax.swing.JTextField txtname;
    // End of variables declaration//GEN-END:variables
}
