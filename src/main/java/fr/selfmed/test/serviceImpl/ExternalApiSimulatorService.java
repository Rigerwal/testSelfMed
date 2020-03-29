package fr.selfmed.test.serviceImpl;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;
import fr.selfmed.test.entity.Transaction;
import org.springframework.stereotype.Service;

import fr.selfmed.test.service.IExternalApiSimulatorService;

import java.io.IOException;
import java.util.List;

@Service
public class ExternalApiSimulatorService implements IExternalApiSimulatorService {

    /**
     * Converts the XML file format to a JSON format
     * @param xml
     * @return
     * @throws IOException
     */
    @Override
    public String convertXmlToJson(String xml) throws IOException {
        XmlMapper xmlMapper = new XmlMapper();

        //Cette méthode marche mais n'est pas appropriée
        /*JSONObject xmlToJson = XML.toJSONObject(xml);
        return xmlToJson.toString();*/


        List<Transaction> transaction = xmlMapper.readValue(xml, new TypeReference<List<Transaction>>() {
        });

        ObjectMapper mapper = new ObjectMapper();
        String json = mapper.writeValueAsString(transaction);

        return json;
    }

    /**
     * Converts the XML file format to a custom format
     * @param xml
     * @return
     * @throws JsonProcessingException
     */
    @Override
    public String convertXmlToCustom(String xml) throws JsonProcessingException {
        XmlMapper xmlMapper = new XmlMapper();

        List<Transaction> transaction = xmlMapper.readValue(xml, new TypeReference<List<Transaction>>() {
        });

        String customFormat = "";

        for (int i = 0; i < transaction.size(); i++){
            customFormat += "\ttransaction:" +
                    "\tid: " + transaction.get(i).getId() +
                    "\tdate: " + transaction.get(i).getDate() +
                    "\tamount: " + transaction.get(i).getAmount() +
                    "\tlabel: " + transaction.get(i).getLabel() +
                    "\tstatus: " + transaction.get(i).getStatus();
        }

        return customFormat;
    }
}