package Temperature;


/*This Temperature class is to accompany the driver class
BrasherBryanProject09TestDrive and is the implementation of
the Temperature class required by Project 09. */

public class Temperature {
    private double degree = 0;
    private char scale = 'C';


    public Temperature() {
    }

    public Temperature(char scale){
        this.degree = degree;
        if (scale == 'C' || scale == 'F'){
            this.scale = scale;
        }
        else {
            throw new IllegalArgumentException("Must enter a valid temperature scale (C/F).");
        }
    }

    public Temperature(double degree) {
        this.degree = degree;
        this.scale = scale;
    }

    public Temperature(double degree, char scale) {
        this.degree = degree;
        if (scale == 'C' || scale == 'F'){
            this.scale = scale;
        }
        else {
            throw new IllegalArgumentException("Must enter a valid temperature scale (C/F).");
        }
    }

    public double getDegreeInCelsius() {
        if(scale == 'C') {
            return degree;
        }
        else {
            return (degree-32)*5/9; //converts C to F
        }
    }

    public double getDegreeInFahrenheit() {
       if(scale == 'F') {
           return degree;
       }
       else {
           return 1.8*degree + 32; //converts F to C
       }
    }

    public char getScale() {
        return scale;
    }

    public void setDegree(double degree) {
        this.degree = degree;
    }

    public void setDegree(char scale) {
        if (scale == 'C' || scale == 'F'){
            this.scale = scale;
        }
        else {
            throw new IllegalArgumentException("Must enter a valid temperature scale (C/F).");
        }
    }

    public void setDegree(double degree, char scale) {
        this.degree = degree;
        this.scale = scale;
    }

    public boolean equals(Temperature temperature) {
        return (this.getDegreeInFahrenheit() == temperature.getDegreeInFahrenheit());
    }

    public boolean isLessThan(Temperature temperature) {
        return (this.getDegreeInFahrenheit() < temperature.getDegreeInFahrenheit());
    }

    public boolean isGreaterThan(Temperature temperature) {
        return (this.getDegreeInFahrenheit() > temperature.getDegreeInFahrenheit());
    }

    public String toString(){

        return "Temperature is " + String.format("%.2f",this.getDegreeInFahrenheit()) +
                " F or " + String.format("%.2f",this.getDegreeInCelsius()) + " C.";
    }


}
