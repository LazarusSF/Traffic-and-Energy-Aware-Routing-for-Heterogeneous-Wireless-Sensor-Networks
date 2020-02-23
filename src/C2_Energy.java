
 
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartFrame;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;
import org.jfree.data.general.DefaultPieDataset;
import java.sql.*;
 
public class C2_Energy {
    public static void main(String[] args) {
        
    

 int count=0;
 int count1=0;
 
  double c1=0.0;
  double c2=0.0;
  double c3=0.0;
  double c4=0.0;
  double c5=0.0;
  double c6=0.0;
  double c7=0.0;
  double c8=0.0;
  
  
    	try
    	{
    		Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
    		Connection con = DriverManager.getConnection("jdbc:odbc:Driver={Microsoft Access Driver (*.mdb)};Dbq=src\\Network.mdb");
    		System.out.println("Connected");
    		Statement st=con.createStatement();
    		
    		ResultSet rs=st.executeQuery("select * from Cluster2");
    		
    		
    		while(rs.next()==true)
    		{
    			
    			count++;
    			
    			if(count==1)
    			{
    				c1=Double.valueOf(rs.getInt("Energy"));
    			}
    			
    			if(count==2)
    			{
    			c2=Double.valueOf(rs.getInt("Energy"));
    			}
    			if(count==3)
    			{
    				c3=Double.valueOf(rs.getInt("Energy"));
    			}
    			if(count==4)
    			{
    				c4=Double.valueOf(rs.getInt("Energy"));
    			}
    			if(count==5)
    			{
    				c5=Double.valueOf(rs.getInt("Energy"));
    			}
    			if(count==6)
    			{
    				c6=Double.valueOf(rs.getInt("Energy"));
    			}
    			if(count==7)
    			{
    				c7=Double.valueOf(rs.getInt("Energy"));
    			}
    			if(count==8)
    			{
    				c8=Double.valueOf(rs.getInt("Energy"));
    			}
    			
    		
    		
    			
    		}
	
    		    DefaultCategoryDataset dataSet = new DefaultCategoryDataset();
    	        dataSet.setValue(c1, "Node1", "N1");
    	        dataSet.setValue(c2, "Node2", "N2");
    	        dataSet.setValue(c3, "Node3", "N3");
    	        dataSet.setValue(c4, "Node4", "N4");
    	        dataSet.setValue(c5, "Node5", "N5");
    	        dataSet.setValue(c6, "Node6", "N6");
    	        dataSet.setValue(c7, "Node7", "N7");
    	        dataSet.setValue(c8, "Node8", "N8");
    	 
    	        JFreeChart chart = ChartFactory.createBarChart(
    	                "Traffic and Energy Aware Routing for Heterogeneous Wireless Sensor Networks --- Cluster2", "Node Category", "Energy",
    	                dataSet, PlotOrientation.VERTICAL, true, true, true);
    	 
    	      
    	        ChartFrame chartFrame=new ChartFrame("Different Transaction Energy Details",chart);
    	        chartFrame.setVisible(true);
    	     
    	        chartFrame.setSize(800,500);
    	        
        
    	}
    	catch(Exception ex)
    	{
    	System.out.println(ex);	
    		
    	}
    
}
}