public class Main {
    public static void main(String[] args) {
        //ejercicio if
        System.out.println("el número");
        double numerolf = -2;

        if (numerolf > 0) {
            System.out.println("es positivo");
        } else if (numerolf < 0) {
            System.out.println("es negativo");
        } else {
            System.out.println("es neutro");
        }

        // ejercicio while
        {
            int numeroWhile = 3;

            while (numeroWhile > 0) {
                System.out.println(numeroWhile);
                numeroWhile = numeroWhile - 1;
            }
        }

        // ejercicio do while
        {
            int numerodowhile = 3;

            do {
                System.out.println(numerodowhile);
                numerodowhile = numerodowhile - 1;
            }while(numerodowhile > 3);
        }

        // ejercicio  for
        {
            for (int numeroFor = 0; numeroFor <=3; numeroFor = numeroFor +1 ){
                System.out.println(numeroFor);
            }
        }

        // ejercicio switch
        {
            var estacion = "PRIMAVERA";

        switch (estacion) {
            case "VERANO":
                System.out.println("es verano");
                break;
            case "OTOÑO":
                System.out.println("es otoño");
                break;
            case "INVIERNO":
                System.out.println("es invierno");
                break;
            case "PRIMAVERA":
                System.out.println("es primavera");
                break;
            default:
                System.out.println("no sé la estación");

        }

        }
    }
}