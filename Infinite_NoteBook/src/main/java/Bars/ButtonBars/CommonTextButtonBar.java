/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package Bars.ButtonBars;

import Blocks.BlockType;

/**
 *
 * @author gzy
 */
public class CommonTextButtonBar extends javax.swing.JPanel {

    /**
     * Creates new form CommonTextButtonBar
     * @param parentBlock
     */
    public CommonTextButtonBar(Blocks.CommonTextBlock parentBlock) {
        initComponents();
        parenCommonTextBlock = parentBlock;
    }
    
    public boolean setTypeText(String newType){
        typeLabel.setText(newType);
        return true;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        changeButton = new javax.swing.JButton();
        typeLabel = new javax.swing.JLabel();
        findTextField = new javax.swing.JTextField();
        findButton = new javax.swing.JButton();
        replaceButton = new javax.swing.JButton();
        replaceAllButton = new javax.swing.JButton();
        blockTypeComboBox = new javax.swing.JComboBox<>();
        operationsComboBox = new javax.swing.JComboBox<>();
        operationButton = new javax.swing.JButton();

        setOpaque(false);
        setPreferredSize(new java.awt.Dimension(1188, 62));
        setLayout(null);

        changeButton.setText("Change");
        changeButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                changeButtonMouseClicked(evt);
            }
        });
        add(changeButton);
        changeButton.setBounds(765, 18, 91, 29);

        typeLabel.setForeground(new java.awt.Color(238, 238, 238));
        typeLabel.setText("Common Text Block");
        add(typeLabel);
        typeLabel.setBounds(6, 23, 151, 16);
        add(findTextField);
        findTextField.setBounds(163, 18, 131, 26);

        findButton.setText("Find");
        findButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                findButtonMouseClicked(evt);
            }
        });
        add(findButton);
        findButton.setBounds(300, 18, 91, 29);

        replaceButton.setText("Replace");
        replaceButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                replaceButtonMouseClicked(evt);
            }
        });
        add(replaceButton);
        replaceButton.setBounds(397, 18, 92, 29);

        replaceAllButton.setText("Replace All");
        replaceAllButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                replaceAllButtonMouseClicked(evt);
            }
        });
        add(replaceAllButton);
        replaceAllButton.setBounds(495, 18, 113, 29);

        blockTypeComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Common Text", "Code", "HyperText", "Markdown", "Formula", "Rich Text", "Infinite Title", "Image", "Video", "Table", "Blank" }));
        add(blockTypeComboBox);
        blockTypeComboBox.setBounds(614, 19, 145, 27);

        operationsComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Move Up", "Move Down", "Undo", "Redo", "Copy Block", "Cut Block", "Delete Block", "Import", "Export", "Compile", "Display", "Compile & Display", "Archive Block" }));
        add(operationsComboBox);
        operationsComboBox.setBounds(862, 19, 162, 27);

        operationButton.setText("Take Operation");
        operationButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                operationButtonMouseClicked(evt);
            }
        });
        add(operationButton);
        operationButton.setBounds(1030, 18, 140, 29);
    }// </editor-fold>//GEN-END:initComponents

    private void findButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_findButtonMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_findButtonMouseClicked

    private void replaceButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_replaceButtonMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_replaceButtonMouseClicked

    private void replaceAllButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_replaceAllButtonMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_replaceAllButtonMouseClicked

    private void changeButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_changeButtonMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_changeButtonMouseClicked

    private void operationButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_operationButtonMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_operationButtonMouseClicked

    private Blocks.BlockType newType = BlockType.BLANK;
    private String findString = "";
    private Bars.ButtonBars.OperationType op = Bars.ButtonBars.OperationType.NO_OP;
    
    private Blocks.CommonTextBlock parenCommonTextBlock;

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> blockTypeComboBox;
    private javax.swing.JButton changeButton;
    private javax.swing.JButton findButton;
    private javax.swing.JTextField findTextField;
    private javax.swing.JButton operationButton;
    private javax.swing.JComboBox<String> operationsComboBox;
    private javax.swing.JButton replaceAllButton;
    private javax.swing.JButton replaceButton;
    private javax.swing.JLabel typeLabel;
    // End of variables declaration//GEN-END:variables
}
