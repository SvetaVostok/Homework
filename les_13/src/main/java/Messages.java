import static java.awt.Color.*;

@Paint(style = "hurray", color = Color.RED)
public class Messages {
    @Paint(style = "hurray", color = Color.YELLOW)
    public String mood() { return "А у меня отличное настроение!"; }
    @Paint(style = "!", color = Color.GREEN)
    public String warning() { return "Предупреждение"; }

    private String error() { return "Ошибка"; }

    public String happyBirthday() { return "С днем рождения!"; }
}
