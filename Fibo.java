public class Fibo{
 public static void main (String args[]){

	int A = 0;
	int B = 1;
	int C = 0;
	int serie = 14;
	int i;
	System.out.println("Serie Fibonacci, con for: ");

	for(i = 1;i < serie;i++){
	if (i < 13) { 
	System.out.print (C+", ");
	A = C;
	C = B;
	B = A + C;
	} else 	System.out.println(C);
	}


	System.out.println("Serie Fibonacci, con while: ");
	 A = 0;
	 B = 1;
	 C = 0;
	 i = 1;
	serie = 14;

	while (i < serie){
	if (i < 13) { 
	System.out.print (C+", ");
	A = C;
	C = B;
	B = A + C;
	} else System.out.println(C);
	i++;
	}		

	
	System.out.println("Serie Fibonacci,do con while: ");
	 A = 0;
	 B = 1;
	 C = 0;
	 i = 1;
	serie = 14;
	do{
	if (i < 13) { 
	System.out.print (C+", ");
	A = C;
	C = B;
	B = A + C;
	} else System.out.println(C);
	i++;
	}
	while(i < serie);
 }
}
