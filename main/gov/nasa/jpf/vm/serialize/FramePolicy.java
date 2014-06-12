package gov.nasa.jpf.vm.serialize;


public final class FramePolicy {
  public FramePolicy() {
    includeOps = true;
    includeLocals = true;
    includePC = true;
    recurse = true;
  }
  
  //May be migrated to BitArray or similar in the future.
  public boolean includeLocals;
  
  //May be migrated to BitArray or similar in the future.
  public boolean includeOps;
  
  /**
   * Whether to include instruction offset.
   */
  public boolean includePC;
  
  /**
   * Whether to considered frames "below" this one (called from here).
   */
  public boolean recurse;
  
  
  
  
  public boolean isDefaultPolicy() {
    return includeLocals && includeOps && includePC && recurse;
  }
  
  
  public void ignoreLocals() {
    includeLocals = false;
  }

  public void ignoreOps() {
    includeOps = false;
  }
  
  public void includeLocals() {
    includeLocals = true;
  }

  public void includeOps() {
    includeOps = true;
  }
}