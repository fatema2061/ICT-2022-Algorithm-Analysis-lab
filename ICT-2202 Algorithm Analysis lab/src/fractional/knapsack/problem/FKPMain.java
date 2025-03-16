package fractional.knapsack.problem;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import activity.selection.problem.ActivitySelectionProblem;

public class FKPMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Items> items = new ArrayList<Items>();
		
		Items item2 = new Items();
		item2.setObject(2);
		item2.setProfit(5);
		item2.setWeight(1);
		
		Items item1 = new Items();
		item1.setObject(1);
		item1.setProfit(12);
		item1.setWeight(3);
		
		Items item3 = new Items();
		item3.setObject(3);
		item3.setProfit(16);
		item3.setWeight(4);
		
		Items item4 = new Items();
		item4.setObject(4);
		item4.setProfit(7);
		item4.setWeight(2);
		
		Items item6 = new Items();
		item6.setObject(6);
		item6.setProfit(11);
		item6.setWeight(4);
		
		Items item7 = new Items();
		item7.setObject(7);
		item7.setProfit(6);
		item7.setWeight(3);
		
		Items item5 = new Items();
		item5.setObject(5);
		item5.setProfit(9);
		item5.setWeight(9);
		
		items.add(item1);
		items.add(item2);
		items.add(item3);
		items.add(item4);
		items.add(item5);
		items.add(item6);
		items.add(item7);
		Collections.sort(items, new FKPComparator());
		
		int capacity = 15;
		
		maxvalue(items,capacity);
		
		
	}
	
	

	private static void maxvalue(ArrayList<Items> items, int capacity) {
		// TODO Auto-generated method stub
		double totalValue = 0d;
		 
        for (Items i : items) {
 
            int curWt = (int)i.getWeight();
            int curVal = (int)i.getProfit();
 
            if (capacity - curWt >= 0) {
 
                // This weight can be picked whole
                capacity = capacity - curWt;
                totalValue += curVal;
            }
            else {
 
                // Item cant be picked whole
                double fraction = ((double)capacity / (double)curWt);
                totalValue += (curVal * fraction);
                capacity = (int)(capacity - (curWt * fraction));
                break;
            }
		
	}
        System.out.println(totalValue);
	}
}
