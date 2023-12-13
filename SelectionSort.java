

//Code uses recursion to sort the array with Selection sort, and find an element with Binary search

public class SelectionSort{

	public static void main(String[] args){
		double[] list={135.3, 152.1, 9.3, 221.9, 2.6, 7.1, 851.6, 41.3, 69.7, 59.3, 142.9, 12.7, 1.5, 36.8};
		
		list=sort(list);

		for(int i=0;i<=list.length-1;i++){
				System.out.print(list[i]+" ");
		}
		
		System.out.println("\n851.6 is in the index "+binarySearch(list, 851.6));

	}

	public static double[] sort(double[] arr){
		return sort(arr, 0, arr.length-1);
	}

	private static double[] sort(double[] arr, int low, int high){
		if(low<high){
			int indexOfMin = low;
			double min = arr[low];

			for(int i=low+1;i<=high;i++){
				if(arr[i]<min){
					indexOfMin=i;
					min=arr[i];
				}
			}

			arr[indexOfMin]=arr[low];
			arr[low]=min;
			return sort(arr, low+1, high);
		}
		return arr;
	}

	public static int binarySearch(double[] arr, double key){
		int low=0;
		int high=arr.length-1;
		
		return binarySearch(arr,low, high, key);
	}

	private static int binarySearch(double[] arr, int low, int high, double key){
		if(low>high)
		return -low-1;

		int mid=(low+high)/2;
		if(key<arr[mid])
			return binarySearch(arr, low, mid-1, key);
		else if(key==arr[mid])
			return mid;
		else if(key>arr[mid])
			return binarySearch(arr, mid+1, high, key);
		
		return -1;
	}
}

