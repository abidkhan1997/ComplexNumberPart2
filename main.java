public class main {

	public static void main(String[] args) 
	{	
		System.out.println("\nProblem 1");
		ComplexNumber cn1 = new ComplexNumber(0.5,866);
		ComplexNumber cn2 = new ComplexNumber(1.414,1414);
		
		System.out.println("w (primitive 6th root) = .5 + .866*i");
		System.out.println("j			wj			w^j");
		for(int j = 1; j <= 6; j++) 
		{
			ComplexNumber result = cn1.power(j);
			System.out.println(String.format("%d			%s			%s", j, cn1.toString(), result.toString()));
		}
		
		
		System.out.println("w (primitive 8th root) = 1.414 + 1.414*i");
		System.out.println("j			wj			w^j");
		for(int j = 1; j <= 8; j++) 
		{
			ComplexNumber result = cn2.power(j);
			System.out.println(String.format("%d			%s			%s", j, cn1.toString(), result.toString()));
		}
		
		System.out.println("\n Problem 2");

		double[] indexes1 = {1,3,-5};
		Polynomial poly1 = new Polynomial(indexes1); 

		double[] indexes2 = {2,-5, 1};
		Polynomial poly2 = new Polynomial(indexes2); 
		
		double[] x = {-1,1/3,1.414,1};
		System.out.println("x\t  value of p(x)\t    value of q(x)\n");
		for(int i = 0; i < x.length-1; i++) 
		{
			System.out.println(String.format("%f\t %f\t %f", x[i],poly1.GetValue(x[i]),poly2.GetValue(x[i])));
		}
		
		System.out.println("x\t  value of p(x) * q(x)\n");
		for(int i = 0; i < x.length-1; i++) 
		{
			System.out.println(String.format("%f\t %f\t", x[i],poly1.GetValue(x[i])*poly2.GetValue(x[i])));
		}

	}

}