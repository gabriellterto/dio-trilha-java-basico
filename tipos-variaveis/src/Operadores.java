public class Operadores {
    public static void main(String[] args) {
        String nomeCompleto = "LINGUAGEM" + "JAVA";
        System.out.print(nomeCompleto);

        String concatenacao = "?";

        concatenacao = 1 + 1 + 1 + "1";

        System.out.println(concatenacao);

        concatenacao = 1 + "1" + 1;

        System.out.println(concatenacao);

        concatenacao = "1" + 1 + 1;

        System.out.println(concatenacao);

        /* Operadores + - ++ -- */
        int numero = 5;
        numero = - numero;
        System.out.println(numero);

        numero = numero * (-1);
        System.out.println(numero);

        /* repeticao */
        numero = 5;
        numero++;
        System.out.println(numero);

        numero--;
        System.out.println(numero);

        boolean variavel = false;
        variavel = !variavel;
        System.out.println(variavel);

        /* ternário */
        int a, b;

        a = 5;
        b = 5;

        String resultado = a == b ? "verdadeiro" : "falso";

        System.out.println(resultado);

        /* Relacionais == > < => =< */
        String nome1 = "Gabriel";
        String nome2 = new String("Gabriel");

        System.out.println(nome1.equals(nome2));

        int numero1 = 1;
        int numero2 = 2;

        boolean simNao = numero1 == numero2;

        System.out.println("numero1 é igual numero2? " + simNao);

       simNao = numero1 != numero2;

        System.out.println("numero1 é igual numero2? " + simNao);

        simNao = numero1 > numero2;

        System.out.println("numero1 é igual numero2? " + simNao);

        simNao = numero1 < numero2;

        System.out.println("numero1 é igual numero2? " + simNao);

        /* Lógicos && || */
        boolean condicao1 = true;
        boolean condicao2 = false;

        if(condicao1 && condicao2) {
            System.out.println("As duas condições são verdadeiras");
        }

        if(condicao1 || condicao2) {
            System.out.println("Uma das condições é verdadeira");
        }

    }
}
