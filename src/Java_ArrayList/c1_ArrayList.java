package Java_ArrayList;

import java.awt.image.AreaAveragingScaleFilter;
import java.util.ArrayList;
import java.util.List;

public class c1_ArrayList {
    public static void main(String[] args) {


        List<String> isimler = new ArrayList<>();
        List<Integer> sayilar = new ArrayList<>();
        List<Double> ondalik = new ArrayList<>();


        // primitive datalara izin vermez. int; double
        // List<double> ondalik1 = new ArrayList<>();
        //  List<int> sayilar1 = new ArrayList<>();

        isimler.add("Ali can");
        isimler.add("Veli Bag");
        // isimler.add(5);    // bunun calismasi icin en basta List<Object> olarak tanimlanmasi gerekirdi.
        // isimler.add(true); // bunun calismasi icin en basta List<Object> olarak tanimlanmasi gerekirdi.


    }

}
