package book;

public class Main {
    public static void main(String[] args) {
        Book JavaCore=new ProgrammingBook("001", "Java", "Java Author", "Java", "Java Core",200);
        Book CSharpCore=new ProgrammingBook("002", "CSharpCore", "CSharp Author", "C#", "C# Core",300);
        Book JavaScript=new ProgrammingBook("003", "JavaScript", "JavaScript Author", "JavaScript", "JavaScript Core",150);
        Book NodeJs=new ProgrammingBook("004", "NodeJs", "JavaScript Author", "JavaScript", "NodeJS",500);
        Book Spring=new ProgrammingBook("005", "Spring", "Spring Author", "Java", "Spring",200);
        Book DuckTales=new FictionBook("006", "Duck Tales", "Duck", 50, "Adventure");
        Book CatTales=new FictionBook("007", "Cat Tales", "Cat", 150, "Thriller");
        Book DogTales=new FictionBook("008", "Dog Tales", "Dog", 350, "Self-help");
        Book FishTales=new FictionBook("009", "Fish Tales", "Fish", 100, "History");
        Book ChickenTales=new FictionBook("010", "Chicken Tales", "Dog", 50, "Thriller");

        BookList library=new BookList();

        library.add(JavaCore);
        library.add(CSharpCore);
        library.add(JavaScript);
        library.add(NodeJs);
        library.add(Spring);
        library.add(DuckTales);
        library.add(CatTales);
        library.add(DogTales);
        library.add(FishTales);
        library.add(ChickenTales);

        System.out.println(library);//list
        System.out.print(library.getTotalPrice()+"\n");//2050
        System.out.println(library.getLanguageCount("JavaScript"));//2
        System.out.println(library.searchBookLinear("CSharpCore"));//300
        System.out.println(library.searchBookLinear("HelloWord"));//Not Found

//        library.priceSortBubbly();
//        System.out.println(library);//Duck Tales,(==) Chicken Tales, Fish Tales, JavaScript,(==) Cat Tales, Java, Spring,(==) CSharpCore, Dog Tales, NodeJs,
//
//        library.priceSortSelection();
//        System.out.println(library);////Duck Tales,(==) Chicken Tales, Fish Tales, JavaScript,(==) Cat Tales, Java, Spring,(==) CSharpCore, Dog Tales, NodeJs,
        library.priceSortInsert();
        System.out.println(library);

    }
}
