public class Polynomial {
	double[] rep;
	
	public Polynomial() {
		rep = new double[1];
		rep[0] = 0;
	}
	
	public Polynomial(double[] inp) {
		rep = new double[inp.length];
		for(int i = 0; i<inp.length; i++) {
			rep[i] = inp[i];
		}
	}
	
	public Polynomial add(Polynomial another) {
		int m;
		if(rep.length>=another.rep.length) {
			m=rep.length;
		}
		else {
			m=another.rep.length;
		}
		double[] res = new double[m];
		for(int i = 0; i<m; i++) {
			double v1 = 0;
			double v2 = 0;
			if(i<rep.length) {
				v1 = rep[i];
			}
			if(i<another.rep.length) {
				v2 = another.rep[i];
			}
			res[i]=v1 + v2;
		}
		Polynomial s = new Polynomial(res);
		return s;
	}
	
	public double evaluate(double x) {
		double res = 0;
		double xn = 1;
		for(int i = 0; i<rep.length; i++) {
			res += rep[i]*xn;
			xn*=x;
		}
		return res;
	}
	
	public boolean hasRoot(double r) {
		double res = evaluate(r);
		return (res==0);
	}
}
