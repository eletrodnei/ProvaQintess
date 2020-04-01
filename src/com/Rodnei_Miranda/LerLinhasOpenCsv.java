package com.Rodnei_Miranda;

import java.io.IOException;
import java.io.Reader;
import java.io.Writer;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import com.Rodnei_Miranda.model.DadosMercado;
import com.Rodnei_Miranda.model.Operacoes;
import com.Rodnei_Miranda.model.SaidaDados;
import com.opencsv.CSVReader;
import com.opencsv.CSVReaderBuilder;
import com.opencsv.bean.StatefulBeanToCsv;
import com.opencsv.bean.StatefulBeanToCsvBuilder;
import com.opencsv.exceptions.CsvException;

public class LerLinhasOpenCsv {

	public static void main(String[] args) throws IOException, CsvException, ParseException {

		double tempo1 = System.currentTimeMillis();
		System.out.println("Tempo inicial = " + tempo1);

		Reader reader = Files.newBufferedReader(Paths.get("DadosMercado.csv"));
		CSVReader csvReader = new CSVReaderBuilder(reader).withSkipLines(1).build();

		List<DadosMercado> dadosMercado = new ArrayList<>();

		List<String[]> cols = csvReader.readAll();
		for (String[] col : cols) {
			DadosMercado dadoMercado = new DadosMercado();

			String[] values = col[0].split(";");

			dadoMercado.setIdPreco(Integer.parseInt((values[0].toString())));
			dadoMercado.setNuPrazoDiasCorridos(Integer.parseInt((values[1].toString())));
			dadoMercado.setVlPreco((Integer.parseInt((values[2].toString()))));
			dadoMercado.setOther(Integer.parseInt(col[1]));

			dadosMercado.add(dadoMercado);
		}

		Reader reader2 = Files.newBufferedReader(Paths.get("Operacoes.csv"));
		CSVReader csvReader2 = new CSVReaderBuilder(reader2).withSkipLines(1).build();

		List<Operacoes> operacoes = new ArrayList<>();

		List<String[]> cols2 = csvReader2.readAll();
		for (String[] col : cols2) {
			Operacoes operacoes1 = new Operacoes();
			String[] values = col[0].split(";");
			String[] values1 = null;

			if (col.length > 1) {
				values1 = col[1].split(";");

			}

			Date dataaux = new SimpleDateFormat("dd/MM/yyyy").parse(values[1]);
			operacoes1.setCdOperacao(Integer.parseInt((values[0].toString())));
			operacoes1.setDtInicio(dataaux);
			dataaux = new SimpleDateFormat("dd/MM/yyyy").parse(values[2]);
			operacoes1.setDtFim(dataaux);
			operacoes1.setNmEmpresa(values[3]);
			operacoes1.setNmMesa(values[4]);
			operacoes1.setNmEstrategia(values[5]);
			operacoes1.setNmCentralizador(values[6]);
			operacoes1.setNmGestor(values[7]);
			operacoes1.setNmSubgestor(values[8]);
			operacoes1.setNmSubproduto(values[9]);
			operacoes1.setNmCaracteristica(values[10]);
			operacoes1.setCdAtivoObjeto(values[11]);
			operacoes1.setQuantidade(Long.parseLong(values[12]));

			if (col.length > 1) {
				if (values1[0].contains("-")) {
					values1[0] = "0";
				}
				operacoes1.setIdPreco(Long.parseLong(values1[0]));
			} else {
				operacoes1.setIdPreco(Long.parseLong(values[13]));
			}

			operacoes.add(operacoes1);
		}

		ArrayList<SaidaDados> saidaDados = new ArrayList<>();
		for (DadosMercado dadoMercado : dadosMercado) {

			for (Operacoes operacao : operacoes) {

				if (dadoMercado.getIdPreco() == operacao.getIdPreco()) {
					SaidaDados saidaDado = new SaidaDados();
					double resultado = dadoMercado.getVlPreco() * operacao.getQuantidade();
					saidaDado.setResultado(resultado);
					saidaDado.setNmSubproduto(operacao.getNmSubproduto());
					saidaDados.add(saidaDado);
					break;
				}
			}

		}

		double resultsubphhh = 0, resultsubpoooo = 0, resultsubprrr = 0, resultsubpjjjj = 0, resultsubpiii = 0,
				resultsubpttt = 0, resultsubpwww = 0, resultsubpkkkk = 0, resultsubpddd = 0, resultsubpyyy = 0,
				resultsubpqqq = 0, resultsubpggg = 0, resultsubplll = 0, resultsubpaaa = 0, resultsubpbbb = 0,
				resultsubpccc = 0, resultsubpeee = 0, resultsubpff = 0;

		for (SaidaDados saidaDado : saidaDados) {

			switch (saidaDado.getNmSubproduto()) {
			case "subphhh":
				resultsubphhh = resultsubphhh + saidaDado.getResultado();
				break;
			case "subpoooo":
				resultsubpoooo = resultsubpoooo + saidaDado.getResultado();
				break;
			case "subprrr":
				resultsubprrr = resultsubprrr + saidaDado.getResultado();
				break;
			case "subpjjjj":
				resultsubpjjjj = resultsubpjjjj + saidaDado.getResultado();
				break;
			case "subpiii":
				resultsubpiii = resultsubpiii + saidaDado.getResultado();
				break;
			case "subpttt":
				resultsubpttt = resultsubpttt + saidaDado.getResultado();
				break;
			case "subpwww":
				resultsubpwww = resultsubpwww + saidaDado.getResultado();
				break;
			case "subpkkkk":
				resultsubpkkkk = resultsubpkkkk + saidaDado.getResultado();
				break;
			case "subpddd":
				resultsubpddd = resultsubpddd + saidaDado.getResultado();
				break;
			case "subpyyy":
				resultsubpyyy = resultsubpyyy + saidaDado.getResultado();
				break;
			case "subpqqq":
				resultsubpqqq = resultsubpqqq + saidaDado.getResultado();
				break;
			case "subpggg":
				resultsubpggg = resultsubpggg + saidaDado.getResultado();
				break;
			case "subplll":
				resultsubplll = resultsubplll + saidaDado.getResultado();
				break;
			case "subpaaa":
				resultsubpaaa = resultsubpaaa + saidaDado.getResultado();
				break;
			case "subpbbb":
				resultsubpbbb = resultsubpbbb + saidaDado.getResultado();
				break;
			case "subpccc":
				resultsubpccc = resultsubpccc + saidaDado.getResultado();
				break;
			case "subpeee":
				resultsubpeee = resultsubpeee + saidaDado.getResultado();
				break;
			case "subpff":
				resultsubpff = resultsubpff + saidaDado.getResultado();
				break;

			}
		}

		ArrayList<SaidaDados> saidaDadosResult = new ArrayList<SaidaDados>();
		SaidaDados subphhhResult = new SaidaDados();
		subphhhResult.setNmSubproduto("subphhh");
		subphhhResult.setResultado(resultsubphhh);
		saidaDadosResult.add(subphhhResult);

		SaidaDados subpooooResult = new SaidaDados();
		subpooooResult.setNmSubproduto("subpoooo");
		subpooooResult.setResultado(resultsubpoooo);
		saidaDadosResult.add(subpooooResult);

		SaidaDados subprrrResult = new SaidaDados();
		subprrrResult.setNmSubproduto("subprrr");
		subprrrResult.setResultado(resultsubprrr);
		saidaDadosResult.add(subprrrResult);

		SaidaDados subpjjjjResult = new SaidaDados();
		subpjjjjResult.setNmSubproduto("subpjjjj");
		subpjjjjResult.setResultado(resultsubpjjjj);
		saidaDadosResult.add(subpjjjjResult);

		SaidaDados subpiiiResult = new SaidaDados();
		subpiiiResult.setNmSubproduto("subpiii");
		subpiiiResult.setResultado(resultsubpiii);
		saidaDadosResult.add(subpiiiResult);

		SaidaDados subptttResult = new SaidaDados();
		subptttResult.setNmSubproduto("subpttt");
		subptttResult.setResultado(resultsubpttt);
		saidaDadosResult.add(subptttResult);

		SaidaDados subpwwwResult = new SaidaDados();
		subpwwwResult.setNmSubproduto("subpwww");
		subpwwwResult.setResultado(resultsubpwww);
		saidaDadosResult.add(subpwwwResult);

		SaidaDados subpkkkkResult = new SaidaDados();
		subpkkkkResult.setNmSubproduto("subpkkkk");
		subpkkkkResult.setResultado(resultsubpkkkk);
		saidaDadosResult.add(subpkkkkResult);

		SaidaDados subpdddResult = new SaidaDados();
		subpdddResult.setNmSubproduto("subpddd");
		subpdddResult.setResultado(resultsubpddd);
		saidaDadosResult.add(subpdddResult);

		SaidaDados subpyyyResult = new SaidaDados();
		subpyyyResult.setNmSubproduto("subpyyy");
		subpyyyResult.setResultado(resultsubpyyy);
		saidaDadosResult.add(subpyyyResult);

		SaidaDados subpqqqResult = new SaidaDados();
		subpqqqResult.setNmSubproduto("subpqqq");
		subpqqqResult.setResultado(resultsubpqqq);
		saidaDadosResult.add(subpqqqResult);

		SaidaDados subpgggResult = new SaidaDados();
		subpgggResult.setNmSubproduto("subpggg");
		subpgggResult.setResultado(resultsubpggg);
		saidaDadosResult.add(subpgggResult);

		SaidaDados subplllResult = new SaidaDados();
		subplllResult.setNmSubproduto("subplll");
		subplllResult.setResultado(resultsubplll);
		saidaDadosResult.add(subplllResult);

		SaidaDados subpaaaResult = new SaidaDados();
		subpaaaResult.setNmSubproduto("subpaaa");
		subpaaaResult.setResultado(resultsubpaaa);
		saidaDadosResult.add(subpaaaResult);

		SaidaDados subpbbbResult = new SaidaDados();
		subpbbbResult.setNmSubproduto("subpbbb");
		subpbbbResult.setResultado(resultsubpbbb);
		saidaDadosResult.add(subpbbbResult);

		SaidaDados subpcccResult = new SaidaDados();
		subpcccResult.setNmSubproduto("subpccc");
		subpcccResult.setResultado(resultsubpccc);
		saidaDadosResult.add(subpcccResult);

		SaidaDados subpeeeResult = new SaidaDados();
		subpeeeResult.setNmSubproduto("subpeee");
		subpeeeResult.setResultado(resultsubpeee);
		saidaDadosResult.add(subpeeeResult);

		SaidaDados subpffResult = new SaidaDados();
		subpffResult.setNmSubproduto("subpff");
		subpffResult.setResultado(resultsubpff);
		saidaDadosResult.add(subpffResult);

		Writer writer = Files.newBufferedWriter(Paths.get("arquivosaida.csv"));
		StatefulBeanToCsv<SaidaDados> beanToCsv = new StatefulBeanToCsvBuilder(writer).build();

		beanToCsv.write(saidaDadosResult);

		writer.flush();
		writer.close();

		double tempo2 = System.currentTimeMillis();
		System.out.println("Tempo final = " + tempo2);

		System.out.println("Tempo total em milisegundos = " + (tempo2 - tempo1));

		System.out.println("Tempo total em segundos = " + (tempo2 - tempo1) / 1000);

	}

}
