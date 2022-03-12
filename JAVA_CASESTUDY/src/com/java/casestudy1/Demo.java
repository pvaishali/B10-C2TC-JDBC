package com.java.casestudy1;
abstract class ShopAcc{
	private int Accno;
	private String AccNm;
	private float charges;
	public void setAccno(int i) {
		Accno=i;
	}
	public int getAccno()
{return Accno;
		}
	public void setAccNm(String j) {
		AccNm=j;
	}public String getAccNm() {
		return AccNm;
	}
	public void setCharges(float k) {
		charges=k;
	}public float getcharges() {
		return charges;}
	
public abstract void bookproduct();
public void items() {
	}public abstract String toString();
}
public class Demo {
	public static void main(String[] args) {
	}

}
