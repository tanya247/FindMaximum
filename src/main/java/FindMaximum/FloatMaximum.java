package FindMaximum;

public class FloatMaximum {
	public Float maximum(Float Number1, Float Number2, Float Number3)
    {
        Float max=Number1;
        if (Number2.compareTo(max)>0)
        {
            max=Number2;
        }
        if (Number3.compareTo(max)>0)
        {
            max=Number3;
        }
        return max;
    }
	
}
