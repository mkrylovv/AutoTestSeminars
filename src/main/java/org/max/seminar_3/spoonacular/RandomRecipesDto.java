package org.max.seminar_3.spoonacular;

import org.max.seminar_3.spoonacular.recipers.OrgMaxLesson3Seminar;

import java.util.List;

public class RandomRecipesDto {

    List<OrgMaxLesson3Seminar> recipes;

    public List<OrgMaxLesson3Seminar> getRecipes() {
        return recipes;
    }

    public void setRecipes(List<OrgMaxLesson3Seminar> recipes) {
        this.recipes = recipes;
    }
}
