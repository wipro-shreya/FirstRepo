public class DiscountMethod {

	
	double originalPrice;
	double finalPrice;
	
	
	
	
	public static double calculateDiscount(double originalPrice, int percent){
		
		
		double discount = originalPrice*((double)percent/100);
		
		
		return discount;
			
	}
	
	public static void main(String[] args) {
		double jay = calculateDiscount(100, 20);
		System.out.println(jay);;

	}	
	
}