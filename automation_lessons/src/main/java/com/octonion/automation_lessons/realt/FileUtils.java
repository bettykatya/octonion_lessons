package com.octonion.automation_lessons.realt;

import java.io.FileOutputStream;
import java.io.IOException;

public class FileUtils {

    public static void addLine(String fileName, String line) throws IOException {
        FileOutputStream outputStream = new FileOutputStream(fileName, true);
        byte[] strToBytes = line.getBytes();
        outputStream.write(strToBytes);
        outputStream.close();
    }

}
