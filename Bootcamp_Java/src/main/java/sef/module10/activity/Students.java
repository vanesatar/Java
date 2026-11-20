package sef.module10.activity;

/**
 * Represents a student, extending the abstract Person class.
 */
public class Students extends Person {
    private String schoolName;

    /**
     * Gets the name of the student's school or university.
     *
     * @return the school name
     */
    public String getSchoolName() {
        return schoolName;
    }

    /**
     * Sets the name of the student's school or university.
     *
     * @param schoolName the school name to set
     */
    public void setSchoolName(String schoolName) {
        this.schoolName = schoolName;
    }

    /**
     * Prints an introduction of the student, including their university name.
     */
    @Override
    public void introduce() {
        IO.println("I study in " + schoolName);
    }
}
