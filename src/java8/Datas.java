package java8;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.Period;
import java.time.YearMonth;
import java.time.format.DateTimeFormatter;

public class Datas {

    public static void main(String[] args) {        
    	LocalDate hoje = LocalDate.now();
    	System.out.println("DATA DE HOJE:" + hoje);
    	
    	LocalDate copa = LocalDate.of(2022, Month.SEPTEMBER, 16);
    	System.out.println("DATA DA COPA:"+copa);
    	int difAnos = copa.getYear() - hoje.getYear();
    	System.out.println("Diferen�a de anos entre hoje e a copa:"+difAnos);
    	
    	Period periodo = Period.between(hoje,copa);
    	//Pode se utilizar por exemplo periodo.getMonth e entre outros para pegar algo especifico
    	System.out.println("PERIODO DIFEREN�A EM DIAS:"+periodo);
    	
    	//Inserindo 4 anos para ver a data da pr�xima copa //� necess�rio criar uma nova variavel pois as datas s�o imutaveis
    	LocalDate proxCopa = copa.plusYears(4);
    	System.out.println("COPA SOMADO 4 ANOS:"+proxCopa);
    	
    	//Formata��o de data
    	DateTimeFormatter formatador = DateTimeFormatter.ofPattern("dd/MM/yyyy");
    	String valFormatado = proxCopa.format(formatador);
    	System.out.println("VALOR FORMATADO:"+valFormatado);
    	
    	DateTimeFormatter formatadorComHoras = DateTimeFormatter.ofPattern("dd/MM/yyyy hh:mm:ss");
    	LocalDateTime agora = LocalDateTime.now();
    	System.out.println("HORA DE AGORA:"+agora.format(formatadorComHoras));
    	
    	//Convertendo dia e hora pra somente dia
    	agora.toLocalDate();
    	
    	//YearMonth mes = YearMonth.of(2020,2);
    	
    	
    	
    }
}