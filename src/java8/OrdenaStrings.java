package java8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;

public class OrdenaStrings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<String> palavras = new ArrayList<String>();
		palavras.add("Alura online");
		palavras.add("editora casa do código");
		palavras.add("caelum");

//		Comparator<String> comparador = new ComparadorPorTamanho();
		// Collections.sort(palavras,comparador);

//		palavras.sort((s1,s2) -> {
//			if (s1.length() < s2.length()) {
//				return -1;
//			}
//			if (s1.length() > s2.length()) {
//				return 1;
//			}
//			return 0;
//		});
//		
		
		
		
		//palavras.sort((s1,s2)-> Integer.compare(s1.length(),s2.length()));

		//Compara length da primeira string e da segunda string// mesma coisa que o código da linha de cima
		//palavras.sort(Comparator.comparing(s-> s.length()));
		
		//Mesa coisa da linha de cima -> METHOD REFERENCE
		palavras.sort(Comparator.comparing(String::length));
		
		System.out.println(palavras);

//		for (String p : palavras) {
//			System.out.println(p);
//		}

//		Consumer<String> consumidor = new Consumer<String>() {
//
//			@Override
//			public void accept(String t) {
//				// TODO Auto-generated method stub
//				System.out.println(t);
//			}
//			
//		};
		
//		palavras.forEach(t -> System.out.println(t));
		
		//Significa a mesma coisa da linha de cima -> METHOD REFERENCE
		palavras.forEach(System.out::println);

	}

}

//class ImprimeNaLinha implements Consumer<String>{
//
//	@Override
//	public void accept(String s) {
//		// TODO Auto-generated method stub
//		System.out.println(s);
//		
//	}	
//	
//}

//class ComparadorPorTamanho implements Comparator<String> {
//
//	@Override
//	public int compare(String s1, String s2) {
//		// TODO Auto-generated method stub
//		if(s1.length() < s2.length() ) {
//			return -1;
//		}
//		if(s1.length() > s2.length() ) {
//			return 1;
//		}
//		return 0;
//	}
//
//}
