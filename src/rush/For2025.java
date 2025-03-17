package rush;

import java.time.Duration;

public class For2025 {
    public void testBank() {
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.globalsqa.com/angularJs-protractor/BankingProject/#/login");
        driver.manage().timeouts().implicitlyWait(Duration.ofMillis(500));
        WebElement submitButton = driver.findElement(By.xpath("//button[contains(@class, 'btn btn-primary ')][1]"));
        submitButton.click();

        WebElement select  = driver.findElement(By.name("userSelect"));
        driver.manage().timeouts().implicitlyWait(Duration.ofMillis(500));
        select.click();

        WebElement choice = driver.findElement(By.xpath("//div[@class='form-group']/*/option[3]"));
        String value = choice.getText();
        assertEquals("Harry Potter", value);
        choice.click();
        driver.manage().timeouts().implicitlyWait(Duration.ofMillis(500));

        WebElement login = driver.findElement(By.xpath("//button[@type='submit']"));
        String log = login.getText();
        assertEquals("Login", log);
        login.click();

        WebElement fin = driver.findElement(By.xpath("//span[contains(text(), 'Harry')]"));
        String finish = fin.getText();
        assertEquals("Harry Potter", finish);

        driver.quit();
}
