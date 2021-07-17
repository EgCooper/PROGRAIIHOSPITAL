import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        //Ciudades
        Ciudad cbba = new Ciudad("2" ,"Cochabamba");
        Ciudad scz = new Ciudad("1" , "SantaCruz");
        Ciudad lpaz = new Ciudad("3" , "LaPaz");
        //Hospitales
        List<Hospital> hospitals = new ArrayList<>();
        List<Servicio> servicios = new ArrayList<>();
        Hospital hn = new Hospital("1" ,"HospitaldelNorte" ,cbba, 323 ,servicios);
        Hospital sr = new Hospital("2" ,"SantaRosa" ,scz , 13333,servicios );
        Hospital ho = new Hospital("3", "HospitalObrero", lpaz, 322, servicios);
        hospitals .add(hn);
        hospitals .add(sr);
        hospitals .add(ho);
        //Servicios
        Servicio cirugia = new Servicio("1", "cirugia", hospitals, "bueno");
        Servicio pediatria = new Servicio("2" , "pediatria" , hospitals,"Malo");
        Servicio mediinterna = new Servicio("3", "medicinainterna", hospitals, "regular");
        servicios .add(cirugia);
        servicios .add(pediatria);
        servicios .add(mediinterna);
        //Medicoss
        Medico ariel = new Medico("123", "ariel", "sanchez", "ramirez","321",Calendar.getInstance().getTime(),servicios, hospitals);
        Medico juan  = new Medico("321", "juan", "perez", "tamez", "123", Calendar.getInstance().getTime(), servicios,hospitals);
        //Paciente
        Paciente Tadeo = new Paciente("222","Tadeo","Ramirez","Quintana","444",Calendar.getInstance().getTime(),"44455");
        //Historial
        Historial bu= new Historial("1",Tadeo);
        //visita
        Visita mañana = new Visita("22",Calendar.getInstance().getTime(),ho,cirugia,ariel,"cancer","quimioterapia","7",Calendar.getInstance().getTime(),bu);
        Visita tarde = new Visita("23", Calendar.getInstance().getTime(),hn,mediinterna,juan,"diabetes","pastillas","8",Calendar.getInstance().getTime(),bu);
        System.out.println("PACIENTE:");
        System.out.println("NombrePaciente:"+Tadeo.getNombre());
        System.out.println("Apellidos del Paciente:"+ Tadeo.getPrimerApellido() + " " + Tadeo.getSegundoApellido());
        System.out.println("MEDICO:");
        System.out.println("Medico:"+ ariel.getNombre());
        System.out.println("CIUDAD:");
        System.out.println("CodigoCiudad :"+cbba.getCodCiudad());
        System.out.println("NombreCiudad:"+cbba.getNombre());
        System.out.println("HOSPITAL:");
        System.out.println("CodigoHospital:"+hn.getCodHospital());
        System.out.println("NombreHospital:"+hn.getNombre());
        System.out.println("SERVICIOS DEL HOSPITAL:");
        System.out.println("Servicios:"+ cirugia.getIdServicio());
        System.out.println("Tipo de Servicio:"+ cirugia.getNombre());
        System.out.println("HISTORIALES");
        System.out.println("Historial:"+ bu.getCodhistorial());
    }

}
