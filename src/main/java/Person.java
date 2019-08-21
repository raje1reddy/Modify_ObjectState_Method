
class Person {
   private String name;

    Person(String newName){
        name = newName;
    }

    public String getName() {
        return name;
    }

    public void setName(String val) {
         name = val;
    }
    public void resetValueOfMemberVariable(Person p1) {
        //Person p = new Person("Reddy");
        p1.setName("Reddy");
    }


}

