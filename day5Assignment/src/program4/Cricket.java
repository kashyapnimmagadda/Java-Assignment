package program4;

public class Cricket {
	public double runrate(int runs, int overs) throws ArithmeticException{
		double runrate=0;
		if(overs<=0){
			throw new ArithmeticException();
		}
		else
		{
			runrate=runs/overs;
		}
		return runrate;
	}

}
