package ca.ulaval.glo4002.pmb.domain.client;

public abstract class Client {
    NumeroClient numeroClient;

    String nom;
    String email;

    public Client(int numeroClient, String nom, String email) {
        this.numeroClient = NumeroClient.creer(numeroClient);
        this.nom = nom;
        this.email = email;
    }
}
