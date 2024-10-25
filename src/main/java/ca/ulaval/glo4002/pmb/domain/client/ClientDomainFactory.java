package ca.ulaval.glo4002.pmb.domain.client;

public class ClientDomainFactory {
    public Client creerClient(int numeroClient, String nom, TypeClient type, String email) {
        Client client = null;

        if (type == TypeClient.RESIDENTIEL) {
            client = new ClientResidentiel(numeroClient, nom, email);
        }
        else if (type == TypeClient.COMMERCIAL) {
            client = new ClientCommercial(numeroClient, nom, email);
        }

        return client;
    }
}
