package com.camstarts.campicker.utils;

import java.io.File;

/**
 * Created by Cam Starts on 18/1/12.
 * Description:
 */
public class FileUtils {
    public static boolean fileIsExists(String path) {
        if (path == null || path.trim().length() <= 0) {
            return false;
        }
        try {
            File f = new File(path);
            if (!f.exists()) {
                return false;
            }
        } catch (Exception e) {
            return false;
        }
        return true;
    }
}
