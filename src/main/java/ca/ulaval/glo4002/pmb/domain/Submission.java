package ca.ulaval.glo4002.pmb.domain;

import ca.ulaval.glo4002.pmb.domain.client.Client;
import ca.ulaval.glo4002.pmb.domain.ne_pas_modifier.CodeMateriel;
import ca.ulaval.glo4002.pmb.persistance.ClientSQLStorage;

import java.util.List;

public class Submission {
    private  final NumeroSoumission numeroSoumission;

    private final Client client;

    private final float price;

    private final ClientRepository clientRepository;

    public Submission(int numeroClient, float hoursWorked, List<CodeMateriel> listMaterialsUsed, PrixFacturationClient facturationClient) {
        this.numeroSoumission = NumeroSoumission.generer();

        clientRepository = new ClientSQLStorage();
        this.client = clientRepository.getClient(numeroClient);

        this.price = calculerFacturation(hoursWorked, listMaterialsUsed, facturationClient);
        this.client.addSubmission(this);

        clientRepository.storeClient(client);
    }

    public NumeroSoumission getNumeroSoumission() {
        return numeroSoumission;
    }

    private float calculerFacturation(float hoursWorked, List<CodeMateriel> listMaterialsUsed, PrixFacturationClient facturationClient) {
        // TODO
        return 0;
    }
}
