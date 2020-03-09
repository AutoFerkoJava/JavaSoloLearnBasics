package L7EqualMethods;

public class Animal {
	String name;
    Animal(String n) {
        name = n;
    }
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Animal other = (Animal) obj;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}
    
}


//Just right click in your class, go to Source->Generate hashCode() 
//and equals()...
/*
 The automatically generated hashCode() method is used to 
 determine where to store the object internally. 
 Whenever you implement equals, you MUST also implement hashCode.
We can run the test again, using the equals method:
 */
 
