package chapter1.innerClasses;

public class AnonInnerUsingInterface {
	interface SaleTodayOnly {
		int dollarsOff();
	}

	public int admission(int basePrice) {
		SaleTodayOnly sale = new SaleTodayOnly() {
			
			//Error: Cannot reduce the visibility of the inherited method from AnonInnerUsingInterface.SaleTodayOnly
			// interfaces require public methods
			//int dollarsOff() {
			//	return 3;
			//}
			
			public int dollarsOff() {
				return 3;
			}
		};
		return basePrice - sale.dollarsOff();
	}
}
