public class CelciusTemperatureTable {
    public static void main(String[] args) {
        double celciusTemp,fahrenheitTemp;
        System.out.println("Convert F to C");
        System.out.println("--------------");
        for(fahrenheitTemp=0;fahrenheitTemp<20;fahrenheitTemp++){
            celciusTemp= Celcius(fahrenheitTemp);
            System.out.println(fahrenheitTemp+"\t\t\t"+celciusTemp);

        }

    }
    public static double Celcius (double fahrenheitTemp){
        double celciusTemp = (fahrenheitTemp-32)*5/9;
        return celciusTemp;
    }
}
