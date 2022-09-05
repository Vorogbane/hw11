public class Main {
    public static void main(String[] args) {
    Author pushkin = new Author ("Alexander", "Pushkin");
    Author gogol = new Author("Nikolai", "Gogol");
    Book eugene_onegin = new Book("Eugene Onegin", pushkin, 1833);
    Book NightBeforeChristmas = new Book("The night before christmas", gogol, 1832);
        System.out.println("EugeneOnegin.getPublishingYear() = " + eugene_onegin.getPublishingYear());
        System.out.println("EugeneOnegin.getAuthor() = " + eugene_onegin.getAuthor());
        System.out.println("NightBeforeChristmas.getBookTitle() = " + NightBeforeChristmas.getBookTitle());
        System.out.println("Pushkin.getName() = " + pushkin.getName());
    eugene_onegin.setPublishingYear(1835);
        System.out.println("EugeneOnegin.getPublishingYear() = " + eugene_onegin.getPublishingYear());
        System.out.println("eugene_onegin.toString() = " + eugene_onegin.toString());
        System.out.println(pushkin.equals(gogol));
        System.out.println(eugene_onegin.hashCode());
        System.out.println(gogol.hashCode());
        System.out.println(eugene_onegin.hashCode());

    }
}