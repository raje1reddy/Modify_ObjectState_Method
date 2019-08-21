import org.junit.Test;
//import static org.junit.Assert.*;

public class PersonTest {


    @Test
    public void setName1(){
        Person person1 = new Person("Padmaja");
        System.out.println(person1.getName()); //print p1.name before passing it to resetValueOfMemberVariable
        person1.resetValueOfMemberVariable(person1); //pass p1 to method resetValueOfMemberVariable
        System.out.println(person1.getName());//print p1.name after passing it to resetValueOfMemberVariable
        }
}