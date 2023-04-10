package math.problems;

import databases.ConnectToMongoDB;
import databases.ConnectToSqlDB;
import org.junit.Assert;

public class UnitTestingMath {
    public static void main(String[] args) {
        //Apply Unit testing into each classes and methods in this package.
        ConnectToSqlDB connectToSqlDB = new ConnectToSqlDB();
      //  ConnectToMongoDB connectToMongoDB = new ConnectToMongoDB();

        Assert.assertEquals("", "");

    }
}
