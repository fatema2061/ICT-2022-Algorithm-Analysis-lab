package fractional.knapsack.problem;

public class Items {
	private int object;
	private int profit;
	private int weight;
	public int getObject() {
		return object;
	}
	public void setObject(int object) {
		this.object = object;
	}
	public int getProfit() {
		return profit;
	}
	public void setProfit(int profit) {
		this.profit = profit;
	}
	public int getWeight() {
		return weight;
	}
	public void setWeight(int weight) {
		this.weight = weight;
	}
	public double getValuePerWeight() {
        return (double) profit / weight;
    }
	@Override
	public String toString() {
		return "Items [object=" + object + ", profit=" + profit + ", weight=" + weight + "]";
	}
	
	
}
