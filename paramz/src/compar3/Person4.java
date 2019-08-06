package compar3;
class Person4 implements Comparable {

	  private String firstName;
	  private String lastName;
	  private int age;

	  public String getFirstName() {
	    return firstName;
	  }

	  public void setFirstName(String firstName) {
	    this.firstName = firstName;
	  }

	  public String getLastName() {
	    return lastName;
	  }

	  public void setLastName(String lastName) {
	    this.lastName = lastName;
	  }

	  public int getAge() {
	    return age;
	  }

	  public void setAge(int age) {
	    this.age = age;
	  }

	  public int compareTo(Object anotherPerson4) throws ClassCastException {
	    if (!(anotherPerson4 instanceof Person4))
	      throw new ClassCastException("A Person4 object expected.");
	    int anotherPerson4Age = ((Person4) anotherPerson4).getAge();  
	    return this.age - anotherPerson4Age;    
	  }
	}