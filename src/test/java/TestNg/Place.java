package TestNg;

import org.testng.annotations.Test;

import frameworkday2.Baseclass;

public class Place {
@Test(priority = 1)
public void ch() {
	System.out.println("Chennai");
}
@Test(priority = 2)
public void ma() {
	System.out.println("MADURAI");
}
@Test(priority = 3)
public void tt() {
	System.out.println("Thiruchenthur");
}
@Test (invocationCount = 5)
public void mn() {
	System.out.println("MADHURANDHAGAM");
}
}
