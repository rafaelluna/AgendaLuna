package luna.pangaio.rafael.assignment1;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;

public class testAssignment {

	private Person rafael = new Person("Rafael", "Luna");
	
	@Test
	public void testOneTimeInstance() {
		
		//Assert.assertEquals(new OneTime(1, 1, 1, "Event A", new Person("Rafael", "Luna")).getsDescription(), instanceof(Appointment.class));
		Assert.assertEquals("Event A", new OneTime(1, 1, 1, "Event A", rafael).getsDescription());
	}
	
	@Test
	public void testPersonAppointment() {
		
		Assert.assertEquals(true, new OneTime(1, 1, 1, "Event A", rafael).forPerson(new Person("Rafael", "Luna")));
		
	}
		
	@Test
	public void testOccourOn() {
		
		//Testing for 1 AM of January 1st		
		Assert.assertEquals(true, new OneTime(1, 1, 1, "Event A", rafael).occursOn(1, 1));		
		//Testing for 1 AM of January 2st
		Assert.assertEquals(false, new OneTime(1, 1, 1, "Event A", rafael).occursOn(2, 1));
		
		//*********************************************************
		//Testing for 1 AM of January 2st
		Assert.assertEquals(true, new Monthly(1, 1, "Event A", rafael).occursOn(1, 1));				
		//Testing for 1 AM of January 2st
		Assert.assertEquals(true, new Monthly(1, 1, "Event A", rafael).occursOn(1, 2));		
		//Testing for 1 AM of January 2st
		Assert.assertEquals(true, new Monthly(1, 1, "Event A", rafael).occursOn(1, 3));
		
		//*********************************************************
		//Testing for 1 AM of January 2st
		Assert.assertEquals(true, new Daily(1, "Event A", rafael).occursOn(1, 1));
		//Testing for 1 AM of January 2st
		Assert.assertEquals(true, new Daily(2, "Event A", rafael).occursOn(1, 2));
		//Testing for 1 AM of January 2st
		Assert.assertEquals(true, new Daily(3, "Event A", rafael).occursOn(2, 1));
		
	}

}
