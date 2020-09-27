package person;

import org.assertj.core.api.Assertions;
import org.assertj.core.api.SoftAssertions;
import org.junit.jupiter.api.Test;
import person.PersonTest;

class PerssonAssertJTest {

    @Test
    void personTest() {
        //  arrange
        final var jan = new PersonTest.Person( "Jan", "Kowalski");

        //act
        final var fullName = jan.getFullName();

        // assert
        final var softAssert = new SoftAssertions();


        Assertions.assertThat(fullName)
                .as("Full name should ne name + space + last name")
                .startsWith("Jan")
                .contains(" ")
                .endsWith("Kowalski");
        softAssert.assertAll(); // This must be here
    }
}
