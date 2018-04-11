package csci305.javalab;

/**
 *
 * @author Taylor Koth
 */
public class Outcome {
    public String outcome, result;

    public Outcome(Rock rock, Element x){
        if("Rock".equals(x.getName())){
            outcome = "Rock ties Rock";
            result = "Tie";
        }else if("Paper".equals(x.getName())){
            outcome = "Paper covers Rock";
            result = "Lose";
        } else if("Scissors".equals(x.getName())){
            outcome = "Rock crushes Scissors";
            result = "Win";
        }else if("Lizard".equals(x.getName())){
            outcome = "Rock smashes Lizard";
            result = "Win";
        }else if("Spock".equals(x.getName())){
            outcome = "Spock vaporizes Rock";
            result = "Lose";
        }
    }

    public Outcome(Paper paper, Element x){
        if("Rock".equals(x.getName())){
            outcome = "Paper covers Rock";
                result = "Win";
        }else if("Paper".equals(x.getName())){
            outcome = "Paper ties Paper";
                result = "Tie";
        } else if("Scissors".equals(x.getName())){
            outcome = "Scissors cut Paper";
                result = "Lose";
        }else if("Lizard".equals(x.getName())){
            outcome = "Lizard eats Paper";
                result = "Lose";
        }else if("Spock".equals(x.getName())){
            outcome = "Paper disproves Spock";
                result = "Win";
        }
    }

    public Outcome(Scissors scissors, Element x){
        if("Rock".equals(x.getName())){
            outcome = "Rock crushes Scissors";
                result = "Lose";
        }else if("Paper".equals(x.getName())){
            outcome = "Scissors cuts Paper";
                result = "Win";
        } else if("Scissors".equals(x.getName())){
            outcome = "Scissors ties Scissors";
                result = "Tie";
        }else if("Lizard".equals(x.getName())){
            outcome = "Scissors decapitates Lizard";
                result = "Win";
        }else if("Spock".equals(x.getName())){
            outcome = "Spock smashes Scissors";
                result = "Lose";
        }
    }

    public Outcome(Lizard lizard, Element x){
        if("Rock".equals(x.getName())){
            outcome = "Rock crushes Lizard";
                result = "Lose";
        }else if("Paper".equals(x.getName())){
            outcome = "Lizard eats Paper";
                result = "Win";
        } else if("Scissors".equals(x.getName())){
            outcome = "Scissors decapitates Lizard";
                result = "Lose";
        }else if("Lizard".equals(x.getName())){
            outcome = "Lizard ties Lizard";
                result = "Tie";
        }else if("Spock".equals(x.getName())){
            outcome = "Lizard poisons Spock";
                result = "Win";
        }
    }

    public Outcome(Spock spock, Element x){
        if("Rock".equals(x.getName())){
            outcome = "Spock vaporizes Rock";
                result = "Win";
        }else if("Paper".equals(x.getName())){
            outcome = "Paper disproves Spock";
                result = "Lose";
        } else if("Scissors".equals(x.getName())){
            outcome = "Spock smashes Scissors";
                result = "Win";
        }else if("Lizard".equals(x.getName())){
            outcome = "Lizard poisons Spock";
                result = "Lose";
        }else if("Spock".equals(x.getName())){
            outcome = "Spock Ties Spock";
                result = "Tie";
        }
    }
}
