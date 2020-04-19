package spring.projects.di.examplebeans;

public class DataSource {

    private String username;
    private String password;
    private String url;

    public DataSource(String username, String password, String url) {
        this.username = username;
        this.password = password;
        this.url = url;
    }

    @Override
    public String toString() {
        return "DataSource{" +
                "username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", url='" + url + '\'' +
                '}';
    }
}
