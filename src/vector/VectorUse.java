package vector;

import java.util.Scanner;

class VectorUse // constructor one one 
{
	public static void main (String[] args)
		{
		Scanner S = new Scanner(System.in);
		int x = S.nextInt();
		int y = S.nextInt();
			Vector vector = new Vector(x,y);
			//vector.ShowInfo();
			System.out.println("Corner is: " +vector.CornerVec());
			System.out.println("Radious is: " +vector.Radious());
		}
} 
