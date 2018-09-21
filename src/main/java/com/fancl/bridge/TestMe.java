package com.fancl.bridge;

public class TestMe {
    public static void main(String[] args) {
        IDbDataSource mysqlDataSource = new MysqlDataSource();
        IDbDataSource oracleDataSource = new OracleDataSource();
        IDbDataSource sqlServerDataSource = new SqlServerDataSource();

        AbstractDbDataExport textDataExport = new TextDataExport();
        textDataExport.setSource(mysqlDataSource);
        textDataExport.export("root");

        AbstractDbDataExport pdfDataExport = new PdfDataExport();
        pdfDataExport.setSource(oracleDataSource);
        pdfDataExport.export("root");

        AbstractDbDataExport xmlDataExport = new XmlDataExport();
        xmlDataExport.setSource(sqlServerDataSource);
        xmlDataExport.export("root");
    }
}
