import automathicalc.*;

class Main {
  public static void main(String[] args)
  {
    double[] ryamu = new double[]{2, 4, 6};
    System.out.println(Statistics.toString(ryamu));
    System.out.println(ryamu);
    System.out.println(Statistics.getSum(ryamu));
    System.out.println(Statistics.getMean(ryamu));
    System.out.println(Statistics.toString(Statistics.copyOfRange(ryamu, 1, 3)));
    
  }
}