import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int divisiPrincipal = 1;
        int divisaSecundaria = 1;
        String moneda1 = "";
        String moneda2 = "";
        double valorAConvertir;
        double resultado;
        boolean finalizar = false;

        while (!finalizar) {
            System.out.println("""
                    ###################################
                    ###        BIENVENIDO AL        ###
                    ###    CONVERSOR DE DIVISAS     ###
                    ###################################
                    """ +
                    "Selecionar la divisa principal:\n" +
                    "1) ARS- Peso Argentino\n" +
                    "2) BOB- boliviano\n" +
                    "3) BRL- Real Brasileño\n" +
                    "4) CLP- Peso Chileno\n" +
                    "5) COP- Peso Colombiano\n" +
                    "6) USD- Dolar estadounidense\n" +
                    "7) Finalizar\n" +
                    "####################################");

            Scanner PrimeraSelecionUsuario = new Scanner(System.in);
            divisiPrincipal = PrimeraSelecionUsuario.nextInt();

            switch (divisiPrincipal) {
                case 1:
                    moneda1 = "ARS";
                    System.out.println(moneda1);
                    break;
                case 2:
                    moneda1 = "BOB";
                    System.out.println(moneda1);
                    break;
                case 3:
                    moneda1 = "BRL";
                    System.out.println(moneda1);
                    break;
                case 4:
                    moneda1 = "CLP";
                    System.out.println(moneda1);
                    break;
                case 5:
                    moneda1 = "COP";
                    System.out.println(moneda1);
                    break;
                case 6:
                    moneda1 = "USD";
                    System.out.println(moneda1);
                    break;
                case 7:
                    System.out.println("Gracias, Esperamos verte pronto");
                    finalizar = true;
                    return;

                default:
                    System.out.println("Opción no válida");
                    continue;

            }



            System.out.println("####################################\n" +
                    "Selecionar la divisa Secundaria:\n" +
                    "1) ARS- Peso Argentino\n" +
                    "2) BOB- boliviano\n" +
                    "3) BRL- Real Brasileño\n" +
                    "4) CLP- Peso Chileno\n" +
                    "5) COP- Peso Colombiano\n" +
                    "6) USD- Dolar estadounidense\n" +
                    "7) Finalizar\n" +
                    "###############################################");

            Scanner SegundaSelecionUsuario = new Scanner(System.in);
            divisaSecundaria = SegundaSelecionUsuario.nextInt();

            switch (divisaSecundaria) {
                case 1:
                    moneda2 = "ARS";
                    System.out.println(moneda2);
                    break;
                case 2:
                    moneda2 = "BOB";
                    System.out.println(moneda2);
                    break;
                case 3:
                    moneda2 = "BRL";
                    System.out.println(moneda2);
                    break;
                case 4:
                    moneda2 = "CLP";
                    System.out.println(moneda2);
                    break;
                case 5:
                    moneda2 = "COP";
                    System.out.println(moneda2);
                    break;
                case 6:
                    moneda2 = "USD";
                    System.out.println(moneda2);
                    break;
                case 7:
                    System.out.println("Gracias, Esperamos verte pronto");
                    finalizar = true ;
                    break;


                default:
                    System.out.println("Opción no válida");
                    continue;
            }


            System.out.println("¿Cuantos " + moneda1 + " desea convertir a " +
                    moneda2 + "?");

            Scanner valorIngresadoUsuario = new Scanner(System.in);
            valorAConvertir = valorIngresadoUsuario.nextDouble();

            ConsultarDivisa consulta = new ConsultarDivisa();
            TasaDeCambio tasaDeCambio = consulta.buscaMoneda(moneda1, moneda2);


            resultado = tasaDeCambio.conversion_rate * valorAConvertir;

            System.out.println(valorAConvertir +" " + moneda1 + " equivale a " +
                    resultado + " de " + moneda2);

        }

    }
}
