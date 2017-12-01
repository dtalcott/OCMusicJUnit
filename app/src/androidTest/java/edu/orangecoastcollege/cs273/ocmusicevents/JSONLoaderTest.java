package edu.orangecoastcollege.cs273.ocmusicevents;

import android.content.Context;
import android.support.test.InstrumentationRegistry;
import android.support.test.runner.AndroidJUnit4;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

/**
 * Instrumentation test, which will execute on an Android device.
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
@RunWith(AndroidJUnit4.class)
public class JSONLoaderTest
{
    private Context testContext;

    @Before
    public void setUp()
    {
        testContext = InstrumentationRegistry.getTargetContext();
    }

    @Test
    public void testJSONLoader() throws Exception
    {
        List<MusicEvent> testList = JSONLoader.loadJSONFromAsset(testContext, "MusicEventsTest.json");
        //asset testList is not null
        assertNotNull("Testing list is NOT null", testList);

        //asset size is 2
        assertEquals("testing list size is 2", 2, testList.size());

        //test title of event 1 is Blink 182
        MusicEvent event1 = testList.get(0);
        assertEquals("Testing is first event title is Blink 182", "Blink 182", event1.getTitle());

        //test day of first event
        assertEquals("Testing is first event day is Friday", "Friday", event1.getDay());

        //test time of the first event
        assertEquals("Testing is first event time is 7:00 PM", "7:00 PM", event1.getTime());

        //test the location of the first event
        assertEquals("Testing is first event location is Irvine Meadows (formerly Verizon Wireless)", "Irvine Meadows (formerly Verizon Wireless)", event1.getLocation());

        //test the address 1 of the first event
        assertEquals("Testing is first event address 1 is 8808 Irvine Center Drive", "8808 Irvine Center Drive", event1.getAddress1());

        //test the address 2 of the first event
        assertEquals("Testing is first event address 2 is Irvine, California 92618", "Irvine, California 92618", event1.getAddress2());

        //test the image name of the first event
        assertEquals("Testing is first event imageName is Blink182.jpeg", "Blink182.jpeg", event1.getImageName());



        MusicEvent event2 = testList.get(1);
        //test title of second event is Ben Folds And A Piano
        assertEquals("Testing is first event title is Ben Folds And A Piano", "Ben Folds And A Piano", event2.getTitle());

        //test date of the second event
        assertEquals("Testing if the second event date is October 20", "October 20", event2.getDate());

        //test day of second event
        assertEquals("Testing if second event day is Thursday", "Thursday", event2.getDay());

        //test time of the second event
        assertEquals("Testing if second event time is 8:00 PM", "8:00 PM", event2.getTime());

        //test the location of the second event
        assertEquals("Testing is second event location is City National Grove of Anaheim", "City National Grove of Anaheim", event2.getLocation());

        //test the address 1 of the second event
        assertEquals("Testing is second event address 1 is 2200 E Katella Ave", "2200 E Katella Ave", event2.getAddress1());

        //test the address 2 of the second event
        assertEquals("Testing is second event address 2 is Anaheim, California", "Anaheim, California", event2.getAddress2());

        //test the image name of the second event
        assertEquals("Testing is second event imageName is BenFoldsAndAPiano.jpeg", "BenFoldsAndAPiano.jpeg", event2.getImageName());
    }
}
/*"Title": "Ben Folds And A Piano",
      "Date": "October 20",
      "Day": "Thursday",
      "Time": "8:00 PM",
      "Location": "City National Grove of Anaheim",
      "Address1": "2200 E Katella Ave",
      "Address2": "Anaheim, California",
      "ImageName": "BenFoldsAndAPiano.jpeg" */
