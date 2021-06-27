package com.example.nicequotes;

import java.util.Random;

public class QuotesGenerator {

    String[] arrayOfQuotes = {
            "I am not afraid of an army of lions led by a sheep; I am afraid of an army of sheep led by a lion.",
            "A good leader takes a little more than his share of the blame, a little less than his share of the credit",
            "Success is to be measured not so much by the position that one has reached in life as by the obstacles which he has overcome.",
            "Nothing ever comes to one, that is worth having, except as a result of hard work.",
            "Hard work spotlights the character of people: some turn up their sleeves, some turn up their noses, and some don't turn up at all.",
            "Opportunity is missed by most people because it is dressed in overalls and looks like work.",
            "Let us realize that: the privilege to work is a gift, the power to work is a blessing, the love of work is success!",
            "Let us always meet each other with smile, for the smile is the beginning of love.",
            "Smile in the mirror. Do that every morning and you'll start to see a big difference in your life.",
            "A smile is the light in your window that tells others that there is a caring, sharing person inside.",
            "Let my soul smile through my heart and my heart smile through my eyes, that I may scatter rich smiles in sad hearts.",
            "Smile, it's free therapy.",
            "A smile is a curve that sets everything straight.",
            "After every storm the sun will smile; for every problem there is a solution, and the soul's indefeasible duty is to be of good cheer.",
            "We're born alone, we live alone, we die alone. Only through our love and friendship can we create the illusion for the moment that we're not alone.",
            "Love doesn't make the world go 'round. Love is what makes the ride worthwhile.",
            "You can learn many things from children. How much patience you have, for instance.",
            "Patience is not simply the ability to wait - it's how we behave while we're waiting.",
            "Sometimes things aren't clear right away. That's where you need to be patient and persevere and see where things lead.",
            "Great works are performed not by strength but by perseverance."
    };

    public String quotesGenerator () {
        Random random = new Random();
        int index = random.nextInt(arrayOfQuotes.length);
        String quote = arrayOfQuotes[index];

        return quote;
    }
}
