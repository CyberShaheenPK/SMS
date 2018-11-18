import java.util.Vector;

public class Store 
{
	private String name;
	private String location;
	private Vector productList;
	private int rbProduct;
	
	public Store(String name,String location)
	{
		this.name=name;
		this.location=location;
	}
	public String getName() 
	{
		return name;
	}
	public void addProduct(Product p) 
	{
		productList.addElement(p);
	}
	public boolean searchProduct(String productname) 
	{
		return true;
	}
	public Produ  ct deleteProduct(String productName) 
	{
		productList.remove(productName);
	}
	public void displayAll() 
	{
		
	}
	
}
