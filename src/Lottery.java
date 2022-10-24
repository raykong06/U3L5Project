public class Lottery {
    // Instance Variables
    private int lotteryNumber;
    private int userValue;
    private int digitOne;
    private int digitTwo;
    private int lotteryOne;
    private int lotteryTwo;
    private String statement;

    // Constructor
    public Lottery()
    {
        lotteryNumber = (int)(Math.random() * 100);
        if (lotteryNumber < 10)
        {
            lotteryOne = 0;
        }
        else
        {
            lotteryOne = lotteryNumber / 10;
            lotteryTwo = lotteryNumber % 10;
        }
    }

    // Methods
    public int determineWinnings(int userNumber)
    {
        userValue = userNumber;
        digitOne = userNumber / 10;
        digitTwo = userNumber % 10;
        if (userNumber == lotteryNumber)
        {
            return 100;
        }
        if (((digitOne == lotteryOne) || (digitOne == lotteryTwo)) && ((digitTwo == lotteryOne) || (digitTwo == lotteryTwo)))
        {
            return 10;
        }
        if (((digitOne == lotteryOne) || (digitOne == lotteryTwo)) || ((digitTwo == lotteryOne) || (digitTwo == lotteryTwo)))
        {
            return 3;
        }
        else
        {
            return 0;
        }
    }

    public String toString()
    {
        statement = "Enter your lottery pick: " + userValue;
        statement = "\n "
    }
}
