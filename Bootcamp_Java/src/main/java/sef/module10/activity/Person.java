package sef.module10.activity;

/**
 * Abstract class representing a generic person.
 * Serves as a base class for specific types of people.
 */
public abstract class Person {
    private String name;
    private int age;

    /**
     * Gets the name of the person.
     *
     * @return the person's name
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the name of the person.
     *
     * @param name the name to assign to the person
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Gets the age of the person.
     *
     * @return the person's age
     */
    public int getAge() {
        return age;
    }

    /**
     * Sets the age of the person.
     *
     * @param age the age to assign to the person
     */
    public void setAge(int age) {
        this.age = age;
    }

    /**
     * Introduces the person.
     * Subclasses must provide their own implementation of this method.
     */
    public abstract void introduce();
}
