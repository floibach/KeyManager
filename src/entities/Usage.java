package entities;

public class Usage 
{
	private OperatingSystem operatingSystem;
	
	public Usage(OperatingSystem operatingSystem)
	{
		if(validateOperatingSystem(operatingSystem))
		{
			this.operatingSystem = operatingSystem;
			return;
		}
		this.operatingSystem = OperatingSystem.NON_VALUE;
	}
	
	public OperatingSystem getOperatingSystem()
	{
		return operatingSystem;
	}
	
	private Boolean validateOperatingSystem(OperatingSystem operatingSystem)
	{
		return true;
	}
}
