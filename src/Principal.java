import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner lectura = new Scanner(System.in);       //Para leer datos

        int flag=1;
        do {
            var pesoArgentino = "ARS";
            var boliviano = "BOB";
            var realBrasileno = "BRL";
            var pesoChileno = "CLP";
            var pesoColombiano = "COP";
            var dolar = "USD";
            double convertido;


            System.out.println("""
                    
                    
                    
                    
                    
                    Sea bienvenido al MENU conversor de Moneda =
                    1) DOLAR           ==> PESO ARGENTINO
                    2) PESO ARGENTINO  ==> DOLAR
                                    
                    3) DOLAR           ==> REAL BRASILEÑO
                    4) REAL BRASILEÑO  ==> DOLAR
                                    
                    5) DOLAR           ==> PESO COLOMBIANO
                    6) PESO COLOMBIANO ==> DOLAR
                                    
                    7) DOLAR           ==> PESO CHILENO
                    8) PESO CHILENO    ==> DOLAR
                                    
                    9) DOLAR           ==> PESO BOLIVIANO
                    10)PESO BOLIVIANO  ==> DOLAR
                                    
                    11) SALIR
                                    
                    Elija una opcion valida:
                    """);
            int opcion = lectura.nextInt();

            System.out.print("Cuanto deseas convertir: ");
            int monedasAConvertir = lectura.nextInt();

            ConsultaMoneda consulta = new ConsultaMoneda(); //Se crea el objeto Consulta para traer datos de la API

            switch (opcion) {
                case 1:
                    Moneda moneda = consulta.buscaMoneda(dolar);
                    double tasaDeCambio = moneda.conversion_rates().get("ARS");

                    System.out.println("Base: " + monedasAConvertir + " " + moneda.base_code());      //Trae le base
                    System.out.println("Tasa de cambio: " + tasaDeCambio + " Pesos Argentinos");       //Trae consigo la equivalencia de las monedas

                    convertido = tasaDeCambio * monedasAConvertir;

                    System.out.println("La conversion es igual a " + convertido + " Pesos Argentinos");
                    break;
                case 2:
                    Moneda moneda2 = consulta.buscaMoneda(pesoArgentino);
                    double tasaDeCambio2 = moneda2.conversion_rates().get("USD");

                    System.out.println("Base: " + monedasAConvertir + " " + moneda2.base_code());
                    System.out.println("Tasa de cambio: " + tasaDeCambio2 + " Dolares");

                    convertido = tasaDeCambio2 * monedasAConvertir;

                    System.out.println("La conversion es igual a " + convertido + " Dolares");
                    break;
                case 3:
                    Moneda moneda3 = consulta.buscaMoneda(dolar);
                    double tasaDeCambio3 = moneda3.conversion_rates().get("BRL");

                    System.out.println("Base: " + monedasAConvertir + " " + moneda3.base_code());      //Trae le base
                    System.out.println("Tasa de cambio: " + tasaDeCambio3 + " Reales Brasileños");       //Trae consigo la equivalencia de las monedas

                    convertido = tasaDeCambio3 * monedasAConvertir;

                    System.out.println("La conversion es igual a " + convertido + " Reales Brasileños");
                    break;
                case 4:
                    Moneda moneda4 = consulta.buscaMoneda(realBrasileno);

                    double tasaDeCambio4 = moneda4.conversion_rates().get("USD");

                    System.out.println("Base: " + monedasAConvertir + " " + moneda4.base_code());
                    System.out.println("Tasa de cambio: " + tasaDeCambio4 + " Dolares");

                    convertido = tasaDeCambio4 * monedasAConvertir;

                    System.out.println("La conversion es igual a " + convertido + " Dolares");
                    break;
                case 5:
                    Moneda moneda5 = consulta.buscaMoneda(dolar);
                    double tasaDeCambio5 = moneda5.conversion_rates().get("COP");

                    System.out.println("Base: " + monedasAConvertir + " " + moneda5.base_code());      //Trae le base
                    System.out.println("Tasa de cambio: " + tasaDeCambio5 + " Pesos Colombianos");       //Trae consigo la equivalencia de las monedas

                    convertido = tasaDeCambio5 * monedasAConvertir;

                    System.out.println("La conversion es igual a " + convertido + " Pesos Colombianos");

                    break;
                case 6:
                    Moneda moneda6 = consulta.buscaMoneda(pesoColombiano);

                    double tasaDeCambio6 = moneda6.conversion_rates().get("USD");

                    System.out.println("Base: " + monedasAConvertir + " " + moneda6.base_code());
                    System.out.println("Tasa de cambio: " + tasaDeCambio6 + " Dolares");

                    convertido = tasaDeCambio6 * monedasAConvertir;

                    System.out.println("La conversion es igual a " + convertido + " Dolares");
                    break;

                case 7:
                    Moneda moneda7 = consulta.buscaMoneda(dolar);
                    double tasaDeCambio7 = moneda7.conversion_rates().get("CLP");

                    System.out.println("Base: " + monedasAConvertir + " " + moneda7.base_code());      //Trae le base
                    System.out.println("Tasa de cambio: " + tasaDeCambio7 + " Pesos Chilenos");       //Trae consigo la equivalencia de las monedas

                    convertido = tasaDeCambio7 * monedasAConvertir;

                    System.out.println("La conversion es igual a " + convertido + " Pesos Chilenos");
                    break;
                case 8:
                    Moneda moneda8 = consulta.buscaMoneda(pesoChileno);

                    double tasaDeCambio8 = moneda8.conversion_rates().get("USD");

                    System.out.println("Base: " + monedasAConvertir + " " + moneda8.base_code());
                    System.out.println("Tasa de cambio: " + tasaDeCambio8 + " Dolares");

                    convertido = tasaDeCambio8 * monedasAConvertir;

                    System.out.println("La conversion es igual a " + convertido + " Dolares");
                    break;

                case 9:
                    Moneda moneda9 = consulta.buscaMoneda(dolar);
                    double tasaDeCambio9 = moneda9.conversion_rates().get("BOB");

                    System.out.println("Base: " + monedasAConvertir + " " + moneda9.base_code());      //Trae le base
                    System.out.println("Tasa de cambio: " + tasaDeCambio9 + " Pesos Bolivianos");       //Trae consigo la equivalencia de las monedas

                    convertido = tasaDeCambio9 * monedasAConvertir;

                    System.out.println("La conversion es igual a " + convertido + " Pesos Bolivianos");
                    break;
                case 10:
                    Moneda moneda10 = consulta.buscaMoneda(boliviano);

                    double tasaDeCambio10 = moneda10.conversion_rates().get("USD");

                    System.out.println("Base: " + monedasAConvertir + " " + moneda10.base_code());
                    System.out.println("Tasa de cambio: " + tasaDeCambio10 + " Dolares");

                    convertido = tasaDeCambio10 * monedasAConvertir;

                    System.out.println("La conversion es igual a " + convertido + " Dolares");
                    break;
                default:
                    System.out.println("SALIENDO");
                    flag = 0;
                    break;
            }

        } while (flag == 1);

        //Se crea el objeto moneda
//        Moneda moneda = consulta.buscaMoneda(monedaBase);
//
//        System.out.println("Base: " + moneda.base_code());
//        System.out.println("Conversion Rates: " + moneda.conversion_rates());


    }
}
