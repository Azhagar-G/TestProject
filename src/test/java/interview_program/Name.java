package interview_program;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.Map.Entry;

import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.xssf.usermodel.*;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Name {
	
public static List<String> name(String loc,String sheetName) throws IOException {
	// TODO Auto-generated method stub
	FileInputStream fis = null;
	List<String> nameList=new LinkedList<String>();
File file = new File(loc);
try {
	 fis = new FileInputStream(file);
} catch (FileNotFoundException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
XSSFWorkbook xl = new XSSFWorkbook(fis);
XSSFSheet xls=xl.getSheet(sheetName);
int physicalNumberOfRows = xls.getPhysicalNumberOfRows();
System.out.println("physicalNumberOfRows : "+physicalNumberOfRows);
for(int i=0;i<=physicalNumberOfRows;i++) {
	XSSFRow row = xls.getRow(i);
	int physicalNumberOfCells = row.getPhysicalNumberOfCells();
	System.out.println("physicalNumberOfCells : "+physicalNumberOfCells);
	for(int j=0;j<=physicalNumberOfCells;j++) {
	XSSFCell cell = row.getCell(j);
	String value=cell.getStringCellValue();
//		int cellType = cell.getCellType();
//	String value=null;
//	if(cellType==1) {
//		value=cell.getStringCellValue();
//	}
//	else {
//		if(DateUtil.isCellDateFormatted(cell)) {
//			value = new SimpleDateFormat("dd-mmm-yyyy").format(cell.getDateCellValue());
//		}else
//			value=String.valueOf((long) cell.getNumericCellValue());
//		}
//	
	nameList.add(value);
	}
}
return nameList;


}
	
	
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
//		System.setProperty(ChromeDriverService.CHROME_DRIVER_SILENT_OUTPUT_PROPERTY, "true");
		driver.get("https://astrologyfutureeye.com/fortune-tellers/lucky-name-numerology?report");

String[] ns= {"Peranya","Priyaalini","Prithvika","Poonguzhali","Poongulali"};

TreeSet<String> treeSet = new TreeSet<String>();
LinkedHashSet<Object> linkedHashSet = new LinkedHashSet<Object>();
LinkedList linkedList = new LinkedList();
LinkedHashMap<String, Integer> linkedHashMap = new LinkedHashMap<String,Integer>();
linkedHashMap.put("Table1", 100);
linkedHashMap.put("Table2", 101);
linkedHashMap.put("Table3", 102);
linkedHashMap.put("Table4", 103);

Set<String> keySet = linkedHashMap.keySet();
String s=null;

linkedHashMap.values();

HashMap hashMap = new HashMap();

hashMap.putAll(linkedHashMap);
Set<Entry<String, Integer>> j=hashMap.entrySet();
j.
Map<String,Integer> set = new TreeMap<String,Integer>();  

List<String> names=new LinkedList<String>();
names.addAll(Arrays.asList(ns));
//names.add("Hananya");
//names.add("Prakthiyusha");
//names.add("pirnalini");
//names.add("piranalini");
//String location="C:\\Users\\Azhagar.G\\Downloads\\babynames.xlsx";
//List<String> names= name(location,"namelist");

for(String name:names) {
	driver.findElement(By.cssSelector("input#vname")).sendKeys(name);
	WebElement day = driver.findElement(By.id("day"));
	Select days = new Select(day);
	days.selectByVisibleText("29");

	WebElement month = driver.findElement(By.id("month"));
	Select months = new Select(month);
	months.selectByValue("5");

	WebElement year = driver.findElement(By.id("year"));
	Select years = new Select(year);
	years.selectByVisibleText("2023");

	driver.findElement(By.cssSelector("input#sub")).click();

	String resultName = driver.findElement(By.cssSelector("span.cap")).getText();
	String per1 = driver.findElement(By.xpath("//table[@class=\"tp2 center\"]/tbody[1]/tr[4]/td[2]/b[1]")).getText();
	String per2 = driver.findElement(By.xpath("//table[@class=\"tp2 center\"]/tbody[1]/tr[5]/td[2]/b[1]")).getText();
	String per3 = driver.findElement(By.cssSelector("b.large")).getText();
	System.out.println(resultName+"---- "+per1+" --- "+per2+" --- "+per3);
}
driver.close();
	}

}
