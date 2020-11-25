package java8;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import javax.security.auth.x500.X500Principal;

public class Snippet {
	public static void main(String[] args) {
		List<Curso> cursos = new ArrayList<Curso>();
		cursos.add(new Curso("Python", 45));
		cursos.add(new Curso("JavaScript", 150));
		cursos.add(new Curso("Java 8", 113));
		cursos.add(new Curso("C", 55));
		
		
		cursos.sort(Comparator.comparing(Curso::getAlunos));
		
		//Toda collection tem o metodo stream, ele devolve uma sequencia/corrente de objetos é uma forma de trabalhar com obj.
		//Tudo que é feito no Stream não impacta diretamente na lista do collection original
		int sum = cursos.stream().filter(c->c.getAlunos()>=100).mapToInt(c->c.getAlunos()).sum();
		 
		System.out.println(sum);
		System.out.println("-------");
		
		cursos.stream()
		.filter(c->c.getAlunos()>=100)
		.findAny()
		//ifPresent só executa se existir algo dentro evitando exceptions desnecessárias.
		.ifPresent(c->System.out.println(c.getNome()));
		
		System.out.println("-------");
		
		//Voltar de uma stream pra uma collection(Array original)
		cursos = cursos.stream().filter(c-> c.getAlunos() >= 100).collect(Collectors.toList());
		cursos.forEach(c-> System.out.println(c.getNome()));
		
		System.out.println("-------");
		
		//Map usa chave e valor nesse caso estamos filtrando maior que 100 e pegando a chave(nome) e o valor(QuantAlunos)
		cursos 
		.stream() 
		.filter(c -> c.getAlunos() > 100) 
		.collect(Collectors.toMap(c -> c.getNome(), c -> c.getAlunos()))
		.forEach((nome,alunos)-> System.out.println(nome + " tem " + alunos));


		
		
		//Comandos para verificar se o curso existe, senão existir trará um null
		//Curso curso = optionalCurso.orElse(null);
		//System.out.println(curso.getNome());
		
		
		
		
		
		
		//cursos.forEach(c->System.out.println(c.getNome()));
	}
}
