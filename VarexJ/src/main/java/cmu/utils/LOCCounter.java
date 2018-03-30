package cmu.utils;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * Count how many lines of code are there in a src folder
 *
 * @author: chupanw
 */
@SuppressWarnings("unused")
public class LOCCounter {
	private String targetPath;
    private File targetFile;

    public static void main(String[] args) {
        LOCCounter prevaylerCounter = new LOCCounter("/Users/chupanw/Projects/prevayler");
        System.out.println(prevaylerCounter.count());

        LOCCounter jettyCounter = new LOCCounter("/Users/chupanw/Desktop/jetty-all/jetty-all-7.6.18-SNAPSHOT-sources");
        System.out.println(jettyCounter.count());
    }

    public LOCCounter(String p){
        targetPath = p;
        targetFile = new File(p);
    }

    public int count() {
        if (targetFile.isDirectory()) {
            return countDir(targetFile);
        }
        else {
            return countFile(targetFile);
        }
    }

    private int countDir(File dir) {
        assert dir.isDirectory();
        int count = 0;
        File[] fileList = dir.listFiles();
        for (File f : fileList) {
            if (f.isDirectory()) {
                count += countDir(f);
            }
            else {
                count += countFile(f);
            }
        }
        return count;
    }

    private int countFile(File file) {
        if (!file.getName().endsWith(".java")) {
            return 0;
        }
        int count = 0;
        try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
            while (reader.readLine() != null) {
                count++;
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return count;
    }
}
