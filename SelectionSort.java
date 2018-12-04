
class SelectionSort{
	void sort(int arr[]){
		int n = arr.length;


		//loop thru not include the last ele
		for(int i=0; i<n-1; i++){
			//assign the min_index
			int min_idx = i;

			//loop thru not include the first ele
			for(int j=i+1; j<n; j++){
				//if ele in the min_indx is greater
				if(arr[j] < arr[min_idx])
					//find the min ele
					min_idx = j;
			}

			//swap the two eles, save the minial to temp
			int temp = arr[min_idx];
			arr[min_idx] = arr[i];
			arr[i] = temp;
		}
	}


	//prints the arrays
	void printArray(int arr[]){
		int n = arr.length;

		for(int i=0; i<n; i++)
			System.out.println(arr[i] + " ");
		System.out.println();
	}

	public static void main(String[] args) {
		int arr[] = {6,5,4,3,2,1};

		SelectionSort obj = new SelectionSort();

		obj.sort(arr);
		System.out.println("Sorted array");
		obj.printArray(arr);
	}


}