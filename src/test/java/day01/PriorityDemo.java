package day01;

import org.testng.annotations.Test;

public class PriorityDemo {
	@Test(enabled = false)//it will skip the method and wont show in console
	public void x_method() {
		System.out.println("Im in method X");
	}

	@Test(priority = 0) 
	public void v_method() {
		System.out.println("Im in method V");
	}
						//if two tests has same priority then those tests will be executed alphabetically
	@Test						//if no priority is given it will be executed first(after negative priority)
	public void d_method() {
		System.out.println("Im in method D");
	}

	@Test(priority = -1)
	public void c_method() {
		System.out.println("Im in method C");
	}

	@Test(priority = 1)
	public void a_method() {
		System.out.println("Im in method A");
	}

	@Test(priority = 2)
	public void b_method() {
		System.out.println("Im in method B");
	}

	@Test(priority = 3)
	public void y_method() {
		System.out.println("Im in method Y");
	}
}
