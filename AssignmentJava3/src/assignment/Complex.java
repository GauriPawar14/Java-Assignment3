package assignment;

public class Complex {
	private double real;
	private double img;
	
	
	
	public Complex(double real, double img) {
		super();
		this.real = real;
		this.img = img;
	}


	//Method
	public Complex add(Complex num)//second is object
	{
		double real=this.real+num.real;
		double img=this.img+num.img;
		return new Complex(real,img);
		
	}
	public Complex sub(Complex num)
	{
		double real=this.real-num.real;
		double img=this.img-num.img;
		return new Complex(real,img);
	}
	public Complex multi(Complex num)
	{
		double real=this.real*num.real;
		double img=this.img*num.img;
		return new Complex(real,img);
	}

	public void display() {
		System.out.println(real+" + "+img+"i");
	}

	public static void main(String[] args) {
		Complex obj=new Complex(10, 20);
		Complex obj1=new Complex(20, 30);
		Complex result=obj.add(obj1);
		result.display();
		
		Complex obj3=new Complex(10, 20);
		Complex obj4=new Complex(20, 30);
		Complex result1=obj.sub(obj4);
		result1.display();
		
		Complex obj5=new Complex(10, 20);
		Complex obj6=new Complex(20, 30);
		Complex result2=obj.multi(obj6);
		result2.display();

	}

}
