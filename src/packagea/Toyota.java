package packagea;

/**
 * Created by Frenclub on 8/24/15.
 */
public class Toyota extends Car {

    private String companyInfo;

    public Toyota() {
        this.inProgress = true;      // package private or default access
        this.brandName = "Toyota";   // protected access
        System.out.println("Toyota constructor called");
    }

    public Toyota(Boolean inProgress) {
        this.inProgress = inProgress;      // package private or default access
        System.out.println(Toyota.this.getClass().getName() + "parameterized constructor called");
    }

    @Override
    public void setBrandName() {
        this.brandName = "Toyota";
    }

   /* public void printBrandName() {
        System.out.println("Car brandName " + this.brandName);
    }*/

    public void setCompanyInfo(String companyInfo) {
        this.companyInfo = companyInfo;
    }

    public String getCompanyInfo() {
        return companyInfo;
    }
}
