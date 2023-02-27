/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package NetflixAppGUI;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import static NetflixAppGUI.NetflixAppFrame.shows;
import Shows.Show;
import java.util.List;

/**
 *
 * @author mahmouderradi
 */
public class ShowSearchPanel extends javax.swing.JPanel {
    DefaultTableModel model;
    String [] colNames = {"Title", "Quality", "Genre", "Language", "Number of Views", "Synopsys", "Average Rating", "Total Watch"};
    /**
     * Creates new form ShowSearchPanel
     */
    public ShowSearchPanel() {
        model = new DefaultTableModel();
        model.setColumnIdentifiers(colNames);
        
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

        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel2 = new javax.swing.JLabel();
        genreTxt = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        resultsTable = new javax.swing.JTable();
        searchBtn = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/guis/icons/Search.png"))); // NOI18N
        jLabel1.setText("Search Show with Genre:");

        jLabel2.setText("Genre:");

        genreTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                genreTxtActionPerformed(evt);
            }
        });

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/guis/icons/About.png"))); // NOI18N
        jLabel3.setText("Search results:");

        resultsTable.setModel(model);
        jScrollPane1.setViewportView(resultsTable);

        searchBtn.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        searchBtn.setForeground(new java.awt.Color(0, 0, 204));
        searchBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/guis/icons/Zoom.png"))); // NOI18N
        searchBtn.setText("Search");
        searchBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator1)
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 500, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(37, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(genreTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(searchBtn)
                        .addGap(70, 70, 70))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(genreTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(searchBtn))
                .addGap(18, 18, 18)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(32, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void genreTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_genreTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_genreTxtActionPerformed

    private void searchBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchBtnActionPerformed
        // TODO add your handling code here:
        
        String genreStr = genreTxt.getText();
        if(genreStr.isEmpty()){
            JOptionPane.showMessageDialog(ShowSearchPanel.this, ""
            + "Please provide a valid genre.", "Search show...", JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        List<Show> results;
        
        try{
        results = shows.findShowWithGenre(genreStr);
        } catch (java.lang.IllegalArgumentException e){
            JOptionPane.showMessageDialog(ShowSearchPanel.this, ""
            + "Please provide a valid genre.", "Search show...", JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        if(!results.isEmpty()){
            Object [] [] data =  new Object[results.size()][colNames.length];
            for(int i = 0; i < results.size(); i++){
                Show show = results.get(i);
                data[i][0] = show.getTitle();
                data[i][1] = show.getQuality();
                data[i][2] = show.getGenre();
                data[i][3] = show.getLang();
                data[i][4] = show.getNum_views();
                data[i][5] = show.getSynopsys();
                data[i][6] = show.getAverage_rating();
                data[i][7] = show.getTotal_watch();
            }
            model.setDataVector(null, colNames);
        }else{
            model.setDataVector(null, colNames);
            JOptionPane.showMessageDialog(ShowSearchPanel.this, ""
            + "No search results.", "Search show...", JOptionPane.INFORMATION_MESSAGE);
            return;
        }
        
    }//GEN-LAST:event_searchBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField genreTxt;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTable resultsTable;
    private javax.swing.JButton searchBtn;
    // End of variables declaration//GEN-END:variables
}