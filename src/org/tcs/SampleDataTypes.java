package org.tcs;

public class SampleDataTypes {

	public void add() {

		// dataType variableName = varibaleValue;

		byte age = 127;
		short empId = 32767;
		int appNo = 2147483647;
		long phno = 7448432188l;

		float salary = 35000.23456f;
		double prvSal = 25000.1235634;

		char gender = 'm';
		String name = "ravi";

		boolean status = false;

		System.out.println(age);
		System.out.println(empId);
		System.out.println(appNo);
		System.out.println(phno);
		System.out.println(salary);
		System.out.println(prvSal);
		System.out.println(gender);
		System.out.println(name);
		System.out.println(status);

		System.out.println("My age is :" + age);
		System.out.println(age + 100);
		System.out.println(name + age + gender);

	}

	public static void main(String[] args) {
		SampleDataTypes s = new SampleDataTypes();
		s.add();
	}

}
