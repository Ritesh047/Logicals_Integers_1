public class PerfectNumber{
// Write Your code here
public static void main(String[] args) {
	int a= 12;
	int temp=0;
	for(int i=2;i<a;i++) {
	if(a%i!=0) {	
		temp++;
	}

	}
	
	if(temp==0) {
		System.out.println("Composite Numbers:"+a);
	}
	else {
		System.out.println("Prime Numbers:"+a);
	}
	
	
}

    
 }


