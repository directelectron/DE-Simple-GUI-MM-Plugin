/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package de;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Point;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.WindowConstants;

/**
 *
 * @author lyon_yao
 */
public class NoticeWaitDialog extends javax.swing.JDialog {

    /**
     * Creates new form NoticeWaitDialog
     */
    public NoticeWaitDialog(JFrame parent, boolean modal) {
        super(parent);
        setTitle("");
        this.setModal(modal);
        this.setResizable(false);
        this.setSize(270, 80);
        this.setDefaultCloseOperation(WindowConstants.DO_NOTHING_ON_CLOSE);
        Point pD = parent.getLocation();
        Dimension pS = parent.getSize();
        int x = (int) (pD.getX() + ((pS.getWidth() - this.getWidth()) / 2));
        int y = (int) (pD.getY() + ((pS.getHeight() - this.getHeight()) / 2));
        this.setLocation(x, y);
        JLabel lab = new JLabel("Operation is in progress, please wait...");
        lab.setFont(new java.awt.Font("Tahoma", 0, 12));
        this.getContentPane().setLayout(new FlowLayout(FlowLayout.CENTER, 15, 15));
        this.getContentPane().add(lab);
        this.setVisible(true);

    }

    public static void main(String args[]) throws Exception {
        JFrame f = new JFrame("");
        f.setLocation(100, 200);
        new NoticeWaitDialog(f, false);
    }
}
