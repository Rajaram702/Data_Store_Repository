public class Laptop
{
	public void m1()
	{
		Stream.of(5,2,5,1,6,2).collect(Collectors.toMap(x->x,x->1,(x,y)->x+y));
	}
	public void m2()
	{
		Integer[] itr=new Integer[]{5,8,4,2,7};
		Arrays.stream(itr).forEach(System.out::println);
	}
}