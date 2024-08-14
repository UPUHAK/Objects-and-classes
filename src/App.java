public class App {
    public static void main(String[] args) {

        Author gromyko = new Author("Ольга ", "Громыко");
        System.out.println(gromyko.getName() + gromyko.getSurname());

        Author shevchenko = new Author("Ирина ", "Шевченко");
        System.out.println(shevchenko.getName() + shevchenko.getSurname());


        Book сybercanicles = new Book("Киберканикулы", gromyko, 2022);

        System.out.println("Книга " + сybercanicles.getTitle() + ". Автор "
                + сybercanicles.getAuthor().getName() + сybercanicles.getAuthor().getSurname() + ". Год выпуска "
                + сybercanicles.getYear());


        Book islanOfNotGuilty = new Book("Остров невиновных", shevchenko, 2020);

        System.out.println("Книга " + islanOfNotGuilty.getTitle() + ". Автор "
                + islanOfNotGuilty.getAuthor().getName() + islanOfNotGuilty.getAuthor().getSurname() + ". Год выпуска "
                + сybercanicles.getYear());


        сybercanicles.setYear(2023);

        System.out.println("Книга " + сybercanicles.getTitle() + ". Автор "
                + сybercanicles.getAuthor().getName() + сybercanicles.getAuthor().getSurname() + ". Год выпуска "
                + сybercanicles.getYear());


    }
}
