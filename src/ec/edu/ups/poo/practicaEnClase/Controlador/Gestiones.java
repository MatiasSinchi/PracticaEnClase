/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.ups.poo.practicaEnClase.Controlador;

import ec.edu.ups.poo.practicaEnClase.Principal;
import java.io.File;
import java.io.IOException;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author matiassinchi
 */
public class Gestiones {

    private Principal p;

    public void crear(String ruta) {
        Object[] opciones = {"Crear Archivo", "Crear Directorio"};

        JTextField NArchivo = new JTextField();
        NArchivo.setColumns(20);
        JPanel panel = new JPanel();
        panel.add(new JLabel("Ingrese el nombre:"));
        panel.add(NArchivo);
        int seleccion = JOptionPane.showOptionDialog(null, panel, "Selecciona una opción", JOptionPane.YES_NO_OPTION, JOptionPane.PLAIN_MESSAGE, null, opciones, null);
        String extra = NArchivo.getText();
        if (seleccion == JOptionPane.YES_OPTION) {
            try {
                File archivo = new File(ruta, extra);
                archivo.createNewFile();
            } catch (IOException e) {
                System.out.println("Excepcion: " + e);
            }
            JOptionPane.showMessageDialog(null, "El archivo se creo correctamente");
        } else if (seleccion == JOptionPane.NO_OPTION) {
            try {
                File directorio = new File(ruta, extra);
                directorio.mkdir();
            } catch (SecurityException e) {
                System.out.println("Excepcion: " + e);
            }
            JOptionPane.showMessageDialog(null, "El directorio se creo correctamente");
        } else {
            JOptionPane.showMessageDialog(null, "Operación cancelada");
        }
    }

    public void renombrar(String ruta) {
        Object[] opciones = {"Editar Archivo", "Editar Directorio"};

        JTextField NArchivo = new JTextField();
        JTextField NArchivoNuevo = new JTextField();
        NArchivoNuevo.setColumns(20);
        NArchivo.setColumns(20);
        JPanel panel = new JPanel();
        panel.add(new JLabel("Ingrese el nombre del archivo a renombrar:"));
        panel.add(NArchivo);
        panel.add(new JLabel("Ingrese el nuevo nombre:"));
        panel.add(NArchivoNuevo);
        int seleccion = JOptionPane.showOptionDialog(null, panel, "Selecciona una opción", JOptionPane.YES_NO_OPTION, JOptionPane.PLAIN_MESSAGE, null, opciones, null);
        String old = NArchivo.getText();
        String extra = NArchivoNuevo.getText();

        if (seleccion == JOptionPane.YES_OPTION) {
            try {
                File archivo = new File(ruta, old);
                File archivoNew = new File(ruta, extra);
                archivo.renameTo(archivoNew);
            } catch (SecurityException e) {
                System.out.println("Excepcion: " + e);
            }
            JOptionPane.showMessageDialog(null, "El Directorio se edito correctamente");
        } else if (seleccion == JOptionPane.NO_OPTION) {
            try {
                File directorio = new File(ruta, old);
                File directorioNew = new File(ruta, extra);
                directorio.renameTo(directorioNew);

            } catch (SecurityException e) {
                System.out.println("Excepcion: " + e);
            }
            JOptionPane.showMessageDialog(null, "El directorio se edito correctamente");
        } else {
            JOptionPane.showMessageDialog(null, "Operación cancelada");
        }
    }

    public void eliminar(File archivo) {
        Object[] opciones = {"Eliminar Archivo", "Eliminar Directorio"};

        JTextField NArchivo = new JTextField();
        NArchivo.setColumns(20);
        JPanel panel = new JPanel();
        NArchivo.setText("Esta accion no se puede deshacer");
        panel.add(NArchivo);

        int seleccion = JOptionPane.showOptionDialog(null, panel, "Selecciona una opción", JOptionPane.YES_NO_OPTION, JOptionPane.PLAIN_MESSAGE, null, opciones, null);
        String old = NArchivo.getText();

        if (seleccion == JOptionPane.YES_OPTION) {

            try {
                if (archivo.isFile()) {
                    archivo.delete();
                }
            } catch (SecurityException e) {
                System.out.println("Excepcion: " + e);
            }

            JOptionPane.showMessageDialog(null, "El archivo se elimino correctamente");
        } else if (seleccion == JOptionPane.NO_OPTION) {

            try {
                if (archivo.exists()) {
                    // Obtiene la lista de archivos y subdirectorios en el directorio
                    File[] archivos = archivo.listFiles();

                    // Verifica si la lista no está vacía
                    if (archivos != null) {
                        for (File a : archivos) {
                            if (a.isDirectory()) {
                                // Si es un directorio, llama recursivamente al método
                                eliminar(a);
                            } else {
                                // Si es un archivo, elimínalo
                                a.delete();
                            }
                        }
                    }

                    // Elimina el directorio después de eliminar su contenido
                    archivo.delete();
                }

            } catch (SecurityException e) {
                System.out.println("Excepcion: " + e);
            }
            JOptionPane.showMessageDialog(null, "El directorio se eliminio correctamente");

        } else {
            JOptionPane.showMessageDialog(null, "Operación cancelada");
        }
    }

}
