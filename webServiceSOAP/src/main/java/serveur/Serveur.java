package serveur;

import jakarta.xml.ws.Endpoint;
import service.StudentService;

public class Serveur {
    public static void main(String[] args) {
        String url="http://localhost:8081/";
        Endpoint.publish(url,new StudentService());
        System.out.println(url);
    }
}
