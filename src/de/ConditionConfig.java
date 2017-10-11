/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package de;

import java.io.Serializable;

/**
 *
 * @author lyon_yao
 */
public class ConditionConfig implements Serializable {

    private int msec;
    private boolean smooth;
    private boolean gain;
    private boolean dark;
    private int bin;

    /**
     * @return the msec
     */
    public int getMsec() {
        return msec;
    }

    /**
     * @param msec the msec to set
     */
    public void setMsec(int msec) {
        this.msec = msec;
    }

    /**
     * @return the smooth
     */
    public boolean isSmooth() {
        return smooth;
    }

    /**
     * @param smooth the smooth to set
     */
    public void setSmooth(boolean smooth) {
        this.smooth = smooth;
    }

    /**
     * @return the gain
     */
    public boolean isGain() {
        return gain;
    }

    /**
     * @param gain the gain to set
     */
    public void setGain(boolean gain) {
        this.gain = gain;
    }

    /**
     * @return the dark
     */
    public boolean isDark() {
        return dark;
    }

    /**
     * @param dark the dark to set
     */
    public void setDark(boolean dark) {
        this.dark = dark;
    }

    /**
     * @return the bin
     */
    public int getBin() {
        return bin;
    }

    /**
     * @param bin the bin to set
     */
    public void setBin(int bin) {
        this.bin = bin;
    }
}
