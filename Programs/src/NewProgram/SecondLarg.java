package NewProgram;

public class SecondLarg {
	public static void main(String[]args) {
		int[] arr = {10, 25, 3, 47, 47, 8}; int third;
		
		for(int i=0; i<arr.length;i++) {
//			int a =arr[i];
			for(int j=i+1;j < arr.length;j++) {
				if(arr[i] < arr[j]) {
					third = arr[j];
					arr[j]=arr[i];
					arr[i]=third;
					
				}
		}
		}
		for(int num :arr) {
//			System.out.println(num);
			
//	int first = Integer.MIN_VALUE;
//	int second = Integer.MIN_VALUE;
//	for(int num : arr) {
//		if(num>first) {
//			second = first;
//			first= num;
//		}
//		else if(num>second  &&  num!= first){
//			second = num;
//		}
//			
//		}
//	System.out.println("first: " + first);
//	System.out.println("second: " + second);
//	}
			

	}
		System.out.println(arr[1]);
	}
}

