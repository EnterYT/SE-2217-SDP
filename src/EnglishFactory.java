public class EnglishFactory implements LanguageFactory {
    @Override
    public Identity createIdentity(String name) {
        return new Identity(name);
    }
}
