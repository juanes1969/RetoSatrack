package co.com.prueba.certificacion.retoSatrack.models;

import io.cucumber.datatable.DataTable;

import java.util.List;
import java.util.Map;

public class Credentials {

    private String username;
    private String password;

    public Credentials(String username, String password) {
        this.username = username;
        this.password = password;
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

    public Credentials(DataTable dataTable) {
        List<Map<String, String>> mapList = dataTable.asMaps(String.class, String.class);
        this.username = mapList.get(0).get("username");
        this.password = mapList.get(0).get("password");
    }

}
