package fr.selfmed.test.controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import fr.selfmed.test.service.IExternalApiSimulatorService;
import fr.selfmed.test.service.IXmlInputService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;

@RestController
public class OutputController {
    private final IExternalApiSimulatorService externalApiSimulatorService;
    private final IXmlInputService xmlInputService;

    @Autowired
    public OutputController(IExternalApiSimulatorService externalApiSimulatorService, IXmlInputService xmlInputService) {
        this.externalApiSimulatorService = externalApiSimulatorService;
        this.xmlInputService = xmlInputService;
    }

    /**
     * Convert an xml into a json format
     * @return
     */
    @GetMapping("/api/output/json")
    public String getAsJsonFormat() throws IOException {
        String xmlInput = xmlInputService.getXmlInput();
        String output = externalApiSimulatorService.convertXmlToJson(xmlInput);

        return output;
    }

    /**
     * Convert the XML format to selfmed format
     * @return
     * @throws JsonProcessingException
     */
    @GetMapping("/api/output/selfmed")
    public String getAsSelfmedFormat() throws JsonProcessingException {
        String xmlInput = xmlInputService.getXmlInput();
        String output = externalApiSimulatorService.convertXmlToCustom(xmlInput);

        return output;
    }
}