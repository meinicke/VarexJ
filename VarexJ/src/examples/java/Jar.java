/* 
 * Copyright (C) 2014  Nastaran Shafiei and Franck van Breugel
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You can find a copy of the GNU General Public License at
 * <http://www.gnu.org/licenses/>.
 */

import java.io.IOException;
import java.util.Enumeration;
import java.util.jar.JarEntry;
import java.util.jar.JarFile;

public class Jar {
   public static void main(String[] args) {
       try {
    	   String dir = System.getProperty("user.dir") + "/src/examples/file.jar";
           JarFile file = new JarFile(dir);
           Enumeration<JarEntry> entries = file.entries();
           while (entries.hasMoreElements()) {
               JarEntry entry = entries.nextElement();
               System.out.println(entry.getName());
           }
           file.close();
       }
       catch (IOException e) {
           System.out.println("Something went wrong");
       }
   }
}
