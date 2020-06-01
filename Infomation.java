package customerManagement.hierache;

public class Infomation{
	int date;
	int charge;
	String product;
	
	@Override
	public String toString() {
		return super.toString();
	}

	public int getDate() {
		return date;
	}

	public void setDate(int date) {
		this.date = date;
	}

	public int getCharge() {
		return charge;
	}

	public void setCharge(int charge) {
		this.charge = charge;
	}

	public String getProduct() {
		return product;
	}

	public void setProduct(String product) {
		this.product = product;
	}
	
	public void showInfo() {
		System.out.println("날짜 : " + date + "\n결재금액 : " + charge + "\n재품명 : " + product);
	}
	
	
	
	

}
