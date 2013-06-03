package entities;

public class ColumnValuePair 
{	
	private ColumnName columnName;
	private Value value;
	
	public ColumnValuePair(ColumnName columnName, Value value)
	{
		this.value = value;
		this.columnName = columnName;
	}

	public ColumnName getColumnName() 
	{
		return columnName;
	}

	public Value getValue() 
	{
		return value;
	}	
}
