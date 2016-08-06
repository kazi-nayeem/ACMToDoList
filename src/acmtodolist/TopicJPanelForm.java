/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package acmtodolist;

import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import problemdetails.TopicDetail;

/**
 *
 * @author Kazi Nayeem
 */
public class TopicJPanelForm extends javax.swing.JPanel {

    /**
     * Creates new form TopicJPanelForm. initialize all components in the panel
     */
    public TopicJPanelForm() {
        super();
        initComponents();

        initActionListener();
        refreshTopicList();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        topicJList = new javax.swing.JList();

        topicJList.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        topicJList.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jScrollPane1.setViewportView(topicJList);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 175, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 563, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private String topicNameList[];
    private String last_Selected_Topic = TopicDetail.ALL_PROBLEM_Topic;

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JList topicJList;
    // End of variables declaration//GEN-END:variables

    /**
     * get all topic list and update topic list panel
     */
    final void refreshTopicList() {

        topicNameList = TopicDetail.getTopicNameList();

        for (int i = 0; i < topicNameList.length; i++) {
            System.err.println(topicNameList[i]);
        }

        topicJList.setListData(topicNameList);
    }

    /**
     * initialize action listener of topic list panel.when a topic select
     * problem list panel update accordingly
     */
    private void initActionListener() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        topicJList.addListSelectionListener(new ListSelectionListener() {

            @Override
            public void valueChanged(ListSelectionEvent lse) {
                //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
                if (topicJList.getSelectedValue() == null) {
                    return;
                }
                if (!topicJList.getSelectedValue().toString().equalsIgnoreCase(last_Selected_Topic)) {
                    last_Selected_Topic = topicJList.getSelectedValue().toString();
                    AcmToDoList.changeSelectedTopic(last_Selected_Topic);
                }
            }
        });
    }
}
