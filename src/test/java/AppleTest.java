import io.qameta.allure.Description;
import io.qameta.allure.Owner;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;

public class AppleTest extends BaseTest{

    private final static String BASE_URL = "https://appleinsider.ru/";
    private final static String SEARCH_STRING = "Чем iPhone 13 отличается от iPhone 12";
    private final static String EXPECTED_WORD = "iphone-12";

    @DisplayName("it's  True test")
    @Owner("Это remanam")
    @Description("Выполняется поиск фильма с заданными параметрами и проверяет, что здесь будет выполнено то то и то то")
    @Test
    public void checkHref(){
        String href = new MainPage(BASE_URL)
                .search(SEARCH_STRING + "1")
                .getHrefFromFirstArticle();

        Assertions.assertTrue(href.contains(EXPECTED_WORD));

    }

    @DisplayName("Проверить, что нашли то, что нужно")
    @Test
    public void checkHref2(){


        Assertions.assertTrue(3 < 2);

    }
}
