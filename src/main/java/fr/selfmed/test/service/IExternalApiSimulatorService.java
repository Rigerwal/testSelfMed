package fr.selfmed.test.service;

import java.io.IOException;

public interface IExternalApiSimulatorService {
    public String callApi(String URI);

    /**
     * Convert an XML into a JSON format
     * @param xml
     * @return
     */
    public String convertXmlToJson(String xml) throws IOException;
}