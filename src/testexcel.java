import java.io.File;
import java.io.FileInputStream;

public class testexcel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		{
			File f= new File("D:\\Bhavani\\Sample.xls");

			FileInputStream fis = new FileInputStream(f);
			Workbook wb = new XSSFWorkbook(fis);
			Sheet sh  = wb.getSheet("demo");
			for(int i=0;i<sh.getPhysicalNumberOfRows();i++)
				{
					
			Row r = sh.getRow(i);
					for(int j=0;j<r.getPhysicalNumberOfCells();j++)
					{
						Cell c= r.getCell(j);
						if(c.getCellType()==0)

					{
							System.out.println(c.getNumericCellValue());
							}
						else if(c.getCellType()==1)
						{
							System.out.println(c.getStringCellValue());
						}
					}
		}
		}

		//
//			sh.getRow(3).createCell(3).setCellValue("text");
//			FileOutputStream fos = new FileOutputStream(f);
//			wb.write(fos);
		//
//			Row r = sh.getRow(3);
//			Cell c= r.getCell(3);
//			System.out.println(c.getStringCellValue());



			}



	}

}
