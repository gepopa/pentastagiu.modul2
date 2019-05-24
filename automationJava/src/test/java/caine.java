public class caine extends animal {

    public static void main (String []args){

       caine caine = new caine();
       caine.setTheColor ("Rosu");
       System.out.println(caine.getTheColor());
       System.out.println();
       caine.culoare = "noua valoare";
       System.out.println(caine.culoare);
    }
}
