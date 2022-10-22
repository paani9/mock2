package mock1;
class A
{ int a=10;
 void disp(A b)
 {
	 
	 System.out.println(b.a);
 }
}
class mock
{ public static void main(String[] args)
	{ A s=new A();
	  A.disp(s);
	}
}


