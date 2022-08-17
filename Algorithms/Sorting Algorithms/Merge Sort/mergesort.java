import java.util.Scanner;

public class mergesort{
	
	public static void merge(int a[],int l,int m,int r,int n) {
		int i=l;
		int j=m+1;
		int k=0;
		int b[]=new int[n];
		
		// Comparing the values in the 2 splitted arrays (array(l,m) and array(m+1,r))
		while(i<=m && j<=r) {
			if(a[i]>a[j]) {
				b[k]=a[j];
				j++;
			}
			else {
				b[k]=a[i];
				i++;
			}
			k++;
		}
		
		// if any one of the array is reached the end we have to join the remaining array as it is in the main array
		while(i<=m) {
			b[k]=a[i];
			k++;
			i++;
		}
		while(j<=r) {
			b[k]=a[j];
			k++;
			j++;
		}
		for(i=l;i<=r;i++) {
			a[i]=b[i-l];
		}
		
	}
	
	public static void mergesplit(int a[],int l,int r,int n) {
		if(l<r) {
			int m=l+(r-l)/2;
			mergesplit(a,l,m,n);
			mergesplit(a,m+1,r,n);
			merge(a,l,m,r,n);
		}
	}
	public static void main(String []args) {
		Scanner in =new Scanner(System.in);
		int n=in.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++) {
			a[i]=in.nextInt();
		}
		mergesplit(a,0,n-1,n); // mergesort(array, left index, right index, size of the array) 
		

		for(int i=0;i<n;i++) {
			System.out.print(a[i]+" ");
		}
	}
}