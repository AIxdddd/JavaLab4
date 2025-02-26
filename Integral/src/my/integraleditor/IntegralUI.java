/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package my.integraleditor;

import java.awt.Color;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.LinkedList;
import java.util.List;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;
/**
 *
 * @author Александр
 */
public class IntegralUI extends javax.swing.JFrame {
    private List<RecIntegral> integralList;
    /**
     * Creates new form IntegralUI
     */
    public IntegralUI() {
        
        initComponents();
        integralList = new LinkedList<>();
        JTableHeader header = jTable2.getTableHeader();
        header.setReorderingAllowed(false);
        header.setBackground(new Color(0, 102, 204));
        
       
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
        min_value_jTextField = new javax.swing.JTextField();
        max_value_jTextField = new javax.swing.JTextField();
        step_jTextField = new javax.swing.JTextField();
        add_jButton = new javax.swing.JButton();
        delete_jButton = new javax.swing.JButton();
        calculate_jButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jLabel4 = new javax.swing.JLabel();
        clearjButton = new javax.swing.JButton();
        filljButton = new javax.swing.JButton();
        saveTextjButton = new javax.swing.JButton();
        saveBinaryjButton = new javax.swing.JButton();
        loadTextjButton = new javax.swing.JButton();
        loadBinaryjButton = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("sqrt(x)");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jPanel1.setBackground(java.awt.SystemColor.textHighlight);

        min_value_jTextField.setBackground(new java.awt.Color(0, 153, 255));
        min_value_jTextField.setForeground(new java.awt.Color(242, 242, 242));
        min_value_jTextField.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 153, 255)));

        max_value_jTextField.setBackground(new java.awt.Color(0, 153, 255));
        max_value_jTextField.setForeground(new java.awt.Color(242, 242, 242));
        max_value_jTextField.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 153, 255)));

        step_jTextField.setBackground(new java.awt.Color(0, 153, 255));
        step_jTextField.setForeground(new java.awt.Color(242, 242, 242));
        step_jTextField.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 153, 255)));

        add_jButton.setBackground(new java.awt.Color(0, 153, 255));
        add_jButton.setForeground(new java.awt.Color(242, 242, 242));
        add_jButton.setText("Добавить");
        add_jButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        add_jButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                add_jButtonActionPerformed(evt);
            }
        });

        delete_jButton.setBackground(new java.awt.Color(0, 153, 255));
        delete_jButton.setForeground(new java.awt.Color(242, 242, 242));
        delete_jButton.setText("Удалить");
        delete_jButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        delete_jButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                delete_jButtonActionPerformed(evt);
            }
        });

        calculate_jButton.setBackground(new java.awt.Color(0, 153, 255));
        calculate_jButton.setForeground(new java.awt.Color(242, 242, 242));
        calculate_jButton.setText("Вычислить");
        calculate_jButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        calculate_jButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                calculate_jButtonActionPerformed(evt);
            }
        });

        jLabel1.setForeground(java.awt.SystemColor.window);
        jLabel1.setText("Нижняя граница");

        jLabel2.setForeground(new java.awt.Color(242, 242, 242));
        jLabel2.setText("Верхняя граница");

        jLabel3.setForeground(new java.awt.Color(242, 242, 242));
        jLabel3.setText("Шаг");

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Нижний", "Верхний", "Шаг", "Результат"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Double.class, java.lang.Double.class, java.lang.Double.class, java.lang.Double.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jTable2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jTable2.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);
        jTable2.setEditingRow(1);
        jTable2.setShowGrid(false);
        jTable2.setShowHorizontalLines(true);
        jTable2.setShowVerticalLines(true);
        jScrollPane2.setViewportView(jTable2);

        jLabel4.setForeground(new java.awt.Color(242, 242, 242));
        jLabel4.setText("sqrt(x)");

        clearjButton.setBackground(new java.awt.Color(0, 153, 255));
        clearjButton.setForeground(new java.awt.Color(242, 242, 242));
        clearjButton.setText("Очистить ");
        clearjButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearjButtonActionPerformed(evt);
            }
        });

        filljButton.setBackground(new java.awt.Color(0, 153, 255));
        filljButton.setForeground(new java.awt.Color(242, 242, 242));
        filljButton.setText("Заполнить");
        filljButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                filljButtonActionPerformed(evt);
            }
        });

        saveTextjButton.setText("Текстовый");
        saveTextjButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveTextjButtonActionPerformed(evt);
            }
        });

        saveBinaryjButton.setText("Бинарный");
        saveBinaryjButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveBinaryjButtonActionPerformed(evt);
            }
        });

        loadTextjButton.setText("Текстовый");
        loadTextjButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loadTextjButtonActionPerformed(evt);
            }
        });

        loadBinaryjButton.setText("Бинарный");
        loadBinaryjButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loadBinaryjButtonActionPerformed(evt);
            }
        });

        jLabel5.setForeground(new java.awt.Color(242, 242, 242));
        jLabel5.setText("Сохранить как");

        jLabel6.setForeground(new java.awt.Color(242, 242, 242));
        jLabel6.setText("Загрузить как");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(min_value_jTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(filljButton, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(step_jTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, Short.MAX_VALUE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(max_value_jTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(clearjButton, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(add_jButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(calculate_jButton, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(delete_jButton, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 510, Short.MAX_VALUE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(saveTextjButton)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(saveBinaryjButton))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(52, 52, 52)
                                .addComponent(jLabel5)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(loadTextjButton)
                                .addGap(18, 18, 18)
                                .addComponent(loadBinaryjButton))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addGap(60, 60, 60))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(195, 195, 195)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4)
                .addGap(43, 43, 43)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(add_jButton)
                    .addComponent(min_value_jTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addComponent(filljButton))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(delete_jButton)
                    .addComponent(max_value_jTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(clearjButton))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(calculate_jButton)
                    .addComponent(step_jTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(saveTextjButton)
                    .addComponent(saveBinaryjButton)
                    .addComponent(loadTextjButton)
                    .addComponent(loadBinaryjButton))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void add_jButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_add_jButtonActionPerformed
        DefaultTableModel model = (DefaultTableModel) jTable2.getModel();
        try{
        double min_value = Double.parseDouble(min_value_jTextField.getText());
        double max_value = Double.parseDouble(max_value_jTextField.getText());
        double step = Double.parseDouble(step_jTextField.getText());
        if (min_value >= max_value) {
            JOptionPane.showMessageDialog(IntegralUI.this, "Нижняя граница должна быть меньше верхней.", "Ошибка", JOptionPane.ERROR_MESSAGE);
            return;
        }
        if (step <= 0) {
            JOptionPane.showMessageDialog(IntegralUI.this, "Шаг должен быть положительным.", "Ошибка", JOptionPane.ERROR_MESSAGE);
            return;
        }
        RecIntegral rec = new RecIntegral(min_value, max_value, step, 0);
        integralList.add(rec);
        model.addRow(new Object[]{min_value, max_value, step,0});
        } catch(NumberFormatException ex){
            JOptionPane.showMessageDialog(IntegralUI.this, "Вводите число.", "Ошибка", JOptionPane.ERROR_MESSAGE);
        } catch (InvalidValueException ex) {
            JOptionPane.showMessageDialog(IntegralUI.this, ex.getMessage(), "Ошибка", JOptionPane.ERROR_MESSAGE);
        }
        
        
    }//GEN-LAST:event_add_jButtonActionPerformed

    private void delete_jButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_delete_jButtonActionPerformed
        DefaultTableModel model = (DefaultTableModel) jTable2.getModel();
        int index = jTable2.getSelectedRow();
        if(index!= -1){
            integralList.remove(index);
            model.removeRow(index);
        }else JOptionPane.showMessageDialog(IntegralUI.this, "Выберите строку для удаления.");
    }//GEN-LAST:event_delete_jButtonActionPerformed

    private void calculate_jButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_calculate_jButtonActionPerformed
        DefaultTableModel model = (DefaultTableModel) jTable2.getModel();
        int index = jTable2.getSelectedRow();
        
        if(index!= -1){
            RecIntegral rec = integralList.get(index);
            rec.integral();
            model.setValueAt(rec.getResult(), index, 3);
        }else JOptionPane.showMessageDialog(IntegralUI.this, "Выберите строку для вычисления.");
    }//GEN-LAST:event_calculate_jButtonActionPerformed

    private void clearjButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearjButtonActionPerformed
    DefaultTableModel model = (DefaultTableModel) jTable2.getModel();
    model.setRowCount(0);

    
    
    }//GEN-LAST:event_clearjButtonActionPerformed

    private void filljButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_filljButtonActionPerformed
