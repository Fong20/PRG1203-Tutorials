//Driver class TestAnother

//In order to import packages which are located in different java project, we need to add the packages to the classpath in Eclipse
//To do so, right click and head to properties, select java build path, select libraries and select the classpath. Then, press add class folder and select the bin file of the project which you wish to import
import com.prg1203.package1.*;
import com.prg1203.package2.*;

public class TestAnother {
	public static void main(String[] args) {
		ClassA object1 = new ClassA();
		ClassB object2 = new ClassB();

	}

}
