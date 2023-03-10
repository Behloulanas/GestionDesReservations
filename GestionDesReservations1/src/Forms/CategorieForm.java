/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Forms;

import entities.Categorie;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import services.CategorieService;

/**
 *
 * @author ep
 */
public class CategorieForm extends javax.swing.JInternalFrame {
    
        private CategorieService cats;
        private DefaultTableModel model;
        private static int id;
        

    /**
     * Creates new form CategorieForm
     */
    public CategorieForm() {
        initComponents();
        cats=new CategorieService();
        model=(DefaultTableModel) ListeCategories.getModel();
        load();
        
    }
    
    private void load(){
        model.setRowCount(0);
        for(Categorie c:cats.findAll()){
            model.addRow(new Object[]{
                c.getId(),
                c.getCode(),
                c.getLibelle(),
            }
                    );
        }
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
        jLabel1 = new javax.swing.JLabel();
        codetxt = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        libelletxt = new javax.swing.JTextField();
        Addcategorie = new javax.swing.JButton();
        supprimercategorie = new javax.swing.JButton();
        modifiercategorie = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        ListeCategories = new javax.swing.JTable();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Gestion des cat??gories");

        jPanel1.setBackground(new java.awt.Color(255, 255, 153));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "New Cat??gorie", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 12))); // NOI18N

        jLabel1.setText("Code : ");

        jLabel2.setText("libelle : ");

        Addcategorie.setText("Ajouter");
        Addcategorie.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddcategorieActionPerformed(evt);
            }
        });

        supprimercategorie.setText("Supprimer");
        supprimercategorie.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                supprimercategorieActionPerformed(evt);
            }
        });

        modifiercategorie.setText("Modifier");
        modifiercategorie.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modifiercategorieActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(codetxt, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(libelletxt, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(1, 1, 1)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 53, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(supprimercategorie, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(Addcategorie, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(modifiercategorie, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(codetxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(Addcategorie)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(libelletxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(45, 45, 45))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(7, 7, 7)
                        .addComponent(supprimercategorie)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(modifiercategorie)
                        .addContainerGap(26, Short.MAX_VALUE))))
        );

        jPanel2.setBackground(new java.awt.Color(255, 255, 153));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Liste des Cat??gories", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 12))); // NOI18N

        ListeCategories.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "id", "code", "libelle"
            }
        ));
        ListeCategories.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ListeCategoriesMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(ListeCategories);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 93, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void modifiercategorieActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modifiercategorieActionPerformed
        String code=codetxt.getText();
        String libelle=libelletxt.getText();
        Categorie c=cats.findById(id);
        c.setCode(code);
        c.setLibelle(libelle);
        int reponse=JOptionPane.showConfirmDialog(this, "Voulez-vous vraiment modifier la cat??gorie");
        if(reponse==0){
            if(cats.update(c)){
                JOptionPane.showMessageDialog(this, "Cat??gorie bien modifi??e");
            }
        }
        
        
        
    }//GEN-LAST:event_modifiercategorieActionPerformed

    private void AddcategorieActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddcategorieActionPerformed
        String code=codetxt.getText();
        String libelle=libelletxt.getText();
        if(cats.create(new Categorie(code,libelle))){
           JOptionPane.showMessageDialog(this, "Catgorie bien ajout??e");
        }
        load();
        
    }//GEN-LAST:event_AddcategorieActionPerformed

    private void ListeCategoriesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ListeCategoriesMouseClicked
       id=Integer.parseInt(model.getValueAt(ListeCategories.getSelectedRow(), 0).toString());
       codetxt.setText(model.getValueAt(ListeCategories.getSelectedRow(), 1).toString());
       libelletxt.setText(model.getValueAt(ListeCategories.getSelectedRow(), 2).toString());
    }//GEN-LAST:event_ListeCategoriesMouseClicked

    private void supprimercategorieActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_supprimercategorieActionPerformed
       int reponse=JOptionPane.showConfirmDialog(this, "Voulez vous vraiment supprimer la cat??gorie");
       if(reponse==0){
           if(cats.delete(cats.findById(id))){
               JOptionPane.showMessageDialog(this, "cat??gorie bien supprim??e");
           }
       }
       load();
    }//GEN-LAST:event_supprimercategorieActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Addcategorie;
    private javax.swing.JTable ListeCategories;
    private javax.swing.JTextField codetxt;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField libelletxt;
    private javax.swing.JButton modifiercategorie;
    private javax.swing.JButton supprimercategorie;
    // End of variables declaration//GEN-END:variables
}
