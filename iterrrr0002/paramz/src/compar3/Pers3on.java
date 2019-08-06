package compar3;
class Pers3on implements Comparable {
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

	  public int compareTo(Object anotherPers3on) throws ClassCastException {
	    if (!(anotherPers3on instanceof Pers3on))
	      throw new ClassCastException("A Pers3on object expected.");
	    int anotherPers3onAge = ((Pers3on) anotherPers3on).getAge();  
	    return this.age - anotherPers3onAge;    
	  }
	}