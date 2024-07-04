package com.Insumo.main.services.Reportes;

import net.sf.jasperreports.engine.JasperExportManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.sql.DataSource;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.sql.Date;
import java.util.HashMap;
import java.util.Map;

@Service
public class ReportInsumo {

    @Autowired
    private DataSource dataSource;

    private static final String REPORTS_DIR = "/app/resources/Reportes/";

    public byte[] generatePdfReportGeneral() {
        try {
            String jasperFilePath = REPORTS_DIR + "Insumo_reporte.jasper";
            File reportFile = new File(jasperFilePath);
            if (!reportFile.exists()) {
                throw new FileNotFoundException("Resource not found: " + jasperFilePath);
            }

            JasperPrint jasperPrint = JasperFillManager.fillReport(jasperFilePath, null, dataSource.getConnection());

            ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
            JasperExportManager.exportReportToPdfStream(jasperPrint, outputStream);
            return outputStream.toByteArray();
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public byte[] generatePdfReportStockout() {
        try {

            String jasperFilePath = REPORTS_DIR + "alerta_SO_insumo_reporte.jasper";
            File reportFile = new File(jasperFilePath);
            if (!reportFile.exists()) {
                throw new FileNotFoundException("Resource not found: " + jasperFilePath);
            }

            JasperPrint jasperPrint = JasperFillManager.fillReport(jasperFilePath, null, dataSource.getConnection());


            ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
            JasperExportManager.exportReportToPdfStream(jasperPrint, outputStream);
            return outputStream.toByteArray();
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public byte[] generatePdfReportSA() {
        try {

            String jasperFilePath = REPORTS_DIR + "alerta_SA_insumo_reporte.jasper";
            File reportFile = new File(jasperFilePath);
            if (!reportFile.exists()) {
                throw new FileNotFoundException("Resource not found: " + jasperFilePath);
            }

            JasperPrint jasperPrint = JasperFillManager.fillReport(jasperFilePath, null, dataSource.getConnection());


            ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
            JasperExportManager.exportReportToPdfStream(jasperPrint, outputStream);
            return outputStream.toByteArray();
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public byte[] generatePdfReportMovimiento() {
        try {
            String jasperFilePath = REPORTS_DIR + "Movimiento_reporte.jasper";
            File reportFile = new File(jasperFilePath);
            if (!reportFile.exists()) {
                throw new FileNotFoundException("Resource not found: " + jasperFilePath);
            }

            JasperPrint jasperPrint = JasperFillManager.fillReport(jasperFilePath, null, dataSource.getConnection());

            ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
            JasperExportManager.exportReportToPdfStream(jasperPrint, outputStream);
            return outputStream.toByteArray();
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public byte[] generatePdfReportNombre(String nombre) {
        try {
            String jasperFilePath = REPORTS_DIR + "Nombre_Insumo.jasper";
            File reportFile = new File(jasperFilePath);
            if (!reportFile.exists()) {
                throw new FileNotFoundException("Resource not found: " + jasperFilePath);
            }

            Map<String, Object> parameters = new HashMap<>();
            parameters.put("nombre", nombre);

            JasperPrint jasperPrint = JasperFillManager.fillReport(jasperFilePath, parameters, dataSource.getConnection());

            ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
            JasperExportManager.exportReportToPdfStream(jasperPrint, outputStream);
            return outputStream.toByteArray();
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public byte[] generatePdfReportFecha(java.util.Date fechaInicio, java.util.Date fechaFin) {
        try {
            String jasperFilePath = REPORTS_DIR + "Fecha_Insumo.jasper";
            File reportFile = new File(jasperFilePath);
            if (!reportFile.exists()) {
                throw new FileNotFoundException("Resource not found: " + jasperFilePath);
            }

            Date sqlFechaInicio = new Date(fechaInicio.getTime());
            Date sqlFechaFin = new Date(fechaFin.getTime());

            Map<String, Object> parameters = new HashMap<>();
            parameters.put("Inicio", sqlFechaInicio);
            parameters.put("Fin", sqlFechaFin);

            JasperPrint jasperPrint = JasperFillManager.fillReport(jasperFilePath, parameters, dataSource.getConnection());

            ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
            JasperExportManager.exportReportToPdfStream(jasperPrint, outputStream);
            return outputStream.toByteArray();
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
