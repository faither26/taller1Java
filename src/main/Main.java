package main;



import static entidades.Calificacion.*;
import entidades.notas.Nota;

import static entidades.Mensajes.*;

import javax.swing.*;

public class Main {



    public static void main(String[] arg)
    {
        Nota nota = new Nota();
        String seguimiento = JOptionPane.showInputDialog(null,MENSAJE_SEGUIMIENTO.getMensaje());
        String parcial = JOptionPane.showInputDialog(null,MENSAJE_FINAL.getMensaje());
        String nFinal = JOptionPane.showInputDialog(null,MENSAJE_FINAL.getMensaje());

        nota.setNotaFinal(Double.parseDouble(nFinal));
        nota.setNotaParcial(Double.parseDouble(parcial));
        nota.setNotaSegimiento(Double.parseDouble(seguimiento));


        if (nota.calcularNota()>=0 && nota.calcularNota()<=0.9)
        {
            JOptionPane.showMessageDialog(null, C5.getMensaje()+nota.calcularNota());
        }else if (nota.calcularNota()<=1.9)
        {
            JOptionPane.showMessageDialog(null,C4.getMensaje()+nota.calcularNota());
        }else if (nota.calcularNota()<=2.9)
        {
            JOptionPane.showMessageDialog(null,C3.getMensaje()+nota.calcularNota());
        }else if ( nota.calcularNota()<=3.9)
        {
            JOptionPane.showMessageDialog(null,C2.getMensaje()+nota.calcularNota());
        }else if (nota.calcularNota()<=5)
        {
            JOptionPane.showMessageDialog(null,C1.getMensaje()+nota.calcularNota());
        }
    }
}
