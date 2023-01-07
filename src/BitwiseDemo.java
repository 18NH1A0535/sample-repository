
public class BitwiseDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// initializing the values of a and b
	      int a=3; // 0+2+1 or 0011 in binary
	      int b=6; // 4+2+0 or 0110 in binary
	       
	      // bitwise or
	      int c= a | b; //011|110 =111 =7
	       
	      // bitwise and
	      int d= a & b; //011&110 =010 =2
	       
	      // bitwise xor
	      int e= a ^ b; //011^110 =101 =5
	       
	      // bitwise not
	      int h=(~a); //~011 -100 =-4
	      int f= (~a & b)|(a &~b);
	      int g= ~a & 0x0f;
	      System.out.println("BOR "+c);
	      System.out.println("BAND "+d);
	      System.out.println("BXOR "+e);
	      System.out.println("BNOT "+h);
	}

}
