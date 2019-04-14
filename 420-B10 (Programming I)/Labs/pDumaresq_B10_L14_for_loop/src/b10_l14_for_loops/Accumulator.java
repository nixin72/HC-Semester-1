package b10_l14_for_loops;
class Accumulator
{
  private int count, sum, product;

  public Accumulator()
  {
    count = 0;
    sum = 0;
    product = 1;
  } // Accumulator()

  public int accumulateSum(int n)
  {
    for (int i = 1; i <= n; ++i)
      sum = n*(n+1)/2;
    return sum;
  } // accumulateSum(int)
  
  public int accumulateSum(int a, int b) {
  	int num1, num2, sum;
  	num1 = a;
  	num2 = b;
  	sum = 0;
  	while (num1 <= num2) {
  		sum += num1;
  		num1++;
  	}
  	return sum;
  }
  
  public double calculateAverage(int a, int b) {
  	double num1, num2, sum, average;
  	num1 = a;
  	num2 = b;
  	sum = 0;
  	while (num1 <= num2) {
  		sum += num1;
  		num1++;
  	}
  	average = sum / num1;
  	return average;
  }

} // Accumulator