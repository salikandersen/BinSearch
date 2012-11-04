
public class BinSearchImpl implements BinSearch {
	
	private MiddlePointStrategy middlePointStrategy;
	
	public BinSearchImpl(MiddlePointStrategy middlePointStrategy){
		this.middlePointStrategy = middlePointStrategy;
	}
	
  /** find the position of 'target' in presorted array a.
   * @param a sorted array of integers
   * @param target the target integer
   * @param position/index of 'target' in array a, or -1
   * if 'target' is not in a.
   */
  public int search(int[] a, int target) {
	int low, high, mid;
	low = 0;
	high = a.length-1;
	
	while( low <= high )
    {
		mid = middlePoint(low, high);
	  
		if(target > a[mid])
			low = mid + 1;
		else if(target < a[mid])
			high = mid - 1;
		else if (target == a[mid])
			return mid;
    }
    return -1;
  }
  
  public int middlePoint(int low, int high){
	  return middlePointStrategy.middlePoint(low, high);
  }
}