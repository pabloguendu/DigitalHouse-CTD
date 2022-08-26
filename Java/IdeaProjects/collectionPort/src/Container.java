public class Container implements Comparable<Container>{
    private Integer id;
    private String countryOfOrigin;
    private Boolean dangerousMaterials;

    public Container(Integer id, String countryOfOrigin, Boolean dangerousMaterials) {
        this.id = id;
        this.countryOfOrigin = countryOfOrigin;
        this.dangerousMaterials = dangerousMaterials;
    }

    public Boolean getDangerousMaterials() {
        return dangerousMaterials;
    }

    public String getCountryOfOrigin() {
        return countryOfOrigin;
    }

    @Override
    public String toString() {
        return "Container{" +
                "id='" + id + '\'' +
                ", countryOfOrigin='" + countryOfOrigin + '\'' +
                ", dangerousMaterials=" + dangerousMaterials +
                '}';
    }

    @Override
    public int compareTo(Container o) {
        return id.compareTo(o.id);
    }
}
