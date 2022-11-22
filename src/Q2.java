public class Q2 {

    public static void main(String[] args) {

         /*
        Soru:   verilen iki metin birbiri ile ayni ise "metinler ayni"
                farkli ise "metinler farkli" yazdirin
         */


        String str1= "Ali";
        String str2= "ALI";




        if (str1.equals(str2)){
            System.out.println("Metinler ayni");
        }else {
            System.out.println("Metinler farkli");
        }


        System.out.println(str1.equals(str2) ? "Metinler ayni" : "Metinler farkli");

    }
}
