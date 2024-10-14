public class Item{
	private int volume;
	private int weight;
	
	public Item(int volume_param, int weight_param){
		volume = volume_param;
		weight = weight_param;
	}
	
	public int getVolume(){
		return volume;
	}
	
	public int getWeight(){
		return weight;
	}
}