package ObjectsForBroCourse;

public class car4 {
    
    private String make;
    private String model;
    private int year;

    public car4(String make, String model, int year) {
        /* this.make = make;
        this.model = model;
        this.year = year;
        */
        this.setMake(make);
        this.setModel(model);
        this.setyear(year);
    }

    // Getter for make
    public String getMake(){
        return make;
    }

    // Getter for model
    public String getModel(){
        return model;
    }

    // Getter for year
    public int getYear(){
        return year;
    }


    // Setter for make
    public void setMake(String make) {
        this.make = make;
    }

    // Setter for model
    public void setModel(String model) {
        this.model = model;
    }
    
    // Setter for make
    public void setyear(int year) {
        this.year = year;
    }

}
