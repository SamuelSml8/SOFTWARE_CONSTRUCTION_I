/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.Scanner;

/**
 * @author ESTUDIANTE
 */
public class Main {

    public static final String PASSWORD_SYSTEM = "123456789";
    public static CredentialItem credential;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        System.out.println("===== Sistema de GC ========");

        Scanner sc = new Scanner(System.in);

        ManagementCredentials managementCredentials = new ManagementCredentials();
        int opcion = 3;
        do {

            System.out.print("Ingrese Contraseña: ");
            String password = sc.nextLine();

            if (PASSWORD_SYSTEM.equals(password)) {
                System.out.println("Ingresando!!");
                int modulo;
                do {
                    System.out.println("==== Lista de Modulos");

                    System.out.println("0 -> Listar Credenciales");
                    System.out.println("1 -> Crear Credencial");
                    System.out.println("2 -> Agregar Credencial");
                    System.out.println("3 -> Buscar Credencial");
                    System.out.println("4 -> Salir");
                    System.out.print("Entrar al modulo: ");
                    modulo = sc.nextInt();
                    sc.nextLine();
                    System.out.println("");

                    switch (modulo) {
                        case 0:
                            managementCredentials.getCredentials();
                            break;
                        case 1:
                            credential = managementCredentials.createCredential();
                            break;
                        case 2:
                            if (credential == null) {
                                System.out.println("No hay credencial en memoria. ");
                            }
                            managementCredentials.addCredential(credential);
                            break;
                        case 3:
                            System.out.println("Ingrese el servicio a buscar: ");
                            String service = sc.nextLine();
                            CredentialItem search = managementCredentials.searchCredential(service);

                            if (search != null) {
                                System.out.println("La credencial existe! ");
                            } else {
                                System.out.println("Credencial no encontrada. ");
                            }
                            break;
                        case 4:
                            System.out.println("Saliendo....");
                            break;
                        default:
                            System.out.println("Opcion no valida!");
                            break;
                    }
                } while (modulo != 4);
            } else {
                opcion--;
                System.out.println("Te quedan " + opcion + "intentos");
            }

        } while (opcion != 0);
    }

}