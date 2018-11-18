import java.util.Vector;

public class Flight
{
	private String id;
	private String destination;
	private Time depart;
	private Time arrival;
	private Vector passengerList;
	
	public Flight(String id,String d,Time depart,Time arrival)
	{
		this.id=id;
		this.destination=d;
		this.depart=depart;
		this.arrival=arrival;
	}
	void addPassenger(Passenger p)
	{
		passengerList.addElement(p);
	}
	void printInfo()
	{
		System.out.println("Flight no :"+id);
		System.out.println("Destination :"+destination);
		System.out.println("Departure :"+depart);
		System.out.println("Arrival :"+arrival);
		System.out.println("No of Passenger :"+ passengerList.size());		
	}
	
}
