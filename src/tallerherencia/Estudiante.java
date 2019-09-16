package tallerherencia;

import javax.swing.JOptionPane;

public class Estudiante extends Persona {
    
    private String carnet;
    private double promedioNotas;  
    private int numeroMaterias;

    public Estudiante() {
        
    }
    
    public Estudiante (String nombre, String apellido, int edad, int peso, int numeroMaterias, double promedioNotas, String Carnet){

    //Usamos el operador super para establecer el constructor
    //de la superclase
    super(nombre, apellido, edad, peso);

    //Definimos los atributos propios de este objeto que hereda
    this.carnet = carnet;
    this.promedioNotas = promedioNotas;
    this.numeroMaterias = numeroMaterias;
}
    /**
     * @return the carnet
     */
    public String getCarnet() {
        return carnet;
    }

    /**
     * @param carnet the carnet to set
     */
    public void setCarnet(String carnet) {
        this.carnet = carnet;
    }

    /**
     * @return the promedioNotas
     */
    public double getPromedioNotas() {
        return promedioNotas;
    }

    /**
     * @param promedioNotas the promedioNotas to set
     */
    public void setPromedioNotas(double promedioNotas) {
        this.promedioNotas = promedioNotas;
    }

    /**
     * @return the numeroMaterias
     */
    public int getNumeroMaterias() {
        return numeroMaterias;
    }

    /**
     * @param numeroMaterias the numeroMaterias to set
     */
    public void setNumeroMaterias(int numeroMaterias) {
        this.numeroMaterias = numeroMaterias;
    }
    
    public double calcularPromedio ( ){
        
    double promedioNotas = 0.0;
    int cantidadNotas;
    
    
    
        return promedioNotas;
    }   
    
    
}
