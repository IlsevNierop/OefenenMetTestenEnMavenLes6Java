package nl.novi;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class PersonTest {

    // hier alvast een Person p declareren zodat die later in alle methodes gebruikt kan worden.
    Person p;
    @BeforeEach
    void setUp() {
        // in de setup methode (die VOOR elke test wordt uitgevoerd) instantieren. Dan hoeft die voor 'lege' personen niet elke keer opnieuw geinstantieerd te worden. Dan kan ik direct gewoon p gebruiken.
        // Als 'arrange' leeg is, betekent het dat ik deze p heb gebruikt.
       p = new Person();
    }

    //arrange
    //act
    //assert

    @Test
    void namesShouldNotBeChangedDuringCreation(){
        // arrange
        Person p = new Person("Piet Puck");

        // act
        String output = p.getName();

        // assert
        assertEquals("Piet Puck", output);
    }

    @Test
    void personWithoutNameShouldBeNamedJohn(){
        //arrange

        //act
        String output = p.getName();

        // assert
        assertEquals("John", output);
    }

    @Test
    void ageShouldAddOneYear(){
        //arrange

        //act
        p.setAge(10);
        p.age();
        int output = p.getAge();

        // assert
        assertEquals(11, output);
    }

    @Test
    void lastNameShouldStartWithUpperCaseWhenLowercaseGiven(){
        //arrange


        //act
        p.setLastName("janssen");
        String output = p.getLastName();

        //assert
        assertEquals("Janssen", output);
    }

    @Test
    void givenAPartnerHasPartnerShouldReturn() {
        //arrange


        //act
        p.setPartner(new Person("Kees"));
        boolean output = p.hasPartner();

        //assert
        assertEquals( true, output);

    }
    @Test
    void childShouldBeAddedToList() {
        //arrange

        //act
        Person k = new Person("Kind 1");
        Person k2 = new Person("Kind 2");
        Person k3 = new Person("Kind 3");
        p.addChild(k);
        p.addChild(k2);
        p.addChild(k3);
        List<Person> output = p.getChildren();

        List <Person> expectedOutput = new ArrayList<>();
        expectedOutput.add(k);
        expectedOutput.add(k2);
        expectedOutput.add(k3);


        //assert
        assertArrayEquals(expectedOutput.toArray(), output.toArray() );

    }




    //arrange
    //act
    //assert
}