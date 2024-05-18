package befaster.solutions.CHK;

import befaster.runner.SolutionNotImplementedException;

public class CheckoutSolution {
    public Integer checkout(String skus) {
        int nr_a=0;
        int nr_b=0;
        int nr_c=0;
        int nr_d=0;
        if (skus.isEmpty())
            return -1;
        for (char i:skus.toCharArray())
        {

                if (i=='A')
                {
                    nr_a++;
                }
                else if (i=='B')
                    nr_b++;
                else if (i=='C')
                    nr_c++;
                else nr_d++;
            }

        if (nr_a==0||nr_b==0||nr_c==0||nr_d==0)
        {
            return -1;
        }
        int sum=0;

        sum+=nr_a/3*130;
        sum+=nr_a%3*50;
        sum+=nr_b/2*45;
        sum+=nr_b%2*30;
        sum+=nr_c*20;
        sum+=nr_d*15;
        return sum;

    }
}


