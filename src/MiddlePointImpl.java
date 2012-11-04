
public class MiddlePointImpl implements MiddlePointStrategy {

	@Override
	public int middlePoint(int low, int high) {
		return ( low + high ) / 2;
	}

}
