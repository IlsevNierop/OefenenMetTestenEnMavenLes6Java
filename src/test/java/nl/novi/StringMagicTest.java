package nl.novi;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StringMagicTest {

    @Test
    @DisplayName("should reverse a string")
    void shouldReverseString(){

        // arrange
        String str = "Hallo Novi!";


        // act
        String output = StringMagic.reverse(str);

        // assert
        assertEquals("!ivoN ollaH", output);

    }



}