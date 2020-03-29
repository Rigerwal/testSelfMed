package fr.selfmed.test.service;

import com.fasterxml.jackson.core.JsonProcessingException;

import java.io.IOException;

public interface IExternalApiSimulatorService {
    /**
     * Convert an XML into a JSON format
     * @param xml
     * @return
     */
    public String convertXmlToJson(String xml) throws IOException;

    /**
     * Converts an XML to a custom format
     * @param xml
     * @return
     * @throws JsonProcessingException
     */
    public String convertXmlToCustom(String xml) throws JsonProcessingException;
}