import java.util.ArrayList;

public class Polynomial 
{
	private ArrayList<Double> list;
	
	public Polynomial(double indexes[]) 
	{
		list = new ArrayList<Double>();
		for(int i = 0; i < indexes.length; i++) 
		{
			list.add(indexes[i]);
		}
	}
	
	public String toString() 
	{
		String result = "";
		int count = list.size();
		for(int i = 0; i < count; i++) 
		{
			result = result + String.valueOf(list.get(i))+"x^"+String.valueOf(count-1);
			if(i != count-1) {
				if(list.get(i) > 0) 
				{
					result = result+"+";
				}
			}
		}
		return result;
	}
	
	public Double GetValue(double x) 
	{
		Double result = 0.0;
		int count = list.size();
		for(int i = 0; i < count; i++) {
			result = result + list.get(i) + Math.pow(x, count-1);
		}
		return result;
	}
}