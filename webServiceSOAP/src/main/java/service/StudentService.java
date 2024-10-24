package service;

import enums.Genre;
import jakarta.jws.WebMethod;
import jakarta.jws.WebService;
import model.Student;

import java.util.List;

@WebService(serviceName = "serviceWeb")
public class StudentService {

    @WebMethod(operationName = "listStudents")
    public List<Student> listEtudiants(){
        return List.of(
                new Student(1,"Chahir","Mohamed", Genre.HOMME),
                new Student(2 ,"ET_Nom2","ET_Prénom2", Genre.FEMME),
                new Student(3 ,"ET_Nom3","ET_Prénom3", Genre.HOMME)
        );
    }
}
