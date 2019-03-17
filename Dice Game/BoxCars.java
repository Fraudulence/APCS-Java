
public class BoxCars
{
    public static void main (String[] args) 
    {
        PairOfDice dies = new PairOfDice();
        int boxCarsCounter = 0;
        for (int dieCounter = 0; dieCounter < 1000; dieCounter++)
        {
            if(dies.diceValue() == 12)
            {
                boxCarsCounter++;
            }
        }
        System.out.println("Box cars: " + boxCarsCounter);
    }
}
