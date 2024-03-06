public class m_69_Recursion_index_of_key_element {
	public static void Occurences(int arr[],int key,int i){
if(i==arr.length){
	return;
}
if(arr[i]==key){
	System.out.println(i);
}

	Occurences(arr, key, i+1);

	}

	public static void main(String[] args) {
		int arr[]={3,2,4,5,6,2,7,2,2};
		int key=2;
		Occurences(arr,key,0);
	}
  

	// public int[] AllIndexesRecursive(int input[],
	// 							int x, int start)
	// {
	// 	if (start == input.length) {
	// 		int[] ans = new int[0]; 
	// 		return ans;
	// 	}
	// 	int[] smallIndex = AllIndexesRecursive(input, x,
	// 										start + 1);
	// 	if (input[start] == x) {
	// 		int[] myAns = new int[smallIndex.length + 1];

	// 		myAns[0] = start;
	// 		for (int i = 0; i < smallIndex.length; i++) {
				
	// 			myAns[i + 1] = smallIndex[i];
	// 		}
	// 		return myAns;
	// 	}
	// 	else {
	// 		return smallIndex;
	// 	}
	// }

	// public int[] AllIndexes(int input[], int x)
	// {

	// 	return AllIndexesRecursive(input, x, 0);
	// }
	// public static void main(String args[])
	// {
	// 	m_69_Recursion_index_of_key_element h = new m_69_Recursion_index_of_key_element();
	// 	int arr[] = { 1, 2, 3, 2, 2, 5 }, x = 2;
		
	// 	int output[] = h.AllIndexes(arr, x);
		
	// 	// Printing the output array
	// 	for (int i = 0; i < output.length; i++) {
	// 		System.out.print(output[i] + " ");
	// 	}
	// }
}


