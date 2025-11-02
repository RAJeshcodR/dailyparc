package pack1;

public class program3 
{

	
public static void main(String[] args) 
 {
	String [][]FoodItems= {{"apple","banana","mango","Avocado"},{"grapes","pineapple","goua","promogranate"},{"orange","kiwi","papaya","custurdapple"}};
	for(int i=0;i<FoodItems.length;i++)
	{
		for(int j=0;j<FoodItems[i].length;j++)
		{
			System.out.print(FoodItems[i][j]+" ");
		}
		System.out.println();
	}
 }

}
