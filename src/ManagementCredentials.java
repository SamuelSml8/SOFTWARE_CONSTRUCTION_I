import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ManagementCredentials {
    Scanner sc = new Scanner(System.in);
    private List<CredentialItem> credentials;

    public ManagementCredentials() {
        this.credentials = new ArrayList<>();
    }

    public CredentialItem createCredential() {
        System.out.println("Ingrese el servicio: ");
        String service = sc.nextLine();
        System.out.println("Ingrese el usuario: ");
        String user = sc.nextLine();
        System.out.println("Ingrese la contraseña: ");
        String password = sc.nextLine();

        CredentialItem credential = new CredentialItem(service, user, password);
        System.out.println("¡Credencial creada!");
        return credential;

    }

    ;

    public void addCredential(CredentialItem credential) {
        this.credentials.add(credential);
        System.out.println("¡Credencial agregada!");

    }

    ;

    public void getCredentials() {
        for (CredentialItem c : this.credentials) {
            System.out.println("Servicio: " + c.service);
        }
    }

    ;

    public CredentialItem searchCredential(String service) {
        for (CredentialItem c : this.credentials) {
            if (c.service.equals(service)) {
                return c;
            }
        }
        return null;
    }

    ;
}
