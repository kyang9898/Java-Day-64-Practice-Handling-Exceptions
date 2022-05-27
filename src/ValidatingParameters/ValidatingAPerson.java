package ValidatingParameters;

public class ValidatingAPerson {

    private String nameOfPerson;
    private int ageOfPerson;
  
    public ValidatingAPerson(String nameOfPerson, int ageOfPerson) {
      if (nameOfPerson == null || nameOfPerson.isEmpty() || nameOfPerson.length() > 40) {
        throw new IllegalArgumentException("Invalid name argument");
      }
  
      if (ageOfPerson < 0 || ageOfPerson > 120) {
        throw new IllegalArgumentException("Invalid age");
      }
  
      this.nameOfPerson = nameOfPerson;
      this.ageOfPerson = ageOfPerson;
    }
  
    public String getNameOfPerson() {
      return nameOfPerson;
    }
  
    public int getAgeOfPerson() {
      return ageOfPerson;
    }
  }