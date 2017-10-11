/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package de.tools;

import java.io.File;
import java.io.FileInputStream;
import java.io.ObjectInputStream;

/**
 *
 * @author lyon_yao
 */
public class ObjectReader {

    public static Object ReadObjectFromFile(File file) throws Exception {
        FileInputStream in = new FileInputStream(file);
        ObjectInputStream objIn = new ObjectInputStream(in);
        Object object = objIn.readObject();
        objIn.close();
        return object;
    }
}
