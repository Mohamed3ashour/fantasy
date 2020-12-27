package fpackage;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.LineNumberReader;

public class LineNumberCounter {

	public static int LineCounter()
	{
		int lineNumberCount	= 0;
		File file = new File("C:\\Users\\HASSAN\\Desktop\\UsersList.txt");
		if(file.exists())
		{
			try 
			{
				FileReader fr = new FileReader(file);
				LineNumberReader lr = new LineNumberReader(fr);
				try 
				{
					while(lr.readLine()!=null)
					{
						lineNumberCount++;
					}
				}
				catch(IOException e)
				{
					e.printStackTrace();
				}
			} 
			catch(FileNotFoundException e)
			{
				e.printStackTrace();
			}	
		}
		return lineNumberCount;
	}
	
}
