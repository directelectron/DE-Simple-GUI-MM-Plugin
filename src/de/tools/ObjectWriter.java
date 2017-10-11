/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package de.tools;

import java.io.File;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

/**
 *
 * @author lyon_yao
 */
public class ObjectWriter {

    public static void writerObjectToFile(File file, Object obj) throws Exception {
        Class<?>[] interFaces = obj.getClass().getInterfaces();
        boolean isFind = false;
        for (Class<?> in : interFaces) {
            if (in == Serializable.class) {
                isFind = true;
                break;
            }
        }
        if (!isFind) {
            throw new Exception("The object is not serializable!");
        }
        try {
            String foldName = file.getParent();
            File foldFile = new File(foldName);
            if (!foldFile.exists()) {
                foldFile.mkdirs();
            }
            if (!file.exists()) {
                file.createNewFile();
            }
            FileOutputStream out = new FileOutputStream(file);
            ObjectOutputStream objOut = new ObjectOutputStream(out);
            objOut.writeObject(obj);
            objOut.flush();
            objOut.close();
        } catch (Exception e) {
            throw e;
        }
    }
}
