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
public class CameraDataConfig implements Serializable {

    private boolean finalImage = true;
    private boolean sumImages = false;
    private int sumImagesCount = 0;
    private boolean rawData = false;
    private boolean saveCurrentSumImages = false;
    private boolean saveCurrentRawData = false;
    private int acquireDarkReference = 2000;
    private int acquireGainReference = 2000;
    private ConditionConfig condition1 = new ConditionConfig();
    private ConditionConfig condition2 = new ConditionConfig();
    private ConditionConfig condition3 = new ConditionConfig();

    /**
     * @return the finalImage
     */
    public boolean isFinalImage() {
        return finalImage;
    }

    /**
     * @param finalImage the finalImage to set
     */
    public void setFinalImage(boolean finalImage) {
        this.finalImage = finalImage;
    }

    /**
     * @return the sumImages
     */
    public boolean isSumImages() {
        return sumImages;
    }

    /**
     * @param sumImages the sumImages to set
     */
    public void setSumImages(boolean sumImages) {
        this.sumImages = sumImages;
    }

    /**
     * @return the sumImagesCount
     */
    public int getSumImagesCount() {
        return sumImagesCount;
    }

    /**
     * @param sumImagesCount the sumImagesCount to set
     */
    public void setSumImagesCount(int sumImagesCount) {
        this.sumImagesCount = sumImagesCount;
    }

    /**
     * @return the rawData
     */
    public boolean isRawData() {
        return rawData;
    }

    /**
     * @param rawData the rawData to set
     */
    public void setRawData(boolean rawData) {
        this.rawData = rawData;
    }

    /**
     * @return the saveCurrentSumImages
     */
    public boolean isSaveCurrentSumImages() {
        return saveCurrentSumImages;
    }

    /**
     * @param saveCurrentSumImages the saveCurrentSumImages to set
     */
    public void setSaveCurrentSumImages(boolean saveCurrentSumImages) {
        this.saveCurrentSumImages = saveCurrentSumImages;
    }

    /**
     * @return the saveCurrentRawData
     */
    public boolean isSaveCurrentRawData() {
        return saveCurrentRawData;
    }

    /**
     * @param saveCurrentRawData the saveCurrentRawData to set
     */
    public void setSaveCurrentRawData(boolean saveCurrentRawData) {
        this.saveCurrentRawData = saveCurrentRawData;
    }

    /**
     * @return the acquireDarkReference
     */
    public int getAcquireDarkReference() {
        return acquireDarkReference;
    }

    /**
     * @param acquireDarkReference the acquireDarkReference to set
     */
    public void setAcquireDarkReference(int acquireDarkReference) {
        this.acquireDarkReference = acquireDarkReference;
    }

    /**
     * @return the acquireGainReference
     */
    public int getAcquireGainReference() {
        return acquireGainReference;
    }

    /**
     * @param acquireGainReference the acquireGainReference to set
     */
    public void setAcquireGainReference(int acquireGainReference) {
        this.acquireGainReference = acquireGainReference;
    }

    /**
     * @return the condition1
     */
    public ConditionConfig getCondition1() {
        return condition1;
    }

    /**
     * @param condition1 the condition1 to set
     */
    public void setCondition1(ConditionConfig condition1) {
        this.condition1 = condition1;
    }

    /**
     * @return the condition2
     */
    public ConditionConfig getCondition2() {
        return condition2;
    }

    /**
     * @param condition2 the condition2 to set
     */
    public void setCondition2(ConditionConfig condition2) {
        this.condition2 = condition2;
    }

    /**
     * @return the condition3
     */
    public ConditionConfig getCondition3() {
        return condition3;
    }

    /**
     * @param condition3 the condition3 to set
     */
    public void setCondition3(ConditionConfig condition3) {
        this.condition3 = condition3;
    }
}