DefaultTableModel model = (DefaultTableModel) jTable2.getModel();
    model.setRowCount(0); // Очищаем таблицу перед заполнением

    for (RecIntegral rec : integralList) {
        model.addRow(new Object[]{
            rec.getMinValue(),
            rec.getMaxValue(),
            rec.getStep(),
            rec.getResult()
        });
    }
    }//GEN-LAST:event_filljButtonActionPerformed

    private void loadTextjButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loadTextjButtonActionPerformed
    JFileChooser fileChooser = new JFileChooser();
    int option = fileChooser.showOpenDialog(this);
    if (option == JFileChooser.APPROVE_OPTION) {
        File file = fileChooser.getSelectedFile();
        DefaultTableModel model = (DefaultTableModel) jTable2.getModel();
        model.setRowCount(0); // Очищаем таблицу перед загрузкой
        integralList.clear(); // Очищаем коллекцию

        try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(",");
                double minValue = Double.parseDouble(parts[0]);
                double maxValue = Double.parseDouble(parts[1]);
                double step = Double.parseDouble(parts[2]);
                double result = Double.parseDouble(parts[3]);

                RecIntegral rec = new RecIntegral(minValue, maxValue, step, result);
                integralList.add(rec);
                model.addRow(new Object[]{minValue, maxValue, step, result});
            }
            JOptionPane.showMessageDialog(this, "Данные загружены из текстового файла.");
        } catch (IOException | NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "Ошибка при загрузке файла: " + ex.getMessage(), "Ошибка", JOptionPane.ERROR_MESSAGE);
        } catch (InvalidValueException ex) {
        JOptionPane.showMessageDialog(IntegralUI.this, ex.getMessage(), "Ошибка", JOptionPane.ERROR_MESSAGE);
    }
    }    }//GEN-LAST:event_loadTextjButtonActionPerformed

    private void saveTextjButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveTextjButtonActionPerformed
    JFileChooser fileChooser = new JFileChooser();
    int option = fileChooser.showSaveDialog(this);
    if (option == JFileChooser.APPROVE_OPTION) {
        File file = fileChooser.getSelectedFile();
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(file))) {
            for (RecIntegral rec : integralList) {
                writer.write(rec.getMinValue() + "," + rec.getMaxValue() + "," + rec.getStep() + "," + rec.getResult());
                writer.newLine();
            }
            JOptionPane.showMessageDialog(this, "Данные сохранены в текстовом файле.");
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(this, "Ошибка при сохранении файла: " + ex.getMessage(), "Ошибка", JOptionPane.ERROR_MESSAGE);
        }
    }    }//GEN-LAST:event_saveTextjButtonActionPerformed

    private void saveBinaryjButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveBinaryjButtonActionPerformed

    JFileChooser fileChooser = new JFileChooser();
    int option = fileChooser.showSaveDialog(this);
    if (option == JFileChooser.APPROVE_OPTION) {
        File file = fileChooser.getSelectedFile();
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(file))) {
            oos.writeObject(integralList);
            JOptionPane.showMessageDialog(this, "Данные сохранены в двоичном файле.");
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(this, "Ошибка при сохранении файла: " + ex.getMessage(), "Ошибка", JOptionPane.ERROR_MESSAGE);
        }
    }
    }//GEN-LAST:event_saveBinaryjButtonActionPerformed

    private void loadBinaryjButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loadBinaryjButtonActionPerformed
