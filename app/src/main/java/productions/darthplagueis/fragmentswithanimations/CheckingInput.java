package productions.darthplagueis.fragmentswithanimations;

import android.content.Context;

/**
 * Created by oleg on 12/3/17.
 */

public class CheckingInput {

    private String editTextString;

    public CheckingInput(String editTextString) {
        this.editTextString = editTextString;
    }

    public String setEditTextString() {
        switch (editTextString) {
            case "jedi":
                return "You're going down a path I can't follow";
            case "sith":
                return "Have you ever heard the tradegy of darth plagueis the wise?";
             default:
                 return editTextString;
        }
    }

}
