package Java_Overriding;

public class c2_OverridingKuslar extends c1_Overriding{

    protected boolean gagasiVarMi=true;
    protected boolean kanadiVarMi= true;
    protected void ureme(){ //override edilmis hali
        System.out.println("Kuslar yumurta ile cogalir.");
    }


    protected void solunum() { //override edilmis hali
        System.out.println("Kuslar akciger solunumu yapar.");
    }

}