JFileChooser fileChooser = new JFileChooser();
    int option = fileChooser.showOpenDialog(this);
    if (option == JFileChooser.APPROVE_OPTION) {
        File file = fileChooser.getSelectedFile();
        DefaultTableModel model = (DefaultTableModel) jTable2.getModel();
        model.setRowCount(0); // Очищаем таблицу перед загрузкой

        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(file))) {
            integralList = (List<RecIntegral>) ois.readObject();
            for (RecIntegral rec : integralList) {
                model.addRow(new Object[]{rec.getMinValue(), rec.getMaxValue(), rec.getStep(), rec.getResult()});
            }
            JOptionPane.showMessageDialog(this, "Данные загружены из двоичного файла.");
        } catch (IOException | ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(this, "Ошибка при загрузке файла: " + ex.getMessage(), "Ошибка", JOptionPane.ERROR_MESSAGE);
        }
    }
    }//GEN-LAST:event_loadBinaryjButtonActionPerformed

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
            java.util.logging.Logger.getLogger(IntegralUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(IntegralUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(IntegralUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(IntegralUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        
        
        
        
        
        
        
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new IntegralUI().setVisible(true);
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton add_jButton;
    private javax.swing.JButton calculate_jButton;
    private javax.swing.JButton clearjButton;
    private javax.swing.JButton delete_jButton;
    private javax.swing.JButton filljButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable2;
    private javax.swing.JButton loadBinaryjButton;
    private javax.swing.JButton loadTextjButton;
    private javax.swing.JTextField max_value_jTextField;
    private javax.swing.JTextField min_value_jTextField;
    private javax.swing.JButton saveBinaryjButton;
    private javax.swing.JButton saveTextjButton;
    private javax.swing.JTextField step_jTextField;
    // End of variables declaration//GEN-END:variables

}

