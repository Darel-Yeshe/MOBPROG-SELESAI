package Modul;

public class ProductMap {
    String name;
    String imageFileName;
    String origin;
    String foodType;
    String ingredients;
    String hourToMake;
    String Step;
    double latitude;
    double longitude;

    public ProductMap(String name, String imageFileName, String origin, String foodType, String ingredients, String hourToMake, String step, double latitude, double longitude) {
        this.name = name;
        this.imageFileName = imageFileName;
        this.origin = origin;
        this.foodType = foodType;
        this.ingredients = ingredients;
        this.hourToMake = hourToMake;
        Step = step;
        this.latitude = latitude;
        this.longitude = longitude;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getImageFileName() {
        return imageFileName;
    }

    public void setImageFileName(String imageFileName) {
        this.imageFileName = imageFileName;
    }

    public String getOrigin() {
        return origin;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    public String getFoodType() {
        return foodType;
    }

    public void setFoodType(String foodType) {
        this.foodType = foodType;
    }

    public String getIngredients() {
        return ingredients;
    }

    public void setIngredients(String ingredients) {
        this.ingredients = ingredients;
    }

    public String getHourToMake() {
        return hourToMake;
    }

    public void setHourToMake(String hourToMake) {
        this.hourToMake = hourToMake;
    }

    public String getStep() {
        return Step;
    }

    public void setStep(String step) {
        Step = step;
    }

    public double getLatitude() {
        return latitude;
    }

    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }

    public double getLongitude() {
        return longitude;
    }

    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }
}
