package entities;

public class LicenceKey 
{
	private String key;
	public LicenceKey(String key)
	{
		if(ValidateKey(key))
		{
			this.key = key.toUpperCase();
			return;
		}
		this.key = "-";
	}
	
	public String getKey()
	{
		return key; 
	}
	
	private Boolean ValidateKey(String key)
	{
		return true;
	}
}
