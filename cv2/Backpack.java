public class Backpack{
	
	private int volume;
	private int loadCapacity;
	private int remainingVolume;
	private int remainingLoadCapacity;
	
	public Backpack(int volume_param, int loadCapacity_param){
		volume = volume_param;
		loadCapacity = loadCapacity_param;
		remainingVolume = volume_param;
		remainingLoadCapacity = loadCapacity_param;
	}
	
	public int getVolume(){
		return volume;
	}
	
	public int getLoadCapacity(){
		return loadCapacity;
	}
	
	public int getRemainingVolume(){
		return remainingVolume;
	}
	
	public int getRemainingLoadCapacity(){
		return remainingLoadCapacity;
	}
	
	public boolean putItem(Item item) {
        if (item.getVolume() <= remainingVolume && item.getWeight() <= remainingLoadCapacity) {
            remainingVolume -= item.getVolume();
            remainingLoadCapacity -= item.getWeight();
            return true;
			}
        return false;
	}
}