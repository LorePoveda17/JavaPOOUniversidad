/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bo.usfx.sis457.entidades;

import bo.usfx.sis457.Utilitarios;
import java.util.Arrays;
import java.util.Calendar;
/**
 *
 * @author Lorena Poveda
 */
public class DocenteTitular extends Docente{
    protected String ExamenCompetencia;
    
    public DocenteTitular(String examencompetencia , String titulo , int añosexperiencia , String nombre , String carnetIdentidad , String[] asignaturas , Calendar fechaNacimiento){
        super (titulo , añosexperiencia , asignaturas , carnetIdentidad , nombre , fechaNacimiento);
        this.ExamenCompetencia = examencompetencia;
    }
    public DocenteTitular (String examencompetencia){
        this.ExamenCompetencia =examencompetencia;
    }

    public String getExamenCompetencia() {
        return ExamenCompetencia;
    }

    public void setExamenCompetencia(String ExamenCompetencia) {
        this.ExamenCompetencia = ExamenCompetencia;
    }
    
    public String toString() {
        return "Administrativo{" 
                + "Id=" + this.Id 
                + ", CarnetIdentidad=" + this.CarnetIdentidad 
                + ", Nombre=" + this.Nombre 
                + ", FechaNacimiento=" + Utilitarios.getFechaCalendario(this.FechaNacimiento)
                + ", Titulo=" + this.Titulo
                + ", AñosExperiencia=" + this.AñosExperiencia
                + ", Asignaturas=" + this.Asignaturas
                + ", ExamenCompetencia" + this.ExamenCompetencia;
    }
}

