package sun.misc;

import java.io.FileDescriptor;

/**
 * this is a placeholder for a Java 6 class, which we only have here to
 * support both Java 1.5 and 6 with the same set of env/ classes
 *
 * see sun.msic.SharedSecrets for details
 *
 * <2do> THIS IS GOING AWAY AS SOON AS WE OFFICIALLY SWITCH TO JAVA 6
 */

public interface JavaIOFileDescriptorAccess {
    public void set(FileDescriptor fdObj, int fd);
    public int get(FileDescriptor fdObj);
    public void setHandle(FileDescriptor fdObj, long h);
    public long getHandle(FileDescriptor fdObj);
}
