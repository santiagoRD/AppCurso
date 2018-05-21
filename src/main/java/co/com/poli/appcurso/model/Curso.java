package co.com.poli.appcurso.model;

import java.util.Objects;


public class Curso {
    //atributos
    private String idCurso;
    private String nombre;
    private Double horas;
    private Double valorCurso;
    private Boolean estado;

    public Curso(String idCurso, String nombre, Double horas,
                 Double valorCurso, Boolean estado) {//Constructor
        
        this.idCurso = idCurso;
        this.nombre = nombre;
        this.horas = horas;
        this.valorCurso = valorCurso;
        this.estado = estado;
    }
    
        
    //Setter y getter
    public String getIdCurso() {
        return idCurso;
    }

    public void setIdCurso(String idCurso) {
        this.idCurso = idCurso;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Double getHoras() {
        return horas;
    }

    public void setHoras(Double horas) {
        this.horas = horas;
    }

    public Double getValorCurso() {
        return valorCurso;
    }

    public void setValorCurso(Double valorCurso) {
        this.valorCurso = valorCurso;
    }

    public Boolean getEstado() {
        return estado;
    }

    public void setEstado(Boolean estado) {
        this.estado = estado;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 11 * hash + Objects.hashCode(this.idCurso);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Curso other = (Curso) obj;
        if (!Objects.equals(this.idCurso, other.idCurso)) {
            return false;
        }
        return true;
    }
    
    
}
