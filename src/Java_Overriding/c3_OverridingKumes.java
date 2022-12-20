package Java_Overriding;

public class c3_OverridingKumes extends c2_OverridingKuslar {


    //  c1_overridingte yer alan hareket methodunun overridi aslinda
    protected void hareket(){
        System.out.println("ucamazlar, yururler.");


    }

    public static void main(String[] args) {
        c3_OverridingKumes kumes1= new c3_OverridingKumes();
        kumes1.hareket();   //c3_OverridingKumes'teki hareket methodu calisir.

        System.out.println(kumes1.gagasiVarMi);  //c2_OverridingKuslar'deki classtan calisacak.
        System.out.println(kumes1.gorurMu);    //c1_Overriding'deki classtan calisacak.

        c2_OverridingKuslar kus1 = new c2_OverridingKuslar();

        System.out.println(kus1.gagasiVarMi);  //c2_OverridingKuslar classindan alacak.
        kus1.beslenme(); // //c2'de beslenme yok c1'de var oradan alacak.



        c2_OverridingKuslar kumes2 = new c3_OverridingKumes();
        System.out.print("kumes2.hareket: ");
        kumes2.hareket();



        c1_Overriding kumes3 = new c3_OverridingKumes();



        c1_Overriding kus2 = new c2_OverridingKuslar();
        System.out.print("kus2.hareket: ");
        kus2.hareket();

    }
}
