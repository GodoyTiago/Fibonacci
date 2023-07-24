public class CicloDos{
 public static void main (String args[]){

	int i = 1, o = 99;

	System.out.println("Serie con For: ");
	for(i = 1; i <= 5; i++){
	if(i < 5){ 
		System.out.print(i + ", ");
		System.out.print(o + ", ");
	} else {
		System.out.print(i + ", ");
		System.out.print(o);
		}	
		o--;
		}		
		System.out.println("");
	i = 1;
	o = 99;

	System.out.println("Serie con while: ");
	while( i <= 5){ 
	if (i < 5){ 
		System.out.print(i + ", ");
		System.out.print(o + ", ");
	} else {
		System.out.print(i + ", ");
		System.out.print(o);
  }
	i++;
	o--;
  }
		System.out.println("");
	System.out.println("Serie con do-while: ");
	i = 1;
	o = 99;
	do{ if (i < 5) { 
		System.out.print(i + ", ");
		System.out.print(o + ", ");
	} else {
		System.out.print(i + ", ");
		System.out.print(o);
  }
	i++;
	o--;
  	} while ( i <= 5);
 }
}