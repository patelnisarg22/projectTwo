package project;

public class Q1 {
			public void bubbleSort() {
				int arr[]= {1,0,5,6,3,2,3,7,9,8,4};
				int n=arr.length;
				for(int i=0;i<n;i++) {
					for(int j=i;j<n;j++){
						if(arr[i]>arr[j])
						{
							int temp;
							temp=arr[i];
							arr[i]=arr[j];
							arr[j]=temp;
						}
					}
				}
				System.out.print("your sorted array is:");
				for(int x=0;x<n;x++) {
					System.out.print(arr[x]);
					}
			}
}
