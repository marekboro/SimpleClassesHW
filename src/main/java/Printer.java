public class Printer {
    private int sheetsRemaining;
    private String errorMessage;


    public Printer(){
        this.sheetsRemaining = 200;
        this.errorMessage = "";

    }

    public int getSheetsRemaining(){
        return this.sheetsRemaining;
    }

    public String getErrorMessage(){
        return this.errorMessage;
    }

    public void print(int pages, int copies){
        if (pages*copies <= this.sheetsRemaining) {
            this.sheetsRemaining -= pages*copies;
        } else {
            this.errorMessage = "Give me more paper human!";

        }


    }

}


/*

Create a Printer class that has a property for number of sheets of paper left.
Add a method to print that takes in a number of pages and number of copies.
The print method will only run if the printer has enough paper. If it runs it will reduce the value of the paper left by number of copies * number of pages.
Add a toner volume property to the class.
Modify the printer so that it reduces the toner by 1 for each page printed.

 */