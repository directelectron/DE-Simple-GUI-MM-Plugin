/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package de;

import java.awt.Dimension;
import java.awt.Point;
import java.awt.Toolkit;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import org.micromanager.api.ScriptInterface;

/**
 *
 * @author Demo
 */
public class DESimpleGUI implements org.micromanager.api.MMPlugin {

    private ScriptInterface gui_;
    private MainFrame mainframe = null;
    //private MainFrame myFrame;
    public static String menuName = "Direct Electron GUI";

    @Override
    public void dispose() {
    }

    @Override
    public void setApp(ScriptInterface si) {
        gui_ = si;
    }

    @Override
    public void show() {
        if (mainframe == null) {
            mainframe = new MainFrame(gui_);
            mainframe.addWindowListener(new WindowAdapter() {
                public void windowClosing(WindowEvent e) {
                    mainframe.cacheConfigToFile();
                }

                public void windowOpened(WindowEvent e) {
                    mainframe.loadCachedConfig();
                }
            });

        }
        Dimension size = mainframe.getSize();
        Toolkit defaultToolkit = Toolkit.getDefaultToolkit();
        Dimension screenSize = defaultToolkit.getScreenSize();
        Point rs = new Point((screenSize.width - size.width) / 2,
                (screenSize.height - size.height) / 2);
        mainframe.setLocation(rs);
        mainframe.setVisible(true);
        mainframe.UpdateCameraStatus();
        mainframe.setDefaultCloseOperation(mainframe.HIDE_ON_CLOSE);
    }

    @Override
    public void configurationChanged() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public String getDescription() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public String getInfo() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public String getVersion() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public String getCopyright() {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}
