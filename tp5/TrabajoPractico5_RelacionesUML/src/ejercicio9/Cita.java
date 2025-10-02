/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio9;

/**
 *
 * @author Fede
 */
public class Cita {
    package ejercicio9_citamedica_paciente_profesional;

public class CitaMedica {
    private String fecha;
    private String hora;
    private Paciente paciente;      // Asociación unidireccional
    private Profesional profesional; // Asociación unidireccional

    public CitaMedica(String fecha, String hora) {
        this.fecha = fecha;
        this.hora = hora;
    }

    // Asociación unidireccional con Paciente
    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }

    // Asociación unidireccional con Profesional
    public void setProfesional(Profesional profesional) {
        this.profesional = profesional;
    }

    // Getters
    public String getFecha() { return fecha; }
    public String getHora() { return hora; }
    public Paciente getPaciente() { return paciente; }
    public Profesional getProfesional() { return profesional; }
    
    // Método para mostrar información de la cita
    public void mostrarInformacion() {
        System.out.println("Cita Médica - " + fecha + " a las " + hora);
        System.out.println("Paciente: " + paciente.getNombre() + " (" + paciente.getObraSocial() + ")");
        System.out.println("Profesional: " + profesional.getNombre() + " - " + profesional.getEspecialidad());
    }
}
}
