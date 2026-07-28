package TestNg;

import org.junit.Test;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

public class StudentDetails {
	@BeforeClass
	public void BF() {
		System.out.println("Before Class");
	}
	@AfterClass
	public void AF() {
		System.out.println("After Class");
	}
@Test
public void StudentName() {
	System.out.println("Stud Name:shiya");
}
@Test
public void StudentPlace() {
	System.out.println("Place:Chennai");
}
@Test
public void StudentId() {
	System.out.println("id:1234");
}
@Test
public void StudentClass() {
	System.out.println("Class Number:20");
}
}
