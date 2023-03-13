package BUSINESSNEXT.SBCGOLD8CLOUD.SOAPAPI;

public class ApiMainClass {

	
	public static void main(String args[])
	
	{
		TokenGeneration token=new TokenGeneration();
		CSQUpdateForTrustTreasury CSQ=new CSQUpdateForTrustTreasury();
		
		token.Token();
		CSQ.CSQUpdate();
		
		
	}
	}
