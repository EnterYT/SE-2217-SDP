public class EnglishCompany extends CompanyBuilder{
    @Override
    void buildName(String name) {
        company.setName(name);
    }

    @Override
    void buildDirector(String director) {
        company.setDirector(director);
    }

    @Override
    void buildManager(String manager) {
        company.setManager(manager);
    }

    @Override
    void buildAccountant(String accountant) {
        company.setAccountant(accountant);
    }
}
