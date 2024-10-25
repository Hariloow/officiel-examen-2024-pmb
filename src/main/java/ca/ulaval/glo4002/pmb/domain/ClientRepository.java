package ca.ulaval.glo4002.pmb.domain;

import ca.ulaval.glo4002.pmb.domain.client.Client;

public interface ClientRepository {
    void storeClient(Client client);

    void getClient(int numeroClient);
}
