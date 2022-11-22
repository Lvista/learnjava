
public class Main {
	public static void main(String[] args) {
		double[][] a = { { 1.0, -2.0, 2.0, 1.0 }, 
				{ 1.0, -1.0, 1.0, 3.0 }, 
				{ -2.0, -2.0, 1.0, 5.0 } };
		double[] xp = { 0, 0, 0 };
		for (double i : GS(a, xp)) {
			System.out.println(i);
		}
		for (double i : Jacobi(a, xp)) {
			System.out.println(i);
		}
	}

	private static double[] GS(double[][] a, double[] x0) {
		// TODO Auto-generated method stub
		double[] xp = x0;
		double[] xc = xp.clone();
		do {
			xp = xc.clone();
			xc[0] = (1 / a[0][0]) * (a[0][3] - a[0][1] * xp[1] - a[0][2] * xp[2]);
			xc[1] = (1 / a[1][1]) * (a[1][3] - a[1][0] * xc[0] - a[1][2] * xp[2]);
			xc[2] = (1 / a[2][2]) * (a[2][3] - a[2][0] * xc[0] - a[2][1] * xc[1]);
		} while (VectorModulus(xp, xc) > 0.000001);
		return xc;
	}
	
	private static double[] Jacobi(double[][] a, double[] x0) {
		// TODO Auto-generated method stub
		double[] xp = x0;
		double[] xc = xp.clone();
		do {
			xp = xc.clone();
			xc[0] = (1 / a[0][0]) * (a[0][3] - a[0][1] * xp[1] - a[0][2] * xp[2]);
			xc[1] = (1 / a[1][1]) * (a[1][3] - a[1][0] * xp[0] - a[1][2] * xp[2]);
			xc[2] = (1 / a[2][2]) * (a[2][3] - a[2][0] * xp[0] - a[2][1] * xp[1]);
		} while (VectorModulus(xp, xc) > 0.000001);
		return xc;
	}

	private static double VectorModulus(double[] xp, double[] xc) {
		// TODO Auto-generated method stub
		double mod = 0;
		for (int i = 0; i < 3; i++) {
			mod += Math.abs(xp[i] - xc[i]);
		}
		return mod;
	}
}
