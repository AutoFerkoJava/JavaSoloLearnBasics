package L4bconctructors;
/*
 A single class can have multiple constructors with different numbers 
 of parameters.
The setter methods inside the constructors can be used to set 
the attribute values.

Example:
 */
public class Vehicle {

private String color;
    
    Vehicle() {
        this.setColor("Red");
    }
    Vehicle(String c) {
        this.setColor(c);
    }
    
    // Setter
    public void setColor(String c) {
        this.color = c;
    }
    
    // Getter
    public String getColor() {
        return color;
    }
}
/*
 The class above has two constructors, one without any parameters setting 
 the color attribute to a default value of "Red", and another constructor 
 that accepts a parameter and assigns it to the attribute.*/
