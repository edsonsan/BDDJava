/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.pageobject;

import java.util.concurrent.TimeUnit;
import junit.framework.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.Keys;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

/**
 *
 * @author tchul
 */
public class PageObject {
    
    //Classe que realizar a automação no Jira
    public static Integer jira(String idpai, int total) throws InterruptedException {
        //System.setProperty("webdriver.chrome.driver", ".\\src\\main\\java\\br\\com\\fox\\projetobdd\\chromedriver.exe");
        System.setProperty("webdriver.gecko.driver", ".\\src\\main\\java\\br\\com\\fox\\projetobdd\\geckodriver.exe");
//        ChromeOptions options = new ChromeOptions();
//        options.addArguments("--disable-gpu");
//        options.addArguments("--window-size=1366,768"); 
//        options.addArguments("--headless");     

//        WebDriver driver = new ChromeDriver(options);
        WebDriver driver = new FirefoxDriver();
        String urljira = "https://id.atlassian.com/login";
        String user = "erodrigues.santos@gmail.com";
        String pass = "Hastemale02";
        driver.get(urljira);
        driver.manage().window().maximize();
        Actions act = new Actions(driver);
        
        // manupulando o login
        driver.findElement(By.xpath("//input[@id='username']")).sendKeys(user);
        driver.findElement(By.xpath("//button[@id='login-submit']")).click();

        //driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(26, TimeUnit.SECONDS);
        driver.findElement(By.xpath("//input[@id='password']")).sendKeys(pass);
        driver.findElement(By.xpath("//button[@id='login-submit']")).click();
        Thread.sleep(5000);
        driver.findElement(By.xpath("//input[@data-test-id='search-dialog-input']")).click();
        //driver.findElement(By.xpath("//input[@data-test-id='search-dialog-input']")).sendKeys(idpai);
        //act.sendKeys(Keys.RETURN).build().perform();
        // erodrigues.santos@gmail.com
        //+'\ue004'
        Thread.sleep(4000);
        WebElement busca = driver.findElement(By.xpath("//input[@data-test-id='search-dialog-input']"));
        //busca.sendKeys(idpai+Keys.TAB);
        busca.sendKeys(idpai);
        Thread.sleep(4000);
        act.sendKeys(Keys.TAB).build().perform();
        Thread.sleep(4000);
        //act.sendKeys(Keys.TAB).build().perform();
        act.sendKeys(Keys.ENTER).build().perform();
        //busca.sendKeys(Keys.TAB,Keys.ENTER);
        //busca.sendKeys(Keys.ENTER);
   
        //Clic Botão [Criar]
        Thread.sleep(8000);
        driver.findElement(By.xpath("//button[@id='createGlobalItem']")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//body[@id='jira']//input[@id='summary-field']")).sendKeys("");
        driver.findElement(By.xpath("//body[@id='jira']//span[contains(text(),'Importar itens')]")).click();
        
        WebElement choseFile = driver.findElement(By.id("csvFile"));
        choseFile.sendKeys(System.getProperty("user.dir")+"\\jiracsv.csv");
        
        driver.findElement(By.id("useConfigFile")).click();
        
        WebElement choseConfig = driver.findElement(By.id("configFile"));
        choseConfig.sendKeys(System.getProperty("user.dir")+"\\config01.txt");
        Thread.sleep(5000);
        JavascriptExecutor jse = (JavascriptExecutor)driver;
        jse.executeScript("scrollBy(0,350)", "");
        driver.findElement(By.id("nextButton")).click();

        //Páina configurações
        Thread.sleep(5000);
        jse.executeScript("scrollBy(0,350)");
        driver.findElement(By.id("nextButton")).click();
        
        //Página de mapeamento dos campos
        Thread.sleep(5000);
        jse.executeScript("scrollBy(0,350)", "");
        driver.findElement(By.id("nextButton")).click();
        
        //Página de Validação e finalização
        driver.findElement(By.id("validationButton")).click();
        Thread.sleep(5000);
        WebElement vTotal = driver.findElement(By.xpath("//span[@class='ok-issue']"));
        Assert.assertEquals(Integer.toString(total), vTotal.getText());

        //Iniciar a Importação
        driver.findElement(By.id("nextButton")).click();
        Thread.sleep(7000);
        total= (int)total;
        driver.quit();
        return total;
    }
}
