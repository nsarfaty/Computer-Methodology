
public class GitHub {
	public static void main (String args[]) {
	int array[]= {1,4,5,3,7,8};
	System.out.println(getCount(array));
	}

public static int getCount(int [] array) {
	if (array.length==0) {
		return 0;
	}
	int total=0;
	for (int i=0; i<array.length;i++) {
		total=array[i]+total;
	}
	return total;
}
}

