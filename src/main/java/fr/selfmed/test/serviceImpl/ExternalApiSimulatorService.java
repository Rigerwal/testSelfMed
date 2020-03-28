package fr.selfmed.test.serviceImpl;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;
import fr.selfmed.test.entity.Transaction;
import org.springframework.stereotype.Service;

import fr.selfmed.test.service.IExternalApiSimulatorService;

import java.io.IOException;

@Service
public class ExternalApiSimulatorService implements IExternalApiSimulatorService {
    @Override
    public String callApi(String URI) {
        String apiResponse = "";

        //TODO

        return apiResponse;
    }

    @Override
    public String convertXmlToJson(String xml) throws IOException {
        XmlMapper xmlMapper = new XmlMapper();
        Transaction transaction = xmlMapper.readValue(xml, Transaction.class);

        ObjectMapper mapper = new ObjectMapper();
        String json = mapper.writeValueAsString(transaction);

        return json;
    }
}