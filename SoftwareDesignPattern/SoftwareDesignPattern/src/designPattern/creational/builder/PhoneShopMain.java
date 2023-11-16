package designPattern.creational.builder;

public class PhoneShopMain {
	public static void main(String[] args) {
		
		//for buying a phone what we need to tell the shopkeeper our requirement or features what we want to him.
		/**
		 * Here we need to provide everything like if we want to provide only few thing it is not possible like 
		 * constructor need all the elements inside it. In this scenario Builder pattern came.
		 */
		Phone phone = new Phone("Android", 4, "Qualcomm", 6.6, 3000);	//Old way to create phone.
		System.out.println(phone);
		
		/**
		 * Here we need do describe only few things not the whole info about the phone to the shopkeeper.
		 */
		Phone phoneNew = new PhoneBuilder().setOs("Android").setProcessor("Qualcomm").getPhone();	//New way to create phone.
		System.out.println(phoneNew);
	}
}
