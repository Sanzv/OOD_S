package org.howard.edu.ood.midterm.problem51;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;


public class IntegerRangeTest {
	
	IntegerRange range;
	
	@BeforeEach
	protected void setUp() {
		range = new IntegerRange(-5, 5);
	}
	
	@Test
    @DisplayName("Test case for getLower")
    public void testGetLower() {
        assertEquals(-5, range.getLower());	  
    }
	
	@Test
    @DisplayName("Test case for getUpper")
    public void testGetUpper() {
        assertEquals(5, range.getUpper());	  
    }
		
    @Test
    @DisplayName("Test case for contains method")
    public void testContains() {
        assertTrue(range.contains(-5), "Range must contain value within upper and lower limit");
        assertTrue(range.contains(5), "Range must contain value within upper and lower limit");
        
        assertFalse(range.contains(-10), "Range must not contain value outside of upper and lower limit");
        assertFalse(range.contains(10), "Range must not contain value outside of upper and lower limit");
    }
    
    @Test
    @DisplayName("Test cases for overlap method with Exception")
    public void testOverlaps_Throws_EmptyRangeException() throws EmptyRangeException {
    	
    	Throwable exception = assertThrows(EmptyRangeException.class, () -> {range.overlaps(null);});
		assertNotNull(exception.getMessage());
		assertEquals("Given Range is a null object.", exception.getMessage());
		
    }
    
    @Test
    @DisplayName("Test cases for overlap method without Exception")
    public void testOverlaps() throws EmptyRangeException {
    	IntegerRange r2 = new IntegerRange(-2, 3);
    	assertTrue(range.overlaps(r2), "Overlaps must return true if any element overlaps");
    	
    	IntegerRange r3 = new IntegerRange(5, 10);
    	assertTrue(range.overlaps(r3), "Overlaps must return true if any element overlaps");
    	
    	IntegerRange r4 = new IntegerRange(-10, -5);
    	assertTrue(range.overlaps(r4), "Overlaps must return true if any element overlaps");
    	
    	IntegerRange r5 = new IntegerRange(6, 10);
    	assertFalse(range.overlaps(r5), "Overlaps must return false if no element overlaps");
		
    	IntegerRange r6 = new IntegerRange(-10, -6);
    	assertFalse(range.overlaps(r6), "Overlaps must return false if no element overlaps");
    }
    
    @Test
    @DisplayName("Test case for size method")
    public void testSize() {
    	
        assertEquals(11, range.size());	

        assertEquals(range.getUpper() - range.getLower() + 1, range.size());	
        
    }
    
    
    

}
