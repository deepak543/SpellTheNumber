package com.assessment.javaassessment;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NumberToWordTest {

    @Test
    public void tensTest()
    {
        assertEquals("Thirteen", NumberToWord.spellNumber(13).trim());
    }

    @Test
    public void hundredsTest()
    {
        assertEquals("One Hundred and Thirty", NumberToWord.spellNumber(130).trim());
    }

    @Test
    public void thousandsTest()
    {
        assertEquals("One Thousand Two Hundred", NumberToWord.spellNumber(1200).trim() );
    }

    @Test
    public void thousandsWithAndTest()
    {
        assertEquals("One Thousand Two Hundred and Six", NumberToWord.spellNumber(1206).trim() );
    }

    @Test
    public void tenThousandsTest()
    {
        assertEquals("Twelve Thousand and Sixty", NumberToWord.spellNumber(12060).trim() );
    }

    @Test
    public void lakhsTest()
    {
        assertEquals("One Lakh Twenty Thousand Six Hundred and Nine", NumberToWord.spellNumber(120609).trim() );
    }

    @Test
    public void croreTest()
    {
        assertEquals("One Crore Twenty Lakh Sixty Thousand Nine Hundred and Ninety Nine", NumberToWord.spellNumber(12060999).trim() );
    }
}