public class Main {
    public static void main(String[] args) {
        //Meeting of two foreign companies

        //Creating people from two companies and their language
        LanguageFactory en = setLanguageByName("english");
        LanguageFactory ru = setLanguageByName("russian");


        //Translator(Adapter) for companies for understanding
        Translator Translator = new Translator();

        //Company, staff and their job
        //English Company
        //Creating People
        Identity adam = en.createIdentity("Adam");
        Identity lorain = en.createIdentity("Lorain");
        Identity gustavo = en.createIdentity("Gustavo");

        //Creating company and giving the job to people
        CompanyBuilder enCompany = new EnglishCompany();
        enCompany.createCompany();
        enCompany.buildName("American Enterprise");
        enCompany.buildDirector(adam.name);
        enCompany.buildManager(lorain.name);
        enCompany.buildAccountant(gustavo.name);
        System.out.println(enCompany.getInfo());
        System.out.println();

        //Russian Company
        //Creating People
        Identity egor = ru.createIdentity("Egor");
        Identity dasha = ru.createIdentity("Dasha");
        Identity laura = ru.createIdentity("Laura");

        //Creating Company and giving job to people
        CompanyBuilder ruCompany = new RussainCompany();
        ruCompany.createCompany();
        ruCompany.buildName("V Pluse");
        ruCompany.buildDirector(egor.name);
        ruCompany.buildManager(dasha.name);
        ruCompany.buildAccountant(laura.name);
        System.out.println(ruCompany.getInfo());
        System.out.println();

        //Local Hub(Subject) for Assistants
        ConcreteSubject EnSubject = new ConcreteSubject();
        ConcreteSubject RuSubject = new ConcreteSubject();

        //Adding Observers to the Subject
        //English Hub
        ConcreteObserver max = new ConcreteObserver("Max");
        ConcreteObserver george = new ConcreteObserver("George");
        EnSubject.addObserver(max);
        EnSubject.addObserver(george);

        //Russian hub
        ConcreteObserver dima = new ConcreteObserver("Dima");
        ConcreteObserver pasha = new ConcreteObserver("Pasha");
        RuSubject.addObserver(dima);
        RuSubject.addObserver(pasha);

        //Setting new state(Request) for Assistants
        EnSubject.setState("Bring work papers");
        RuSubject.setState("Bring coffee for our guests");

        //Testing the program

    }


    static LanguageFactory setLanguageByName(String language){
        if (language.equalsIgnoreCase("english")){
            return new EnglishFactory();
        }
        else if(language.equalsIgnoreCase("russian")){
            return new RussianFactory();
        }
        else {
            throw new RuntimeException(language + " language is not suitable here");
        }
    }
}