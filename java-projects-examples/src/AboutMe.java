public class AboutMe {
    public static void main(String[] args) {
        String nome = args[0];
        String sobrenome = args[1];
        int idade = Integer.valueOf(args[2]);
        double altura = Double.valueOf(args[3]);

        System.out.println("Oi, meu nome é " + nome + " " + sobrenome);
        System.out.println("Minha idade é " + idade + " anos");
        System.out.println("Minha altura é " + altura + " cm");
    }
}
