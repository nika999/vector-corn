package vector;
import java.math.*;
class Vector
{
	public double x,y,r,corner;
	Vector (double x, double y) // object
		{
			this.x = x;
			this.y = y; 
		}
	double CornerVec () // method for calculating the corner
		{
		corner = 57.2958*(Math.atan(x/y));
		
		return corner;		
		}
//                                         //
//            0 0
//             &   
//            ###
//
	double Radious () 
	{
	//r = Math.pow((Math.pow(x, 2)+Math.pow(y, 2)), 1/2);
	r = x/Math.cos(corner);
	
	return r;
	}
	
	
/*	void ShowInfo() // method for outlet of data
		{
		System.out.println ("Korner ic: " + CornerVec ()); 
		} */
}

