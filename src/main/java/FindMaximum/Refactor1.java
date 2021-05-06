package FindMaximum;

public class Refactor1<T extends Comparable<T>> {
	T x;
	T y;
	T z;
	public Refactor1(T x, T y, T z) {
		super();
		this.x = x;
		this.y = y;
		this.z = z;
	}
	public <T extends Comparable<T>> T maximum(T x, T y, T z) {
        T max = x;
        if (y.compareTo(max) > 0) {
            max = y;
        }
        if (z.compareTo(max) > 0) {
            max = z;
        }
        return max;
    }
	
}
