package pass;

public class GCD{
	
	public int gcd(int x, int y){
		int t;
		while(!(y == 0) && !(x == 0)){
			t = y;
			y = x % y;
			x = t;
		}
		return x+y;
	}
}
