package source;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

public class BaseClass {
	@BeforeSuite
	public void beforeSuiteMethod() {
//		System.out.println(this.getClass().getName());
		String nameofCurrMethod = new Exception() 
                .getStackTrace()[0] 
                .getMethodName(); 
		System.out.println(nameofCurrMethod);
	}
	@BeforeClass
	public void beforeClassMethod() {
		System.out.println(this.getClass().getName());
		String nameofCurrMethod = new Exception() 
                .getStackTrace()[0] 
                .getMethodName(); 
		System.out.println(nameofCurrMethod);
	}
	@BeforeMethod
	public void beforeMethodMethod() {
		System.out.println(this.getClass().getName());
		String nameofCurrMethod = new Exception()
                .getStackTrace()[0]
                .getMethodName();
		System.out.println(nameofCurrMethod);
	}
	@BeforeTest
	public void beforeTestMethod() {
		System.out.println(this.getClass().getName());
		String nameofCurrMethod = new Exception() 
                .getStackTrace()[0] 
                .getMethodName(); 
		System.out.println(nameofCurrMethod);
	}
	@AfterSuite
	public void afterSuiteMethod() {
//		System.out.println(this.getClass().getName());
		String nameofCurrMethod = new Exception() 
                .getStackTrace()[0] 
                .getMethodName(); 
		System.out.println(nameofCurrMethod);
	}
	@AfterClass
	public void afterClassMethod() {
		System.out.println(this.getClass().getName());
		String nameofCurrMethod = new Exception() 
                .getStackTrace()[0] 
                .getMethodName(); 
		System.out.println(nameofCurrMethod);
	}
	@AfterMethod
	public void afterMethodMethod() {
		System.out.println(this.getClass().getName());
		String nameofCurrMethod = new Exception()
                .getStackTrace()[0]
                .getMethodName();
		System.out.println(nameofCurrMethod);
	}
	@AfterTest
	public void afterTestMethod() {
		System.out.println(this.getClass().getName());
		String nameofCurrMethod = new Exception() 
                .getStackTrace()[0] 
                .getMethodName(); 
		System.out.println(nameofCurrMethod);
	}
}
