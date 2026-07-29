//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        String[] Months={"MONTH 1","MONTH 2","MONTH 3"};
        String[]Gym= {"GYM 1","GYM 2","GYM 3"};
        int[][]Kilos={{10,20,27},{22,5,20},{30,20,10}};

        System.out.println("GYM WEIGHTLOSS APPLICATION");
        System.out.println("--------------------------------------------------------------------------------------------------------------");

        System.out.printf("%-15s","");
        for (int i = 0; i < Months.length; i++) {
            System.out.printf("%-15s",Months[i]);
        }
        System.out.printf("%-12s %-12s%-12s%-12s%n","|TOTAL","AVG","MIN","MAX");
        System.out.println("--------------------------------------------------------------------------------------------------------------");

        for (int i = 0; i <Gym.length ; i++) {
            System.out.printf("%-15s",Gym[i]);

            int Total=0;
            int min=Kilos[i][0];
            int max=Kilos[i][0];

            for (int j = 0; j < Kilos[i].length; j++) {
                int currentKilos=Kilos[i][j];

                System.out.printf("%-15s",currentKilos,"kg");

                Total+=currentKilos;
                if (currentKilos < min) {
                    min=currentKilos;
                }
                if (currentKilos >max) {
                    max=currentKilos;
                }

            }
            double ave=(double)Total/Kilos[i].length;
            String formatAve=String.format("%.2fkg",ave);

            System.out.printf("|%-12s%-12s%-12s%-12s%n",Total+"kg",formatAve,min+"kg",max+"kg");

        }



    }
}
