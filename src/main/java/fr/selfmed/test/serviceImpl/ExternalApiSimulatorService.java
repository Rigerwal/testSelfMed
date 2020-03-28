package fr.selfmed.test.serviceImpl;

import org.springframework.stereotype.Service;

import fr.selfmed.test.service.IExternalApiSimulatorService;

@Service
public class ExternalApiSimulatorService implements IExternalApiSimulatorService {
    @Override
    public String callApi(String URI) {
        String apiResponse = "";

        //TODO

        return apiResponse;
    }
}