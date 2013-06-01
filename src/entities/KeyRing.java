package entities;

import java.util.ArrayList;

public class KeyRing 
{
	private ArrayList<Key> keys;
	
	public KeyRing()
	{
		this.keys = loadCollection();
	}
	
	public void safeCollection()
	{
		
	}

	private ArrayList<Key> loadCollection()
	{
		return new ArrayList<Key>();
	}
	
	public Key getKeyAtIndex(int index)
	{
		return keys.get(index);
	}
	
	public void addKey(Key key)
	{
		keys.add(key);
	}
	
	public int getKeyRingSize()
	{
		return keys.size();
	}
	
	public void deleteKey(Key key)
	{
		keys.remove(key);
	}
}
