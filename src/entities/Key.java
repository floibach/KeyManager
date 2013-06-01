package entities;

public class Key 
{
	private LicenceKey licenceKey;
	private Location location;
	private Usage usage;
	
	public Key(LicenceKey licenceKey, Location location, Usage usage)
	{
		this.licenceKey = licenceKey;
		this.location = location;
		this.usage = usage;
	}

	public LicenceKey getLicenceKey() 
	{
		return licenceKey;
	}

	public Location getLocation() 
	{
		return location;
	}

	public Usage getUsage() 
	{
		return usage;
	}

	
}
