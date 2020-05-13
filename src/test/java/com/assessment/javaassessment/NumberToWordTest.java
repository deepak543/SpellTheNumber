package com.assessment.javaassessment;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NumberToWordTest {

    @Test
    public void tensTest()
    {
        assertEquals(NumberToWord.spellNumber(13), "Thirteen");
    }

    @Test
    public void hundredsTest()
    {
        assertEquals(NumberToWord.spellNumber(120), "Hundred and thirty");
    }
}