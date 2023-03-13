package BUSINESSNEXT.SBCGOLD8.TESTSCENARIOS;
import org.testng.annotations.Test;

import BUSINESSNEXT.SBCGOLD8CLOUD.COMMON.*;
import BUSINESSNEXT.SBCGOLD8CLOUD.METHOD.*;




   public class SC_063_DB_ConnectionCheck extends HomePageMethod
   {
	   OracleDbConnection db= new OracleDbConnection();
	//ListnersClassAnotation css=new ListnersClassAnotation();
    @Test(priority=1)
	public void SC_050_TC_001() throws Exception
	{
    	db.dboracleConnection("13947");
	}
    }




