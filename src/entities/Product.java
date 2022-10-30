package entities;

public class Product {

	private int id;
	private String name;
	private double unitprice;

	// sağ click yapıp source > constructer with fields a  hiçbirini (id, name, unitprice) seçmeden tıklıyoruz
	public Product() {
		super();
	}
	// sağ click yapıp source > constructer with fields a  hepsini (id,name,unitprice) seçmeden tıklıyoruz

	public Product(int id, String name, double unitprice) {
		super();
		this.id = id;
		this.name = name;
		this.unitprice = unitprice;
	}

	// getter - setter
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getUnitprice() {
		return unitprice;
	}

	public void setUnitprice(double unitprice) {
		this.unitprice = unitprice;
	}

}
