
public class MiddlePointTestStub implements MiddlePointStrategy {
	private MiddlePointStrategy middlePointStrategy;
	
	private int iterations = 0;
	
	public MiddlePointTestStub(){
		middlePointStrategy = new MiddlePointImpl();
	}
	
	@Override
	public int middlePoint(int low, int high) {
		iterations++;
		
		return middlePointStrategy.middlePoint(low, high);
	}
	
	public int getIterations(){
		return iterations;
	}

}
