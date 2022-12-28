public class MyMap <K, T> {
	
	List<T> arrOfValues;
	List<Integer> arrOfHash;
	
	
	public MyMap() {
		arrOfValues = new ArrayList<>();
		arrOfHash = new ArrayList<>();
	}
	
	public void put(K key, T value) {
		arrOfHash.add(key.hashCode());
		arrOfValues.add(value);
	}
	
	public T get(K key) {
		int index = arrOfHash.indexOf(key.hashCode());
		if (index < 0) {
			return null;
		}
		return arrOfValues.get(index);
	}
}
