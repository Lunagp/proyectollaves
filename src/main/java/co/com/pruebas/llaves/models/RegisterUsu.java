package co.com.pruebas.llaves.models;

public class RegisterUsu {

    private String username;
    private String password;
    private String name;
    private String last;
    private String id;
    private String cel;
    private String nameusur;
    private String perfil;
    private String email;
    private String passwordusur;

    public RegisterUsu(String username, String password, String name, String last, String id, String cel, String nameusur, String perfil, String email, String passwordusur) {
        this.username = username;
        this.password = password;
        this.name = name;
        this.last = last;
        this.id = id;
        this.cel = cel;
        this.nameusur = nameusur;
        this.perfil = perfil;
        this.email = email;
        this.passwordusur = passwordusur;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLast() {
        return last;
    }

    public void setLast(String last) {
        this.last = last;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getCel() {
        return cel;
    }

    public void setCel(String cel) {
        this.cel = cel;
    }

    public String getNameusur() {
        return nameusur;
    }

    public void setNameusur(String nameusur) {
        this.nameusur = nameusur;
    }

    public String getPerfil() {
        return perfil;
    }

    public void setPerfil(String perfil) {
        this.perfil = perfil;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPasswordusur() {
        return passwordusur;
    }

    public void setPasswordusur(String passwordusur) {
        this.passwordusur = passwordusur;
    }
}
