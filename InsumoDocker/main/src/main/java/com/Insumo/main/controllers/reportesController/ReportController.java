package com.Insumo.main.controllers.reportesController;

import com.Insumo.main.services.Reportes.ReportInsumo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

@RestController
@RequestMapping("/api/report")
public class ReportController {

    @Autowired
    private ReportInsumo reportService;

    @GetMapping(value = "/general", produces = MediaType.APPLICATION_PDF_VALUE)
    public ResponseEntity<byte[]> getReport() {
        byte[] pdfBytes = reportService.generatePdfReportGeneral();

        if (pdfBytes != null) {
            return ResponseEntity
                    .ok()
                    .contentType(MediaType.APPLICATION_PDF)
                    .body(pdfBytes);
        } else {
            return ResponseEntity
                    .badRequest()
                    .body(null);
        }
    }

    @GetMapping(value = "/stockout", produces = MediaType.APPLICATION_PDF_VALUE)
    public ResponseEntity<byte[]> getReportStockout() {
        byte[] pdfBytes = reportService.generatePdfReportStockout();

        if (pdfBytes != null) {
            return ResponseEntity
                    .ok()
                    .contentType(MediaType.APPLICATION_PDF)
                    .body(pdfBytes);
        } else {
            return ResponseEntity
                    .badRequest()
                    .body(null);
        }
    }

    @GetMapping(value = "/sobreabastecimiento", produces = MediaType.APPLICATION_PDF_VALUE)
    public ResponseEntity<byte[]> getReportSA() {
        byte[] pdfBytes = reportService.generatePdfReportSA();

        if (pdfBytes != null) {
            return ResponseEntity
                    .ok()
                    .contentType(MediaType.APPLICATION_PDF)
                    .body(pdfBytes);
        } else {
            return ResponseEntity
                    .badRequest()
                    .body(null);
        }
    }

    @GetMapping(value = "/movimiento", produces = MediaType.APPLICATION_PDF_VALUE)
    public ResponseEntity<byte[]> getReportMovimiento() {
        byte[] pdfBytes = reportService.generatePdfReportMovimiento();

        if (pdfBytes != null) {
            return ResponseEntity
                    .ok()
                    .contentType(MediaType.APPLICATION_PDF)
                    .body(pdfBytes);
        } else {
            return ResponseEntity
                    .badRequest()
                    .body(null);
        }
    }

    @GetMapping(value = "/nombre", produces = MediaType.APPLICATION_PDF_VALUE)
    public ResponseEntity<byte[]> getReportName(@RequestParam String nombre) {
        byte[] pdfBytes = reportService.generatePdfReportNombre(nombre);

        if (pdfBytes != null) {
            return ResponseEntity
                    .ok()
                    .contentType(MediaType.APPLICATION_PDF)
                    .body(pdfBytes);
        } else {
            return ResponseEntity
                    .badRequest()
                    .body(null);
        }
    }

    @GetMapping(value = "/fecha", produces = MediaType.APPLICATION_PDF_VALUE)
    public ResponseEntity<byte[]> getReportFecha(
            @RequestParam @DateTimeFormat(pattern = "yyyy-MM-dd") Date fechaInicio,
            @RequestParam @DateTimeFormat(pattern = "yyyy-MM-dd") Date fechaFin) {
        byte[] pdfBytes = reportService.generatePdfReportFecha(fechaInicio, fechaFin);

        if (pdfBytes != null) {
            return ResponseEntity
                    .ok()
                    .contentType(MediaType.APPLICATION_PDF)
                    .body(pdfBytes);
        } else {
            return ResponseEntity
                    .badRequest()
                    .body(null);
        }
    }
}

