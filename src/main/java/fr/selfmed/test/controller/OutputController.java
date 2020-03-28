package fr.selfmed.test.controller;

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

    @GetMapping("/api/output/selfmed")
    public String getAsSelfmedFormat() {
        String xmlInput = externalApiSimulatorService.callApi("");
        String output = "";

        /**
         * Pour le output, il faudra retourner une liste d'objet de la classe status
         * et boucler sur cette liste et faire un toString pour chacun des objet.
         * Nous mettrons ca dans un string
         */

        // TODO

        return output;
    }
}