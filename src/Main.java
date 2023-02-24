import java.util.ArrayList;
import java.util.Set;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        ArrayList<City> cityArrayList = new ArrayList<>();
        cityArrayList.add(new City(312,"Bidhkek"));
        cityArrayList.add(new City(3622,"Batken"));
        cityArrayList.add(new City(3922,"KaraKol"));
        cityArrayList.add(new City(3422,"Talas"));
        System.out.println(cityArrayList);
        System.out.println();
        for (City code: cityArrayList) {
            System.out.println(code);
        }
        for (int i = 0; i < cityArrayList.size(); i++) {
            if ((cityArrayList[i]%2)!=0){

            }
            System.out.println(cityArrayList[i]);
        }



    }
}