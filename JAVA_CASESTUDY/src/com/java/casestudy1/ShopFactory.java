package com.java.casestudy1;

abstract class ShopFactory {
abstract public GSPrimeAcc getNewPrimeAcc();
	
	abstract public GSNormalAcc getNewNormalAcc();
	
}
 class GSPrimeAcc extends PrimeAcc{
	
	public GSPrimeAcc(int AccNo, String AccNm, float charges, boolean isPrime) {
		super(AccNo, AccNm, charges, isPrime);
	}

	private static final float deliveryCharges= 10;

	@Override
	public void bookproduct() {
	}
	
	@Override
	public String toString() {
		return null;
	}
 public class GSNormalAcc extends NormalAcc {

		public GSNormalAcc(int AccNo, String AccNm, float charges, float deliveryCharges) {
			super(AccNo, AccNm, charges, deliveryCharges);		
		}
		@Override
		public void bookproduct() {
			
		}	@Override
		public String toString() {
		    String demo ="demo 2";
		    return demo;
		
		}
		
	}
 }

