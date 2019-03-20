
public class PairOfDice
{
    private Die die1;
    private Die die2;
    
    public PairOfDice()
    {
       die1 = new Die(6);
       die2 = new Die(6);
    }
    
    public int diceValue()
    {
        die1.roll();
        die2.roll();
        return die1.getFaceValue() + die2.getFaceValue();        
    }
}
