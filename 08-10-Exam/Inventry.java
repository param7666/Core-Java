class Inventry 
{	
	public static int  totalItem=10;
	
	public void addItem(int quentity) {
		System.out.println("Before Adding Item Total Item is"+totalItem);
		int result=totalItem+quentity;
		
		System.out.println("After Adding Items Total Item is"+result);
	}
	
	public void removeItem(int quentity) {
		System.out.println("Before Removing Item Total Item is"+totalItem);
		int result = totalItem-quentity;
		System.out.println("After removing the Item Total Item is"+result);
	}
	public static void main(String[] args) 
	{
		Inventry obj=new Inventry();
		obj.addItem(5);
	}
}
