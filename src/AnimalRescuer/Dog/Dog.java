package src.AnimalRescuer.Dog;

public class Dog {
    //-animal: nume, vârstă, nivelul stării de sănătate (de la 1 la 10), nivelul senzației de foame (de la 1 la 10),
    //    // nivelul stării de spirit (de la 1 la 10), numele mâncării preferate, numele activității de recreere preferate

private String name ;
    private int age ;
    private int theLevelOfHealth ;
    private int theLevelOfTheFeelingOfHunger ;
    private int moodLevel ;
    private String favoriteFood ;
    private String favoriteRecreationalActivity ;


    public String getName(){
        return name;
    }
    public void setName(String newName){
        this.name = name;
    }
    public int getAge(){
        return age;
    }
    public void setAge(){
        this.age = age;
    }

    public int getTheLevelOfHealth(){
        return theLevelOfHealth;
    }
    public void setTheLevelOfHealth(){
        this.theLevelOfHealth = theLevelOfHealth;
    }

    public int getTheLevelOfTheFeelingOfHunger(){
        return theLevelOfHealth;
    }
    public void setTheLevelOfTheFeelingOfHunger(){
        this.theLevelOfTheFeelingOfHunger = theLevelOfTheFeelingOfHunger;
    }


    public int getMoodLevel(){
        return moodLevel;
    }
    public void setMoodLevel(){
        this.moodLevel= moodLevel;
    }


    public String getFavoriteFood(){
        return favoriteFood;
    }
    public void setFavoriteFood(){
        this.favoriteFood= favoriteFood;
    }

    public String getFavoriteRecreationalActivity(){
        return favoriteFood;
    }
    public void setFavoriteRecreationalActivity(){
        this.favoriteRecreationalActivity= favoriteRecreationalActivity;
    }


    public void jogging(){
    System.out.println("Bella runs in the morning.");
}
public void walk(){
    System.out.println("Bella likes to go for a walk.");
}

}
