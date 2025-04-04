/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package bloodtestscheduler;

import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author rokom
 */
public class BloodTestSchedulerGUI extends javax.swing.JFrame {
    private ArrayList<GP> gpList = new ArrayList<>();
    private PatientPriorityQueue testQueue = new PatientPriorityQueue();
    private NoShowQueue noShowQueue = new NoShowQueue();
    private PatientBinaryTree patientTree = new PatientBinaryTree();
    private int currentIndex = 0;   // keeps track of the currently viewed appointment
    /**
     * Creates new form BloodTestSchedulerGUI
     */
    public BloodTestSchedulerGUI() {
        initComponents();
    }

    public void printQueue() {
        displayTA.setText(testQueue.printQueue());
        displayTA.setCaretPosition(0);
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
        displayTA = new javax.swing.JTextArea();
        queueBTN = new javax.swing.JButton();
        addPatientBTN = new javax.swing.JButton();
        noshowsBTN = new javax.swing.JButton();
        newBTN = new javax.swing.JButton();
        addDoctorBTN = new javax.swing.JButton();
        gpsBTN = new javax.swing.JButton();
        titleLBL = new javax.swing.JLabel();
        getHeadBTN = new javax.swing.JButton();
        completeBTN = new javax.swing.JButton();
        noshowBTN = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Blood Test Scheduler");

        displayTA.setEditable(false);
        displayTA.setColumns(20);
        displayTA.setRows(5);
        displayTA.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        displayTA.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        displayTA.setEnabled(false);
        jScrollPane1.setViewportView(displayTA);

        queueBTN.setText("View Queue");
        queueBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                queueBTNActionPerformed(evt);
            }
        });

        addPatientBTN.setText("Add Patient");
        addPatientBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addPatientBTNActionPerformed(evt);
            }
        });

        noshowsBTN.setText("View No-Shows");
        noshowsBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                noshowsBTNActionPerformed(evt);
            }
        });

        newBTN.setText("New Appointment");
        newBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                newBTNActionPerformed(evt);
            }
        });

        addDoctorBTN.setText("Add GP");
        addDoctorBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addDoctorBTNActionPerformed(evt);
            }
        });

        gpsBTN.setText("View GPs");
        gpsBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gpsBTNActionPerformed(evt);
            }
        });

        titleLBL.setText("Blood Test Scheduler");

        getHeadBTN.setText("Current Appointment");
        getHeadBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                getHeadBTNActionPerformed(evt);
            }
        });

        completeBTN.setText("Complete");
        completeBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                completeBTNActionPerformed(evt);
            }
        });

        noshowBTN.setText("No-Show");
        noshowBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                noshowBTNActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(getHeadBTN)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(completeBTN)
                        .addComponent(noshowBTN)))
                .addGap(5, 5, 5)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 349, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(queueBTN)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(noshowsBTN)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(6, 6, 6)
                                        .addComponent(gpsBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(newBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(addDoctorBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(addPatientBTN))
                        .addGap(18, 18, 18))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(titleLBL)
                .addGap(298, 298, 298))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addComponent(titleLBL)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addComponent(addPatientBTN)
                        .addGap(18, 18, 18)
                        .addComponent(addDoctorBTN)
                        .addGap(136, 136, 136)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(newBTN, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addContainerGap())
                            .addGroup(layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(getHeadBTN, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(queueBTN, javax.swing.GroupLayout.Alignment.TRAILING))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(completeBTN)
                                    .addComponent(noshowsBTN))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(noshowBTN)
                                        .addGap(29, 29, 29))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(gpsBTN)
                                        .addGap(39, 39, 39))))))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 313, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void queueBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_queueBTNActionPerformed
        // TODO add your handling code here:
        printQueue();
    }//GEN-LAST:event_queueBTNActionPerformed

    private void addDoctorBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addDoctorBTNActionPerformed
        // TODO add your handling code here:
        GPRegistrationGUI gpGUI = new GPRegistrationGUI();
        gpGUI.setGPList(gpList);
        gpGUI.setVisible(true);
    }//GEN-LAST:event_addDoctorBTNActionPerformed

    private void addPatientBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addPatientBTNActionPerformed
        // TODO add your handling code here:
        // disable action if there are no GPs on file
        if (!gpList.isEmpty()) {
            PatientRegistrationGUI patientGUI = new PatientRegistrationGUI();
            patientGUI.setGPList(gpList);
            patientGUI.setPatientRecords(patientTree);
            patientGUI.setVisible(true);
        } else 
            displayTA.setText("No GPs on record!");
    }//GEN-LAST:event_addPatientBTNActionPerformed

    private void gpsBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gpsBTNActionPerformed
        // TODO add your handling code here:
        
        displayTA.setText("");
        for (GP gp : gpList) {
            displayTA.append(gp.toString() + "\n");
        }
        displayTA.setCaretPosition(0);
    }//GEN-LAST:event_gpsBTNActionPerformed

    private void newBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newBTNActionPerformed
        // TODO add your handling code here:
        // cannot set appointments if there are no patients on file
        if (!patientTree.isEmpty()) {
            PatientSelectorGUI selectGUI = new PatientSelectorGUI();
            patientTree.resetTraversal();
            patientTree.traverseTree(patientTree.getRoot());
            selectGUI.setPatientList(patientTree.getPatients());
            selectGUI.setPriorityQueue(testQueue);
            selectGUI.setRefGUI(this);
            selectGUI.setVisible(true);
        } else
            displayTA.setText("No patients on file!");
    }//GEN-LAST:event_newBTNActionPerformed

    private void getHeadBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_getHeadBTNActionPerformed
        // TODO add your handling code here:
        if (!testQueue.isEmpty())
            displayTA.setText(testQueue.head().toString());
        else
            displayTA.setText("Queue is empty!");
    }//GEN-LAST:event_getHeadBTNActionPerformed

    private void completeBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_completeBTNActionPerformed
        // TODO add your handling code here:
        if (!testQueue.isEmpty()) {
            testQueue.dequeue();
            if (!testQueue.isEmpty())
                displayTA.setText(testQueue.head().toString());
            else
                displayTA.setText("Queue is empty!");
        }
    }//GEN-LAST:event_completeBTNActionPerformed

    private void noshowBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_noshowBTNActionPerformed
        // TODO add your handling code here:
        if (!testQueue.isEmpty()) {
            noShowQueue.enqueue(testQueue.head());
            testQueue.dequeue();
            if (!testQueue.isEmpty())
                displayTA.setText(testQueue.head().toString());
            else
                displayTA.setText("Queue is empty!");
        }
    }//GEN-LAST:event_noshowBTNActionPerformed

    private void noshowsBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_noshowsBTNActionPerformed
        // TODO add your handling code here:
        displayTA.setText(noShowQueue.printQueue());
        displayTA.setCaretPosition(0);
    }//GEN-LAST:event_noshowsBTNActionPerformed

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
            java.util.logging.Logger.getLogger(BloodTestSchedulerGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BloodTestSchedulerGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BloodTestSchedulerGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BloodTestSchedulerGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BloodTestSchedulerGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addDoctorBTN;
    private javax.swing.JButton addPatientBTN;
    private javax.swing.JButton completeBTN;
    private javax.swing.JTextArea displayTA;
    private javax.swing.JButton getHeadBTN;
    private javax.swing.JButton gpsBTN;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton newBTN;
    private javax.swing.JButton noshowBTN;
    private javax.swing.JButton noshowsBTN;
    private javax.swing.JButton queueBTN;
    private javax.swing.JLabel titleLBL;
    // End of variables declaration//GEN-END:variables
}
