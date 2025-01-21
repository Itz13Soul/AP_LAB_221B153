/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/

class Hellp {

	private String name;
	private Integer age;

	public String getName() 
	{ return name; }
	public Integer getAge() 
	{ return age;}

	public void setName(String N)
	{

		this.name = N;
	}
	public void setAge(Integer C)
	{
	    this.age = C;
	}
}

class Juet {

	public static void main(String[] args)
	{
		Hellp obj = new Hellp();

		obj.setName("Ajay");
		obj.setAge(25);
		System.out.println(obj.getName());
		System.out.println(obj.getAge());
	}
}

