package com.omrbranch.page;

import frameworkday2.Baseclass;

import org.junit.BeforeClass;
import org.testng.annotations.Test;

		@BeforeClass()
		public void launchUrl()
		{
			browserLaunch();
			enterApplicationUrl("https://www.omrbranch.com/");
			maximizeWindow();
		}
		
		@AfterClass()
		public void closeDriver()
		{
			closeAllWindow();
		}
		//@BeforeMethod()
		//public void beforeScreenshot() throws IOException
		//{
		// screenshot(new File("C:\\Users\\My PC\\Downloads\\Testng"+System.currentTimeMillis()+"before.png"));
		//}
		//@AfterMethod()
		//public void afterScreenshot() throws IOException
		//{
		// screenshot(new File("C:\\Users\\My PC\\Downloads\\Testng"+System.currentTimeMillis()+"after.png"));
		//}

		@Test(priority=1,dataProvider = "Login",dataProviderClass = TestData.class)
		public void loginPageTest(String s1,String s2) throws IOException
		{
			LoginPage loginPage = new LoginPage();
			loginPage.login(s1,s2);
			String userName =getDomPropertyValue(loginPage.getTxtEmailId(),"value");
			Assert.assertEquals(userName,s1,"verify userName");
			String password =getDomPropertyValue(loginPage.getTextPass(),"value");
			Assert.assertEquals(password,s2,"verify password");
			
			implicitWait();
			
		}
		@Test(priority=2,dataProvider = "Product",dataProviderClass = TestData.class)
		public void productSearchPageTest(String s1) throws IOException, InterruptedException
		{
			ProductSearchPage productSearchPage = new ProductSearchPage();
			String loginMsg = productSearchPage.loginSuccessMsg();
			Assert.assertEquals("Welcome Kiruthiga",loginMsg,"verify after Login");
			productSearchPage.productSearch(s1);
			String search =getDomPropertyValue(productSearchPage.getSearchBox(),"value");
			Assert.assertEquals(search,s1,"verify searched product");
			
		}
		@Test(priority=3)
		public void productListingPageTest() throws InterruptedException
		{
			ProductListingPage productListingPage = new ProductListingPage();
			productListingPage.productAdd();
			Thread.sleep(2000);
		}
		@Test(priority=4)
		public void productSizeVarientPageTest() throws InterruptedException
		{
			
			ProductSizeVariantPage productSizeVariant = new ProductSizeVariantPage();
			productSizeVariant.addSizevariant();
			Thread.sleep(2000);
		}
			@Test(priority=5)
			public void goToCartTest() throws InterruptedException
			{
			GoToCart goToCart = new GoToCart();
			goToCart.addcart();
		}
		@Test(priority=6,dataProvider = "MyCart",dataProviderClass = TestData.class)
		public void myCartTest(String s1,String s2,String s3,String s4,String s5,String s6,String s7,String s8,String s9,String s10,String s11,String s12,String s13,String s14,String s15) throws IOException
		{
			
			MyCartPage myCartPage = new MyCartPage();
			myCartPage.addressDetails(s1,s2,s3,s4,s5,s6,s7,s8,s9,s10);
			myCartPage.paymentDetails(s11,s12,s13,s14,s15);
			String addressType =getDomPropertyValue(myCartPage.getTxtAddressType(),"value");
			Assert.assertEquals(addressType,s1,"verify address type");
			String firstName =getDomPropertyValue(myCartPage.getTxtFirstName(),"value");
			Assert.assertEquals(firstName,s2,"verify firstname");
			
		}
		@Test(priority=7,dataProvider = "Login",dataProviderClass = TestData.class)
		public void ReLogin(String s1,String s2) throws IOException
		{
			LoginPage loginPage = new LoginPage();
			loginPage.login(s1,s2);
			implicitWait();
			
		}
		@Test(priority=8)
		public void myAccountPage() throws InterruptedException, IOException
		{
		    MyAccountPage myAccountPage = new MyAccountPage();
		    myAccountPage.myAccount();
		    Thread.sleep(2000);
		    myAccountPage.toPrintOrderNo();
			
		}
		

	}

}
