
package usuarios.pacientes;

import usuarios.Usuario;
import utils.Rol;

import java.time.LocalDate;

public class Paciente extends Usuario {

    public String tipoSangre;
    public char sexo;


    public Paciente(String id, String nombre, String apellidos, LocalDate fechaNacimiento, String tipoSangre, char sexo, String telefono, String contrasenia) {
        super(id, nombre, apellidos, fechaNacimiento, telefono, contrasenia, Rol.PACIENTE);
        this.tipoSangre = tipoSangre;
        this.sexo = sexo;

    }

    public String mostrarDatos() {
        return String.format("Id: %s, Nombre: %s, Apellidos: %s," +
                        " Fecha de nacimiento: %s, Tipo de sangre: %s, " +
                        "Sexo: %s, Telefono: %s",
                id, nombre, apellido, fechaNacimiento, tipoSangre, sexo, telefono);
    }

    public String verConsultas() {
        return String.format("adsadasd");
    }

    // -----------------Getters y Setters--------------------------------------


    public char getSexo() {
        return sexo;
    }


    public String getTipoSangre() {
        return tipoSangre;
    }


}
