package com.example.feliphe;

import java.sql.*;

public class Main {

    public static final String DB_NAME = "testjava.db";
    public static final String CONNECTION_STRING = "jdbc:sqlite:D:\\Workspace\\JavaPrograms\\TestDB\\" + DB_NAME;
    public static final String TABLE_CONTACTS = "contacts";
    public static final String COLUMN_NAME = "name";
    public static final String COLUMN_PHONE = "phone";
    public static final String COLUMN_EMAIL = "email";

    public static void main(String[] args) {

//        try(Connection conn = DriverManager.getConnection("jdbc:sqlite:D:\\Workspace\\JavaPrograms\\TestDB\\testjava.db");
//            Statement statement = conn.createStatement()) {
//            statement.execute("CREATE TABLE contacts (name TEXT, phone INTEGER, email TEXT)");
//
//        }catch (SQLException e){
//            System.out.println("Something went wrong: " + e.getMessage());
//        }

        try {
            Connection conn = DriverManager.getConnection(CONNECTION_STRING);
//            conn.setAutoCommit(false);
            Statement statement = conn.createStatement();
            statement.execute("DROP TABLE IF EXISTS " + TABLE_CONTACTS);
            statement.execute("CREATE TABLE IF NOT EXISTS " + TABLE_CONTACTS +
                                    " (" + COLUMN_NAME + " text, " +
                                    COLUMN_PHONE + " integer, " +
                                    COLUMN_EMAIL + " text" +
                                    ")");

//            statement.execute("INSERT INTO " + TABLE_CONTACTS + " (" + COLUMN_NAME + ", " +
//                                                                        COLUMN_PHONE + ", " +
//                                                                        COLUMN_EMAIL + ") " +
//                                                                        "VALUES('Feliphe', 123456, 'feliphe@email.com')");
//
//            statement.execute("INSERT INTO " + TABLE_CONTACTS + " (" + COLUMN_NAME + ", " +
//                    COLUMN_PHONE + ", " +
//                    COLUMN_EMAIL + ") " +
//                    "VALUES('Irelia', 653214, 'Irelia@email.com')");
//
//            statement.execute("INSERT INTO " + TABLE_CONTACTS + " (" + COLUMN_NAME + ", " +
//                    COLUMN_PHONE + ", " +
//                    COLUMN_EMAIL + ") " +
//                    "VALUES('Lydia', 987456, 'Lydia@email.com')");
//
//            statement.execute("INSERT INTO " + TABLE_CONTACTS + " (" + COLUMN_NAME + ", " +
//                    COLUMN_PHONE + ", " +
//                    COLUMN_EMAIL + ") " +
//                    "VALUES('Ana', 14512, 'ana@email.com')");

            insertContact(statement,"Feliphe", 123456, "feliphe@email.com");
            insertContact(statement,"Irelia", 956412, "irelia@email.com");
            insertContact(statement,"Lydia", 326541, "lydia@email.com");
            insertContact(statement,"Ana", 754236, "ana@email.com");

            statement.execute("UPDATE " + TABLE_CONTACTS + " SET " +
                    COLUMN_PHONE + " = 546863" +
                    " WHERE " + COLUMN_NAME + " = 'Lydia'");

            statement.execute("DELETE FROM " + TABLE_CONTACTS +
                        " WHERE " + COLUMN_NAME + " = 'Lydia'");

//            statement.execute("INSERT INTO contacts(name, phone, email) VALUES('Irelia', 123456, 'irelia@email.com')");
//            statement.execute("INSERT INTO contacts(name, phone, email) VALUES('Kaysa', 214364, 'kaysa@email.com')");
//            statement.execute("INSERT INTO contacts(name, phone, email) VALUES('Lydia', 987456, 'lydia@email.com')");

//            statement.execute("UPDATE contacts SET phone = 654239 WHERE name='Feliphe'");

//            statement.execute("DELETE FROM contacts WHERE name='Kaysa'");

//            statement.execute("SELECT * FROM contacts");
//            ResultSet results = statement.getResultSet();

            ResultSet results = statement.executeQuery("SELECT * FROM " + TABLE_CONTACTS);
            while (results.next()){
                System.out.println(results.getString(COLUMN_NAME) + " " +
                        results.getInt(COLUMN_PHONE) + " " + results.getString(COLUMN_EMAIL));
            }

            results.close();

            statement.close();
            conn.close();

        }catch (SQLException e){
            System.out.println("Something went wrong: " + e.getMessage());
            e.printStackTrace();
        }
    }

    private static void insertContact(Statement statement, String name, int phone, String email) throws SQLException{
        statement.execute("INSERT INTO " + TABLE_CONTACTS + " (" + COLUMN_NAME + ", " +
                COLUMN_PHONE + ", " +
                COLUMN_EMAIL + ") " +
                "VALUES('" + name + "', " + phone + ", '" + email + "')");
    }
}
