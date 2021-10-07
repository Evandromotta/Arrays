public class TSARRAY {
    public static void main(String[] args) {
        Cliente[] clientes = new Cliente[10];

        for (int i = 0; i< clientes.length; i++){
            clientes[i] = new Cliente();
            clientes[i].nome ="João";
        }
        for(Cliente c : clientes) {
            System.out.println(c.nome);
        }
        Cliente[] clientes2 = new Cliente[5];
        clientes2[0] = new Cliente();
        clientes2[1] = new ClienteEspecial();

        Cliente guilherme = new Cliente();
        guilherme.nome = "Guilherme";

        clientes2[0] = guilherme;

        System.out.println(guilherme.nome);
        System.out.println(clientes2[0].nome);

        guilherme.nome = "Silveira";
        System.out.println(guilherme.nome);
        System.out.println(clientes2[0].nome);


    }
}



class Cliente {
    String nome;
}

class ClienteEspecial extends Cliente {

}


