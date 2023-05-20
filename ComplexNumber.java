public class ComplexNumber {
	
	private double r;
	private double i;
	
	public ComplexNumber(double a, double b)
    {
        this.r = a;
		this.i = b;
	}
	
	public double real()
	{
		return this.r;
	}
	
	public double imaginary()
	{
		return this.i;
	}
	
	public ComplexNumber add(ComplexNumber z)
	{
		return new ComplexNumber(this.r + z.real(), this.i + z.imaginary());
	}
	
	public ComplexNumber subtract(ComplexNumber z)
	{
		return new ComplexNumber(this.r - z.real(), this.i - z.imaginary());
	}
	
	public ComplexNumber multiply(ComplexNumber m)
	{
	
		return new ComplexNumber((this.r*m.real()) - (this.i* m.imaginary()),(this.r*m.imaginary()) + (this.i* m.real()));
	}

	public ComplexNumber power(int n) 
	{
		ComplexNumber cn1 = this;
		ComplexNumber cn2 = this;
		for(int j=1; j <n;j++) 
		{
			cn2 = cn2.multiply(cn1);
		}

		return cn2;
	}

	@Override
	public String toString() 
	{

		if(i >= 0) 
		{
			return String.valueOf(r) + "+" + String.valueOf(i) + "i";
		}
		else 
		{
			return String.valueOf(r) + "-" + String.valueOf(-i) + "i";	
		}
	}
}
