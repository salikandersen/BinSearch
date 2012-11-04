import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class testBinSearch {

	private BinSearch binSearch;
	private MiddlePointTestStub middlePointStrategy;
	
	@Before
	public void setup() {
		middlePointStrategy = new MiddlePointTestStub();
		binSearch = new BinSearchImpl(middlePointStrategy);
	}
	
	@Test
	public void testMiddlePointWithRange10(){
		int middlepoint = binSearch.middlePoint(0, 10);
		
		assertEquals(5, middlepoint);
	}
	
	@Test
	public void testMiddlePointWithRange5(){
		int middlepoint = binSearch.middlePoint(0, 5);
		
		assertEquals(2, middlepoint);
	}
	
	@Test
	public void testSearchOnMiddle(){
		int[] sortedInts = {1, 5, 10, 11, 15};
		
		int position = binSearch.search(sortedInts, 10);
		
		assertEquals(2, position);
		assertEquals(1, middlePointStrategy.getIterations());
	}
	
	@Test
	public void testSearch2HigherThanMiddle(){
		int[] sortedInts = {1, 5, 10, 11, 15};
		
		int position = binSearch.search(sortedInts, 11);
		
		assertEquals(3, position);
		assertEquals(2, middlePointStrategy.getIterations());
	}
	
	@Test
	public void testSearch2LowerThanMiddle(){
		int[] sortedInts = {1, 5, 10, 11, 15};
		
		int position = binSearch.search(sortedInts, 5);
		
		assertEquals(1, position);
		assertEquals(3, middlePointStrategy.getIterations());
	}
}
