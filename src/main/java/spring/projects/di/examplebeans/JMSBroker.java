package spring.projects.di.examplebeans;

public class JMSBroker {

    private String username;
    private String password;
    private String url;

    public JMSBroker(String username, String password, String url) {
        this.username = username;
        this.password = password;
        this.url = url;
    }

    @Override
    public String toString() {
        return "JMSBroker{" +
                "username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", url='" + url + '\'' +
                '}';
    }
}
