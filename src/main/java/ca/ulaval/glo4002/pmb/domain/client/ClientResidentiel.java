package ca.ulaval.glo4002.pmb.domain.client;

public class ClientResidentiel extends Client{
    private final TypeClient typeClient = TypeClient.RESIDENTIEL;

    public ClientResidentiel(int numeroClient, String nom, String email) {
        super(numeroClient, nom, email);
    }
}
