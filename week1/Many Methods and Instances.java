import java.util.Scanner;

public class firstclass {
	public static void main(String[] args)
	{
		Scanner sc=new Scanner (System.in);
		secondclass object=new secondclass();
		String name;
		System.out.println("Enter the name of your school:");
		name=sc.nextLine();
		object.getName(name);
		object.output();
	}

}

---------------------------------------------------------------------    

public class secondclass {
	private String schoolname;
	public void getName(String name)
	{
		schoolname=name;
	}
	public void output()
	{
		System.out.print("The name of your school is "+schoolname);
	}
}
