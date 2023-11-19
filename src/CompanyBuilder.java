public abstract class CompanyBuilder {
    protected Company company;

    void createCompany() {
        company = new Company();
    }

    abstract void buildName(String name);
    abstract void buildDirector(String director);
    abstract void buildManager(String manager);
    abstract void buildAccountant(String accountant);

    Company getCompany() {
        return company;
    }

    public String getInfo() {
        return "Company name: " + company.getName() +
                "\n Company Director: " + company.getDirector() +
                "\n Company Manager: " + company.getManager() +
                "\n Company Accountant: " + company.getAccountant();
    }
}
