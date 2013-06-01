package entities;

public class Location 
{
	private String location;
	public Location(String location)
	{
		this.location = location;
	}
	
	public String getLocation()
	{		
		return location;
	}
	
	public void updateLocation(Location location)
	{
		this.location = location.getLocation();
	}
}
