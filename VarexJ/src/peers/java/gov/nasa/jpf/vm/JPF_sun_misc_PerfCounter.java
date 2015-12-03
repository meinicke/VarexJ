package gov.nasa.jpf.vm;

import de.fosd.typechef.featureexpr.FeatureExpr;
import gov.nasa.jpf.annotation.MJI;

public class JPF_sun_misc_PerfCounter extends NativePeer {

    @MJI
    public void increment____V (MJIEnv env, int objRef, FeatureExpr ctx) {
        // Bypass
    }

    @MJI
    public void addElapsedTimeFrom__J__V (MJIEnv env, int objRef, long v0, FeatureExpr ctx) {
        // Bypass
    }

    @MJI
    public int getZipFileOpenTime____Lsun_misc_PerfCounter_2 (MJIEnv env, int clsObjRef, FeatureExpr ctx) {
        // Bypass
        int rPerfCounter = env.newObject(ctx, "sun.misc.PerfCounter");
        return rPerfCounter;
    }

    @MJI
    public int getZipFileCount____Lsun_misc_PerfCounter_2 (MJIEnv env, int clsObjRef, FeatureExpr ctx) {
        // Bypass
        int rPerfCounter = env.newObject(ctx, "sun.misc.PerfCounter");
        return rPerfCounter;
    }


}