// somar (int n1, int n2) {}
// abrirConexao () {}

// concluirProcessamento () {}

// findById(int id) {} // findById(int id, String nome) {}

public class MyCLass{
    public double somar (int num1, int num2) {
        return num1 + num2;
    }

    public void imprimir (String texto) {
        //logica - finalidade do metodo 
        //aqui nao precisa de return
        //pois nao será retornado nenhum resultado
        System.out.println(texto);
    }

    //throws Exception - para indicar que o metodo pode lançar uma exceção
    //poderá gerar uma exceção

    public double dividir (int dividendo, int divisor) throws Exception {
        if (divisor == 0) {
            throw new Exception("Divisão por zero não é permitida.");
        }
        return dividendo / divisor;
    }
    
    private void metodoPrivado() {
        // Este método só pode ser acessado dentro desta classe
        // esse metodo naopode ser visto por outras classes
    }
    // alguns equivocos estruturais
    public void validar(){}
    //esse metodo deveria retornar algum valor
    //no caso boolean (true ou false)
    
    public void calcularEnviar(){
        //um metodo deve representar uma unica responsabilidade
    }
    // public void gravarCliente(String nome, String cpf,)
    // este metodo tem a finalidade de gravar
    //informações de um cliente, por que nao criar
    // um objeto cliente e passar como parametro?
    //eja abaixo

    // public void gravarCliente(Cliente cliente) {}
    //     //ou
    // public void gravar (Cliente cliente) {
    //     //logica de gravar o cliente
    // }
    
}
