/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.u1a4_robertchen;

/**
 *
 * @author 335091559
 */
public class StudentGrades extends javax.swing.JFrame {
    
    String[][] course = new String[30][6];
    String firstN, lastN, testOne, testTwo, testThree, testFour, firstOfStudent, lastOfStudent;
    double testO, testTw, testTh, testF, avg;
    int people = 0;

    /**
     * Creates new form StudentGrades
     */
    public StudentGrades() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unduplicateStudentNotFounded")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        title = new javax.swing.JLabel();
        first = new javax.swing.JLabel();
        firstName = new javax.swing.JTextField();
        last = new javax.swing.JLabel();
        lastName = new javax.swing.JTextField();
        testPrompt1 = new javax.swing.JLabel();
        testPrompt2 = new javax.swing.JLabel();
        testPrompt3 = new javax.swing.JLabel();
        testPrompt4 = new javax.swing.JLabel();
        test1 = new javax.swing.JTextField();
        test2 = new javax.swing.JTextField();
        test3 = new javax.swing.JTextField();
        test4 = new javax.swing.JTextField();
        add = new javax.swing.JButton();
        studentAverage = new javax.swing.JButton();
        courseAverages = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        output = new javax.swing.JTextArea();
        outputField = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        title.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 30)); // NOI18N
        title.setForeground(new java.awt.Color(102, 204, 255));
        title.setText("Student Grades");

        first.setText("First Name:");

        firstName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                firstNameActionPerformed(evt);
            }
        });

        last.setText("Last Name:");

        lastName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lastNameActionPerformed(evt);
            }
        });

        testPrompt1.setText("Test 1:");

        testPrompt2.setText("Test 2:");

        testPrompt3.setText("Test 3:");

        testPrompt4.setText("Test 4:");

        test1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                test1ActionPerformed(evt);
            }
        });

        test2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                test2ActionPerformed(evt);
            }
        });

        test3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                test3ActionPerformed(evt);
            }
        });

        test4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                test4ActionPerformed(evt);
            }
        });

        add.setText("Add");
        add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addActionPerformed(evt);
            }
        });

        studentAverage.setText("Student Average");
        studentAverage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                studentAverageActionPerformed(evt);
            }
        });

        courseAverages.setText("Course Averages");
        courseAverages.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                courseAveragesActionPerformed(evt);
            }
        });

        output.setEditable(false);
        output.setColumns(20);
        output.setRows(5);
        jScrollPane1.setViewportView(output);

        outputField.setEditable(false);
        outputField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                outputFieldActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                            .addComponent(testPrompt3)
                                            .addGap(18, 18, 18)
                                            .addComponent(test3, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(testPrompt1)
                                            .addGap(18, 18, 18)
                                            .addComponent(test1))
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                            .addComponent(testPrompt2)
                                            .addGap(18, 18, 18)
                                            .addComponent(test2, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                            .addComponent(testPrompt4)
                                            .addGap(18, 18, 18)
                                            .addComponent(test4, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(first)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(firstName, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(26, 26, 26)
                                        .addComponent(last)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(lastName, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(add, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(43, 43, 43)
                                        .addComponent(studentAverage))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(courseAverages)
                                        .addGap(62, 62, 62))))
                            .addComponent(outputField, javax.swing.GroupLayout.PREFERRED_SIZE, 395, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(140, 140, 140)
                        .addComponent(title))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(100, 100, 100)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(14, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(title)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(first)
                    .addComponent(firstName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(last)
                    .addComponent(lastName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(testPrompt1)
                            .addComponent(test1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(testPrompt2)
                            .addComponent(test2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(testPrompt3)
                            .addComponent(test3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(testPrompt4)
                            .addComponent(test4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(add)
                            .addComponent(studentAverage))
                        .addGap(66, 66, 66)
                        .addComponent(courseAverages)
                        .addGap(13, 13, 13)))
                .addGap(34, 34, 34)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                .addComponent(outputField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void addActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addActionPerformed
        firstN = firstName.getText();
        lastN = lastName.getText();
        testOne = test1.getText();
        testTwo = test2.getText();
        testThree = test3.getText();
        testFour = test4.getText();
        boolean duplicateStudentNotFound = true;
       
        try {
            testO = Double.parseDouble(testOne);
            testTw = Double.parseDouble(testTwo);
            testTh = Double.parseDouble(testThree);
            testF = Double.parseDouble(testFour);
            
            if (firstN.isEmpty() || lastN.isEmpty() || testOne.isEmpty() || testThree.isEmpty() || testFour.isEmpty()) {
                outputField.setText("Invalid input. You cannot have an empty field.");
            } else if (people > 29) {
                outputField.setText("You can only have 30 students in a class.");
            } else {
                if (testO >= 0 && testO <= 100 && testTw >= 0 && testTw <= 100 && testTh >= 0 && testTh <= 100 && testF >= 0 && testF <= 100) {
                    for (int i = 0; i < people; i++) {
                        if (course[i][0].equals(firstN) && course[i][1].equals(lastN)) {
                            outputField.setText("This student already exsists in the course.");
                            duplicateStudentNotFound = false;
                            break;
                        }  
                    }
                    if (duplicateStudentNotFound) {
                        course[people][0] = firstN;
                        course[people][1] = lastN;
                        course[people][2] = testOne;
                        course[people][3] = testTwo;
                        course[people][4] = testThree;
                        course[people][5] = testFour;
                        people ++;
                        
                        output.append("First Name: " + firstN + "\nLast Name: " + lastN + "\n");
                        output.append("Test 1 Grade: " + Math.round(testO * 100.0) / 100.0 + "\n");
                        output.append("Test 2 Grade: " + Math.round(testTw * 100.0) / 100.0 + "\n");
                        output.append("Test 3 Grade: " + Math.round(testTh * 100.0) / 100.0 + "\n");
                        output.append("Test 4 Grade: " + Math.round(testF * 100.0) / 100.0 + "\n\n");
                    }
                } else {
                    outputField.setText("Invalid input. Please make sure you have entered your full name and your test scores as positive numbers.");
                }
            }
        } 
        catch (Exception e) {
            outputField.setText("Invalid input. Please make sure you have entered your full name and your test scores as positive numbers.");
        }
    }//GEN-LAST:event_addActionPerformed

    private void firstNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_firstNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_firstNameActionPerformed

    private void lastNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lastNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_lastNameActionPerformed

    private void test1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_test1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_test1ActionPerformed

    private void test2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_test2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_test2ActionPerformed

    private void test3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_test3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_test3ActionPerformed

    private void test4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_test4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_test4ActionPerformed

    private void studentAverageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_studentAverageActionPerformed
        if (firstN.isEmpty() || lastN.isEmpty()) {
                outputField.setText("Invalid input. You cannot have an empty field.");
        } else {
            for (int i = 0; i < people; i++) {
                if (course[i][0].equals(firstName.getText()) && course[i][1].equals(lastName.getText())) {
                    avg = (Double.parseDouble(course[i][2]) + Double.parseDouble(course[i][3]) + Double.parseDouble(course[i][4]) + Double.parseDouble(course[i][5])) / 4;
                    outputField.setText("The student's average is: " + Double.toString(Math.round(avg * 100.0) / 100.0) + "%");
                    break;
                } else {
                    outputField.setText("This student is not in the class");
                }
            }
        }
    }//GEN-LAST:event_studentAverageActionPerformed

    private void courseAveragesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_courseAveragesActionPerformed
        double courseTotal = 0;
        
        for (int i = 0; i < people; i++) {
            courseTotal += (Double.parseDouble(course[i][2]) + Double.parseDouble(course[i][3]) + Double.parseDouble(course[i][4]) + Double.parseDouble(course[i][5])) / 4;
        }
        outputField.setText("The class average is: " + Double.toString(Math.round((courseTotal / people) * 100.0) / 100.0) + "%");
    }//GEN-LAST:event_courseAveragesActionPerformed

    private void outputFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_outputFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_outputFieldActionPerformed

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
            java.util.logging.Logger.getLogger(StudentGrades.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(StudentGrades.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(StudentGrades.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(StudentGrades.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new StudentGrades().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton add;
    private javax.swing.JButton courseAverages;
    private javax.swing.JLabel first;
    private javax.swing.JTextField firstName;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel last;
    private javax.swing.JTextField lastName;
    private javax.swing.JTextArea output;
    private javax.swing.JTextField outputField;
    private javax.swing.JButton studentAverage;
    private javax.swing.JTextField test1;
    private javax.swing.JTextField test2;
    private javax.swing.JTextField test3;
    private javax.swing.JTextField test4;
    private javax.swing.JLabel testPrompt1;
    private javax.swing.JLabel testPrompt2;
    private javax.swing.JLabel testPrompt3;
    private javax.swing.JLabel testPrompt4;
    private javax.swing.JLabel title;
    // End of variables declaration//GEN-END:variables
}
