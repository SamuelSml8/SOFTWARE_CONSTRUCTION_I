public class CredentialItem {
    private String user;
    private String password;
    public String service;

    public CredentialItem(String service, String user, String password) {
        this.service = service;
        this.password = password;
        this.user = user;
    }
}
