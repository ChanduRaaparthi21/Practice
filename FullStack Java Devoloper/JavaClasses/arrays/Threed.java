class Threed{
	
	public static void main(String arg[]) {
		
		//creatiing and inserting elements into an 3d array
		int[][][] collegemarks = {
				                 {{10,9,8,7,8},{7,9,8,7,8},{10,5,9,7,8}},
				                 {{10,9,8,7,8},{7,9,8,7,8},{10,5,9,7,8}},
				                 {{10,9,8,7,8},{7,9,8,7,8},{10,5,9,7,8}}
				                 };
		for(int i=0;i<3;i++)//no.of 2-d array
		{
			for(int j=0;j<3;j++)//rows
				
			{
		       for(int k=0;k<5;k++)//columns
		       {
		    	   System.out.println(collegemarks[i][j][k]+"\t");
		       }
		
		
		
			}
		}
		
		
	}
}