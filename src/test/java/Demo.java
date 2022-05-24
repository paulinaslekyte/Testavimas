import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.DayOfWeek;
import java.time.LocalDateTime;

public class Demo {

    @Test
    public void testIfNumber4IsEven() {

        // Duomenys
        int input = 5;
        int actualRemainder;
        int expectedRemainder = 0;

        //Testo veiksmai
        actualRemainder = input % 2;

        //palyginimas
        Assert.assertEquals(actualRemainder, expectedRemainder);

    }

    @Test
    public void testIfTimeNowIs19Hours() {

        //Duomenys
        int expectedHour = 19;
        LocalDateTime actualDateTime = LocalDateTime.now();
        int actualHour = actualDateTime.getHour();

        //Veiksmai ??

        //Palyginimas
//        Assert.assertTrue(actualHour== expectedHour);
//        Assert.assertEquals(actualHour, expectedHour);
        Assert.assertTrue(actualHour == expectedHour, "Expected :" + expectedHour + " , actual: " + actualHour);

    }

    @Test

    public void testIf995CanDivideBy3 () {

        int input = 995;
        int actualRemainder;
        int expectedRemainder = 0;

        actualRemainder= input % 3;
        Assert.assertEquals(actualRemainder, expectedRemainder);

    }
    @Test

    public void testIfTodayIsWednesday() {
        DayOfWeek expectedDay = DayOfWeek.WEDNESDAY;
        LocalDateTime actualDate = LocalDateTime.now();
DayOfWeek actualDay= actualDate.getDayOfWeek();

        Assert.assertEquals(actualDate,expectedDay);
    }


    @Test
    public void testWaitFor5Seconds (){
        try {Thread.sleep(5000);
        } catch (InterruptedException e){
            Thread.currentThread().interrupt();
        }

    }
    @Test
    public void testCountOfEvenNumbersBetween1And10(){
        int actualEvenNumberCounter= 0;
        int expectedEvenNumbersCount=4;

        for (int i=1;i<=10; i++){

            //Check if number is even
            if (i%2==0) {
                actualEvenNumberCounter++;
            }
        }
        Assert.assertEquals(actualEvenNumberCounter, expectedEvenNumbersCount);
    }
}
