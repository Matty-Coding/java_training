package it.training;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import it.training.ui.Messages;
import it.training.utils.Validator;

public class ValidatorTest {
    @Test
    void validateText_trimsValue() {
        assertEquals("Attempt", Validator.validateText("  Attempt ", "Attempt"));
    }

    @Test
    void validateText_blank() {
        IllegalArgumentException exception = assertThrows(
                IllegalArgumentException.class,
                () -> Validator.validateText(" ", "Attempt error"));
        assertEquals("Attempt error " + Messages.EMPTY_OR_NULL_TEXT, exception.getMessage());
    }

}
