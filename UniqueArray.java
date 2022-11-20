package s0start;

public class UniqueArray {
	
	public static int unique(int[] array) {
		int i, a, zahl, count;
		
		i = 0;
		a = 0;
		zahl = 0;
		count = 0;
		while (i < array.length) {
			while (a < array.length) {
				if (array[i] == array[a] && i != a) {
					count++;
				}
				a++;
			}
			if (count == 0) {
				zahl++;
			}
			a = 0;
			count = 0;
			i++;
		}
		return zahl;
	}
	
	public static void main(String[] args) {
		int[] array = {1,2,3,3,1};
		System.out.println(unique(array));
	}
}
