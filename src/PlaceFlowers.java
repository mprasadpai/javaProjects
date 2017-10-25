
public class PlaceFlowers {
	

	    public boolean canPlaceFlowers(int[] flowerbed, int n) {
	        int i = 0, count = 0;
	        while (i < flowerbed.length) {
	            if (flowerbed[i] == 0 && (i == 0 || flowerbed[i - 1] == 0) && (i == flowerbed.length - 1 || flowerbed[i + 1] == 0)) {
	                flowerbed[i] = 1;
	                count++;
	            }
	            i++;
	        }
	        return count >= n;
	    }
	

	public static void main(String[] args) {

		PlaceFlowers mbs = new PlaceFlowers();
		int[] arr = {1,0,0,0,0,0,1};
		
        System.out.println("Can be placed? : "+mbs.canPlaceFlowers(arr, 3));


	}

}