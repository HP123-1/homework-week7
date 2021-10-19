//Write a class with the name Person. The class needs three fields (instance variables) with the names
//firstName, lastName of type String and age of type int.
//Write the following methods (instance methods):
//*Method named getFirstName without any parameters, it needs to return the value of the firstName
//field.
//*Method named getLastName without any parameters, it needs to return the value of the lastName
//field.
//*Method named getAge without any parameters, it needs to return the value of the age field.
//*Method named setFirstName with one parameter of type String, it needs to set the value of the
//firstName field.
//*Method named setLastName with one parameter of type String, it needs to set the value of the
//lastName field.
//*Method named setAge with one parameter of type int, it needs to set the value of the age field. If
//the parameter is less than 0 or greater than 100, it needs to set the age field value to 0.
//*Method named isTeen without any parameters, it needs to return true if the value of the age field is
//greater than 12 and less than 20, otherwise, return false.
//*Method named getFullName without any parameters, it needs to return the full name of the person.
//*In case both firstName and lastName fields are empty, Strings return an empty String.








public class Person14 {
    String firstname;
    String lastname;
    int age;

    public static void main(String[] args) {
        Person14 person = new Person14();
        person.setFirstName(" ");
        person.setLastname(" ");
        person.setAge(10);
        System.out.println("full name =" + person.getFullName());
        System.out.println("teen = " + person.isTeen());
        person.setFirstName("John");
        person.setAge(18);
        System.out.println("fullName = " + person.getFullName());
        System.out.println("teen" + person.isTeen());
        person.setLastname("John ");
        System.out.println("fullName" + person.getFullName());

    }

    public String getFirstName() {
        return firstname;
    }

    public String getLastname() {

        return lastname;
    }

    public int getAge() {

        return age;
    }

    public void setFirstName(String firstName) { //no return with one parameter
        this.firstname = firstName;


    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }
    // no return with one parameter

    public void setAge(int age) {

        if (age < 0 && age > 100) {
            this.age = age;
        } else {
            this.age = 0;
        }
    }


    public boolean isTeen() {
        if ((age > 12) && (age < 20)) {
            return true;
        } else {

            return false;
        }
    }

    public String getFullName() {
        if (firstname.isEmpty()) {

            return firstname;
        } else if (lastname.isEmpty()) {
            return lastname;
        } else if (firstname.isEmpty() && lastname.isEmpty()) {
            return " ";
        } else {
            return "=" + firstname + " " + lastname;
        }
    }


}









