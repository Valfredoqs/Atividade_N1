package br.senai.fatesg.atividade_n1.testes;

import static org.junit.Assert.assertEquals;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.junit.Test;

public class PrincipalTest {

 private static final Date Atividade_N1 = null;

@Test
 public void testeGetHorario() {
	SimpleDateFormat d = new SimpleDateFormat("HH:mm:ss.SSS");
	String time = d.format(new Date());
	String local = d.format(Atividade_N1.getTime());
	assertEquals(local, time);
 	}
}