package test;

import java.io.IOException;


import generalUtility.XLUtility;

public class program1 
{
	public static void main(String[] args) throws IOException 
	{
			String path1 = "C:\\Users\\Fleek\\eclipse-workspace\\Testing.Treatians\\data\\LoginCredential.xlsx";
			XLUtility xlutil1 = new XLUtility(path1);
			int totalrows = xlutil1.getRowCount("Sheet1");
			int totalcolumn = xlutil1.getCellCount("Sheet1", 1);
			
			String loginData[][] = new String [totalrows][totalcolumn];
					for(int i = 1; i<=totalrows ; i++)
					{
						for (int j = 0 ; j<totalcolumn;j++)
						{
							loginData [i-1][j] = xlutil1.getCellData(path1,"Sheet1", i, j);
							//System.out.println(loginData);
						
								System.out.print(loginData[i-1][j]+" ");
								
						}
						System.out.println();

					}
					
		
	}

}
