package fractional.knapsack.problem;

import java.util.Comparator;

public class FKPComparator implements Comparator<Items> {

	@Override
	public int compare(Items item1, Items item2) {
		// TODO Auto-generated method stub
//		int cpr1,cpr2;
//		cpr1= item1.getProfit()/item1.getWeight();
//		cpr2= item2.getProfit()/item2.getWeight();
//		
		double cpr1,cpr2;
//		cpr1=new Double(((double)item1.getProfit()/(double)item1.getWeight());
		cpr1=new Double(item1.getProfit()/item1.getWeight());
		cpr2=new Double(item2.getProfit()/item2.getWeight());
		 
				
		
		if(cpr1 < cpr2)
			return 1;
		else
			return -1;
	}

}
