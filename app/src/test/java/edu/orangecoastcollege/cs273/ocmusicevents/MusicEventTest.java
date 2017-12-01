package edu.orangecoastcollege.cs273.ocmusicevents;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

/**
 * Created by dtallcott on 11/30/2017.
 */
public class MusicEventTest
{
    private MusicEvent testEvent;
    @Before
    public void setUp() throws Exception
    {
        testEvent = new MusicEvent();
    }

    @Test
    public void getSetTitle() throws Exception
    {
        //empty
        assertNull("Testing that title is null", testEvent.getTitle());
        //Has a title
        testEvent.setTitle("Blink 182");
        assertEquals("Testing that title is now Blink 182", "Blink 182", testEvent.getTitle());
    }

    @Test
    public void getSetDate() throws Exception
    {
        //empty
        assertNull("Testing that the date is null", testEvent.getDate());
        //Has a date
        testEvent.setDate("January 1, 2018");
        assertEquals("Testing if the date is January 1, 2018", "January 1, 2018", testEvent.getDate());
    }

    @Test
    public void getSetDay() throws Exception
    {
        //empty
        assertNull("Testing that the day is null", testEvent.getDay());
        //Has a Day
        testEvent.setDay("Monday");
        assertEquals("Testing that the day is Monday", "Monday", testEvent.getDay());
    }

    @Test
    public void getSetTime() throws Exception
    {
        //empty
        assertNull("Testing that the time is null", testEvent.getTime());
        //Has a time
        testEvent.setTime("7:00 PM");
        assertEquals("Testing that the time is 7:00 PM", "7:00 PM", testEvent.getTime());
    }

    @Test
    public void getSetLocation() throws Exception
    {
        //empty
        assertNull("Testing that the location is null", testEvent.getLocation());
        //Has a location
        testEvent.setLocation("Bowl");
        assertEquals("Testing that the location is Bowl", "Bowl", testEvent.getLocation());
    }

    @Test
    public void getSetAddress1() throws Exception
    {
        //empty
        assertNull("Testing that the address 1 is null", testEvent.getAddress1());
        //Has an Address 1
        testEvent.setAddress1("123 Katella");
        assertEquals("Testing that the address 1 is 123 Katella", "123 Katella", testEvent.getAddress1());
    }


    @Test
    public void getAddress2() throws Exception
    {
        //empty
        assertNull("Testing that the address 2 is null", testEvent.getAddress2());
        //Has an Address 2
        testEvent.setAddress2("Anaheim, California");
        assertEquals("Testing that the address 2 is Anaheim, California", "Anaheim, California", testEvent.getAddress2());
    }

    @Test
    public void getImageName() throws Exception
    {
        //empty
        assertNull("Testing that the imageName is null", testEvent.getImageName());
        //Has an Address 2
        testEvent.setImageName("red.jpeg");
        assertEquals("Testing that the imageName is red.jpeg", "red.jpeg", testEvent.getImageName());
    }

}