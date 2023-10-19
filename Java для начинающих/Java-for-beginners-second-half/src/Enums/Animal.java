package Enums;

public enum Animal {
    DOG("собака"),CAT("кошка"),FROG("лягушка");
    private String tranlation;
    Animal(String translation){
        this.tranlation = translation;
    }
    public String getTranlation() {
        return tranlation;
    }

    @Override
    public String toString() {
        return "Перевод на русский язык: "+tranlation;
    }
}
