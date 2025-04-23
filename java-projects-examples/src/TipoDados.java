public class TipoDados {
    public static void main(String[] args) {
        byte idade = 123;
        short ano = 2023;
        int cep = 12345678;
        long cpf = 12345678901L;
        float pi = 3.14f;
        double salario = 12345.67;
        boolean doador0rgao = true;
        char sexo = 'M';
        
        short numeroCurto = 1;
        int numeroNormal = 123456;
        short numeroCurto2 = (short) numeroNormal; // Casting de int para short
        System.out.println(numeroCurto2); // Saída: 123456, mas pode causar perda de dados se o valor for maior que o limite do short
    }
    
}
