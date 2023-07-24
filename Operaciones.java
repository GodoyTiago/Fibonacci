public class Operaciones {
public static void main(String Args[]){
	System.out.println("Serie con For, ricky ford");

	int i = 0;

	for(i = 1; i <= 10; i++)
	if (i < 10) {
		System.out.print(i + ", "); }
	else { System.out.print(i); }

	i = 1;
	System.out.println("");

	System.out.println("Serie con While: ");
	while(i <= 10) {
	if (i < 10) {
		System.out.print(i + ", ");
	} else {
	 System.out.print(i); 
	}
	i++;
  }
	i = 1;
	System.out.println("");

	System.out.println("Serie con Do While: ");
	do{
	if (i < 10) {
		System.out.print(i + ", ");
	} else {
	 System.out.print(i); 
	}
	i++;
	} while(i <= 10);
 }
}