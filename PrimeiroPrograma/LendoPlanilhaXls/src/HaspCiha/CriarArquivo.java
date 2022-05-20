package HaspCiha;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class CriarArquivo extends DadosPlanilha {
   
    public void CriarArquivoXls(String nomeArquivo, List<DadosPlanilha> dados){

        try (var workbook = new XSSFWorkbook();
             var outputStream = new FileOutputStream(nomeArquivo)) {
            var planilha = workbook.createSheet("Dados CIHA");
            int numeroDaLinha = 0;
            adicionarCabecalho(planilha, numeroDaLinha++);

            for (Dado info : dados){
                var linha = planilha.createRow(numeroDaLinha++);
                adicionarCelula(linha, 0, super.getId());
                adicionarCelula(linha, 1, super.getNome());
                adicionarCelula(linha, 2, super.getEmail());
                adicionarCelula(linha, 3, super.getTelefone());
            }

            workbook.write(outputStream);
        } catch (FileNotFoundException e) {
        //    log.error("Arquivo não encontrado: {}", nomeArquivo);
        } catch (IOException e) {
        //    log.error("Erro ao processar o arquivo: {} ", nomeArquivo);
        }
       // log.info("Arquivo gerado com sucesso!");
    }

    private void adicionarCabecalho(XSSFSheet planilha, int numeroLinha) {
        var linha = planilha.createRow(numeroLinha);
        adicionarCelula(linha, 0, "Id");
        adicionarCelula(linha, 1, "Nome");
        adicionarCelula(linha, 2, "Email");
        adicionarCelula(linha, 3, "Telefone");
    }

    private void adicionarCelula(Row linha, int coluna, String valor) {
        Cell cell = linha.createCell(coluna);
        cell.setCellValue(valor);
    }

    private void adicionarCelula(Row linha, int coluna, int valor) {
        Cell cell = linha.createCell(coluna);
        cell.setCellValue(valor);
    }
}
