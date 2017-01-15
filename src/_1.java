
public class _1 {
	public static int binarySearch(int[] a, int key)
	{
		return binarySearch(key, a, 0, a.length -1);
	}
	private static int binarySearch(int key, int[] a, int lo, int hi)
	{
		if (lo > hi) 
			return -1;
		int mid = (hi + lo) / 2;
		if (key == a[mid])
			return mid;
		if (key > a[mid])
			return binarySearch(key, a, mid + 1, hi);
		return binarySearch(key, a, lo, mid - 1);
		
	}

	public static void main(String[] args) {
		System.out.println("Algorithm _1");
		System.out.println("BinarySearch");
		int[] a = new int[100];
		for (int i = 0; i < a.length; i++)
			a[i] = i + 1;
		System.out.println("result = " + binarySearch(a, 3));
	}

}
