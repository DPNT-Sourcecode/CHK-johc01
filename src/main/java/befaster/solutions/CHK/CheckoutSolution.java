package befaster.solutions.CHK;

import befaster.runner.SolutionNotImplementedException;

public class CheckoutSolution {
    public Integer checkout(String skus) {
        for (char i:skus.toCharArray())
        {
            if (i=='A')
            {
                return (int) i;
            }
        }
        return null;
    }
}


