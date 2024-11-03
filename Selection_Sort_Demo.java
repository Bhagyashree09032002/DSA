package Data_Structure;

public class Selection_Sort_Demo {

	public static void display(int a[]) {
		System.out.println();
		for(int i=0; i< a.length; i++)
		{
			System.out.print(a[i]+" ");
		}
	}
	public static void selectionSort(int a[]) {
		int min=0;
		for(int i=0; i< a.length; i++) //Traversing
		{
			min=i;
			for(int j=i+1; j<a.length; j++) //Comparing element
			{
				if(a[j]< a[min])
				{
					min= j;
				}
			}
			int temp=a[min];
			a[min]=a[i];
			a[i]=temp;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {10,7,21,4,65};
		display(a);
		selectionSort(a);
		display(a);

	}

}
