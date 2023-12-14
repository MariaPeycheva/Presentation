package com.company;

public class Main {

    public static void main(String[] args) throws CloneNotSupportedException {
        Author author = new Author("Mariika");
        Presentation presentationOG = new Presentation(author, "Etimologiq na nazvaniqta na mesecite vbulgarskiq ezik i vruzkata im s tezi v drugi slavqnksi ezici!", 25);
        {
            Presentation pres2 = (Presentation) presentationOG.clone();
            pres2.getAuthor().setName("Zlatiq");
            Presentation pres3 = (Presentation) presentationOG.clone();
            pres3.getAuthor().setName("Kali Pey");
            Presentation pres4 = (Presentation) presentationOG.clone();
            pres4.getAuthor().setName("i kompaniq");

            presentationOG.submit();
            pres2.submit();
            pres3.submit();
            pres4.submit();
            System.out.println(presentationOG);
            System.out.println(pres2);
            System.out.println(pres3);
            System.out.println(pres4);

        }
    }
}
