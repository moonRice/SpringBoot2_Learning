package JavaEE.ioc.ioc_1.model;

import java.util.*;

public class User {
    private String username;
    private String address;
    private Integer id;
    private Cat cat;
    private Cat[] cats;
    private List<String> hobbies;
    private Map<String, Object> details;
    private Properties infos;

    @Override
    public String toString() {
        return "User{" +
                "username='" + username + '\'' +
                ", address='" + address + '\'' +
                ", id=" + id +
                ", cat=" + cat +
                ", cats=" + Arrays.toString(cats) +
                ", hobbies=" + hobbies +
                ", details=" + details +
                ", infos=" + infos +
                '}';
    }

    public Properties getInfos() {
        return infos;
    }

    public void setInfos(Properties infos) {
        this.infos = infos;
    }

    public Map<String, Object> getDetails() {
        return details;
    }

    public void setDetails(Map<String, Object> details) {
        this.details = details;
    }

    public Cat[] getCats() {
        return cats;
    }

    public void setCats(Cat[] cats) {
        this.cats = cats;
    }

    public List<String> getHobbies() {
        return hobbies;
    }

    public void setHobbies(List<String> hobbies) {
        this.hobbies = hobbies;
    }

    public Cat getCat() {
        return cat;
    }

    public void setCat(Cat cat) {
        this.cat = cat;
    }

    public User() {
        System.out.println("-----init-----");
    }

    public User(String username, String address, Integer id) {
        this.username = username;
        this.address = address;
        this.id = id;
    }

    public User(String username) {
        this.username = username;
    }

    public User(Integer id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
}
