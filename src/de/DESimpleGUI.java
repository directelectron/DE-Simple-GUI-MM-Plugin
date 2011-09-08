/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package de;

import org.micromanager.api.ScriptInterface;
import mmcorej.CMMCore;

/**
 *
 * @author Demo
 */
public class DESimpleGUI implements org.micromanager.api.MMPlugin{
    private ScriptInterface gui_;
   
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
        MainFrame mainframe = new MainFrame(gui_);
        mainframe.setVisible(true);
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
