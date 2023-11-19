public class Company {
    private String name;
    private String director;
    private String manager;
    private String accountant;

    public void setName(String name) {
        this.name = name;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public void setManager(String manager) {
        this.manager = manager;
    }

    public void setAccountant(String accountant) {
        this.accountant = accountant;
    }

    public String getName() {
        return name;
    }

    public String getAccountant() {
        return accountant;
    }

    public String getDirector() {
        return director;
    }

    public String getManager() {
        return manager;
    }
}
