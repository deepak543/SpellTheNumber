package com.assessment.javaassessment;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NumberToWordTest {

    @Test
    public void tensTest()
    {
        assertEquals(NumberToWord.spellNumber(13).trim(), "Thirteen");
    }

    @Test
    public void hundredsTest()
    {
        assertEquals(NumberToWord.spellNumber(120).trim(), "Hundred and Thirty");
    }

    @Test
    public void thousandsTest()
    {
        assertEquals(NumberToWord.spellNumber(1200).trim(), "Thousand Two Hundred");
    }
}