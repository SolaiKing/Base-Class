
package com.config;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Set;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.junit.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import com.fasterxml.jackson.annotation.JsonTypeInfo.Id;

import io.github.bonigarcia.wdm.WebDriverManager;
import net.bytebuddy.asm.Advice.Return;

public class LibGlobal {
	
	
	static WebDriver driver;
	public static void getdriver() {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
	}
	public  static void loadurl(String data) {
		driver.get(data);
		}
	public static void maximize() {
		driver.manage().window().maximize();

	}
	public static void close() {
    driver.close();
	}
	public void quit() {
     driver.quit();
	}
	
	public String getcurrenturl() {
		String currentUrl = driver.getCurrentUrl();
		return currentUrl;
}
	public String title() {
		String title = driver.getTitle();
		return title;
}
	public WebElement byId(String data) {
		WebElement Element = driver.findElement(By.id(data));
		return Element;
}
	public WebElement byname(String data) {
		WebElement Element = driver.findElement(By.name(data));
		return Element;
	}
	public WebElement byclassname(String data) {
		WebElement Element = driver.findElement(By.className(data));
		return Element;
	}
	public WebElement byxpath(String data) {
		WebElement Element = driver.findElement(By.xpath(data));
		return Element;
	}
	public void sendKeys(WebElement Element, String data) {
		Element.sendKeys(data);
		}
	public void click(WebElement Element) {
		Element.click();
}
	public String gettext(WebElement Element) {
    	String text = Element.getText();
    	return text;
}	
	public String getAttribute(WebElement Element) {
    	String attribute = Element.getAttribute("value");
         return attribute;
}
	public String getAttribute1(WebElement Element,String data) {
    	String attribute = Element.getAttribute(data);
		return attribute;
}
	public void mouseAction(WebElement Element) {
		Actions actions=new Actions(driver);
		actions.moveToElement(Element).perform();
}
	public void dragdrop(WebElement a,WebElement b) {
    	Actions actions=new Actions(driver);
    	actions.dragAndDrop(a,b).perform();
}
	public void rightClick(WebElement Element) {
    	Actions actions=new Actions(driver);
    	actions.contextClick(Element).perform();
}
	public void doubleClick(WebElement Element) {
    	Actions actions=new Actions(driver);
    	actions.doubleClick(Element).perform();
}
	public void keyDown(String a) {
    	Actions actions=new Actions(driver);
        actions.keyDown(a);
}
	public void keyUp(String a) {
    	Actions actions=new Actions(driver);
        actions.keyUp(a);
}
	public void keyDownSend(String a,WebElement Element,String data) {
    	Actions actions=new Actions(driver);
        actions.keyDown(a).sendKeys(Element,data);
} 
	public void keyUpPerform(String a) {
    	Actions actions=new Actions(driver);
        actions.keyUp(a).perform();
}
	public void keypress(int a) throws AWTException  {
		Robot robot=new Robot();
		robot.keyPress(a);
}
	public void keyRelease(int a) throws AWTException {
    	Robot robot=new Robot();
    	robot.keyRelease(a);
}
	public void clickOk() {
		Alert alert=driver.switchTo().alert();
		alert.accept();
}    
	public void clickCancel() {
    	Alert alert=driver.switchTo().alert();
    	alert.dismiss();
}
	public String getalerText() {
    	Alert alert=driver.switchTo().alert();
    	String text = alert.getText();
        return text;
}
	public void alertsendkey(String data) {
    	Alert alert=driver.switchTo().alert();
		alert.sendKeys(data);
}
	public File screenShotsource() {
		TakesScreenshot screenshot=(TakesScreenshot)driver;
		File file = screenshot.getScreenshotAs(OutputType.FILE);
		return file;
}
	public void screenShotdest(String data) {
		File file=new File(data);
}
	public void javaScript(String data,WebElement Element) {
		JavascriptExecutor executor=(JavascriptExecutor)driver;
		executor.executeScript("arguments[0].setAttribute('value',"+data+")",Element);
}
	public void javaScript1(WebElement Element) {
    	JavascriptExecutor executor=(JavascriptExecutor)driver;
    	executor.executeScript("arguments[0].click()",Element);
}
	public void scrollDown(WebElement Element) {
    	JavascriptExecutor executor=(JavascriptExecutor)driver;
    	executor.executeScript("arguments[0].ScrollIntoView(true)",Element);
}
	public void scrollUp(WebElement Element) {
    	JavascriptExecutor executor=(JavascriptExecutor)driver;
    	executor.executeScript("arguments[0].ScrollIntoView(false)",Element);
}
	public void selectIndex(WebElement Element,int a) {
		Select select=new Select(Element);
		select.selectByIndex(a);
}
	public void selectValue(WebElement Element,String data) {
    	Select select=new Select(Element);
		select.selectByValue(data);
}
	public void selectText(WebElement Element,String data) {
    	Select select=new Select(Element);
    	select.selectByVisibleText(data);
}
	public List<WebElement> getOptions(WebElement Element) {
    	Select select=new Select(Element);
    	List<WebElement> options = select.getOptions();
        return options;
}
	public int size(List<WebElement> options) {
    	int size = options.size();
    	return size;
}
	public List<WebElement> getAllOptions(WebElement Element) {
    	Select select=new Select(Element);
    	List<WebElement> alloptions = select.getAllSelectedOptions();
        return alloptions;
 }
	public WebElement getFirstOption(WebElement Element) {
    	Select select=new Select(Element);
    	WebElement firstSelectedOption = select.getFirstSelectedOption();
        return firstSelectedOption;
}
	public void deselectAll(WebElement Element) {
    	Select select=new Select(Element);
    	 select.deselectAll();
}
	public void frame(int a) {
		driver.switchTo().frame(a);
}
	public void frane1(String data) {
		driver.switchTo().frame(data);
}
	public void frame3() {
		driver.switchTo().defaultContent();
}
	public String getwindowId() {
		String windowHandle = driver.getWindowHandle();
        return windowHandle;
}
	public Set<String> getAllwindowId() {
		Set<String> windowHandles = driver.getWindowHandles();
        return windowHandles;
}
	public void getfile(String data) {
		File file=new File(data);
}
	public void getbytes(File file) throws FileNotFoundException {
		FileInputStream stream=new FileInputStream(file);
}
	public void createworkbook(FileInputStream stream) throws IOException {
		Workbook workbook=new XSSFWorkbook(stream);
}
	public Sheet getsheet(Workbook workbook,String data) {
		Sheet sheet = workbook.getSheet(data);
        return sheet;
}
	public Row getrow(Sheet sheet,int a) {
		Row row = sheet.getRow(a);
        return row;
}
	public Cell getcell(Row row,int a) {
		Cell cell = row.getCell(a);
        return cell;
}
	public int rowcount(Sheet sheet) {
		int physicalNumberOfRows = sheet.getPhysicalNumberOfRows();
        return physicalNumberOfRows;
}
	public int cellcount(Row row ) {
		int physicalNumberOfCells = row.getPhysicalNumberOfCells();
		return physicalNumberOfCells;
}
	
