package ca.ulaval.glo4002.pmb.domain.client;

public class ClientCommercial extends Client{
    private final TypeClient typeClient = TypeClient.COMMERCIAL;

    public ClientCommercial(int numeroClient, String nom, String email) {
        super(numeroClient, nom, email);
    }
}
