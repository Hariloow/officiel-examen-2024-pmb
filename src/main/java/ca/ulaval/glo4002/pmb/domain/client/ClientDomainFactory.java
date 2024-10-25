package ca.ulaval.glo4002.pmb.domain.client;

import ca.ulaval.glo4002.pmb.domain.ClientRepository;
import ca.ulaval.glo4002.pmb.persistance.ClientSQLStorage;

public class ClientDomainFactory {
    ClientRepository clientRepository;

    public ClientDomainFactory(){
        clientRepository = new ClientSQLStorage();
    }

    public Client creerClient(int numeroClient, String nom, TypeClient type, String email) {
        Client client = null;

        if (type == TypeClient.RESIDENTIEL) {
            client = new ClientResidentiel(numeroClient, nom, email);
        }
        else if (type == TypeClient.COMMERCIAL) {
            client = new ClientCommercial(numeroClient, nom, email);
        }

        clientRepository.storeClient(client);

        return client;
    }
}
