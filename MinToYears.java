package minToYears;

class MinToYears {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int y=years(3456789);
		//int d=days(3456789);
		MinToYears num=new MinToYears();
		int y=num.years(3456789);
		int d=num.days(3456789);
		System.out.println("3456789 minutes is approximately "+y+" years and "+d+" days.");
	}
	int years(int yr) {
		return (yr/(24*60*365));
	}
	int days(int da) {
		da=da/(24*60);
		return (da%(24*60*365));
	}
	
}
