import stub.ServiceWeb;
import stub.Student;
import stub.StudentService;

import java.util.List;

public class ClientServiceSoap {

    public static void main(String[] args) {
        StudentService wsdl= new ServiceWeb().getStudentServicePort();
        List<Student> liste=wsdl.listStudents();
        liste.forEach(elm->{System.out.println(elm.getNom()
                +"----"+elm.getPrenom());});
    }
}
