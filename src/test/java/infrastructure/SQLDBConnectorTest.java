package infrastructure;

/**
 * sqlDBConnectorTest.java
 * Class for testing sqlDBConnectorTest
 * Author: Peter Buckingham (220165289)
 * Date: 19 March 2021
 */


import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.sql.Connection;

import static org.junit.jupiter.api.Assertions.assertNotNull;


public class SQLDBConnectorTest {

    private static SQLDBConnector sqlDbConnector;

    @BeforeAll
    public static void setUp() throws Exception {
        sqlDbConnector = SQLDBConnector.getInstance();
    }

    @AfterAll
    public static void tearDown() throws Exception {
        sqlDbConnector.closeConnection();
    }

    @Test
    public void testConnectionNotNull() throws Exception {
        Connection connection = sqlDbConnector.getConnection();
        assertNotNull(connection);
    }
}
