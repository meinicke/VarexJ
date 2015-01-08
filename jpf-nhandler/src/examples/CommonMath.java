

import org.apache.commons.math3.linear.MatrixUtils;
import org.apache.commons.math3.linear.RealMatrix;
import org.apache.commons.math3.ode.FirstOrderDifferentialEquations;
import org.apache.commons.math3.ode.FirstOrderIntegrator;
import org.apache.commons.math3.ode.nonstiff.DormandPrince853Integrator;
import org.apache.commons.math3.ode.sampling.StepHandler;
import org.apache.commons.math3.ode.sampling.StepInterpolator;
import org.apache.commons.math3.random.CorrelatedRandomVectorGenerator;
import org.apache.commons.math3.random.GaussianRandomGenerator;
import org.apache.commons.math3.random.JDKRandomGenerator;
import org.apache.commons.math3.random.RandomGenerator;


public class CommonMath {

  private static class CircleODE implements FirstOrderDifferentialEquations {

    private double[] c;

    private double omega;

    public CircleODE (double[] c, double omega) {
      this.c = c;
      this.omega = omega;
    }

    public int getDimension () {
      return 2;
    }

    public void computeDerivatives (double t, double[] y, double[] yDot) {
      yDot[0] = omega * (c[1] - y[1]);
      yDot[1] = omega * (y[0] - c[0]);
    }

    public static void runExample1() {
      FirstOrderIntegrator integrator = new DormandPrince853Integrator(1.0e-8, 100.0, 1.0e-10, 1.0e-10);
      FirstOrderDifferentialEquations ode = new CircleODE(new double[] { 1.0, 1.0 }, 0.1);
      double[] y = new double[] { 0.0, 1.0 }; // initial state
      StepHandler stepHandler = new StepHandler() {
        public void init (double t0, double[] y0, double t) {
        }

        public void handleStep (StepInterpolator interpolator, boolean isLast) {
          double t = interpolator.getCurrentTime();
          double[] y = interpolator.getInterpolatedState();
          System.out.println("->" + t + " " + y[0] + " " + y[1]);
        }
      };
      integrator.addStepHandler(stepHandler);
      integrator.integrate(ode, 0.0, y, 16.0, y); // now y contains final state
                                                  // at time
                                                  // t=16.0
    }
  }

  public static void main (String[] args) {
    CircleODE.runExample1();

    double[] mean = { 1, 2 };
    double[][] cov = { { 9, 3 }, { 3, 16 } };
    RealMatrix covariance = MatrixUtils.createRealMatrix(cov);

    // Create and seed a RandomGenerator (could use any of the generators in the
    // random package here)
    RandomGenerator rg = new JDKRandomGenerator();
    rg.setSeed(17399225432l); // Fixed seed means same results every time

    // Create a GassianRandomGenerator using rg as its source of randomness
    GaussianRandomGenerator rawGenerator = new GaussianRandomGenerator(rg);

    // Create a CorrelatedRandomVectorGenerator using rawGenerator for the
    // components
    CorrelatedRandomVectorGenerator generator = new CorrelatedRandomVectorGenerator(mean, covariance, 1.0e-12 * covariance.getNorm(), rawGenerator);

    // Use the generator to generate correlated vectors
    double[] randomVector = generator.nextVector();
  }
}
