/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package Blocks;

import java.util.ArrayList;
import java.util.List;
import javax.swing.text.*;
import java.awt.Font;
import java.awt.Color;

/**
 *
 * @author gzy
 */
public class RichTextToolBox extends javax.swing.JPanel {

    /**
     * Creates new form RichTextToolBox
     */
    public RichTextToolBox(RichTextBlock parBlock) {
        initComponents();
        parentRichTextBlock = parBlock;
        initComponentsManually();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setFontSizeButton = new javax.swing.JButton();
        changeFontButton = new javax.swing.JButton();
        changeColorButton = new javax.swing.JButton();
        colorComboBox = new javax.swing.JComboBox<>();
        changeFormButton = new javax.swing.JButton();
        fontComboBox = new javax.swing.JComboBox<>();
        formComboBox = new javax.swing.JComboBox<>();
        boldButton = new javax.swing.JButton();
        italyButton = new javax.swing.JButton();
        underlineButton = new javax.swing.JButton();
        fontSizeTextField = new javax.swing.JTextField();
        copyButton = new javax.swing.JButton();
        cutButton = new javax.swing.JButton();
        pasteButton = new javax.swing.JButton();

        setOpaque(false);
        setPreferredSize(new java.awt.Dimension(200, 238));
        setSize(new java.awt.Dimension(200, 238));

        setFontSizeButton.setText("A");
        setFontSizeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                setFontSizeButtonActionPerformed(evt);
            }
        });

        changeFontButton.setText("Font");
        changeFontButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                changeFontButtonActionPerformed(evt);
            }
        });

        changeColorButton.setText("Color");
        changeColorButton.setPreferredSize(new java.awt.Dimension(75, 29));

        colorComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "BLACK", "BLUE", "CYAN", "DARK_GRAY", "GRAY", "GREEN", "LIGHT_GRAY", "MAGENTA", "ORANGE", "PINK", "RED", "WHITE", "YELLOW" }));
        colorComboBox.setMinimumSize(new java.awt.Dimension(75, 27));
        colorComboBox.setPreferredSize(new java.awt.Dimension(75, 27));
        colorComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                colorComboBoxActionPerformed(evt);
            }
        });

        changeFormButton.setText("Form");
        changeFormButton.setPreferredSize(new java.awt.Dimension(75, 29));

        fontComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Dialog", "DialogInput", "Monospaced", "Serif", "SansSerif" }));
        fontComboBox.setMinimumSize(new java.awt.Dimension(75, 27));
        fontComboBox.setPreferredSize(new java.awt.Dimension(75, 27));
        fontComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fontComboBoxActionPerformed(evt);
            }
        });

        formComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Left Align", "Mid Align", "Right Align" }));
        formComboBox.setMinimumSize(new java.awt.Dimension(75, 27));
        formComboBox.setPreferredSize(new java.awt.Dimension(75, 27));
        formComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                formComboBoxActionPerformed(evt);
            }
        });

        boldButton.setText("B");
        boldButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boldButtonActionPerformed(evt);
            }
        });

        italyButton.setText("I");

        underlineButton.setText("U");

        copyButton.setText("C");
        copyButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                copyButtonActionPerformed(evt);
            }
        });

        cutButton.setText("K");
        cutButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cutButtonActionPerformed(evt);
            }
        });

        pasteButton.setText("P");
        pasteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pasteButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(boldButton, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(underlineButton, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(pasteButton, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(15, 15, 15)
                        .addComponent(cutButton, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(changeFontButton, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addComponent(fontComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(13, 13, 13)
                        .addComponent(changeFormButton, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addComponent(formComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(13, 13, 13)
                        .addComponent(changeColorButton, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addComponent(colorComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(italyButton, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(copyButton, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(setFontSizeButton, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(fontSizeTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(boldButton, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(underlineButton, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(italyButton, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(copyButton, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(setFontSizeButton, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(fontSizeTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(pasteButton, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(cutButton, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(changeFontButton, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(fontComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(changeFormButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(formComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(changeColorButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(colorComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void changeFontButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_changeFontButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_changeFontButtonActionPerformed

    private void setFontSizeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_setFontSizeButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_setFontSizeButtonActionPerformed

    private void boldButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boldButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_boldButtonActionPerformed

    private void fontComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fontComboBoxActionPerformed
        // TODO add your handling code here:
        changeFontButton.setAction(parentRichTextBlock.getFontFamilyAction(fontFamilyMap.get(fontComboBox.getSelectedIndex())));
    }//GEN-LAST:event_fontComboBoxActionPerformed

    private void copyButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_copyButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_copyButtonActionPerformed

    private void cutButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cutButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cutButtonActionPerformed

    private void pasteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pasteButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pasteButtonActionPerformed

    private void formComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_formComboBoxActionPerformed
        // TODO add your handling code here:
        changeFormButton.setAction(parentRichTextBlock.getAlignmentAction(formComboBox.getSelectedIndex()));
    }//GEN-LAST:event_formComboBoxActionPerformed

    private void colorComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_colorComboBoxActionPerformed
        // TODO add your handling code here:
        changeColorButton.setAction(parentRichTextBlock.getForegroundAction(fontColorMap.get(colorComboBox.getSelectedIndex())));
    }//GEN-LAST:event_colorComboBoxActionPerformed

    private void initComponentsManually(){
        boldButton.setAction(parentRichTextBlock.getBoldAction());
        boldButton.setText("B");
        italyButton.setAction(parentRichTextBlock.getItalicAction());
        italyButton.setText("I");
        underlineButton.setAction(parentRichTextBlock.getUnderlineAction());
        underlineButton.setText("U");
        copyButton.setAction(parentRichTextBlock.getCpyAction());
        copyButton.setText("C");
        cutButton.setAction(parentRichTextBlock.getCutAction());
        cutButton.setText("X");
        pasteButton.setAction(parentRichTextBlock.getPasteAction());
        pasteButton.setText("P");
        int fontSize = 16;
        try{
            fontSize = Integer.parseInt(fontSizeTextField.getText());
        }
        catch(NumberFormatException e){
            fontSize = 16;
        }
        setFontSizeButton.setAction(parentRichTextBlock.getFontSizeAction(fontSize));
        setFontSizeButton.setText("A");
        changeFontButton.setAction(parentRichTextBlock.getFontFamilyAction(fontFamilyMap.get(fontComboBox.getSelectedIndex())));
        changeFontButton.setText("Font");
        changeFormButton.setAction(parentRichTextBlock.getAlignmentAction(formComboBox.getSelectedIndex()));
        changeFormButton.setText("Form");
        changeColorButton.setAction(parentRichTextBlock.getForegroundAction(fontColorMap.get(colorComboBox.getSelectedIndex())));
        changeColorButton.setText("Color");
    }
    
    private RichTextBlock parentRichTextBlock;
    private ArrayList<String> fontFamilyMap = new ArrayList<String>(
            List.of(Font.DIALOG,Font.DIALOG_INPUT,Font.MONOSPACED,Font.SERIF,Font.SANS_SERIF)
    );
    private ArrayList<Color> fontColorMap = new ArrayList<Color>(
            List.of(Color.BLACK, Color.BLUE,Color.CYAN,Color.DARK_GRAY,Color.GRAY,Color.GREEN,Color.LIGHT_GRAY,Color.MAGENTA,Color.ORANGE,Color.PINK,Color.RED,Color.WHITE,Color.YELLOW)
    );

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton boldButton;
    private javax.swing.JButton changeColorButton;
    private javax.swing.JButton changeFontButton;
    private javax.swing.JButton changeFormButton;
    private javax.swing.JComboBox<String> colorComboBox;
    private javax.swing.JButton copyButton;
    private javax.swing.JButton cutButton;
    private javax.swing.JComboBox<String> fontComboBox;
    private javax.swing.JTextField fontSizeTextField;
    private javax.swing.JComboBox<String> formComboBox;
    private javax.swing.JButton italyButton;
    private javax.swing.JButton pasteButton;
    private javax.swing.JButton setFontSizeButton;
    private javax.swing.JButton underlineButton;
    // End of variables declaration//GEN-END:variables
}
