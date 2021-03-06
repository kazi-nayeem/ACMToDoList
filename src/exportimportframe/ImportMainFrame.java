package exportimportframe;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import org.json.JSONException;
import org.json.JSONObject;
import problemdetails.FullProblem;
import problemdetails.ProblemDemo;
import problemdetails.TopicDetail;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Kazi Nayeem
 */
public class ImportMainFrame extends javax.swing.JFrame {

    /**
     * Creates new form ImportMainFrame.initialize all components in this Frame.
     */
    public ImportMainFrame() {
        super("Import Problems");

        allProb = new ArrayList<>();
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
        jLabel2 = new javax.swing.JLabel();
        directoryJTextField = new javax.swing.JTextField();
        browseJButton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        importJTable = new javax.swing.JTable();
        impotJButton = new javax.swing.JButton();
        removeJButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setText("Problem List");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel2.setText("Choose File:");

        browseJButton.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        browseJButton.setText("Browse");
        browseJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                browseJButtonActionPerformed(evt);
            }
        });

        importJTable.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        importJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Judge Name", "Problem ID", "Problem Name", "Mark"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Boolean.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(importJTable);

        impotJButton.setText("Import");
        impotJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                impotJButtonActionPerformed(evt);
            }
        });

        removeJButton.setText("Remove");
        removeJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removeJButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(199, 199, 199)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(directoryJTextField)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(browseJButton))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 484, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(removeJButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(impotJButton)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(directoryJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(browseJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 9, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(impotJButton)
                    .addComponent(removeJButton))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * File selection button action perform. open a JFileChooser for file
     * selection
     *
     * @param evt
     */
    private void browseJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_browseJButtonActionPerformed
        // TODO add your handling code here:

        JFileChooser choose = new JFileChooser();
        choose.setFileSelectionMode(JFileChooser.FILES_ONLY);

        if (choose.showSaveDialog(this) == JFileChooser.APPROVE_OPTION) {
            File fi = choose.getSelectedFile();
            directoryJTextField.setText(fi.getAbsolutePath());
            newFileSelected(fi);
        }
    }//GEN-LAST:event_browseJButtonActionPerformed

    /**
     * remove marked problems from import list and update problem list
     *
     * @param evt
     */
    private void removeJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removeJButtonActionPerformed
        // TODO add your handling code here:

        DefaultTableModel tableModel = (DefaultTableModel) importJTable.getModel();

        for (int i = 0; i < tableModel.getRowCount(); i++) {
            if (tableModel.getValueAt(i, 3).equals(true)) {
                ProblemDemo now = new ProblemDemo(tableModel.getValueAt(i, 0).toString(), tableModel.getValueAt(i, 1).toString());

                for (int j = 0; j < allProb.size(); j++) {
                    if (allProb.get(j).isSameProblem(now)) {
                        allProb.remove(j);
                        break;
                    }
                }
            }
        }
        refreshImportTable();

    }//GEN-LAST:event_removeJButtonActionPerformed

    /**
     * import all problem in the list
     *
     * @param evt
     */

    private void impotJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_impotJButtonActionPerformed
        // TODO add your handling code here:

        for (int i = 0; i < allProb.size(); i++) {
            TopicDetail.addImportedProblem(allProb.get(i));
        }
        allProb.clear();
        refreshImportTable();
        acmtodolist.AcmToDoList.main_Window.refreshJudgeComboBox();
        acmtodolist.AcmToDoList.main_Window.refreshTopicList();
        acmtodolist.AcmToDoList.changeSelectedTopic(acmtodolist.AcmToDoList.lastSelectedTopic);
    }//GEN-LAST:event_impotJButtonActionPerformed

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
            java.util.logging.Logger.getLogger(ImportMainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ImportMainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ImportMainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ImportMainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ImportMainFrame().setVisible(true);
            }
        });
    }

    ArrayList<FullProblem> allProb;

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton browseJButton;
    private javax.swing.JTextField directoryJTextField;
    private javax.swing.JTable importJTable;
    private javax.swing.JButton impotJButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton removeJButton;
    // End of variables declaration//GEN-END:variables

    /**
     * import problem from selected file fi
     *
     * @param fi selected file
     */
    synchronized private void newFileSelected(File fi) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        allProb = new ArrayList<>();

        String str = fi.getAbsolutePath();
        if (str.endsWith(".txt")) {
            txtFileProcess(fi);
        } else if (str.endsWith(".csv")) {
            csvFileProcess(fi);
        } else {

            JOptionPane.showMessageDialog(this, "File format not match", "", JOptionPane.ERROR_MESSAGE);
        }
        sameProblemFind();
        refreshImportTable();
    }

    /**
     * update import table
     */
    private void refreshImportTable() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.

        DefaultTableModel model = (DefaultTableModel) importJTable.getModel();

        while (model.getRowCount() > 0) {
            model.removeRow(0);
        }

        for (int i = 0; i < allProb.size(); i++) {
            model.addRow(allProb.get(i).getExImTableModel());
        }
    }

    /**
     * .txt file input. import all problems from the selected file
     *
     * @param file selected file
     */
    private void txtFileProcess(File file) {
        Scanner scan = null;

        try {
            //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            scan = new Scanner(file);

            while (scan.hasNext()) {
                JSONObject obj = new JSONObject(scan.nextLine());

                String judge = obj.getString("judge");
                String probID = obj.getString("problemID");

                FullProblem prob = new FullProblem(judge, probID, obj.getString("problemName"));
                prob.setDifficultyLevel(obj.getInt("diffLevel"));

                prob.setTopicJSON(obj.getJSONArray("topics"));
                prob.setInputOutputJSON(obj.getJSONArray("inputoutput"));

                allProb.add(prob);
            }
        } catch (FileNotFoundException ex) {
            //Logger.getLogger(ImportMainFrame.class.getName()).log(Level.SEVERE, null, ex);
            allProb.clear();
            JOptionPane.showMessageDialog(this, "File not found", "", JOptionPane.ERROR_MESSAGE);
            return;
        } catch (JSONException ex) {
            //Logger.getLogger(ImportMainFrame.class.getName()).log(Level.SEVERE, null, ex);
            allProb.clear();
            JOptionPane.showMessageDialog(this, "File format not match", "", JOptionPane.ERROR_MESSAGE);
            return;
        } finally {
            if (scan != null) {
                scan.close();
            }
        }

    }

    /**
     * import all problem from .csv selected file
     *
     * @param file selected file
     */
    private void csvFileProcess(File file) {
        Scanner scan = null;

        try {
            //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            scan = new Scanner(file);
            scan.nextLine();
            scan.nextLine();

            while (scan.hasNext()) {
                String str = scan.nextLine();
                System.out.println(str);
                int pos = 0;
                for (int i = 0; i < str.length(); i++) {
                    if (str.charAt(i) == ',') {
                        pos = i;
                        break;
                    }
                }
                String judge = str.substring(0, pos);
                //System.out.println(judge);
                str = str.substring(pos + 1);

                for (int i = 0; i < str.length(); i++) {
                    if (str.charAt(i) == ',') {
                        pos = i;
                        break;
                    }
                }
                String probID = str.substring(0, pos);
                str = str.substring(pos + 1);
                //System.out.println(probID);

                for (int i = 0; i < str.length(); i++) {
                    if (str.charAt(i) == ',') {
                        pos = i;
                        break;
                    }
                }
                String probName = str.substring(0, pos);
                str = str.substring(pos + 1);
                //System.out.println(probName);

                FullProblem prob = new FullProblem(judge, probID, probName);

                for (int i = 0; i < str.length(); i++) {
                    if (str.charAt(i) == ',') {
                        pos = i;
                        break;
                    }
                }
                prob.setDifficultyLevel(Integer.parseInt(str.substring(0, pos)));
                str = str.substring(pos + 1);
                //System.out.println("diff " + prob.getDifficultyLevel() + "   " + str);

                pos = 1;
                for (int i = 0; i < str.length(); i++) {
                    if (str.charAt(i) == ',') {
                        pos = i;
                        break;
                    }
                }

                int topicno = Integer.parseInt(str.substring(0, pos));
                if (str.length() >= pos + 1) {
                    str = str.substring(pos + 1);
                }
                //System.out.println(topicno);

                for (int j = 0; j + 1 < topicno; j++) {

                    for (int i = 0; i < str.length(); i++) {
                        if (str.charAt(i) == ',') {
                            pos = i;
                            break;
                        }
                    }
                    prob.addTopic(str.substring(0, pos));
                    str = str.substring(pos + 1);
                }
                if (topicno > 0) {
                    prob.addTopic(str);
                }
                allProb.add(prob);
            }
        } catch (FileNotFoundException ex) {
            //Logger.getLogger(ImportMainFrame.class.getName()).log(Level.SEVERE, null, ex);
            allProb.clear();
            JOptionPane.showMessageDialog(this, "File not found", "", JOptionPane.ERROR_MESSAGE);
            return;
        } catch (Exception ex) {
            //Logger.getLogger(ImportMainFrame.class.getName()).log(Level.SEVERE, null, ex);
            allProb.clear();
            JOptionPane.showMessageDialog(this, "File format not match", "", JOptionPane.ERROR_MESSAGE);
            return;
        } finally {
            if (scan != null) {
                scan.close();
            }
        }

    }

    /**
     * remove same problem from the import list
     */
    private void sameProblemFind() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        //DefaultTableModel tableModel = (DefaultTableModel) exportJTable.getModel();

        for (int i = 0; i < allProb.size(); i++) {
            for (int j = i + 1; j < allProb.size();) {
                if (allProb.get(i).isSameProblem(allProb.get(j))) {
                    allProb.remove(j);
                } else {
                    j++;
                }
            }
        }
    }
}
