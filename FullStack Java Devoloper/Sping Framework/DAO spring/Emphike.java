import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

class Emphike
{
	 public static void main(String arr[])
	 {
		 
		               try {
			 
			              String driver="com.mysql.cj.jdbc.Driver";
			    		  String url="jdbc:mysql://localhost:3306/springjdbc";
			    		  String username="root";
			    		  String password="chandu242638";
			    		  
			    		  Class.forName(driver);
			    		  Connection con=DriverManager.getConnection(url, username, password);
			    		  Statement stmt=con.createStatement();
			    		  ResultSet rs=stmt.executeQuery("select * from employee");
			    		  
			    		  while(rs.next())
			    		  {
			    			  String id=rs.getString(1);
			    			  String name=rs.getString(2);
			    			  int exp=rs.getInt(3);
			    		  
					
			    		  //business logic
			    		  if(exp>=15)
			    		  {
			    			  System.out.println("Employee with id "+id+" and name "+name+" with expireance "+exp+" got 30% hike ");
			    		  }
			    		  else if(exp>=10)
			    		  {
			    			  System.out.println("Employee with id "+id+" and name "+name+" with expireance "+exp+" got 25% hike ");
			    		  }
			    		  else if(exp>=5)
			    		  {
			    			  System.out.println("Employee with id "+id+" and name "+name+" with expireance "+exp+" got 20% hike ");
			    		  }
			    		  else{
			    			  System.out.println("Employee with id "+id+" and name "+name+" with expireance "+exp+" got 15% hike ");
			    		       }	
			    		  }
		               }
		               catch(Exception e)
		               {
		            	   
		               }
	 }
}
		                   
		 
	 