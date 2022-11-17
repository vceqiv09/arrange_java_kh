package polymorphism;

import java.util.Objects;

public class VipCustomer extends Person {
	
	private double discount = 0.08;
	private int point = 10000;
	
	public double getDiscount() {
		return discount;
	}
	public int getPoint() {
		return point;
	}
	
	public void setDiscount(double discount) {
		this.discount = discount;
	}
	public void setPoint(int point) {
		this.point = point;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + Objects.hash(discount, point);
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		VipCustomer other = (VipCustomer) obj;
		return Double.doubleToLongBits(discount) == Double.doubleToLongBits(other.discount) && point == other.point;
	}
	
	@Override
	public String toString() {
		return "VipCustomer [getName()=" + getName() + ", getAge()=" + getAge() + ", getGender()=" + getGender()
				+ ", discount=" + discount + ", point=" + point + "]";
	}
	
}