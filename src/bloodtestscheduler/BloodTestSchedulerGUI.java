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
    private PatientBinaryTree patientTree = new PatientBinaryTree();
    private int currentIndex = 0;   // keeps track of the currently viewed appointment
    /**
     * Creates new form BloodTestSchedulerGUI
     */
    public BloodTestSchedulerGUI() {
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

        jScrollPane1 = new javax.swing.JScrollPane();
        displayTA = new javax.swing.JTextArea();
        queueBTN = new javax.swing.JButton();
        patientsBTN = new javax.swing.JButton();
        addPatientBTN = new javax.swing.JButton();
        noshowsBTN = new javax.swing.JButton();
        saveBTN = new javax.swing.JButton();
        loadBTN = new javax.swing.JButton();
        newBTN = new javax.swing.JButton();
        addDoctorBTN = new javax.swing.JButton();
        gpsBTN = new javax.swing.JButton();
        titleLBL = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();

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

        patientsBTN.setText("View Patients");
        patientsBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                patientsBTNActionPerformed(evt);
            }
        });

        addPatientBTN.setText("Add Patient");
        addPatientBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addPatientBTNActionPerformed(evt);
            }
        });

        noshowsBTN.setText("View No-Shows");

        saveBTN.setText("Save");

        loadBTN.setText("Load");

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

        jButton1.setText("Current Appointment");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Complete");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("No-Show");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
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
                                .addGap(18, 18, 18)
                                .addComponent(saveBTN)
                                .addGap(28, 28, 28)
                                .addComponent(loadBTN))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(44, 44, 44)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jButton2)
                                    .addComponent(jButton1)
                                    .addComponent(jButton3))))
                        .addGap(214, 214, 214)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(noshowsBTN)
                                    .addComponent(gpsBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(newBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(queueBTN)
                                    .addComponent(patientsBTN))
                                .addGap(89, 89, 89)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(addPatientBTN)
                                    .addComponent(addDoctorBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 24, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(99, 99, 99)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 514, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(queueBTN)
                    .addComponent(addPatientBTN)
                    .addComponent(jButton1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(saveBTN)
                            .addComponent(loadBTN)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(addDoctorBTN)
                            .addComponent(patientsBTN)
                            .addComponent(jButton2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(newBTN, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(noshowsBTN)
                                    .addComponent(jButton3))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 25, Short.MAX_VALUE)
                                .addComponent(gpsBTN)))))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void queueBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_queueBTNActionPerformed
        // TODO add your handling code here:
        displayTA.setText(testQueue.printQueue());
    }//GEN-LAST:event_queueBTNActionPerformed

    private void addDoctorBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addDoctorBTNActionPerformed
        // TODO add your handling code here:
        String name = JOptionPane.showInputDialog("Enter GP's name: ");
        String address = JOptionPane.showInputDialog("Enter GP's address: ");
        String phoneNo = JOptionPane.showInputDialog("Enter GP's phone number: ");
        GP tempGP = new GP(name, address, phoneNo);
        gpList.add(tempGP);
    }//GEN-LAST:event_addDoctorBTNActionPerformed

    private void addPatientBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addPatientBTNActionPerformed
        // TODO add your handling code here:
        // disable action if there are no GPs on file
        if (!gpList.isEmpty()) {
            String name = JOptionPane.showInputDialog(rootPane, "Enter patient's name: ");
            int age = Integer.parseInt(JOptionPane.showInputDialog(rootPane, "Enter patient's age: "));
            ArrayList<String> gpNames = new ArrayList<>();
            for (GP temp : gpList) {
                gpNames.add(temp.getName());
            }
            int choice3 = JOptionPane.showOptionDialog(rootPane, "", "Choose their designated GP: ", JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, null, gpNames.toArray(), gpNames.get(0));
            GP gp = gpList.get(choice3);
            Patient patientRecord = new Patient(name, age, gp);
            patientTree.insert(patientRecord, patientTree.getRoot());
            patientTree.resetTraversal();
        } else 
            displayTA.setText("No GPs on record!");
    }//GEN-LAST:event_addPatientBTNActionPerformed

    private void gpsBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gpsBTNActionPerformed
        // TODO add your handling code here:
        
        displayTA.setText("");
        for (GP gp : gpList) {
            displayTA.append(gp.toString());
        }
    }//GEN-LAST:event_gpsBTNActionPerformed

    private void newBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newBTNActionPerformed
        // TODO add your handling code here:
        // cannot set appointments if there are no patients on file
        if (!patientTree.isEmpty()) {
            PatientSelectorGUI selectGUI = new PatientSelectorGUI();
            patientTree.traverseTree(patientTree.getRoot());
            selectGUI.setPatientList(patientTree.getPatients());
            selectGUI.setPriorityQueue(testQueue);
            selectGUI.setVisible(true);
        } else
            displayTA.setText("No patients on file!");
    }//GEN-LAST:event_newBTNActionPerformed

    private void patientsBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_patientsBTNActionPerformed
        // TODO add your handling code here:
        displayTA.setText("");
        patientTree.resetTraversal();
        patientTree.traverseTree(patientTree.getRoot());
        for (Patient patient : patientTree.getPatients()) {
            displayTA.append(patient.toString() + "\n");
        }
    }//GEN-LAST:event_patientsBTNActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        displayTA.setText(testQueue.head().toString());
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        testQueue.dequeue();
        displayTA.setText("Appointment removed from queue. Patient has been seen.");
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        testQueue.dequeue();
        displayTA.setText("Appointment removed from queue. Patient did not turn up!");
    }//GEN-LAST:event_jButton3ActionPerformed

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
    private javax.swing.JTextArea displayTA;
    private javax.swing.JButton gpsBTN;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton loadBTN;
    private javax.swing.JButton newBTN;
    private javax.swing.JButton noshowsBTN;
    private javax.swing.JButton patientsBTN;
    private javax.swing.JButton queueBTN;
    private javax.swing.JButton saveBTN;
    private javax.swing.JLabel titleLBL;
    // End of variables declaration//GEN-END:variables
}
