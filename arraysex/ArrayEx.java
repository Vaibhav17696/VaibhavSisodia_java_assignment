package arraysex;

public class ArrayEx {
	public static void main(String[] args) {

		int[] arr;
		arr = new int[5];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = i;
		}
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
		System.out.println("iterate using for each loop:");
		for (int v : arr) {
			System.out.println(v);
		}

		String[] arr1 = new String[3]; 
		arr1[0]="VAIBHAV";
		arr1[1]="VAIBHAV2";
		arr1[2]="VAIBHAV3";
		
		for (int i = 0; i < arr1.length; i++) {
			System.out.println(arr1[i]);
		}

	}

}
