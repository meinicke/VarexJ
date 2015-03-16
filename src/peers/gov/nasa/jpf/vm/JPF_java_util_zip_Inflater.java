import de.fosd.typechef.featureexpr.FeatureExpr;
import gov.nasa.jpf.JPFException;
import gov.nasa.jpf.annotation.MJI;
import gov.nasa.jpf.vm.MJIEnv;
import gov.nasa.jpf.vm.NativePeer;

public class JPF_java_util_zip_Inflater extends NativePeer {

    @MJI
    public int inflateBytes__J_3BII__I (MJIEnv env, int objRef, long v0, int rB1, int v2, int v3, FeatureExpr ctx) {
        throw new JPFException("java.util.zip.Inflater not supported yet.");
    }

    @MJI
    public void initIDs____V (MJIEnv env, int clsObjRef, FeatureExpr ctx) {
        throw new JPFException("java.util.zip.Inflater not supported yet.");
    }

}