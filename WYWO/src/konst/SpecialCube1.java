package konst;
//http://www.wideskills.com/java-tutorial/java-constructors

class Cube {

	int length;
	int breadth;
	int height;
	public int getVolume() {
		return (length * breadth * height);
	}
	Cube(int l, int b, int h) {
		length = l;
		breadth = b;
		height = h;
		System.out.println("Finished with Parameterized Constructor having 3 params of Cube");
	}
}

public class SpecialCube1 extends Cube {

	int weight;
	SpecialCube1() {
		super(10, 20, 30); //Will Give a Compilation Error without this line
		weight = 10;
	}
	public static void main(String[] args) {
		SpecialCube1 specialObj1 = new SpecialCube1();
		System.out.println("Volume of SpecialCube1 is : "+ specialObj1.getVolume());
	}
}