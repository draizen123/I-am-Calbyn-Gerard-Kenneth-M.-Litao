/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classmate;

/**
 *
 * @author Server-PC

import java.awt.Color;
import javax.swing.JOptionPane;
/**
 *
 * @author Server-PC
 */
import java.awt.Color;
import javax.swing.JOptionPane;
    


public class myLottery extends javax.swing.JFrame {

   int[] n = new int[6]; //for int random numbers
   String[] que = new String[6]; //variable for setText (number generator)
   String[] inputs = new String[6]; //variable for user input
   int[] arr = new int[6]; //integer for user input
   int c = 0; //counter for winning combination
   
  
   
    public myLottery() {
        initComponents(); //gui format
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField6 = new javax.swing.JTextField();
        q1 = new javax.swing.JTextField();
        q2 = new javax.swing.JTextField();
        q3 = new javax.swing.JTextField();
        q4 = new javax.swing.JTextField();
        q5 = new javax.swing.JTextField();
        q6 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        input1 = new javax.swing.JTextField();
        input2 = new javax.swing.JTextField();
        input3 = new javax.swing.JTextField();
        input4 = new javax.swing.JTextField();
        input5 = new javax.swing.JTextField();
        input6 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        compButton = new javax.swing.JButton();

        jTextField6.setText("jTextField6");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                formMouseMoved(evt);
            }
        });

        q1.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N

        q2.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N

        q3.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N

        q4.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N

        q5.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N

        q6.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        jButton1.setText("Number Generator");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButton1MouseEntered(evt);
            }
        });
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 255));
        jLabel1.setText("Jackpot Lottery");

        jButton2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton2.setText("Exit");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        input1.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N

        input2.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N

        input3.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N

        input4.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N

        input5.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N

        input6.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 255));
        jLabel2.setText("Enter combination list here!");

        compButton.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        compButton.setText("Click here!");
        compButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                compButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton2))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(62, 62, 62)
                                .addComponent(jButton1))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(29, 29, 29)
                                    .addComponent(input1, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(input2)
                                    .addGap(18, 18, 18)
                                    .addComponent(input3, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(input4, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(input5, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(input6, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(20, 20, 20)
                                    .addComponent(q1, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel1)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(q2, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(18, 18, 18)
                                            .addComponent(q3, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(18, 18, 18)
                                            .addComponent(q4, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(18, 18, 18)
                                            .addComponent(q5, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(18, 18, 18)
                                            .addComponent(q6, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                        .addGap(0, 40, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(89, 89, 89)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(compButton, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(q1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(q2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(q3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(q4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(q5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(q6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 22, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(input1, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(input2, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(input3, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(input4, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(input5, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(input6, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(2, 2, 2)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(compButton, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(4, 4, 4)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton2)
                .addGap(12, 12, 12))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        //system exit
        System.exit(0);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void formMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseMoved
        this.getContentPane().setBackground(Color.gray);
    }//GEN-LAST:event_formMouseMoved

    private void jButton1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseEntered
        //inputs for jtextfield in generate number
        q1.setText(que[0] = "");
        q2.setText(que[1] = "");
        q3.setText(que[2] = "");
        q4.setText(que[3] = "");
        q5.setText(que[4] = "");
        q6.setText(que[5] = "");
    }//GEN-LAST:event_jButton1MouseEntered

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        //action performed for buttion number generator.
        n[0] = 1 + (int) (Math.random() * 45);
        que[0] += n[0];
        q1.setText(que[0]);
        n[1] = 1 + (int) (Math.random() * 45);
        que[1] += n[1];
        q2.setText(que[1]);
        n[2] = 1 + (int) (Math.random() * 45);
        que[2] += n[2];
        q3.setText(que[2]);
        n[3] = 1 + (int) (Math.random() * 45);
        que[3] += n[3];
        q4.setText(que[3]);
        n[4] = 1 + (int) (Math.random() * 45);
        que[4] += n[4];
        q5.setText(que[4]);
        n[5] = 1 + (int) (Math.random() * 45);
        que[5] += n[5];
        q6.setText(que[5]);
        
        // for duplicate number in random then if the number is duplicate it random again until it is unique
        while(n[1] == n[0]){
            q2.setText(que[1] = "");
            n[1] = 1 + (int) (Math.random() * 45);
            que[1] += n[1];
            q2.setText(que[1]);
        }
        while((n[2] == n[1]) || (n[2] == n[0])){
            q3.setText(que[2] = "");
            n[2] = 1 +(int) (Math.random() * 45);
            que[2] += n[2];
            q3.setText(que[2]);
        }
        while((n[3] == n[1]) || (n[3] == n[2]) || (n[3] == n[0])){
            q4.setText(que[3] = "");
            n[3] = 1 + (int) (Math.random() * 45);
            que[3] += n[3];
            q4.setText(que[3]);
        }
        while((n[4] == n[1]) || (n[4] == n[2]) || (n[4] == n[3]) || (n[4] == n[0])){
            q5.setText(que[4] = "");
            n[4] = 1 + (int) (Math.random() * 45);
            que[4] += n[4];
            q5.setText(que[4]);
        }
        while((n[5] == n[1]) || (n[5] == n[2]) || (n[5] == n[3]) || (n[5] == n[4]) || (n[5] == n[0])){
            q6.setText(que[5] = "");
            n[5] =1 + (int) (Math.random() * 45);
            que[5] += n[5];
            q6.setText(que[5]);
        }
        
        //it reads the 2arrays then compare it to check if there is same value
        for(int i = 0; i < n.length  ; i++){//for random numbers
            for(int j = 0; j < arr.length ; j++){//input numbers
                if(n[i] == arr[j]){ 
                    c++;
                    System.out.println("common number are: " +n[i]);
                }
            }
        }
            System.out.println(c);
        
       // for winning prize
       switch (c) {
           case 1:
               JOptionPane.showMessageDialog(null, "you win: PHP5,000");
               System.exit(0);
           case 2:
               JOptionPane.showMessageDialog(null, "you win: PHP10,000");
               System.exit(0);
           case 3:
               JOptionPane.showMessageDialog(null, "you win: PHP50,000");
               System.exit(0);
           case 4:
               JOptionPane.showMessageDialog(null, "you win: PHP100,000");
               System.exit(0);
           case 5:
               JOptionPane.showMessageDialog(null, "you win: PHP500,000");
               System.exit(0);
           case 6:
               JOptionPane.showMessageDialog(null, "you win a jockpot prize: PHP1,000,000");
               System.exit(0);
           default:
               JOptionPane.showMessageDialog(null, "No match");
               System.exit(0);
       }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void compButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_compButtonActionPerformed
        //jtextfield for user input
        input1.setText(inputs[0] = "");
        input2.setText(inputs[1] = "");
        input3.setText(inputs[2] = "");
        input4.setText(inputs[3] = "");
        input5.setText(inputs[4] = "");
        input6.setText(inputs[5] = "");
        
        for(int k = 0; k < arr.length; k++){
            arr[k] = Integer.parseInt(JOptionPane.showInputDialog("Enter number: "));
        }
        inputs[0]+=arr[0];
        input1.setText(inputs[0]);
        inputs[1]+=arr[1];
        input2.setText(inputs[1]);
        inputs[2]+=arr[2];
        input3.setText(inputs[2]);
        inputs[3]+=arr[3];
        input4.setText(inputs[3]);
        inputs[4]+=arr[4];
        input5.setText(inputs[4]);
        inputs[5]+=arr[5];
        input6.setText(inputs[5]);
        
        if(arr[0] >=46 || arr[1] >=46 || arr[2] >=46 || arr[3] >=46 || arr[4] >=46 || arr[5] >=46){
            JOptionPane.showMessageDialog(null,"invalid input");
            System.exit(0);
        }
        
        //for duplicate number of user input
        while(arr[1] == arr[0]){
            JOptionPane.showMessageDialog(null,"You enter duplicate number");
            System.exit(0);
        }
        while((arr[2] == arr[1]) || (arr[2] == arr[0])){
            JOptionPane.showMessageDialog(null,"You enter duplicate number");
            System.exit(0);
        }
        while((arr[3] == arr[0]) || (arr[3] == arr[1]) || (arr[3] == arr[2])){
            JOptionPane.showMessageDialog(null,"You enter duplicate number");
            System.exit(0);
        }
        while((arr[4] == arr[1]) || (arr[4] == arr[2]) || (arr[4] == arr[3]) || (arr[4] == arr[0])){
            JOptionPane.showMessageDialog(null,"You enter duplicate number");
            System.exit(0);
        }
        while((arr[5] == arr[0]) || (arr[5] == arr[1]) || (arr[5] == arr[2]) || 
                (arr[5] == arr[3]) || (arr[5] == arr[4])){
            JOptionPane.showMessageDialog(null,"You enter duplicate number");
            System.exit(0);
        }
    }//GEN-LAST:event_compButtonActionPerformed
    /**
     * @param args the command line arguments
     */
  
        


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton compButton;
    private javax.swing.JTextField input1;
    private javax.swing.JTextField input2;
    private javax.swing.JTextField input3;
    private javax.swing.JTextField input4;
    private javax.swing.JTextField input5;
    private javax.swing.JTextField input6;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField q1;
    private javax.swing.JTextField q2;
    private javax.swing.JTextField q3;
    private javax.swing.JTextField q4;
    private javax.swing.JTextField q5;
    private javax.swing.JTextField q6;
    // End of variables declaration//GEN-END:variables
}

    
