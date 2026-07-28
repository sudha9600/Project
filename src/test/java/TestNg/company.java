package TestNg;

import org.testng.annotations.Test;

public class company {
	@Test(groups = {"sanity"})
	private void companyName() {
		System.out.println(Thread.currentThread().getId());
	}
	@Test(groups = {"Reg"})
	private void companyBrand() {
		System.out.println(Thread.currentThread().getId());
	}
	@Test(groups = {"smoke"})
	private void companyPlace() {
		System.out.println(Thread.currentThread().getId());
	}
	

}
