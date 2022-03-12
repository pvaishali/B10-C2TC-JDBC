package com.java.casestudy1;

abstract class PrimeAcc extends ShopAcc {
	private boolean isPrime;
	 private float deliveryCharges;
	 
	 public PrimeAcc(int accNo, String accNm, float charges, boolean isPrime) {
		 super();
		// TODO Auto-generated constructor stub
	}
	public void setisPrime(boolean l) { //starts getters and setters of Prime Acc
		 isPrime = l;
	 }
	 public boolean getisPrime() {
		 return isPrime;
	 }
	 public void setdc(float m) {
		 deliveryCharges = m;
	 }
	 public float getdc() {
		 return deliveryCharges;
	 }                                 //End of getters and setters
	 
	 public void bookproduct() {
	}
	 
	 public String toString() {
		 String demo ="demo 1";
		return demo;
	}

}
