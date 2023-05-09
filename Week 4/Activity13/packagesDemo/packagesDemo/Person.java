//**************************************************************
// Activity 13
// Name: Tyler Shannon
// Date: 2/20/23
//***************************************************************
// This class represents a person with a name, age, address, and phone number.
// It has methods to set and get the values of these instance variables with
// different access modifiers (public, private, protected, default).
//********************************************************************
//*******************************************************************
// FOR ALL METHODS
// Parameters:
// - For setters: the new value of the instance variable
// - For getters: none
// Return value:
// - For setters: void
// - For getters: the value of the instance variable
//********************************************************************
package packagesDemo;

public class Person {
    public String name;
    public int age;
    private String address;
    private String phone;

    public Person(String name, int age, String address, String phone) {
        this.name = name;
        this.age = age;
        this.address = address;
        this.phone = phone;
    }

    public void setName(String name) {
        this.name = name;
    }

    private void setAge(int age) {
        this.age = age;
    }

    protected void setAddress(String address) {
        this.address = address;
    }

    void setPhone(String phone) {
        this.phone = phone;
    }

    public String getName() {
        return this.name;
    }

    private int getAge() {
        return this.age;
    }

    protected String getAddress() {
        return this.address;
    }

    String getPhone() {
        return this.phone;
    }
}
