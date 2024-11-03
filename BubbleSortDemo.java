package Data_Structure;

public class BubbleSortDemo {

		public static void display(int a[]) {
			System.out.println();
			for(int i=0; i< a.length; i++)
			{
				System.out.print(a[i]+" ");
			}
		}
		public static void bubbleSort(int a[]) {
			int min=0;
			for(int i=0; i< a.length; i++)//Iterating 
			{
				for(int j=0; j<a.length-i-1; j++)//Reducing steps
				{
					if(a[j]> a[j+1]) 
					{
				         int temp=a[j];
				         a[j]=a[j+1];
				         a[j+1]=temp;
					}
				}
			}
		}

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			int a[]= {10,7,21,4,65};
			display(a);
			bubbleSort(a);
			display(a);

		}

	}