	public  String getdata(String sheetname,int rowno,int cellno) throws IOException {
    		String data=null;
			File file=new File("C:\\Users\\Solai King\\eclipse-workspace\\FrameWork\\Excel\\Integration.xlsx");
			FileInputStream stream=new FileInputStream(file);
			Workbook book=new XSSFWorkbook(stream);
			Sheet sheet = book.getSheet(sheetname);
			Row row = sheet.getRow(rowno);
			Cell cell = row.getCell(cellno);
			int type = cell.getCellType();
			if (type==1) {
		      data = cell.getStringCellValue();
			}
			if (type==0) {
				if (DateUtil.isCellDateFormatted(cell)) {
					Date date = cell.getDateCellValue();
					SimpleDateFormat simpleformat=new SimpleDateFormat("dd-MMM-yy");
					data = simpleformat.format(date);
				}else {
					double d = cell.getNumericCellValue();
					long l=(long)d;
					 data = String.valueOf(l);
			}
			}
			   return data;
			}
	public void write(String sheetname,int rowno,int cellno,String data) throws IOException {
		   File file=new File("C:\\\\Users\\\\Solai King\\\\eclipse-workspace\\\\FrameWork\\\\Excel\\\\Integration.xlsx");
		    FileInputStream stream=new FileInputStream(file);
		    Workbook workbook=new XSSFWorkbook(stream);
		    Sheet sheet = workbook.getSheet(sheetname);
		    Row row = sheet.getRow(rowno);
		    Cell createCell = row.createCell(cellno);
		    createCell.setCellValue(data);
		    FileOutputStream output=new FileOutputStream(file);
		    workbook.write(output);
		}
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	

	
	

}
