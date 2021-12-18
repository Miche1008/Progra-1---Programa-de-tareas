
package Inicio;

import com.itextpdf.text.BaseColor;
import com.itextpdf.text.Chunk;
import com.itextpdf.text.Document;
import com.itextpdf.text.Image;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.Phrase;
import com.itextpdf.text.pdf.BarcodeQRCode;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import java.io.FileOutputStream;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.LinkedList;
import javax.swing.JOptionPane;

public class Diseño_de_los_Reportes {
    
    String nombreDocumento;
    String fecha;
    String rutaImagen;
    ArrayList<Datos_Tarea> ArrayDatos;

    Document documento;
    FileOutputStream archivo;
    Paragraph titulo;

    public Diseño_de_los_Reportes(String nombreDocumento, String fecha, String rutaImagen, ArrayList<Datos_Tarea> ArrayDatos) {
        this.nombreDocumento = nombreDocumento;
        this.fecha = fecha;
        this.rutaImagen = rutaImagen;
        this.ArrayDatos = ArrayDatos;

        documento = new Document();
        titulo = new Paragraph("Reporte");
    }

    public void GenerarReporte_TareasPendientes() {

        try {

            archivo = new FileOutputStream(nombreDocumento + ".pdf");

            PdfWriter.getInstance(documento, archivo);

            documento.open();
            titulo.setAlignment(1);
            documento.add(titulo);

            Image imagen = null;

            try {

                imagen = Image.getInstance(rutaImagen);
                imagen.scaleAbsolute(100, 100);
                imagen.setAbsolutePosition(485, 730);

            } catch (Exception e) {
            }

            documento.add(imagen);
            documento.add(Chunk.NEWLINE);
            documento.add(Chunk.NEWLINE);
            documento.add(new Paragraph("Tareas pendientes"));
            documento.add(Chunk.NEWLINE);
            documento.add(new Paragraph("A continuación se mostrará un listado con el detalle de las tareas que tiene pendientes."));

            PdfPTable Tabla_Tareas_Pendientes = new PdfPTable(3);
            documento.add(Chunk.NEWLINE);

            Tabla_Tareas_Pendientes.setWidthPercentage(100);
            
            PdfPCell tarea = new PdfPCell(new Phrase("Tarea"));
            tarea.setBackgroundColor(BaseColor.LIGHT_GRAY);

            PdfPCell responsable = new PdfPCell(new Phrase("Responsable"));
            responsable.setBackgroundColor(BaseColor.LIGHT_GRAY);

            PdfPCell fecha = new PdfPCell(new Phrase("Fecha"));
            fecha.setBackgroundColor(BaseColor.LIGHT_GRAY);


            Tabla_Tareas_Pendientes.addCell(tarea);
            Tabla_Tareas_Pendientes.addCell(responsable);
            Tabla_Tareas_Pendientes.addCell(fecha);

            for (Datos_Tarea t : ArrayDatos) {
                Tabla_Tareas_Pendientes.addCell(t.getTarea());
                Tabla_Tareas_Pendientes.addCell(t.getResponsable());
                Tabla_Tareas_Pendientes.addCell(t.getFecha());

            }

            documento.add(Tabla_Tareas_Pendientes);

            documento.add(Chunk.NEWLINE);

            documento.close();

            JOptionPane.showMessageDialog(null, "Su reporte ha sido creado");

        } catch (Exception e) {
        }
    }

}