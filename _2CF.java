import java.util.*;

class _2CF 
{
    //attributes
    private String input; //user input
    private String _1C; //value of 1Cf
    private String _2C; //value of 2Cf

    //constructor
    public _2CF(String input)
    {
        if(setInput(input))
        {
            to1CF(input);
            to2CF(_1C);
        }
    }

    //set method
    private boolean setInput(String input)
    {
        if(input.length() >= 2) //must be at least 2 characters
        {
            for (int i = 0; i < input.length(); i++)
            {
                if(isBinary(input.charAt(i))) //If a character is not 0 or 1, break out of the loop
                {
                    this.input = input;
                }
                else
                {   
                    System.out.println("Input contains an invalid character!");
                    return false;
                }
            }

            return true;

        }
        else
        {
            System.out.println("The input is not a valid binary number!");
            return false;
        }
    }

    //no need to check if valid since it passed the first test
    private void set1CF(String dummy)
    {
        this._1C = dummy;
    }

    //same as above
    private void set2CF(String dummy)
    {
        this._2C = dummy;
    }

    //checks to see if the character is 0 or 1
    public boolean isBinary(char c)
    {
        return (c == '1' || c == '0');
    }

    public void to1CF(String input)
    {
        char[] charaterArray = input.toCharArray(); //changes string to char array

        //complements the binary number
        for(int i = 0; i < input.length(); i++)
        {
            //changes 1 to 0 and 0 to 1
            if(charaterArray[i] == '0')
            {
                charaterArray[i] = '1';
            }
            else
            {
                charaterArray[i] = '0';
            }

        }

        String _1C = String.copyValueOf(charaterArray); //changes char array into string

        set1CF(_1C); //sets the value 1CF
    }

    //adds 1 to the complement
    public void to2CF(String x)
    {
        char[] charaterArray2 = x.toCharArray(); //changes string to char array

        char carry = '1'; //since 2CF carry starts at 1

        //adds 1 to the binary number
        for (int i = x.length() - 1; i >= 0; i--)
        {
            //possible cases for 2CF
            if(charaterArray2[i] == '1' && carry == '1')
            {
                charaterArray2[i] = '0';
                carry = '1';
            }
            else if(charaterArray2[i] == '0' && carry == '1')
            {
                charaterArray2[i] = '1';
                carry = '0';
            }
            else
            {
                carry = '0';
            }
        }

        String string2 = String.copyValueOf(charaterArray2); //makes char array into string

        set2CF(string2); //sets the value of 2CF
    }

    public String toString()
    {
        return "1CF: " + _1C +"\n2CF: " + _2C;
    }
}