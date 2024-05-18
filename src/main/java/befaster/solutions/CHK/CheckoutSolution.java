package befaster.solutions.CHK;

import befaster.runner.SolutionNotImplementedException;

public class CheckoutSolution {
    public Integer checkout(String skus) {
        int nr_a=0;
        int nr_b=0;
        int nr_c=0;
        for (char i:skus.toCharArray())
        {
            if (i=='A')
            {
                nr_a++;
            }
            else if (i=='B')
                nr_b++;
            else nr_c++;
        }
        int sum=0;
        if (nr_a%3==0)
        {
            sum+=nr_a/3*130;
        }
        else
            sum+=nr_a*50;
        if (nr_b%2==0)
        {
            sum+=nr_b/2*
        }

    }
}



