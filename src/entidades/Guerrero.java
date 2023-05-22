/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;

/**
 *
 * @author Estudiante
 */
public class Guerrero extends Personaje {
    private int fuerza;
    private int resistencia;

    public void ataqueEspecial(Personaje atacado){
        
    }
    
    @Override
    public void atacar(Personaje atacado){
        int nivelActualDeVida = atacado.getVida();
        atacado.setVida(nivelActualDeVida - 10);
        atacado.defender(this);
    }
    
    public int getFuerza() {
        return fuerza;
    }

    public void setFuerza(int fuerza) {
        this.fuerza = fuerza;
    }

    public int getResistencia() {
        return resistencia;
    }

    public void setResistencia(int resistencia) {
        this.resistencia = resistencia;
    }
    
    
}
