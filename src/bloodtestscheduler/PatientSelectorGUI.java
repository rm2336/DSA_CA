/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package bloodtestscheduler;

import java.util.ArrayList;

/**
 *
 * @author rokom
 */
public class PatientSelectorGUI extends javax.swing.JFrame {
    
    private ArrayList<Patient> patientList;
    private PatientPriorityQueue testQueueRef;
    private String priority = "Low";
    private boolean fromWard = false;
    /**
     * Creates new form PatientSelectorGUI
     */
    public PatientSelectorGUI() {
        initComponents();
    }

    public void setPatientList(ArrayList<Patient> list) {
        patientList = list;
        for (Patient iterator : patientList)
            patientsCB.addItem(iterator.getName());
    }
    
    public void setPriorityQueue(PatientPriorityQueue queue) {
        testQueueRef = queue;
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        priorityBG = new javax.swing.ButtonGroup();
        titleLBL = new javax.swing.JLabel();
        selectLBL = new javax.swing.JLabel();
        patientsCB = new javax.swing.JComboBox<>();
        confirmBTN = new javax.swing.JButton();
        cancelBTN = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        displayTA = new javax.swing.JTextArea();
        priorityLBL = new javax.swing.JLabel();
        lowRB = new javax.swing.JRadioButton();
        mediumRB = new javax.swing.JRadioButton();
        urgentRB = new javax.swing.JRadioButton();
        wardLBL = new javax.swing.JLabel();
        wardCHB = new javax.swing.JCheckBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        titleLBL.setText("New Appointment");

        selectLBL.setText("Select Patient");

        patientsCB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                patientsCBActionPerformed(evt);
            }
        });

        confirmBTN.setText("´Confirm");
        confirmBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                confirmBTNActionPerformed(evt);
            }
        });

        cancelBTN.setText("Cancel");
        cancelBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelBTNActionPerformed(evt);
            }
        });

        displayTA.setEditable(false);
        displayTA.setColumns(20);
        displayTA.setRows(5);
        jScrollPane1.setViewportView(displayTA);

        priorityLBL.setText("Select Priority");

        priorityBG.add(lowRB);
        lowRB.setText("Low");
        lowRB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lowRBActionPerformed(evt);
            }
        });

        priorityBG.add(mediumRB);
        mediumRB.setText("Medium");
        mediumRB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mediumRBActionPerformed(evt);
            }
        });

        priorityBG.add(urgentRB);
        urgentRB.setText("Urgent");
        urgentRB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                urgentRBActionPerformed(evt);
            }
        });

        wardLBL.setText("Referred From Ward");

        wardCHB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                wardCHBActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(titleLBL, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(139, 139, 139))
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(confirmBTN)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(cancelBTN)
                        .addGap(46, 46, 46))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(urgentRB, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 122, Short.MAX_VALUE))
                            .addComponent(patientsCB, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(selectLBL, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(priorityLBL, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lowRB, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(mediumRB, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(wardLBL)
                                .addGap(18, 18, 18)
                                .addComponent(wardCHB)))
                        .addGap(15, 15, 15))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(titleLBL)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(57, 57, 57)
                        .addComponent(selectLBL)
                        .addGap(18, 18, 18)
                        .addComponent(patientsCB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(38, 38, 38)
                        .addComponent(priorityLBL)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lowRB)
                        .addGap(18, 18, 18)
                        .addComponent(mediumRB)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(urgentRB)
                            .addComponent(wardLBL)
                            .addComponent(wardCHB))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 38, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(confirmBTN)
                    .addComponent(cancelBTN))
                .addGap(25, 25, 25))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void patientsCBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_patientsCBActionPerformed
        // TODO add your handling code here:
        if (patientsCB.getSelectedItem() != null)
            for (int i = 0; i < patientList.size(); i++)
                if (patientsCB.getSelectedItem().toString().equals(patientList.get(i).getName()))
                    displayTA.setText(patientList.get(i).toString());
    }//GEN-LAST:event_patientsCBActionPerformed

    private void confirmBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_confirmBTNActionPerformed
        // TODO add your handling code here:
        if (patientsCB.getSelectedItem() != null) {
            // locate patient in list
            for (int i = 0; i < patientList.size(); i++)
                if (patientsCB.getSelectedItem().toString().equals(patientList.get(i).getName())) {
                    Patient tempPatient = patientList.get(i);
                    Appointment tempApt = new Appointment(tempPatient, priority, fromWard);
                    testQueueRef.enqueue(tempApt, priority);
                    patientsCB.setSelectedItem(null);
                    break;
                }                   
        }
    }//GEN-LAST:event_confirmBTNActionPerformed

    private void lowRBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lowRBActionPerformed
        // TODO add your handling code here:
        priority = "Low";
    }//GEN-LAST:event_lowRBActionPerformed

    private void mediumRBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mediumRBActionPerformed
        // TODO add your handling code here:
        priority = "Medium";
    }//GEN-LAST:event_mediumRBActionPerformed

    private void urgentRBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_urgentRBActionPerformed
        // TODO add your handling code here:
        priority = "Urgent";
    }//GEN-LAST:event_urgentRBActionPerformed

    private void cancelBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelBTNActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_cancelBTNActionPerformed

    private void wardCHBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_wardCHBActionPerformed
        // TODO add your handling code here:
        if (wardCHB.isSelected())
            fromWard = true;
        else
            fromWard = false;
    }//GEN-LAST:event_wardCHBActionPerformed

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
            java.util.logging.Logger.getLogger(PatientSelectorGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PatientSelectorGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PatientSelectorGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PatientSelectorGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PatientSelectorGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cancelBTN;
    private javax.swing.JButton confirmBTN;
    private javax.swing.JTextArea displayTA;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JRadioButton lowRB;
    private javax.swing.JRadioButton mediumRB;
    private javax.swing.JComboBox<String> patientsCB;
    private javax.swing.ButtonGroup priorityBG;
    private javax.swing.JLabel priorityLBL;
    private javax.swing.JLabel selectLBL;
    private javax.swing.JLabel titleLBL;
    private javax.swing.JRadioButton urgentRB;
    private javax.swing.JCheckBox wardCHB;
    private javax.swing.JLabel wardLBL;
    // End of variables declaration//GEN-END:variables
}
